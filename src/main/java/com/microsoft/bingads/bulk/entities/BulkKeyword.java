package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.Keyword;
import com.microsoft.bingads.campaignmanagement.KeywordEditorialStatus;
import com.microsoft.bingads.campaignmanagement.KeywordStatus;
import com.microsoft.bingads.campaignmanagement.MatchType;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.BulkStreamReader;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.bulk.TryResult;
import com.microsoft.bingads.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
                        return c.getKeyword().getDestinationUrl();
                    }
                },
                new BiConsumer<String, BulkKeyword>() {
                    @Override
                    public void accept(String v, BulkKeyword c) {
                        c.getKeyword().setDestinationUrl(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkKeyword, KeywordEditorialStatus>(StringTable.EditorialStatus,                
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
    public void processMappingsToRowValues(RowValues values) {
        MappingHelpers.<BulkKeyword>convertToValues(this, values, MAPPINGS);
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

    public Long getAdGroupId() {
        return adGroupId;
    }

    public void setAdGroupId(Long adGroupId) {
        this.adGroupId = adGroupId;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public void setAdGroupName(String adGroupName) {
        this.adGroupName = adGroupName;
    }   

    public String getCampaignName() {
        return campaignName;
    }

    public String getAdGroupName() {
        return adGroupName;
    }

    public PerformanceData getPerformanceData() {
        return performanceData;
    }

    public QualityScoreData getQualityScoreData() {
        return qualityScoreData;
    }

    public BidSuggestionData getBidSuggestions() {
        return bidSuggestions;
    }

}
