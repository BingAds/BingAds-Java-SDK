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
import com.microsoft.bingads.v13.campaignmanagement.OnlineConversionAdjustment;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a OnlineConversionAdjustment that can be read or written in a bulk file.
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
public class BulkOnlineConversionAdjustment extends SingleRecordBulkEntity {

    private OnlineConversionAdjustment onlineConversionAdjustment;
    

    private static final List<BulkMapping<BulkOnlineConversionAdjustment>> MAPPINGS;

    static {
        List<BulkMapping<BulkOnlineConversionAdjustment>> m = new ArrayList<BulkMapping<BulkOnlineConversionAdjustment>>();

        m.add(new SimpleBulkMapping<BulkOnlineConversionAdjustment, String>(StringTable.TransactionId,
                new Function<BulkOnlineConversionAdjustment, String>() {
                    @Override
                    public String apply(BulkOnlineConversionAdjustment c) {
                        return c.getOnlineConversionAdjustment().getTransactionId();
                    }
                },
                new BiConsumer<String, BulkOnlineConversionAdjustment>() {
                    @Override
                    public void accept(String v, BulkOnlineConversionAdjustment c) {
                        c.getOnlineConversionAdjustment().setTransactionId(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkOnlineConversionAdjustment, String>(StringTable.ConversionCurrencyCode,
                new Function<BulkOnlineConversionAdjustment, String>() {
                    @Override
                    public String apply(BulkOnlineConversionAdjustment c) {
                        return c.getOnlineConversionAdjustment().getAdjustmentCurrencyCode();
                    }
                },
                new BiConsumer<String, BulkOnlineConversionAdjustment>() {
                    @Override
                    public void accept(String v, BulkOnlineConversionAdjustment c) {
                        c.getOnlineConversionAdjustment().setAdjustmentCurrencyCode(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkOnlineConversionAdjustment, String>(StringTable.ConversionName,
                new Function<BulkOnlineConversionAdjustment, String>() {
                    @Override
                    public String apply(BulkOnlineConversionAdjustment c) {
                        return c.getOnlineConversionAdjustment().getConversionName();
                    }
                },
                new BiConsumer<String, BulkOnlineConversionAdjustment>() {
                    @Override
                    public void accept(String v, BulkOnlineConversionAdjustment c) {
                        c.getOnlineConversionAdjustment().setConversionName(v);
                    }
                }
        ));

        

        m.add(new SimpleBulkMapping<BulkOnlineConversionAdjustment, Double>(StringTable.AdjustmentValue,
                new Function<BulkOnlineConversionAdjustment, Double>() {
                    @Override
                    public Double apply(BulkOnlineConversionAdjustment c) {
                        return c.getOnlineConversionAdjustment().getAdjustmentValue();
                    }
                },
                new BiConsumer<String, BulkOnlineConversionAdjustment>() {
                    @Override
                    public void accept(String v, BulkOnlineConversionAdjustment c) {
                        c.getOnlineConversionAdjustment().setAdjustmentValue(StringExtensions.nullOrDouble(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkOnlineConversionAdjustment, String>(StringTable.AdjustmentTime, 
                new Function<BulkOnlineConversionAdjustment, String>() {
                    @Override
                    public String apply(BulkOnlineConversionAdjustment t) {
                        if (t.getOnlineConversionAdjustment().getAdjustmentTime() == null) {
                            return null;
                        }
        
                        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        
                        return format.format(t.getOnlineConversionAdjustment().getAdjustmentTime().getTime());
                    }
                },
                new BiConsumer<String, BulkOnlineConversionAdjustment>() {
                    @Override
                    public void accept(String v, BulkOnlineConversionAdjustment c) {
                        c.getOnlineConversionAdjustment().setAdjustmentTime(StringExtensions.parseOptional(v, new Function<String, Calendar>() {
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

        m.add(new SimpleBulkMapping<BulkOnlineConversionAdjustment, String>(StringTable.AdjustmentType,
                new Function<BulkOnlineConversionAdjustment, String>() {
                    @Override
                    public String apply(BulkOnlineConversionAdjustment c) {
                        return c.getOnlineConversionAdjustment().getAdjustmentType();
                    }
                },
                new BiConsumer<String, BulkOnlineConversionAdjustment>() {
                    @Override
                    public void accept(String v, BulkOnlineConversionAdjustment c) {
                        c.getOnlineConversionAdjustment().setAdjustmentType(v);
                    }
                }
        ));        

        MAPPINGS = Collections.unmodifiableList(m);
    }

    public OnlineConversionAdjustment getOnlineConversionAdjustment() {
        return onlineConversionAdjustment;
    }

    public void setOnlineConversionAdjustment(OnlineConversionAdjustment onlineConversionAdjustment) {
        this.onlineConversionAdjustment = onlineConversionAdjustment;
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setOnlineConversionAdjustment(new OnlineConversionAdjustment());
        MappingHelpers.<BulkOnlineConversionAdjustment>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getOnlineConversionAdjustment(), "OnlineConversionAdjustment");
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
