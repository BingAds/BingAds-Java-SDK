package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.CustomAudience;
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
 * Represents a custom audience that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkCustomAudience#setCustomAudience} and {@link BulkCustomAudience#getCustomAudience}
 * methods that can be used to read and write fields of the Custom Audience record in a bulk file.
 *
 * <p>
 *     For more information, see Custom Audience at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCustomAudience extends SingleRecordBulkEntity {

    private CustomAudience customAudience;

    private Status status;

    private static final List<BulkMapping<BulkCustomAudience>> MAPPINGS;

    static {
        List<BulkMapping<BulkCustomAudience>> m = new ArrayList<BulkMapping<BulkCustomAudience>>();

        m.add(new SimpleBulkMapping<BulkCustomAudience, String>(StringTable.Status,
                new Function<BulkCustomAudience, String>() {
                    @Override
                    public String apply(BulkCustomAudience c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkCustomAudience>() {
                    @Override
                    public void accept(String v, BulkCustomAudience c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCustomAudience, Long>(StringTable.Id,
                new Function<BulkCustomAudience, Long>() {
                    @Override
                    public Long apply(BulkCustomAudience c) {
                        return c.getCustomAudience().getId();
                    }
                },
                new BiConsumer<String, BulkCustomAudience>() {
                    @Override
                    public void accept(String v, BulkCustomAudience c) {
                        c.getCustomAudience().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCustomAudience, Long>(StringTable.ParentId,
                new Function<BulkCustomAudience, Long>() {
                    @Override
                    public Long apply(BulkCustomAudience c) {
                        return c.getCustomAudience().getParentId();
                    }
                },
                new BiConsumer<String, BulkCustomAudience>() {
                    @Override
                    public void accept(String v, BulkCustomAudience c) {
                        c.getCustomAudience().setParentId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCustomAudience, String>(StringTable.Audience,
                new Function<BulkCustomAudience, String>() {
                    @Override
                    public String apply(BulkCustomAudience c) {
                        return c.getCustomAudience().getName();
                    }
                },
                new BiConsumer<String, BulkCustomAudience>() {
                    @Override
                    public void accept(String v, BulkCustomAudience c) {
                        c.getCustomAudience().setName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCustomAudience, Long>(StringTable.AudienceSearchSize,
                new Function<BulkCustomAudience, Long>() {
                    @Override
                    public Long apply(BulkCustomAudience c) {
                        return c.getCustomAudience().getSearchSize();
                    }
                },
                new BiConsumer<String, BulkCustomAudience>() {
                    @Override
                    public void accept(String v, BulkCustomAudience c) {
                        c.getCustomAudience().setSearchSize(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCustomAudience, String>(StringTable.Description,
                new Function<BulkCustomAudience, String>() {
                    @Override
                    public String apply(BulkCustomAudience c) {
                        return c.getCustomAudience().getDescription();
                    }
                },
                new BiConsumer<String, BulkCustomAudience>() {
                    @Override
                    public void accept(String v, BulkCustomAudience c) {
                        c.getCustomAudience().setDescription(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCustomAudience, Integer>(StringTable.MembershipDuration,
                new Function<BulkCustomAudience, Integer>() {
                    @Override
                    public Integer apply(BulkCustomAudience c) {
                        return c.getCustomAudience().getMembershipDuration();
                    }
                },
                new BiConsumer<String, BulkCustomAudience>() {
                    @Override
                    public void accept(String v, BulkCustomAudience c) {
                        c.getCustomAudience().setMembershipDuration(StringExtensions.<Integer>parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String value) {
                                return Integer.parseInt(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCustomAudience, String>(StringTable.Scope,
                new Function<BulkCustomAudience, String>() {
                    @Override
                    public String apply(BulkCustomAudience c) {
                        return c.getCustomAudience().getScope() != null ? c.getCustomAudience().getScope().value() : null;
                    }
                },
                new BiConsumer<String, BulkCustomAudience>() {
                    @Override
                    public void accept(String v, BulkCustomAudience c) {
                        c.getCustomAudience().setScope(StringExtensions.parseOptional(v, new Function<String, EntityScope>() {
                            @Override
                            public EntityScope apply(String value) {
                                return EntityScope.fromValue(value);
                            }
                        }));
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkCustomAudience, Long>(StringTable.AudienceNetworkSize,
                new Function<BulkCustomAudience, Long>() {
                    @Override
                    public Long apply(BulkCustomAudience c) {
                        return c.getCustomAudience().getAudienceNetworkSize();
                    }
                },
                new BiConsumer<String, BulkCustomAudience>() {
                    @Override
                    public void accept(String v, BulkCustomAudience c) {
                        c.getCustomAudience().setAudienceNetworkSize(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCustomAudience, String>(StringTable.SupportedCampaignTypes,
                new Function<BulkCustomAudience, String>() {
                    @Override
                    public String apply(BulkCustomAudience c) {
                        return StringExtensions.writeArrayOfstring(c.getCustomAudience().getSupportedCampaignTypes(), ";");
                    }
                },
                new BiConsumer<String, BulkCustomAudience>() {
                    @Override
                    public void accept(String v, BulkCustomAudience c) {
                        c.getCustomAudience().setSupportedCampaignTypes(StringExtensions.parseArrayOfString(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setCustomAudience(new CustomAudience());
       
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getCustomAudience(), "CustomAudience");
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the custom audience.
     */
    public CustomAudience getCustomAudience() {
        return this.customAudience;
    }

    /**
     * Sets the custom audience.
     */
    public void setCustomAudience(CustomAudience customAudience) {
        this.customAudience = customAudience;
    }

    /**
     * Gets the status of the custom audience.
     *
     * <p>
     *     The value is Active if the custom audience is available in the account's shared library.
     *     The value is Deleted if the custom audience is deleted from the library,
     *     or should be deleted in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the custom audience.
     *
     * <p>
     *     The value is Active if the custom audience is available to be associated with an ad group.
     *     The value is Deleted if the custom audience is deleted, or should be deleted  
     *     in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public void setStatus(Status status) {
        this.status = status;
    }
}
