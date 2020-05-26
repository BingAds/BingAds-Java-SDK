package com.microsoft.bingads.v13.bulk.entities;

import java.text.ParseException;
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
import com.microsoft.bingads.v13.campaignmanagement.PromotionAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.PromotionDiscountModifier;
import com.microsoft.bingads.v13.campaignmanagement.PromotionOccasion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents an promotion ad extension that can be read or written in a bulk file.
 * This class exposes the properties
 * that can be read and written as fields of the Promotion Ad Extension record in a
 * bulk file.
 *
 * For more information, see Promotion Ad Extension at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkPromotionAdExtension extends BulkAdExtension<PromotionAdExtension> {

    /**
     * Gets the promotion ad extension.
     */
    public PromotionAdExtension getPromotionAdExtension() {
        return getAdExtension();
    }

    /**
     * Sets the promotion ad extension.
     */
    public void setPromotionAdExtension(PromotionAdExtension PromotionAdExtension) {
        setAdExtension(PromotionAdExtension);
    }

    private static final List<BulkMapping<BulkPromotionAdExtension>> MAPPINGS;
    
    private String actionText;

    static {
        List<BulkMapping<BulkPromotionAdExtension>> m = new ArrayList<BulkMapping<BulkPromotionAdExtension>>();

        m.add(new SimpleBulkMapping<BulkPromotionAdExtension, String>(StringTable.CurrencyCode,
                new Function<BulkPromotionAdExtension, String>() {
                    @Override
                    public String apply(BulkPromotionAdExtension t) {
                        return t.getPromotionAdExtension().getCurrencyCode();
                    }
                },
                new BiConsumer<String, BulkPromotionAdExtension>() {
                    @Override
                    public void accept(String v, BulkPromotionAdExtension c) {
                        c.getPromotionAdExtension().setCurrencyCode(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkPromotionAdExtension, String>(StringTable.Language,
                new Function<BulkPromotionAdExtension, String>() {
                    @Override
                    public String apply(BulkPromotionAdExtension t) {
                        return t.getPromotionAdExtension().getLanguage();
                    }
                },
                new BiConsumer<String, BulkPromotionAdExtension>() {
                    @Override
                    public void accept(String v, BulkPromotionAdExtension c) {
                        c.getPromotionAdExtension().setLanguage(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkPromotionAdExtension, String>(StringTable.PromotionCode,
                new Function<BulkPromotionAdExtension, String>() {
                    @Override
                    public String apply(BulkPromotionAdExtension t) {
                        return StringExtensions.toOptionalBulkString(t.getPromotionAdExtension().getPromotionCode(), t.getPromotionAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkPromotionAdExtension>() {
                    @Override
                    public void accept(String v, BulkPromotionAdExtension c) {
                        c.getPromotionAdExtension().setPromotionCode(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkPromotionAdExtension, String>(StringTable.PromotionTarget,
                new Function<BulkPromotionAdExtension, String>() {
                    @Override
                    public String apply(BulkPromotionAdExtension t) {
                        return t.getPromotionAdExtension().getPromotionItem();
                    }
                },
                new BiConsumer<String, BulkPromotionAdExtension>() {
                    @Override
                    public void accept(String v, BulkPromotionAdExtension c) {
                        c.getPromotionAdExtension().setPromotionItem(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkPromotionAdExtension, String>(StringTable.PromotionStart,
                new Function<BulkPromotionAdExtension, String>() {
                    @Override
                    public String apply(BulkPromotionAdExtension t) {
                        return StringExtensions.toScheduleDateBulkString(t.getPromotionAdExtension().getPromotionStartDate(), t.getPromotionAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkPromotionAdExtension>() {
                    @Override
                    public void accept(String v, BulkPromotionAdExtension c) {
                        try {
                            c.getPromotionAdExtension().setPromotionStartDate(StringExtensions.parseDate(v));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkPromotionAdExtension, String>(StringTable.PromotionEnd,
                new Function<BulkPromotionAdExtension, String>() {
                    @Override
                    public String apply(BulkPromotionAdExtension t) {
                        return StringExtensions.toScheduleDateBulkString(t.getPromotionAdExtension().getPromotionEndDate(), t.getPromotionAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkPromotionAdExtension>() {
                    @Override
                    public void accept(String v, BulkPromotionAdExtension c) {
                        try {
                            c.getPromotionAdExtension().setPromotionEndDate(StringExtensions.parseDate(v));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkPromotionAdExtension, String>(StringTable.MoneyAmountOff,
                new Function<BulkPromotionAdExtension, String>() {
                    @Override
                    public String apply(BulkPromotionAdExtension t) {
                        return StringExtensions.toBulkString(t.getPromotionAdExtension().getMoneyAmountOff());
                    }
                },
                new BiConsumer<String, BulkPromotionAdExtension>() {
                    @Override
                    public void accept(String v, BulkPromotionAdExtension c) {
                        c.getPromotionAdExtension().setMoneyAmountOff(StringExtensions.parseOptional(v,  new Function<String, Double>() {
                            @Override
                            public Double apply(String value) {
                                return Double.parseDouble(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkPromotionAdExtension, String>(StringTable.OrdersOverAmount,
                new Function<BulkPromotionAdExtension, String>() {
                    @Override
                    public String apply(BulkPromotionAdExtension t) {
                        return StringExtensions.toBulkString(t.getPromotionAdExtension().getOrdersOverAmount());
                    }
                },
                new BiConsumer<String, BulkPromotionAdExtension>() {
                    @Override
                    public void accept(String v, BulkPromotionAdExtension c) {
                        c.getPromotionAdExtension().setOrdersOverAmount(StringExtensions.parseOptional(v,  new Function<String, Double>() {
                            @Override
                            public Double apply(String value) {
                                return Double.parseDouble(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkPromotionAdExtension, String>(StringTable.PercentOff,
                new Function<BulkPromotionAdExtension, String>() {
                    @Override
                    public String apply(BulkPromotionAdExtension t) {
                        return StringExtensions.toBulkString(t.getPromotionAdExtension().getPercentOff());
                    }
                },
                new BiConsumer<String, BulkPromotionAdExtension>() {
                    @Override
                    public void accept(String v, BulkPromotionAdExtension c) {
                        c.getPromotionAdExtension().setPercentOff(StringExtensions.parseOptional(v,  new Function<String, Double>() {
                            @Override
                            public Double apply(String value) {
                                return Double.parseDouble(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkPromotionAdExtension, String>(StringTable.DiscountModifier,
                new Function<BulkPromotionAdExtension, String>() {
                    @Override
                    public String apply(BulkPromotionAdExtension t) {
                        if (t.getPromotionAdExtension().getDiscountModifier() == null) return null;
                        return StringExtensions.toBulkString(t.getPromotionAdExtension().getDiscountModifier().value());
                    }
                },
                new BiConsumer<String, BulkPromotionAdExtension>() {
                    @Override
                    public void accept(String v, BulkPromotionAdExtension c) {
                        c.getPromotionAdExtension().setDiscountModifier(StringExtensions.parseOptional(v,  new Function<String, PromotionDiscountModifier>() {
                            @Override
                            public PromotionDiscountModifier apply(String value) {
                                return PromotionDiscountModifier.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkPromotionAdExtension, String>(StringTable.Occasion,
                new Function<BulkPromotionAdExtension, String>() {
                    @Override
                    public String apply(BulkPromotionAdExtension t) {
                        if (t.getPromotionAdExtension().getPromotionOccasion() == null) return null;
                        return StringExtensions.toBulkString(t.getPromotionAdExtension().getPromotionOccasion().value());
                    }
                },
                new BiConsumer<String, BulkPromotionAdExtension>() {
                    @Override
                    public void accept(String v, BulkPromotionAdExtension c) {
                        c.getPromotionAdExtension().setPromotionOccasion(StringExtensions.parseOptional(v,  new Function<String, PromotionOccasion>() {
                            @Override
                            public PromotionOccasion apply(String value) {
                                return PromotionOccasion.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkPromotionAdExtension, String>(StringTable.FinalUrl,
                new Function<BulkPromotionAdExtension, String>() {
                    @Override
                    public String apply(BulkPromotionAdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getPromotionAdExtension().getFinalUrls(), c.getPromotionAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkPromotionAdExtension>() {
                    @Override
                    public void accept(String v, BulkPromotionAdExtension c) {
                        ArrayOfstring urls = new ArrayOfstring();
                        List<String> urlArray = StringExtensions.parseUrls(v);
                        if(urlArray == null) {
                            urls = null;
                        } else {
                            urls.getStrings().addAll(urlArray);
                        }
                        c.getPromotionAdExtension().setFinalUrls(urls);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkPromotionAdExtension, String>(StringTable.FinalMobileUrl,
                new Function<BulkPromotionAdExtension, String>() {
                    @Override
                    public String apply(BulkPromotionAdExtension c) {
                        return StringExtensions.writeUrls("; ", c.getPromotionAdExtension().getFinalMobileUrls(), c.getPromotionAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkPromotionAdExtension>() {
                    @Override
                    public void accept(String v, BulkPromotionAdExtension c) {
                        ArrayOfstring urls = new ArrayOfstring();
                        List<String> urlArray = StringExtensions.parseUrls(v);
                        if(urlArray == null) {
                            urls = null;
                        } else {
                            urls.getStrings().addAll(urlArray);
                        }
                        c.getPromotionAdExtension().setFinalMobileUrls(urls);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkPromotionAdExtension, String>(StringTable.TrackingTemplate,
                new Function<BulkPromotionAdExtension, String>() {
                    @Override
                    public String apply(BulkPromotionAdExtension t) {
                        return StringExtensions.toOptionalBulkString(t.getPromotionAdExtension().getTrackingUrlTemplate(), t.getPromotionAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkPromotionAdExtension>() {
                    @Override
                    public void accept(String v, BulkPromotionAdExtension c) {
                        c.getPromotionAdExtension().setTrackingUrlTemplate(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));


        m.add(new SimpleBulkMapping<BulkPromotionAdExtension, String>(StringTable.CustomParameter,
                new Function<BulkPromotionAdExtension, String>() {
                    @Override
                    public String apply(BulkPromotionAdExtension c) {
                        return StringExtensions.toCustomParaBulkString(c.getPromotionAdExtension().getUrlCustomParameters(), c.getPromotionAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkPromotionAdExtension>() {
                    @Override
                    public void accept(String v, BulkPromotionAdExtension c) {
                        try {
                                c.getPromotionAdExtension().setUrlCustomParameters(StringExtensions.parseCustomParameters(v));
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkPromotionAdExtension, String>(StringTable.FinalUrlSuffix,
                new Function<BulkPromotionAdExtension, String>() {
                    @Override
                    public String apply(BulkPromotionAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getAdExtension().getFinalUrlSuffix(), c.getAdExtension().getId());
                    }
                },
                new BiConsumer<String, BulkPromotionAdExtension>() {
                    @Override
                    public void accept(String v, BulkPromotionAdExtension c) {
                        c.getAdExtension().setFinalUrlSuffix(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        PromotionAdExtension extension = new PromotionAdExtension();

        extension.setType("PromotionAdExtension");

        setAdExtension(extension);

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(this.getPromotionAdExtension(), "PromotionAdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    public String getActionText() {
        return actionText;
    }

    public void setActionText(String actionText) {
        this.actionText = actionText;
    }
    
}
