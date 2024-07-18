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
import com.microsoft.bingads.v13.campaignmanagement.DataExclusion;
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
 * Represents a Data Exclusion.
 * <p/>
 * <p>
 * This class exposes the {@link #setDataExclusion} and {@link #getDataExclusion} that can be used to read and write
 * fields of the Asset Group record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Data Exclusion at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkDataExclusion extends SingleRecordBulkEntity {

    private DataExclusion DataExclusion;

    private static final List<BulkMapping<BulkDataExclusion>> MAPPINGS;

    static {
        List<BulkMapping<BulkDataExclusion>> m = new ArrayList<BulkMapping<BulkDataExclusion>>();

        m.add(new SimpleBulkMapping<BulkDataExclusion, Long>(StringTable.Id,
                new Function<BulkDataExclusion, Long>() {
                    @Override
                    public Long apply(BulkDataExclusion c) {
                        return c.getDataExclusion().getId();
                    }
                },
                new BiConsumer<String, BulkDataExclusion>() {
                    @Override
                    public void accept(String v, BulkDataExclusion c) {
                        c.getDataExclusion().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDataExclusion, String>(StringTable.DataExclusion,
                new Function<BulkDataExclusion, String>() {
                    @Override
                    public String apply(BulkDataExclusion c) {
                        return c.getDataExclusion().getName();
                    }
                },
                new BiConsumer<String, BulkDataExclusion>() {
                    @Override
                    public void accept(String v, BulkDataExclusion c) {
                        c.getDataExclusion().setName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDataExclusion, String>(StringTable.Description,
                new Function<BulkDataExclusion, String>() {
                    @Override
                    public String apply(BulkDataExclusion c) {
                        return c.getDataExclusion().getDescription();
                    }
                },
                new BiConsumer<String, BulkDataExclusion>() {
                    @Override
                    public void accept(String v, BulkDataExclusion c) {
                        c.getDataExclusion().setDescription(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDataExclusion, String>(StringTable.StartDate,
                new Function<BulkDataExclusion, String>() {
                    @Override
                    public String apply(BulkDataExclusion t) {
                        if (t.getDataExclusion().getStartDate() == null) {
                            return null;
                        }

                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                        format.setTimeZone(TimeZone.getTimeZone("UTC"));

                        return format.format(t.getDataExclusion().getStartDate().getTime());
                    }
                },
                new BiConsumer<String, BulkDataExclusion>() {
                    @Override
                    public void accept(String v, BulkDataExclusion c) {
                        c.getDataExclusion().setStartDate(StringExtensions.parseOptional(v, new Function<String, Calendar>() {
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
        
        m.add(new SimpleBulkMapping<BulkDataExclusion, String>(StringTable.EndDate,
                new Function<BulkDataExclusion, String>() {
                    @Override
                    public String apply(BulkDataExclusion t) {
                        if (t.getDataExclusion().getEndDate() == null) {
                            return null;
                        }

                        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                        format.setTimeZone(TimeZone.getTimeZone("UTC"));

                        return format.format(t.getDataExclusion().getEndDate().getTime());
                    }
                },
                new BiConsumer<String, BulkDataExclusion>() {
                    @Override
                    public void accept(String v, BulkDataExclusion c) {
                        c.getDataExclusion().setEndDate(StringExtensions.parseOptional(v, new Function<String, Calendar>() {
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
        
        m.add(new SimpleBulkMapping<BulkDataExclusion, String>(StringTable.CampaignType,
                new Function<BulkDataExclusion, String>() {
                    @Override
                    public String apply(BulkDataExclusion c) {
                    	return StringExtensions.toCampaignTypeListBulkString(",", c.getDataExclusion().getCampaignTypeFilter());
                    }
                },
                new BiConsumer<String, BulkDataExclusion>() {
                    @Override
                    public void accept(String v, BulkDataExclusion c) { 	
                        c.getDataExclusion().setCampaignTypeFilter(StringExtensions.parseCampaignTypeList(v, ","));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDataExclusion, String>(StringTable.DeviceType,
                new Function<BulkDataExclusion, String>() {
                    @Override
                    public String apply(BulkDataExclusion c) {
                    	return StringExtensions.toDeviceTypeListBulkString(",", c.getDataExclusion().getDeviceTypeFilter());
                    }
                },
                new BiConsumer<String, BulkDataExclusion>() {
                    @Override
                    public void accept(String v, BulkDataExclusion c) { 	
                        c.getDataExclusion().setDeviceTypeFilter(StringExtensions.parseDeviceTypeList(v, ","));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkDataExclusion, String>(StringTable.CampaignAssociations,
                new Function<BulkDataExclusion, String>() {
                    @Override
                    public String apply(BulkDataExclusion c) {
                    	return StringExtensions.toCampaignAssociationsBulkString(";", c.getDataExclusion().getCampaignAssociations());
                    }
                },
                new BiConsumer<String, BulkDataExclusion>() {
                    @Override
                    public void accept(String v, BulkDataExclusion c) { 	
                        c.getDataExclusion().setCampaignAssociations(StringExtensions.parseCampaignAssociations(v, ";"));
                    }
                }
        ));
   
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setDataExclusion(new DataExclusion());
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getDataExclusion(), "DataExclusion");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets the DataExclusion Data Object of the Campaign Management Service.
     * <p/>
     * <p>
     * A subset of DataExclusion properties are available in the Ad Group record.
     * For more information, see Ad Group at
     * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
     * </p>
     */
    public DataExclusion getDataExclusion() {
        return DataExclusion;
    }

    /**
     * Sets the DataExclusion Data Object of the Campaign Management Service.
     * <p/>
     * <p>
     * A subset of DataExclusion properties are available in the Ad Group record.
     * For more information, see Ad Group at
     * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
     * </p>
     */
    public void setDataExclusion(DataExclusion DataExclusion) {
        this.DataExclusion = DataExclusion;
    }
}
