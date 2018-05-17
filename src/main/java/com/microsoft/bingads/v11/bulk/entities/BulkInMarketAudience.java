package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.InMarketAudience;
import com.microsoft.bingads.v11.campaignmanagement.EntityScope;
import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkFileWriter;
import com.microsoft.bingads.v11.bulk.BulkOperation;
import com.microsoft.bingads.v11.internal.bulk.StringExtensions;
import com.microsoft.bingads.v11.internal.bulk.StringTable;
import com.microsoft.bingads.v11.internal.bulk.BulkMapping;
import com.microsoft.bingads.v11.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v11.internal.bulk.RowValues;
import com.microsoft.bingads.v11.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v11.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents an in market audience that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkInMarketAudience#setInMarketAudience} and {@link BulkInMarketAudience#getInMarketAudience}
 * methods that can be used to read and write fields of the In Market Audience record in a bulk file.
 *
 * <p>
 *     For more information, see In Market Audience at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkInMarketAudience extends SingleRecordBulkEntity {

    private InMarketAudience inMarketAudience;

    private Status status;

    private static final List<BulkMapping<BulkInMarketAudience>> MAPPINGS;

    static {
        List<BulkMapping<BulkInMarketAudience>> m = new ArrayList<BulkMapping<BulkInMarketAudience>>();

        m.add(new SimpleBulkMapping<BulkInMarketAudience, String>(StringTable.Status,
                new Function<BulkInMarketAudience, String>() {
                    @Override
                    public String apply(BulkInMarketAudience c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkInMarketAudience>() {
                    @Override
                    public void accept(String v, BulkInMarketAudience c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkInMarketAudience, Long>(StringTable.Id,
                new Function<BulkInMarketAudience, Long>() {
                    @Override
                    public Long apply(BulkInMarketAudience c) {
                        return c.getInMarketAudience().getId();
                    }
                },
                new BiConsumer<String, BulkInMarketAudience>() {
                    @Override
                    public void accept(String v, BulkInMarketAudience c) {
                        c.getInMarketAudience().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkInMarketAudience, Long>(StringTable.ParentId,
                new Function<BulkInMarketAudience, Long>() {
                    @Override
                    public Long apply(BulkInMarketAudience c) {
                        return c.getInMarketAudience().getParentId();
                    }
                },
                new BiConsumer<String, BulkInMarketAudience>() {
                    @Override
                    public void accept(String v, BulkInMarketAudience c) {
                        c.getInMarketAudience().setParentId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkInMarketAudience, String>(StringTable.Audience,
                new Function<BulkInMarketAudience, String>() {
                    @Override
                    public String apply(BulkInMarketAudience c) {
                        return c.getInMarketAudience().getName();
                    }
                },
                new BiConsumer<String, BulkInMarketAudience>() {
                    @Override
                    public void accept(String v, BulkInMarketAudience c) {
                        c.getInMarketAudience().setName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkInMarketAudience, Long>(StringTable.AudienceSearchSize,
                new Function<BulkInMarketAudience, Long>() {
                    @Override
                    public Long apply(BulkInMarketAudience c) {
                        return c.getInMarketAudience().getSearchSize();
                    }
                },
                new BiConsumer<String, BulkInMarketAudience>() {
                    @Override
                    public void accept(String v, BulkInMarketAudience c) {
                        c.getInMarketAudience().setSearchSize(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkInMarketAudience, String>(StringTable.Description,
                new Function<BulkInMarketAudience, String>() {
                    @Override
                    public String apply(BulkInMarketAudience c) {
                        return c.getInMarketAudience().getDescription();
                    }
                },
                new BiConsumer<String, BulkInMarketAudience>() {
                    @Override
                    public void accept(String v, BulkInMarketAudience c) {
                        c.getInMarketAudience().setDescription(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkInMarketAudience, Integer>(StringTable.MembershipDuration,
                new Function<BulkInMarketAudience, Integer>() {
                    @Override
                    public Integer apply(BulkInMarketAudience c) {
                        return c.getInMarketAudience().getMembershipDuration();
                    }
                },
                new BiConsumer<String, BulkInMarketAudience>() {
                    @Override
                    public void accept(String v, BulkInMarketAudience c) {
                        c.getInMarketAudience().setMembershipDuration(StringExtensions.<Integer>parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String value) {
                                return Integer.parseInt(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkInMarketAudience, String>(StringTable.Scope,
                new Function<BulkInMarketAudience, String>() {
                    @Override
                    public String apply(BulkInMarketAudience c) {
                        return c.getInMarketAudience().getScope() != null ? c.getInMarketAudience().getScope().value() : null;
                    }
                },
                new BiConsumer<String, BulkInMarketAudience>() {
                    @Override
                    public void accept(String v, BulkInMarketAudience c) {
                        c.getInMarketAudience().setScope(StringExtensions.parseOptional(v, new Function<String, EntityScope>() {
                            @Override
                            public EntityScope apply(String value) {
                                return EntityScope.fromValue(value);
                            }
                        }));
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkInMarketAudience, Long>(StringTable.AudienceNetworkSize,
                new Function<BulkInMarketAudience, Long>() {
                    @Override
                    public Long apply(BulkInMarketAudience c) {
                        return c.getInMarketAudience().getAudienceNetworkSize();
                    }
                },
                new BiConsumer<String, BulkInMarketAudience>() {
                    @Override
                    public void accept(String v, BulkInMarketAudience c) {
                        c.getInMarketAudience().setAudienceNetworkSize(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkInMarketAudience, String>(StringTable.SupportedCampaignTypes,
                new Function<BulkInMarketAudience, String>() {
                    @Override
                    public String apply(BulkInMarketAudience c) {
                        return StringExtensions.writeArrayOfstring(c.getInMarketAudience().getSupportedCampaignTypes(), ";");
                    }
                },
                new BiConsumer<String, BulkInMarketAudience>() {
                    @Override
                    public void accept(String v, BulkInMarketAudience c) {
                        c.getInMarketAudience().setSupportedCampaignTypes(StringExtensions.parseArrayOfString(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setInMarketAudience(new InMarketAudience());
       
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getInMarketAudience(), "InMarketAudience");
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the in market audience.
     */
    public InMarketAudience getInMarketAudience() {
        return this.inMarketAudience;
    }

    /**
     * Sets the in market audience.
     */
    public void setInMarketAudience(InMarketAudience inMarketAudience) {
        this.inMarketAudience = inMarketAudience;
    }

    /**
     * Gets the status of the in market audience.
     *
     * <p>
     *     The value is Active if the in market audience is available in the account's shared library.
     *     The value is Deleted if the in market audience is deleted from the library,
     *     or should be deleted in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the in market audience.
     *
     * <p>
     *     The value is Active if the in market audience is available to be associated with an ad group.
     *     The value is Deleted if the in market audience is deleted, or should be deleted  
     *     in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public void setStatus(Status status) {
        this.status = status;
    }
}
