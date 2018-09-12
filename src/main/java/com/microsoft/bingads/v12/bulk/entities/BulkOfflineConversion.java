package com.microsoft.bingads.v12.bulk.entities;

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
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.OfflineConversion;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a label that can be read or written in a bulk file.
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

        MAPPINGS = Collections.unmodifiableList(m);
    }

    public OfflineConversion getOfflineConversion() {
        return offlineConversion;
    }

    public void setOfflineConversion(OfflineConversion offlineConversion) {
        this.offlineConversion = offlineConversion;
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
