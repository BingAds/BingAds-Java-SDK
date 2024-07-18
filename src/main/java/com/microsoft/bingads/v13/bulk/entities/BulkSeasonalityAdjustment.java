package com.microsoft.bingads.v13.bulk.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
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
import com.microsoft.bingads.v13.campaignmanagement.SeasonalityAdjustment;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v13.campaignmanagement.BudgetLimitType;
import com.microsoft.bingads.v13.campaignmanagement.CallToAction;
import com.microsoft.bingads.v13.campaignmanagement.CampaignType;
import com.microsoft.bingads.v13.campaignmanagement.DeviceType;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a Seasonality Adjustment.
 * <p/>
 * <p>
 * This class exposes the {@link #setSeasonalityAdjustment} and {@link #getSeasonalityAdjustment} that can be used to read and write
 * fields of the Asset Group record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Seasonality Adjustment at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkSeasonalityAdjustment extends SingleRecordBulkEntity {

    private SeasonalityAdjustment SeasonalityAdjustment;

    private static final List<BulkMapping<BulkSeasonalityAdjustment>> MAPPINGS;

    static {
        List<BulkMapping<BulkSeasonalityAdjustment>> m = new ArrayList<BulkMapping<BulkSeasonalityAdjustment>>();

        m.add(new SimpleBulkMapping<BulkSeasonalityAdjustment, Long>(StringTable.Id,
                new Function<BulkSeasonalityAdjustment, Long>() {
                    @Override
                    public Long apply(BulkSeasonalityAdjustment c) {
                        return c.getSeasonalityAdjustment().getId();
                    }
                },
                new BiConsumer<String, BulkSeasonalityAdjustment>() {
                    @Override
                    public void accept(String v, BulkSeasonalityAdjustment c) {
                        c.getSeasonalityAdjustment().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSeasonalityAdjustment, String>(StringTable.SeasonalityAdjustment,
                new Function<BulkSeasonalityAdjustment, String>() {
                    @Override
                    public String apply(BulkSeasonalityAdjustment c) {
                        return c.getSeasonalityAdjustment().getName();
                    }
                },
                new BiConsumer<String, BulkSeasonalityAdjustment>() {
                    @Override
                    public void accept(String v, BulkSeasonalityAdjustment c) {
                        c.getSeasonalityAdjustment().setName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSeasonalityAdjustment, String>(StringTable.Description,
                new Function<BulkSeasonalityAdjustment, String>() {
                    @Override
                    public String apply(BulkSeasonalityAdjustment c) {
                        return c.getSeasonalityAdjustment().getDescription();
                    }
                },
                new BiConsumer<String, BulkSeasonalityAdjustment>() {
                    @Override
                    public void accept(String v, BulkSeasonalityAdjustment c) {
                        c.getSeasonalityAdjustment().setDescription(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSeasonalityAdjustment, String>(StringTable.StartDate,
                new Function<BulkSeasonalityAdjustment, String>() {
                    @Override
                    public String apply(BulkSeasonalityAdjustment t) {
                        if (t.getSeasonalityAdjustment().getStartDate() == null) {
                            return null;
                        }

                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                        format.setTimeZone(TimeZone.getTimeZone("UTC"));

                        return format.format(t.getSeasonalityAdjustment().getStartDate().getTime());
                    }
                },
                new BiConsumer<String, BulkSeasonalityAdjustment>() {
                    @Override
                    public void accept(String v, BulkSeasonalityAdjustment c) {
                        c.getSeasonalityAdjustment().setStartDate(StringExtensions.parseOptional(v, new Function<String, Calendar>() {
                            @Override
                            public Calendar apply(String t) {
                                Calendar c = new GregorianCalendar();
                                try {
                                    SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
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
        
        m.add(new SimpleBulkMapping<BulkSeasonalityAdjustment, String>(StringTable.EndDate,
                new Function<BulkSeasonalityAdjustment, String>() {
                    @Override
                    public String apply(BulkSeasonalityAdjustment t) {
                        if (t.getSeasonalityAdjustment().getEndDate() == null) {
                            return null;
                        }

                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                        format.setTimeZone(TimeZone.getTimeZone("UTC"));

                        return format.format(t.getSeasonalityAdjustment().getEndDate().getTime());
                    }
                },
                new BiConsumer<String, BulkSeasonalityAdjustment>() {
                    @Override
                    public void accept(String v, BulkSeasonalityAdjustment c) {
                        c.getSeasonalityAdjustment().setEndDate(StringExtensions.parseOptional(v, new Function<String, Calendar>() {
                            @Override
                            public Calendar apply(String t) {
                                Calendar c = new GregorianCalendar();
                                try {
                                    SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
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
        
        m.add(new SimpleBulkMapping<BulkSeasonalityAdjustment, String>(StringTable.CampaignType,
                new Function<BulkSeasonalityAdjustment, String>() {
                    @Override
                    public String apply(BulkSeasonalityAdjustment c) {
                    	return StringExtensions.toCampaignTypeListBulkString(",", c.getSeasonalityAdjustment().getCampaignTypeFilter());
                    }
                },
                new BiConsumer<String, BulkSeasonalityAdjustment>() {
                    @Override
                    public void accept(String v, BulkSeasonalityAdjustment c) { 	
                        c.getSeasonalityAdjustment().setCampaignTypeFilter(StringExtensions.parseCampaignTypeList(v, ","));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSeasonalityAdjustment, String>(StringTable.DeviceType,
                new Function<BulkSeasonalityAdjustment, String>() {
                    @Override
                    public String apply(BulkSeasonalityAdjustment c) {
                    	return StringExtensions.toDeviceTypeListBulkString(",", c.getSeasonalityAdjustment().getDeviceTypeFilter());
                    }
                },
                new BiConsumer<String, BulkSeasonalityAdjustment>() {
                    @Override
                    public void accept(String v, BulkSeasonalityAdjustment c) { 	
                        c.getSeasonalityAdjustment().setDeviceTypeFilter(StringExtensions.parseDeviceTypeList(v, ","));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSeasonalityAdjustment, Double>(StringTable.AdjustmentValue,
                new Function<BulkSeasonalityAdjustment, Double>() {
                    @Override
                    public Double apply(BulkSeasonalityAdjustment c) {
                        return c.getSeasonalityAdjustment().getAdjustmentPercentage();
                    }
                },
                new BiConsumer<String, BulkSeasonalityAdjustment>() {
                    @Override
                    public void accept(String v, BulkSeasonalityAdjustment c) {
                        c.getSeasonalityAdjustment().setAdjustmentPercentage(StringExtensions.nullOrDouble(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSeasonalityAdjustment, String>(StringTable.CampaignAssociations,
                new Function<BulkSeasonalityAdjustment, String>() {
                    @Override
                    public String apply(BulkSeasonalityAdjustment c) {
                    	return StringExtensions.toCampaignAssociationsBulkString(";", c.getSeasonalityAdjustment().getCampaignAssociations());
                    }
                },
                new BiConsumer<String, BulkSeasonalityAdjustment>() {
                    @Override
                    public void accept(String v, BulkSeasonalityAdjustment c) { 	
                        c.getSeasonalityAdjustment().setCampaignAssociations(StringExtensions.parseCampaignAssociations(v, ";"));
                    }
                }
        ));
   
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setSeasonalityAdjustment(new SeasonalityAdjustment());
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getSeasonalityAdjustment(), "SeasonalityAdjustment");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the SeasonalityAdjustment Data Object of the Campaign Management Service.
     * <p/>
     * <p>
     * A subset of SeasonalityAdjustment properties are available in the Ad Group record.
     * For more information, see Ad Group at
     * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
     * </p>
     */
    public SeasonalityAdjustment getSeasonalityAdjustment() {
        return SeasonalityAdjustment;
    }

    /**
     * Sets the SeasonalityAdjustment Data Object of the Campaign Management Service.
     * <p/>
     * <p>
     * A subset of SeasonalityAdjustment properties are available in the Ad Group record.
     * For more information, see Ad Group at
     * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
     * </p>
     */
    public void setSeasonalityAdjustment(SeasonalityAdjustment SeasonalityAdjustment) {
        this.SeasonalityAdjustment = SeasonalityAdjustment;
    }
}
