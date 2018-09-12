package com.microsoft.bingads.v12.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.campaignmanagement.MatchType;
import com.microsoft.bingads.v12.campaignmanagement.NegativeKeyword;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * This abstract base class for all bulk negative keywords that
 * are either assigned individually to a campaign or ad group entity,
 * or shared in a negative keyword list.
 *
 * @see BulkAdGroupNegativeKeyword
 * @see BulkCampaignNegativeKeyword
 * @see BulkSharedNegativeKeyword
 */
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

    /**
     * Gets a negative keyword with match type.
     */
    public NegativeKeyword getNegativeKeyword() {
        return negativeKeyword;
    }

    /**
     * Sets a negative keyword with match type.
     */
    public void setNegativeKeyword(NegativeKeyword negativeKeyword) {
        this.negativeKeyword = negativeKeyword;
    }

    /**
     * Gets the status of the negative keyword association.
     *
     * <p>
     * The value is Active if the negative keyword is assigned to the parent entity.
     * The value is Deleted if the negative keyword is removed from the parent entity,
     * or should be removed in a subsequent upload operation.
     * Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the negative keyword association.
     *
     * <p>
     * The value is Active if the negative keyword is assigned to the parent entity.
     * The value is Deleted if the negative keyword is removed from the parent entity,
     * or should be removed in a subsequent upload operation.
     * Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Reserved for internal use.
     */
    Long getParentId() {
        return parentId;
    }

    /**
     * Reserved for internal use.
     */
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
