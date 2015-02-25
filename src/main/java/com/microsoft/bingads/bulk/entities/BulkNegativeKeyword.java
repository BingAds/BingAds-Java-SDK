package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.MatchType;
import com.microsoft.bingads.campaignmanagement.NegativeKeyword;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class BulkNegativeKeyword extends SingleRecordBulkEntity {

    private NegativeKeyword negativeKeyword;

    private Status status;

    private Long parentId;

    private static final List<BulkMapping<BulkNegativeKeyword>> MAPPINGS;

    static {
        List<BulkMapping<BulkNegativeKeyword>> m = new ArrayList<BulkMapping<BulkNegativeKeyword>>();

        m.add(new SimpleBulkMapping<BulkNegativeKeyword, Long>(StringTable.Id,
                new Function<BulkNegativeKeyword, Long>() {
                    @Override
                    public Long apply(BulkNegativeKeyword c) {
                        return c.getNegativeKeyword().getId();
                    }
                },
                new BiConsumer<String, BulkNegativeKeyword>() {
                    @Override
                    public void accept(String v, BulkNegativeKeyword c) {
                        c.getNegativeKeyword().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkNegativeKeyword, String>(StringTable.Status,
                new Function<BulkNegativeKeyword, String>() {
                    @Override
                    public String apply(BulkNegativeKeyword c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkNegativeKeyword>() {
                    @Override
                    public void accept(String v, BulkNegativeKeyword c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkNegativeKeyword, Long>(StringTable.ParentId,
                new Function<BulkNegativeKeyword, Long>() {
                    @Override
                    public Long apply(BulkNegativeKeyword c) {
                        return c.getParentId();
                    }
                },
                new BiConsumer<String, BulkNegativeKeyword>() {
                    @Override
                    public void accept(String v, BulkNegativeKeyword c) {
                        c.setParentId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkNegativeKeyword, String>(StringTable.Keyword,
                new Function<BulkNegativeKeyword, String>() {
                    @Override
                    public String apply(BulkNegativeKeyword c) {
                        return c.getNegativeKeyword().getText();
                    }
                },
                new BiConsumer<String, BulkNegativeKeyword>() {
                    @Override
                    public void accept(String v, BulkNegativeKeyword c) {
                        c.getNegativeKeyword().setText(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkNegativeKeyword, String>(StringTable.MatchType,
                new Function<BulkNegativeKeyword, String>() {
                    @Override
                    public String apply(BulkNegativeKeyword c) {
                        return StringExtensions.toMatchTypeBulkString(c.getNegativeKeyword().getMatchType());
                    }
                },
                new BiConsumer<String, BulkNegativeKeyword>() {
                    @Override
                    public void accept(String v, BulkNegativeKeyword c) {
                        c.getNegativeKeyword().setMatchType(StringExtensions.parseOptional(v, new Function<String, MatchType>() {
                            @Override
                            public MatchType apply(String t) {
                                return MatchType.fromValue(t);
                            }
                        }));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    public NegativeKeyword getNegativeKeyword() {
        return negativeKeyword;
    }

    public void setNegativeKeyword(NegativeKeyword negativeKeyword) {
        this.negativeKeyword = negativeKeyword;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    Long getParentId() {
        return parentId;
    }

    void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.negativeKeyword = new NegativeKeyword();
        this.negativeKeyword.setType("NegativeKeyword");        

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getNegativeKeyword(), "NegativeKeyword");
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

}
