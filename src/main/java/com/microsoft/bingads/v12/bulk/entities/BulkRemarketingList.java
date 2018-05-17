package com.microsoft.bingads.v12.bulk.entities;

import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.RemarketingList;
import com.microsoft.bingads.v12.campaignmanagement.EntityScope;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a remarketing list that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkRemarketingList#setRemarketingList} and {@link BulkRemarketingList#getRemarketingList}
 * methods that can be used to read and write fields of the Remarketing List record in a bulk file.
 *
 * <p>
 *     For more information, see Remarketing List at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkRemarketingList extends SingleRecordBulkEntity {

    private RemarketingList remarketingList;

    private Status status;

    private static final List<BulkMapping<BulkRemarketingList>> MAPPINGS;

    static {
        List<BulkMapping<BulkRemarketingList>> m = new ArrayList<BulkMapping<BulkRemarketingList>>();

        m.add(new SimpleBulkMapping<BulkRemarketingList, String>(StringTable.Status,
                new Function<BulkRemarketingList, String>() {
                    @Override
                    public String apply(BulkRemarketingList c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkRemarketingList>() {
                    @Override
                    public void accept(String v, BulkRemarketingList c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkRemarketingList, Long>(StringTable.Id,
                new Function<BulkRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkRemarketingList c) {
                        return c.getRemarketingList().getId();
                    }
                },
                new BiConsumer<String, BulkRemarketingList>() {
                    @Override
                    public void accept(String v, BulkRemarketingList c) {
                        c.getRemarketingList().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkRemarketingList, Long>(StringTable.ParentId,
                new Function<BulkRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkRemarketingList c) {
                        return c.getRemarketingList().getParentId();
                    }
                },
                new BiConsumer<String, BulkRemarketingList>() {
                    @Override
                    public void accept(String v, BulkRemarketingList c) {
                        c.getRemarketingList().setParentId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkRemarketingList, String>(StringTable.Audience,
                new Function<BulkRemarketingList, String>() {
                    @Override
                    public String apply(BulkRemarketingList c) {
                        return c.getRemarketingList().getName();
                    }
                },
                new BiConsumer<String, BulkRemarketingList>() {
                    @Override
                    public void accept(String v, BulkRemarketingList c) {
                        c.getRemarketingList().setName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkRemarketingList, Long>(StringTable.AudienceSearchSize,
                new Function<BulkRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkRemarketingList c) {
                        return c.getRemarketingList().getSearchSize();
                    }
                },
                new BiConsumer<String, BulkRemarketingList>() {
                    @Override
                    public void accept(String v, BulkRemarketingList c) {
                        c.getRemarketingList().setSearchSize(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkRemarketingList, String>(StringTable.Description,
                new Function<BulkRemarketingList, String>() {
                    @Override
                    public String apply(BulkRemarketingList c) {
                        return c.getRemarketingList().getDescription();
                    }
                },
                new BiConsumer<String, BulkRemarketingList>() {
                    @Override
                    public void accept(String v, BulkRemarketingList c) {
                        c.getRemarketingList().setDescription(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkRemarketingList, Integer>(StringTable.MembershipDuration,
                new Function<BulkRemarketingList, Integer>() {
                    @Override
                    public Integer apply(BulkRemarketingList c) {
                        return c.getRemarketingList().getMembershipDuration();
                    }
                },
                new BiConsumer<String, BulkRemarketingList>() {
                    @Override
                    public void accept(String v, BulkRemarketingList c) {
                        c.getRemarketingList().setMembershipDuration(StringExtensions.<Integer>parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String value) {
                                return Integer.parseInt(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkRemarketingList, String>(StringTable.Scope,
                new Function<BulkRemarketingList, String>() {
                    @Override
                    public String apply(BulkRemarketingList c) {
                        return c.getRemarketingList().getScope() != null ? c.getRemarketingList().getScope().value() : null;
                    }
                },
                new BiConsumer<String, BulkRemarketingList>() {
                    @Override
                    public void accept(String v, BulkRemarketingList c) {
                        c.getRemarketingList().setScope(StringExtensions.parseOptional(v, new Function<String, EntityScope>() {
                            @Override
                            public EntityScope apply(String value) {
                                return EntityScope.fromValue(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkRemarketingList, Long>(StringTable.TagId,
                new Function<BulkRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkRemarketingList c) {
                        return c.getRemarketingList().getTagId();
                    }
                },
                new BiConsumer<String, BulkRemarketingList>() {
                    @Override
                    public void accept(String v, BulkRemarketingList c) {
                        c.getRemarketingList().setTagId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkRemarketingList, String>(StringTable.RemarketingRule,
                new Function<BulkRemarketingList, String>() {
                    @Override
                    public String apply(BulkRemarketingList c) {
                        return StringExtensions.toRemarketingRuleBulkString(c.getRemarketingList().getRule());
                    }
                },
                new BiConsumer<String, BulkRemarketingList>() {
                    @Override
                    public void accept(String v, BulkRemarketingList c) {
                        c.getRemarketingList().setRule(StringExtensions.parseRemarketingRule(v));
                    }
                }
        ));
		
        m.add(new SimpleBulkMapping<BulkRemarketingList, Long>(StringTable.AudienceNetworkSize,
                new Function<BulkRemarketingList, Long>() {
                    @Override
                    public Long apply(BulkRemarketingList c) {
                        return c.getRemarketingList().getAudienceNetworkSize();
                    }
                },
                new BiConsumer<String, BulkRemarketingList>() {
                    @Override
                    public void accept(String v, BulkRemarketingList c) {
                        c.getRemarketingList().setAudienceNetworkSize(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkRemarketingList, String>(StringTable.SupportedCampaignTypes,
                new Function<BulkRemarketingList, String>() {
                    @Override
                    public String apply(BulkRemarketingList c) {
                        return StringExtensions.writeArrayOfstring(c.getRemarketingList().getSupportedCampaignTypes(), ";");
                    }
                },
                new BiConsumer<String, BulkRemarketingList>() {
                    @Override
                    public void accept(String v, BulkRemarketingList c) {
                        c.getRemarketingList().setSupportedCampaignTypes(StringExtensions.parseArrayOfString(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setRemarketingList(new RemarketingList());
       
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getRemarketingList(), "RemarketingList");
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the remarketing list.
     */
    public RemarketingList getRemarketingList() {
        return this.remarketingList;
    }

    /**
     * Sets the remarketing list.
     */
    public void setRemarketingList(RemarketingList remarketingList) {
        this.remarketingList = remarketingList;
    }

    /**
     * Gets the status of the remarketing list.
     *
     * <p>
     *     The value is Active if the remarketing list is available in the account's shared library.
     *     The value is Deleted if the remarketing list is deleted from the library,
     *     or should be deleted in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the remarketing list.
     *
     * <p>
     *     The value is Active if the remarketing list is available to be associated with an ad group.
     *     The value is Deleted if the remarketing list is deleted, or should be deleted  
     *     in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public void setStatus(Status status) {
        this.status = status;
    }
}
