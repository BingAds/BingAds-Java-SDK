package com.microsoft.bingads.v12.bulk.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.EntityScope;
import com.microsoft.bingads.v12.campaignmanagement.ProductAudience;
import com.microsoft.bingads.v12.campaignmanagement.ProductAudienceType;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a product audience that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkProductAudience#setProductAudience} and {@link BulkProductAudience#getProductAudience}
 * methods that can be used to read and write fields of the Product Audience record in a bulk file.
 *
 * <p>
 *     For more information, see Product Audience at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkProductAudience extends SingleRecordBulkEntity {

    private ProductAudience productAudience;

    private Status status;

    private static final List<BulkMapping<BulkProductAudience>> MAPPINGS;

    static {
        List<BulkMapping<BulkProductAudience>> m = new ArrayList<BulkMapping<BulkProductAudience>>();

        m.add(new SimpleBulkMapping<BulkProductAudience, String>(StringTable.Status,
                new Function<BulkProductAudience, String>() {
                    @Override
                    public String apply(BulkProductAudience c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkProductAudience>() {
                    @Override
                    public void accept(String v, BulkProductAudience c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkProductAudience, Long>(StringTable.Id,
                new Function<BulkProductAudience, Long>() {
                    @Override
                    public Long apply(BulkProductAudience c) {
                        return c.getProductAudience().getId();
                    }
                },
                new BiConsumer<String, BulkProductAudience>() {
                    @Override
                    public void accept(String v, BulkProductAudience c) {
                        c.getProductAudience().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkProductAudience, Long>(StringTable.ParentId,
                new Function<BulkProductAudience, Long>() {
                    @Override
                    public Long apply(BulkProductAudience c) {
                        return c.getProductAudience().getParentId();
                    }
                },
                new BiConsumer<String, BulkProductAudience>() {
                    @Override
                    public void accept(String v, BulkProductAudience c) {
                        c.getProductAudience().setParentId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkProductAudience, String>(StringTable.Audience,
                new Function<BulkProductAudience, String>() {
                    @Override
                    public String apply(BulkProductAudience c) {
                        return c.getProductAudience().getName();
                    }
                },
                new BiConsumer<String, BulkProductAudience>() {
                    @Override
                    public void accept(String v, BulkProductAudience c) {
                        c.getProductAudience().setName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkProductAudience, Long>(StringTable.AudienceSearchSize,
                new Function<BulkProductAudience, Long>() {
                    @Override
                    public Long apply(BulkProductAudience c) {
                        return c.getProductAudience().getSearchSize();
                    }
                },
                new BiConsumer<String, BulkProductAudience>() {
                    @Override
                    public void accept(String v, BulkProductAudience c) {
                        c.getProductAudience().setSearchSize(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkProductAudience, String>(StringTable.Description,
                new Function<BulkProductAudience, String>() {
                    @Override
                    public String apply(BulkProductAudience c) {
                        return c.getProductAudience().getDescription();
                    }
                },
                new BiConsumer<String, BulkProductAudience>() {
                    @Override
                    public void accept(String v, BulkProductAudience c) {
                        c.getProductAudience().setDescription(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkProductAudience, Integer>(StringTable.MembershipDuration,
                new Function<BulkProductAudience, Integer>() {
                    @Override
                    public Integer apply(BulkProductAudience c) {
                        return c.getProductAudience().getMembershipDuration();
                    }
                },
                new BiConsumer<String, BulkProductAudience>() {
                    @Override
                    public void accept(String v, BulkProductAudience c) {
                        c.getProductAudience().setMembershipDuration(StringExtensions.<Integer>parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String value) {
                                return Integer.parseInt(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkProductAudience, String>(StringTable.Scope,
                new Function<BulkProductAudience, String>() {
                    @Override
                    public String apply(BulkProductAudience c) {
                        return c.getProductAudience().getScope() != null ? c.getProductAudience().getScope().value() : null;
                    }
                },
                new BiConsumer<String, BulkProductAudience>() {
                    @Override
                    public void accept(String v, BulkProductAudience c) {
                        c.getProductAudience().setScope(StringExtensions.parseOptional(v, new Function<String, EntityScope>() {
                            @Override
                            public EntityScope apply(String value) {
                                return EntityScope.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkProductAudience, Long>(StringTable.TagId,
                new Function<BulkProductAudience, Long>() {
                    @Override
                    public Long apply(BulkProductAudience c) {
                        return c.getProductAudience().getTagId();
                    }
                },
                new BiConsumer<String, BulkProductAudience>() {
                    @Override
                    public void accept(String v, BulkProductAudience c) {
                        c.getProductAudience().setTagId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkProductAudience, Long>(StringTable.AudienceNetworkSize,
                new Function<BulkProductAudience, Long>() {
                    @Override
                    public Long apply(BulkProductAudience c) {
                        return c.getProductAudience().getAudienceNetworkSize();
                    }
                },
                new BiConsumer<String, BulkProductAudience>() {
                    @Override
                    public void accept(String v, BulkProductAudience c) {
                        c.getProductAudience().setAudienceNetworkSize(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkProductAudience, String>(StringTable.SupportedCampaignTypes,
                new Function<BulkProductAudience, String>() {
                    @Override
                    public String apply(BulkProductAudience c) {
                        return StringExtensions.writeArrayOfstring(c.getProductAudience().getSupportedCampaignTypes(), ";");
                    }
                },
                new BiConsumer<String, BulkProductAudience>() {
                    @Override
                    public void accept(String v, BulkProductAudience c) {
                        c.getProductAudience().setSupportedCampaignTypes(StringExtensions.parseArrayOfString(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkProductAudience, String>(StringTable.ProductAudienceType,
                new Function<BulkProductAudience, String>() {
                    @Override
                    public String apply(BulkProductAudience c) {
                        Collection<ProductAudienceType> productAudienceTypes = c.getProductAudience().getProductAudienceType();
                        if (productAudienceTypes == null || productAudienceTypes.size() == 0) return null;
                        if (productAudienceTypes.size() != 1) {
                            throw new IllegalArgumentException("Only 1 Product Audience Type can be set in ProductAudience");
                        }
                        return (productAudienceTypes.toArray(new ProductAudienceType[productAudienceTypes.size()])[0]).value();
                    }
                },
                new BiConsumer<String, BulkProductAudience>() {
                    @Override
                    public void accept(String v, BulkProductAudience c) {
                        
                        ProductAudienceType productAudienceType = StringExtensions.parseOptional(v, new Function<String, ProductAudienceType>() {
                            @Override
                            public ProductAudienceType apply(String value) {
                                return ProductAudienceType.fromValue(value);
                            }
                        });
                        if (productAudienceType != null) {
                            c.getProductAudience().setProductAudienceType(Collections.singleton(productAudienceType));
                        }
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setProductAudience(new ProductAudience());
       
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getProductAudience(), "ProductAudience");
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the product audience.
     */
    public ProductAudience getProductAudience() {
        return this.productAudience;
    }

    /**
     * Sets the product audience.
     */
    public void setProductAudience(ProductAudience productAudience) {
        this.productAudience = productAudience;
    }

    /**
     * Gets the status of the product audience.
     *
     * <p>
     *     The value is Active if the product audience is available in the account's shared library.
     *     The value is Deleted if the product audience is deleted from the library,
     *     or should be deleted in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the product audience.
     *
     * <p>
     *     The value is Active if the product audience is available to be associated with an ad group.
     *     The value is Deleted if the product audience is deleted, or should be deleted  
     *     in a subsequent upload operation.
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public void setStatus(Status status) {
        this.status = status;
    }
}
