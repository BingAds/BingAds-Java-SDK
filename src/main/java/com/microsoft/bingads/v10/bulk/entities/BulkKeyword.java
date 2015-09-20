package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.campaignmanagement.AdExtensionEditorialStatus;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v10.campaignmanagement.Keyword;
import com.microsoft.bingads.v10.campaignmanagement.KeywordEditorialStatus;
import com.microsoft.bingads.v10.campaignmanagement.KeywordStatus;
import com.microsoft.bingads.v10.campaignmanagement.MatchType;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkOperation;
import com.microsoft.bingads.v10.internal.bulk.StringExtensions;
import com.microsoft.bingads.v10.internal.bulk.StringTable;
import com.microsoft.bingads.v10.internal.bulk.BulkMapping;
import com.microsoft.bingads.v10.internal.bulk.BulkObjectWriter;
import com.microsoft.bingads.v10.internal.bulk.BulkStreamReader;
import com.microsoft.bingads.v10.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v10.internal.bulk.RowValues;
import com.microsoft.bingads.v10.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v10.internal.bulk.TryResult;
import com.microsoft.bingads.v10.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a keyword that can be read or written in a bulk file.
 *
 * This class exposes the {@link #setKeyword} and {@link #getKeyword} methods
 * that can be used to read and write fields of the Keyword record in a bulk file.
 *
 * <p>
 *     Properties of this class and of classes that it is derived from,
 *     correspond to fields of the Keyword record in a bulk file.
 *     For more information, see Keyword at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=620265">http://go.microsoft.com/fwlink/?LinkID=620265</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkKeyword extends SingleRecordBulkEntity {

    private Long adGroupId;

    private Keyword keyword;

    private String campaignName;

    private String adGroupName;

    private PerformanceData performanceData;

    private QualityScoreData qualityScoreData;

    private BidSuggestionData bidSuggestions;

    private static final List<BulkMapping<BulkKeyword>> MAPPINGS;

    static {
        List<BulkMapping<BulkKeyword>> m = new ArrayList<BulkMapping<BulkKeyword>>();

        m.add(new SimpleBulkMapping<BulkKeyword, Long>(StringTable.Id,
                new Function<BulkKeyword, Long>() {
                    @Override
                    public Long apply(BulkKeyword c) {
                        return c.getKeyword().getId();
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                        c.getKeyword().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkKeyword, Long>(StringTable.ParentId,
                new Function<BulkKeyword, Long>() {
                    @Override
                    public Long apply(BulkKeyword c) {
                        return c.getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                        c.setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkKeyword, String>(StringTable.Status,
                new Function<BulkKeyword, String>() {
                    @Override
                    public String apply(BulkKeyword c) {
                        return c.getKeyword().getStatus() != null ? c.getKeyword().getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                        c.getKeyword().setStatus(StringExtensions.<KeywordStatus>parseOptional(v, new Function<String, KeywordStatus>() {
                            @Override
                            public KeywordStatus apply(String value) {
                                return KeywordStatus.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkKeyword, String>(StringTable.Campaign,
                new Function<BulkKeyword, String>() {
                    @Override
                    public String apply(BulkKeyword c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkKeyword, String>(StringTable.AdGroup,
                new Function<BulkKeyword, String>() {
                    @Override
                    public String apply(BulkKeyword c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                        c.setAdGroupName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkKeyword, String>(StringTable.Keyword,
                new Function<BulkKeyword, String>() {
                    @Override
                    public String apply(BulkKeyword c) {
                        return c.getKeyword().getText();
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                        c.getKeyword().setText(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkKeyword, String>(StringTable.DestinationUrl,
                new Function<BulkKeyword, String>() {
                    @Override
                    public String apply(BulkKeyword c) {
                    	return StringExtensions.toOptionalBulkString(c.getKeyword().getDestinationUrl());
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                    	c.getKeyword().setDestinationUrl(StringExtensions.getValueOrEmptyString(v));
                    }
                },
                true
        ));

        m.add(new SimpleBulkMapping<BulkKeyword, String>(StringTable.EditorialStatus,
                new Function<BulkKeyword, String>() {
                    @Override
                    public String apply(BulkKeyword t) {
                        return t.getKeyword().getEditorialStatus() != null ? t.getKeyword().getEditorialStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                        c.getKeyword().setEditorialStatus(StringExtensions.<KeywordEditorialStatus>parseOptional(v, new Function<String, KeywordEditorialStatus>() {
                            @Override
                            public KeywordEditorialStatus apply(String value) {
                                return KeywordEditorialStatus.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkKeyword, String>(StringTable.MatchType,
                new Function<BulkKeyword, String>() {
                    @Override
                    public String apply(BulkKeyword c) {
                        return StringExtensions.toMatchTypeBulkString(c.getKeyword().getMatchType());
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                        c.getKeyword().setMatchType(StringExtensions.<MatchType>parseOptional(v, new Function<String, MatchType>() {
                            @Override
                            public MatchType apply(String value) {
                                return MatchType.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkKeyword, String>(StringTable.Bid,
                new Function<BulkKeyword, String>() {
                    @Override
                    public String apply(BulkKeyword c) {
                        return StringExtensions.toKeywordBidBulkString(c.getKeyword().getBid());
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                        c.getKeyword().setBid(StringExtensions.parseKeywordBid(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkKeyword, String>(StringTable.Param1,
                new Function<BulkKeyword, String>() {
                    @Override
                    public String apply(BulkKeyword c) {
                        return StringExtensions.toOptionalBulkString(c.getKeyword().getParam1());
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                        c.getKeyword().setParam1(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkKeyword, String>(StringTable.Param2,
                new Function<BulkKeyword, String>() {
                    @Override
                    public String apply(BulkKeyword c) {
                        return StringExtensions.toOptionalBulkString(c.getKeyword().getParam2());
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                        c.getKeyword().setParam2(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkKeyword, String>(StringTable.Param3,
                new Function<BulkKeyword, String>() {
                    @Override
                    public String apply(BulkKeyword c) {
                        return StringExtensions.toOptionalBulkString(c.getKeyword().getParam3());
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                        c.getKeyword().setParam3(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkKeyword, String>(StringTable.FinalUrl,
                new Function<BulkKeyword, String>() {
                    @Override
                    public String apply(BulkKeyword c) {
                        return StringExtensions.writeUrls("; ", c.getKeyword().getFinalUrls());
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                    	ArrayOfstring urls = new ArrayOfstring();
                    	List<String> urlArray = StringExtensions.parseUrls(v);
                    	if(urlArray == null) {
                    		urls = null;
                    	} else {
                    		urls.getStrings().addAll(urlArray);
                    	}
                    	
                        c.getKeyword().setFinalUrls(urls);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkKeyword, String>(StringTable.FinalMobileUrl,
                new Function<BulkKeyword, String>() {
                    @Override
                    public String apply(BulkKeyword c) {
                        return StringExtensions.writeUrls("; ", c.getKeyword().getFinalMobileUrls());
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                    	ArrayOfstring urls = new ArrayOfstring();
                    	List<String> urlArray = StringExtensions.parseUrls(v);
                    	if(urlArray == null) {
                    		urls = null;
                    	} else {
                    		urls.getStrings().addAll(urlArray);
                    	}
                    	
						c.getKeyword().setFinalMobileUrls(urls);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkKeyword, String>(StringTable.TrackingTemplate,
                new Function<BulkKeyword, String>() {
                    @Override
                    public String apply(BulkKeyword c) {
                        return StringExtensions.toOptionalBulkString(c.getKeyword().getTrackingUrlTemplate());
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                        c.getKeyword().setTrackingUrlTemplate(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkKeyword, String>(StringTable.CustomParameter,
                new Function<BulkKeyword, String>() {
                    @Override
                    public String apply(BulkKeyword c) {
                        return StringExtensions.toCustomParaBulkString(c.getKeyword().getUrlCustomParameters());
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                        try {
							c.getKeyword().setUrlCustomParameters(StringExtensions.parseCustomParameters(v));
						} catch (Exception e) {
							e.printStackTrace();
						}
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setKeyword(new Keyword());

        MappingHelpers.<BulkKeyword>convertToEntity(values, MAPPINGS, this);

        qualityScoreData = QualityScoreData.readFromRowValuesOrNull(values);
        performanceData = PerformanceData.readFromRowValuesOrNull(values);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getKeyword(), "Keyword");

        MappingHelpers.<BulkKeyword>convertToValues(this, values, MAPPINGS);

        if (!excludeReadonlyData) {
            QualityScoreData.writeToRowValuesIfNotNull(qualityScoreData, values);

            PerformanceData.writeToRowValuesIfNotNull(performanceData, values);
        }
    }

    @Override
    public void readAdditionalData(BulkStreamReader reader) {
        TryResult<BulkKeywordBidSuggestion> nextBidSuggestionResult = reader.tryRead(BulkKeywordBidSuggestion.class);

        while (nextBidSuggestionResult.isSuccessful()) {
            if (this.bidSuggestions == null) {
                this.bidSuggestions = new BidSuggestionData();
            }

            BulkKeywordBidSuggestion nextBidSuggestion = nextBidSuggestionResult.getResult();

            if (nextBidSuggestion instanceof BulkKeywordBestPositionBid) {
                this.bidSuggestions.setBestPosition(nextBidSuggestion);
            } else if (nextBidSuggestion instanceof BulkKeywordMainLineBid) {
                bidSuggestions.setMainLine(nextBidSuggestion);
            } else if (nextBidSuggestion instanceof BulkKeywordFirstPageBid) {
                bidSuggestions.setFirstPage(nextBidSuggestion);
            }

            nextBidSuggestionResult = reader.tryRead(BulkKeywordBidSuggestion.class);
        }
    }

    @Override
    public void writeAdditionalData(BulkObjectWriter writer) throws IOException {
        if (getBidSuggestions() != null) {
            BulkKeywordBidSuggestion.writeIfNotNull(getBidSuggestions().getBestPosition(), writer);

            BulkKeywordBidSuggestion.writeIfNotNull(getBidSuggestions().getMainLine(), writer);

            BulkKeywordBidSuggestion.writeIfNotNull(getBidSuggestions().getFirstPage(), writer);
        }
    }

    /**
     * Gets the identifier of the ad group that contains the keyword.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the identifier of the ad group that contains the keyword.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setAdGroupId(Long adGroupId) {
        this.adGroupId = adGroupId;
    }

    /**
     * Gets a keyword within an ad group.
     */
    public Keyword getKeyword() {
        return keyword;
    }

    /**
     * Sets a keyword within an ad group.
     */
    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    /**
     * Sets the name of the campaign that contains the keyword.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * Sets the name of the ad group that contains the keyword.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public void setAdGroupName(String adGroupName) {
        this.adGroupName = adGroupName;
    }

    /**
     * Gets the name of the campaign that contains the keyword.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Gets the name of the ad group that contains the keyword.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public String getAdGroupName() {
        return adGroupName;
    }

    /**
     * Gets the historical performance data for the keyword.
     */
    public PerformanceData getPerformanceData() {
        return performanceData;
    }

    /**
     * Gets the quality score data for the keyword.
     */
    public QualityScoreData getQualityScoreData() {
        return qualityScoreData;
    }

    /**
     * Gets the bid suggestion data for the keyword.
     */
    public BidSuggestionData getBidSuggestions() {
        return bidSuggestions;
    }

}
