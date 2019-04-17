package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.EntityScope;
import com.microsoft.bingads.v13.campaignmanagement.SimilarRemarketingList;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a Similar Remarketing List that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkSimilarRemarketingList#setRemarketingList} and {@link BulkSimilarRemarketingList#getRemarketingList}
 * methods that can be used to read and write fields of the Similar Remarketing List record in a bulk file.
 *
 * <p>
 *     For more information, see Similar Remarketing List at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkSimilarRemarketingList extends SingleRecordBulkEntity {

    private SimilarRemarketingList similarRemarketingList;

    private Status status;

    private static final List<BulkMapping<BulkSimilarRemarketingList>> MAPPINGS;

    static {
        List<BulkMapping<BulkSimilarRemarketingList>> m = new ArrayList<BulkMapping<BulkSimilarRemarketingList>>();

        m.add(new SimpleBulkMapping<BulkSimilarRemarketingList, String>(StringTable.Status,
                new Function<BulkSimilarRemarketingList, String>() {
                    @Override
                    public String apply(BulkSimilarRemarketingList c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkSimilarRemarketingList>() {
                    @Override
                    public void accept(String v, BulkSimilarRemarketingList c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSimilarRemarketingList, Long>(StringTable.Id,
                new Function<BulkSimilarRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkSimilarRemarketingList c) {
                        return c.getSimilarRemarketingList().getId();
                    }
                },
                new BiConsumer<String, BulkSimilarRemarketingList>() {
                    @Override
                    public void accept(String v, BulkSimilarRemarketingList c) {
                        c.getSimilarRemarketingList().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkSimilarRemarketingList, Long>(StringTable.ParentId,
                new Function<BulkSimilarRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkSimilarRemarketingList c) {
                        return c.getSimilarRemarketingList().getParentId();
                    }
                },
                new BiConsumer<String, BulkSimilarRemarketingList>() {
                    @Override
                    public void accept(String v, BulkSimilarRemarketingList c) {
                        c.getSimilarRemarketingList().setParentId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkSimilarRemarketingList, String>(StringTable.Audience,
                new Function<BulkSimilarRemarketingList, String>() {
                    @Override
                    public String apply(BulkSimilarRemarketingList c) {
                        return c.getSimilarRemarketingList().getName();
                    }
                },
                new BiConsumer<String, BulkSimilarRemarketingList>() {
                    @Override
                    public void accept(String v, BulkSimilarRemarketingList c) {
                        c.getSimilarRemarketingList().setName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkSimilarRemarketingList, Long>(StringTable.AudienceSearchSize,
                new Function<BulkSimilarRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkSimilarRemarketingList c) {
                        return c.getSimilarRemarketingList().getSearchSize();
                    }
                },
                new BiConsumer<String, BulkSimilarRemarketingList>() {
                    @Override
                    public void accept(String v, BulkSimilarRemarketingList c) {
                        c.getSimilarRemarketingList().setSearchSize(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkSimilarRemarketingList, String>(StringTable.Description,
                new Function<BulkSimilarRemarketingList, String>() {
                    @Override
                    public String apply(BulkSimilarRemarketingList c) {
                        return c.getSimilarRemarketingList().getDescription();
                    }
                },
                new BiConsumer<String, BulkSimilarRemarketingList>() {
                    @Override
                    public void accept(String v, BulkSimilarRemarketingList c) {
                        c.getSimilarRemarketingList().setDescription(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSimilarRemarketingList, Integer>(StringTable.MembershipDuration,
                new Function<BulkSimilarRemarketingList, Integer>() {
                    @Override
                    public Integer apply(BulkSimilarRemarketingList c) {
                        return c.getSimilarRemarketingList().getMembershipDuration();
                    }
                },
                new BiConsumer<String, BulkSimilarRemarketingList>() {
                    @Override
                    public void accept(String v, BulkSimilarRemarketingList c) {
                        c.getSimilarRemarketingList().setMembershipDuration(StringExtensions.<Integer>parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String value) {
                                return Integer.parseInt(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSimilarRemarketingList, String>(StringTable.Scope,
                new Function<BulkSimilarRemarketingList, String>() {
                    @Override
                    public String apply(BulkSimilarRemarketingList c) {
                        return c.getSimilarRemarketingList().getScope() != null ? c.getSimilarRemarketingList().getScope().value() : null;
                    }
                },
                new BiConsumer<String, BulkSimilarRemarketingList>() {
                    @Override
                    public void accept(String v, BulkSimilarRemarketingList c) {
                        c.getSimilarRemarketingList().setScope(StringExtensions.parseOptional(v, new Function<String, EntityScope>() {
                            @Override
                            public EntityScope apply(String value) {
                                return EntityScope.fromValue(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSimilarRemarketingList, Long>(StringTable.SourceId,
                new Function<BulkSimilarRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkSimilarRemarketingList c) {
                        return c.getSimilarRemarketingList().getSourceId();
                    }
                },
                new BiConsumer<String, BulkSimilarRemarketingList>() {
                    @Override
                    public void accept(String v, BulkSimilarRemarketingList c) {
                        c.getSimilarRemarketingList().setSourceId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        		
        m.add(new SimpleBulkMapping<BulkSimilarRemarketingList, Long>(StringTable.AudienceNetworkSize,
                new Function<BulkSimilarRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkSimilarRemarketingList c) {
                        return c.getSimilarRemarketingList().getAudienceNetworkSize();
                    }
                },
                new BiConsumer<String, BulkSimilarRemarketingList>() {
                    @Override
                    public void accept(String v, BulkSimilarRemarketingList c) {
                        c.getSimilarRemarketingList().setAudienceNetworkSize(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkSimilarRemarketingList, String>(StringTable.SupportedCampaignTypes,
                new Function<BulkSimilarRemarketingList, String>() {
                    @Override
                    public String apply(BulkSimilarRemarketingList c) {
                        return StringExtensions.writeArrayOfstring(c.getSimilarRemarketingList().getSupportedCampaignTypes(), ";");
                    }
                },
                new BiConsumer<String, BulkSimilarRemarketingList>() {
                    @Override
                    public void accept(String v, BulkSimilarRemarketingList c) {
                        c.getSimilarRemarketingList().setSupportedCampaignTypes(StringExtensions.parseArrayOfString(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setSimilarRemarketingList(new SimilarRemarketingList());
       
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getSimilarRemarketingList(), SimilarRemarketingList.class.getSimpleName());
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the similar remarketing list.
     */
    public SimilarRemarketingList getSimilarRemarketingList() {
        return this.similarRemarketingList;
    }

    /**
     * Sets the similar remarketing list.
     */
    public void setSimilarRemarketingList(SimilarRemarketingList remarketingList) {
        this.similarRemarketingList = remarketingList;
    }

    /**
     * Gets the status of the similar remarketing list.
     *
     * <p>
     *     The value is Active if the similar remarketing list is available in the account's shared library.
     *     The value is Deleted if the similar remarketing list is deleted from the library,
     *     or should be deleted in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the similar remarketing list.
     *
     * <p>
     *     The value is Active if the similar remarketing list is available to be associated with an ad group.
     *     The value is Deleted if the similar remarketing list is deleted, or should be deleted  
     *     in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public void setStatus(Status status) {
        this.status = status;
    }
}
