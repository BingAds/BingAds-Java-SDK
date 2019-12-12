package com.microsoft.bingads.v13.bulk.entities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v13.campaignmanagement.BiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.InheritFromParentBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.Keyword;
import com.microsoft.bingads.v13.campaignmanagement.KeywordEditorialStatus;
import com.microsoft.bingads.v13.campaignmanagement.KeywordStatus;
import com.microsoft.bingads.v13.campaignmanagement.MatchType;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.BulkObjectWriter;
import com.microsoft.bingads.v13.internal.bulk.BulkRecordReader;
import com.microsoft.bingads.v13.internal.bulk.ComplexBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.TryResult;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

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
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
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
                    	return StringExtensions.toOptionalBulkString(c.getKeyword().getDestinationUrl(), c.getKeyword().getId());
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
                        return StringExtensions.toKeywordBidBulkString(c.getKeyword().getBid(), c.getKeyword().getId());
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
                        return StringExtensions.toOptionalBulkString(c.getKeyword().getParam1(), c.getKeyword().getId());
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
                        return StringExtensions.toOptionalBulkString(c.getKeyword().getParam2(), c.getKeyword().getId());
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
                        return StringExtensions.toOptionalBulkString(c.getKeyword().getParam3(), c.getKeyword().getId());
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
                        return StringExtensions.writeUrls("; ", c.getKeyword().getFinalUrls(), c.getKeyword().getId());
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
                        return StringExtensions.writeUrls("; ", c.getKeyword().getFinalMobileUrls(), c.getKeyword().getId());
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
                        return StringExtensions.toOptionalBulkString(c.getKeyword().getTrackingUrlTemplate(), c.getKeyword().getId());
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
                        return StringExtensions.toCustomParaBulkString(c.getKeyword().getUrlCustomParameters(), c.getKeyword().getId());
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

        m.add(new ComplexBulkMapping<BulkKeyword>(
                new BiConsumer<BulkKeyword, RowValues>() {
                    @Override
                    public void accept(BulkKeyword c, RowValues v) {
                        biddingSchemeToCsv(c, v);
                    }
                },
                new BiConsumer<RowValues, BulkKeyword>() {
                    @Override
                    public void accept(RowValues v, BulkKeyword c) {
                        csvToBiddingScheme(v, c);
                    }
                }
        ));
		
		m.add(new SimpleBulkMapping<BulkKeyword, String>(StringTable.FinalUrlSuffix,
                new Function<BulkKeyword, String>() {
                    @Override
                    public String apply(BulkKeyword c) {
                        return StringExtensions.toOptionalBulkString(c.getKeyword().getFinalUrlSuffix(), c.getKeyword().getId());
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                        c.getKeyword().setFinalUrlSuffix(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    private static void csvToBiddingScheme(RowValues values, BulkKeyword c) {
        try {
            String bidStrategyTypeRowValue = values.tryGet(StringTable.BidStrategyType);
            if (bidStrategyTypeRowValue == null) {
                return;
            }
            BiddingScheme biddingScheme = StringExtensions.parseBiddingScheme(bidStrategyTypeRowValue);
            if (biddingScheme == null) {
                return;
            }
            if (biddingScheme instanceof InheritFromParentBiddingScheme) {
                InheritFromParentBiddingScheme inheritFromParentBiddingScheme = new InheritFromParentBiddingScheme();
                inheritFromParentBiddingScheme.setType("InheritFromParent");
                inheritFromParentBiddingScheme.setInheritedBidStrategyType(values.tryGet(StringTable.InheritedBidStrategyType));
                c.getKeyword().setBiddingScheme(inheritFromParentBiddingScheme);
            } else {
                c.getKeyword().setBiddingScheme(biddingScheme);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void biddingSchemeToCsv(BulkKeyword c, RowValues values) {
        BiddingScheme biddingScheme = c.getKeyword().getBiddingScheme();
        if (biddingScheme == null) {
            return;
        }
        try {
            values.put(StringTable.BidStrategyType, StringExtensions.toBiddingSchemeBulkString(biddingScheme));
            if (biddingScheme instanceof InheritFromParentBiddingScheme) {
                values.put(StringTable.InheritedBidStrategyType, ((InheritFromParentBiddingScheme) biddingScheme).getInheritedBidStrategyType());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setKeyword(new Keyword());

        MappingHelpers.<BulkKeyword>convertToEntity(values, MAPPINGS, this);

        qualityScoreData = QualityScoreData.readFromRowValuesOrNull(values);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getKeyword(), "Keyword");

        MappingHelpers.<BulkKeyword>convertToValues(this, values, MAPPINGS);

        if (!excludeReadonlyData) {
            QualityScoreData.writeToRowValuesIfNotNull(qualityScoreData, values);
        }
    }

    @Override
    public void readAdditionalData(BulkRecordReader reader) {
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
