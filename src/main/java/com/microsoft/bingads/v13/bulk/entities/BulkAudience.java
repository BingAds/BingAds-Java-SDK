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
import com.microsoft.bingads.v13.campaignmanagement.Audience;
import com.microsoft.bingads.v13.campaignmanagement.EntityScope;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a basic audience that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkAudience#setAudience} and {@link BulkAudience#getAudience}
 * methods that can be used to read and write fields of the Audience record in a bulk file.
 *
 * <p>
 *     For more information, see Audience at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public abstract class BulkAudience<T extends Audience> extends SingleRecordBulkEntity {
    
    private T audience;

    private Status status;

    private static final List<BulkMapping<BulkAudience>> MAPPINGS;

    static {
        List<BulkMapping<BulkAudience>> m = new ArrayList<BulkMapping<BulkAudience>>();

        m.add(new SimpleBulkMapping<BulkAudience, String>(StringTable.Status,
                new Function<BulkAudience, String>() {
                    @Override
                    public String apply(BulkAudience c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAudience>() {
                    @Override
                    public void accept(String v, BulkAudience c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return StringExtensions.fromValueOptional(value, Status.class);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAudience, Long>(StringTable.Id,
                new Function<BulkAudience, Long>() {
                    @Override
                    public Long apply(BulkAudience c) {
                        return c.getAudience().getId();
                    }
                },
                new BiConsumer<String, BulkAudience>() {
                    @Override
                    public void accept(String v, BulkAudience c) {
                        c.getAudience().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAudience, Long>(StringTable.ParentId,
                new Function<BulkAudience, Long>() {
                    @Override
                    public Long apply(BulkAudience c) {
                        return c.getAudience().getParentId();
                    }
                },
                new BiConsumer<String, BulkAudience>() {
                    @Override
                    public void accept(String v, BulkAudience c) {
                        c.getAudience().setParentId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAudience, String>(StringTable.Audience,
                new Function<BulkAudience, String>() {
                    @Override
                    public String apply(BulkAudience c) {
                        return c.getAudience().getName();
                    }
                },
                new BiConsumer<String, BulkAudience>() {
                    @Override
                    public void accept(String v, BulkAudience c) {
                        c.getAudience().setName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAudience, Long>(StringTable.AudienceSearchSize,
                new Function<BulkAudience, Long>() {
                    @Override
                    public Long apply(BulkAudience c) {
                        return c.getAudience().getSearchSize();
                    }
                },
                new BiConsumer<String, BulkAudience>() {
                    @Override
                    public void accept(String v, BulkAudience c) {
                        c.getAudience().setSearchSize(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAudience, String>(StringTable.Description,
                new Function<BulkAudience, String>() {
                    @Override
                    public String apply(BulkAudience c) {
                        return c.getAudience().getDescription();
                    }
                },
                new BiConsumer<String, BulkAudience>() {
                    @Override
                    public void accept(String v, BulkAudience c) {
                        c.getAudience().setDescription(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAudience, Integer>(StringTable.MembershipDuration,
                new Function<BulkAudience, Integer>() {
                    @Override
                    public Integer apply(BulkAudience c) {
                        return c.getAudience().getMembershipDuration();
                    }
                },
                new BiConsumer<String, BulkAudience>() {
                    @Override
                    public void accept(String v, BulkAudience c) {
                        c.getAudience().setMembershipDuration(StringExtensions.<Integer>parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String value) {
                                return Integer.parseInt(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAudience, String>(StringTable.Scope,
                new Function<BulkAudience, String>() {
                    @Override
                    public String apply(BulkAudience c) {
                        return c.getAudience().getScope() != null ? c.getAudience().getScope().value() : null;
                    }
                },
                new BiConsumer<String, BulkAudience>() {
                    @Override
                    public void accept(String v, BulkAudience c) {
                        c.getAudience().setScope(StringExtensions.parseOptional(v, new Function<String, EntityScope>() {
                            @Override
                            public EntityScope apply(String value) {
                                return StringExtensions.fromValueOptional(value, EntityScope.class);
                            }
                        }));
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkAudience, Long>(StringTable.AudienceNetworkSize,
                new Function<BulkAudience, Long>() {
                    @Override
                    public Long apply(BulkAudience c) {
                        return c.getAudience().getAudienceNetworkSize();
                    }
                },
                new BiConsumer<String, BulkAudience>() {
                    @Override
                    public void accept(String v, BulkAudience c) {
                        c.getAudience().setAudienceNetworkSize(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAudience, String>(StringTable.SupportedCampaignTypes,
                new Function<BulkAudience, String>() {
                    @Override
                    public String apply(BulkAudience c) {
                        return StringExtensions.writeArrayOfstring(c.getAudience().getSupportedCampaignTypes(), ";");
                    }
                },
                new BiConsumer<String, BulkAudience>() {
                    @Override
                    public void accept(String v, BulkAudience c) {
                        c.getAudience().setSupportedCampaignTypes(StringExtensions.parseArrayOfString(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setAudience(createAudience());
       
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAudience(), "Audience");
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
    
    public abstract T createAudience();

    /**
     * Gets the audience.
     */
    public T getAudience() {
        return audience;
    }

    /**
     * Sets the audience.
     */
    public void setAudience(T audience) {
        this.audience = audience;
    }

    /**
     * Gets the status of the audience.
     *
     * <p>
     *     The value is Active if the audience is available in the account's shared library.
     *     The value is Deleted if the audience is deleted from the library,
     *     or should be deleted in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the audience.
     *
     * <p>
     *     The value is Active if the audience is available to be associated with an ad group.
     *     The value is Deleted if the audience is deleted, or should be deleted  
     *     in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public void setStatus(Status status) {
        this.status = status;
    }
}
