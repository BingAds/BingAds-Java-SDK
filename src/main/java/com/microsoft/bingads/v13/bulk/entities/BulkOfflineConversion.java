package com.microsoft.bingads.v13.bulk.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import com.microsoft.bingads.internal.UncheckedParseException;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.OfflineConversion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an OfflineConversion that can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Label at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkOfflineConversion extends SingleRecordBulkEntity {

    private OfflineConversion offlineConversion;
    
    private Double adjustmentValue;

    private Calendar adjustmentTime;
    
    private String adjustmentCurrencyCode;
    
    private String adjustmentType;
    
    private String externalAttributionModel;
    
    private Double externalAttributionCredit;
    

    private static final List<BulkMapping<BulkOfflineConversion>> MAPPINGS;

    static {
        List<BulkMapping<BulkOfflineConversion>> m = new ArrayList<BulkMapping<BulkOfflineConversion>>();

        m.add(new SimpleBulkMapping<BulkOfflineConversion, String>(StringTable.ConversionCurrencyCode,
                new Function<BulkOfflineConversion, String>() {
                    @Override
                    public String apply(BulkOfflineConversion c) {
                        return c.getOfflineConversion().getConversionCurrencyCode();
                    }
                },
                new BiConsumer<String, BulkOfflineConversion>() {
                    @Override
                    public void accept(String v, BulkOfflineConversion c) {
                        c.getOfflineConversion().setConversionCurrencyCode(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkOfflineConversion, String>(StringTable.ConversionName,
                new Function<BulkOfflineConversion, String>() {
                    @Override
                    public String apply(BulkOfflineConversion c) {
                        return c.getOfflineConversion().getConversionName();
                    }
                },
                new BiConsumer<String, BulkOfflineConversion>() {
                    @Override
                    public void accept(String v, BulkOfflineConversion c) {
                        c.getOfflineConversion().setConversionName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkOfflineConversion, String>(StringTable.MicrosoftClickId,
                new Function<BulkOfflineConversion, String>() {
                    @Override
                    public String apply(BulkOfflineConversion c) {
                        return c.getOfflineConversion().getMicrosoftClickId();
                    }
                },
                new BiConsumer<String, BulkOfflineConversion>() {
                    @Override
                    public void accept(String v, BulkOfflineConversion c) {
                        c.getOfflineConversion().setMicrosoftClickId(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkOfflineConversion, String>(StringTable.ConversionTime,
                new Function<BulkOfflineConversion, String>() {
                    @Override
                    public String apply(BulkOfflineConversion t) {
                        if (t.getOfflineConversion().getConversionTime() == null) {
                            return null;
                        }

                        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                        format.setTimeZone(TimeZone.getTimeZone("UTC"));

                        return format.format(t.getOfflineConversion().getConversionTime().getTime());
                    }
                },
                new BiConsumer<String, BulkOfflineConversion>() {
                    @Override
                    public void accept(String v, BulkOfflineConversion c) {
                        c.getOfflineConversion().setConversionTime(StringExtensions.parseOptional(v, new Function<String, Calendar>() {
                            @Override
                            public Calendar apply(String t) {
                                Calendar c = new GregorianCalendar();
                                try {
                                    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                                    format.setTimeZone(TimeZone.getTimeZone("UTC"));

                                    c.setTime(format.parse(t));
                                } catch (ParseException ex) {
                                    throw new UncheckedParseException(ex);
                                }

                                return c;
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkOfflineConversion, Double>(StringTable.ConversionValue,
                new Function<BulkOfflineConversion, Double>() {
                    @Override
                    public Double apply(BulkOfflineConversion c) {
                        return c.getOfflineConversion().getConversionValue();
                    }
                },
                new BiConsumer<String, BulkOfflineConversion>() {
                    @Override
                    public void accept(String v, BulkOfflineConversion c) {
                        c.getOfflineConversion().setConversionValue(StringExtensions.nullOrDouble(v));
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkOfflineConversion, Double>(StringTable.AdjustmentValue,
                new Function<BulkOfflineConversion, Double>() {
                    @Override
                    public Double apply(BulkOfflineConversion c) {
                        return c.getAdjustmentValue();
                    }
                },
                new BiConsumer<String, BulkOfflineConversion>() {
                    @Override
                    public void accept(String v, BulkOfflineConversion c) {
                        c.setAdjustmentValue(StringExtensions.nullOrDouble(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkOfflineConversion, Double>(StringTable.ExternalAttributionCredit,
                new Function<BulkOfflineConversion, Double>() {
                    @Override
                    public Double apply(BulkOfflineConversion c) {
                        return c.getExternalAttributionCredit();
                    }
                },
                new BiConsumer<String, BulkOfflineConversion>() {
                    @Override
                    public void accept(String v, BulkOfflineConversion c) {
                        c.setExternalAttributionCredit(StringExtensions.nullOrDouble(v));
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkOfflineConversion, String>(StringTable.AdjustmentTime, 
                new Function<BulkOfflineConversion, String>() {
                    @Override
                    public String apply(BulkOfflineConversion t) {
                        if (t.getAdjustmentTime() == null) {
                            return null;
                        }
        
                        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        
                        return format.format(t.getAdjustmentTime().getTime());
                    }
                },
                new BiConsumer<String, BulkOfflineConversion>() {
                    @Override
                    public void accept(String v, BulkOfflineConversion c) {
                        c.setAdjustmentTime(StringExtensions.parseOptional(v, new Function<String, Calendar>() {
                            @Override
                            public Calendar apply(String t) {
                                Calendar c = new GregorianCalendar();
                                try {
                                    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                                    format.setTimeZone(TimeZone.getTimeZone("UTC"));
        
                                    c.setTime(format.parse(t));
                                } catch (ParseException ex) {
                                    throw new UncheckedParseException(ex);
                                }
        
                                return c;
                            }
                        }));
                    }
                }
        ));        

        m.add(new SimpleBulkMapping<BulkOfflineConversion, String>(StringTable.AdjustmentCurrencyCode,
                new Function<BulkOfflineConversion, String>() {
                    @Override
                    public String apply(BulkOfflineConversion c) {
                        return c.getAdjustmentCurrencyCode();
                    }
                },
                new BiConsumer<String, BulkOfflineConversion>() {
                    @Override
                    public void accept(String v, BulkOfflineConversion c) {
                        c.setAdjustmentCurrencyCode(v);
                    }
                }
        ));        

        m.add(new SimpleBulkMapping<BulkOfflineConversion, String>(StringTable.AdjustmentType,
                new Function<BulkOfflineConversion, String>() {
                    @Override
                    public String apply(BulkOfflineConversion c) {
                        return c.getAdjustmentType();
                    }
                },
                new BiConsumer<String, BulkOfflineConversion>() {
                    @Override
                    public void accept(String v, BulkOfflineConversion c) {
                        c.setAdjustmentType(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkOfflineConversion, String>(StringTable.ExternalAttributionModel,
                new Function<BulkOfflineConversion, String>() {
                    @Override
                    public String apply(BulkOfflineConversion c) {
                        return c.getExternalAttributionModel();
                    }
                },
                new BiConsumer<String, BulkOfflineConversion>() {
                    @Override
                    public void accept(String v, BulkOfflineConversion c) {
                        c.setExternalAttributionModel(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkOfflineConversion, String>(StringTable.HashedEmailAddress,
                new Function<BulkOfflineConversion, String>() {
                    @Override
                    public String apply(BulkOfflineConversion c) {
                        return c.getOfflineConversion().getHashedEmailAddress();
                    }
                },
                new BiConsumer<String, BulkOfflineConversion>() {
                    @Override
                    public void accept(String v, BulkOfflineConversion c) {
                        c.getOfflineConversion().setHashedEmailAddress(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkOfflineConversion, String>(StringTable.HashedPhoneNumber,
                new Function<BulkOfflineConversion, String>() {
                    @Override
                    public String apply(BulkOfflineConversion c) {
                        return c.getOfflineConversion().getHashedPhoneNumber();
                    }
                },
                new BiConsumer<String, BulkOfflineConversion>() {
                    @Override
                    public void accept(String v, BulkOfflineConversion c) {
                        c.getOfflineConversion().setHashedPhoneNumber(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    public OfflineConversion getOfflineConversion() {
        return offlineConversion;
    }

    public void setOfflineConversion(OfflineConversion offlineConversion) {
        this.offlineConversion = offlineConversion;
    }
    

    public Double getAdjustmentValue() {
        return adjustmentValue;
    }

    public void setAdjustmentValue(Double adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
    }

    public Calendar getAdjustmentTime() {
        return adjustmentTime;
    }

    public void setAdjustmentTime(Calendar adjustmentTime) {
        this.adjustmentTime = adjustmentTime;
    }

    public String getAdjustmentCurrencyCode() {
        return adjustmentCurrencyCode;
    }

    public void setAdjustmentCurrencyCode(String adjustmentCurrencyCode) {
        this.adjustmentCurrencyCode = adjustmentCurrencyCode;
    }

    public String getAdjustmentType() {
        return adjustmentType;
    }

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public String getExternalAttributionModel() {
        return externalAttributionModel;
    }

    public void setExternalAttributionModel(String externalAttributionModel) {
        this.externalAttributionModel = externalAttributionModel;
    }

    public Double getExternalAttributionCredit() {
        return externalAttributionCredit;
    }

    public void setExternalAttributionCredit(Double externalAttributionCredit) {
        this.externalAttributionCredit = externalAttributionCredit;
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setOfflineConversion(new OfflineConversion());
        MappingHelpers.<BulkOfflineConversion>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getOfflineConversion(), "OfflineConversion");
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
