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
import com.microsoft.bingads.v13.campaignmanagement.Criterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelCheckInDateCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a HotelCheckInDateCriterion that is assigned to an ad group. Each HotelCheckInDateCriterion criterion can
 * be read or written in a bulk file.
 *
 * <p>
 * For more information, see Ad Group HotelCheckInDateCriterion at <a
 * href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupHotelCheckInDateCriterion extends BulkAdGroupBiddableCriterion {

    private static final List<BulkMapping<BulkAdGroupHotelCheckInDateCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupHotelCheckInDateCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupHotelCheckInDateCriterion>>();

        m.add(new SimpleBulkMapping<BulkAdGroupHotelCheckInDateCriterion, String>(StringTable.MinTargetValue,
                new Function<BulkAdGroupHotelCheckInDateCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupHotelCheckInDateCriterion c) {
                        if (c.getBiddableAdGroupCriterion().getCriterion() instanceof HotelCheckInDateCriterion) {
                            HotelCheckInDateCriterion criterion = ((HotelCheckInDateCriterion) c.getBiddableAdGroupCriterion().getCriterion());
                            if (criterion == null || criterion.getStartDate() == null) {
                                return null;
                            }
                            SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                            format.setTimeZone(TimeZone.getTimeZone("UTC"));

                            return format.format(criterion.getStartDate().getTime());

                        }
                        return null;
                    }
                }, new BiConsumer<String, BulkAdGroupHotelCheckInDateCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupHotelCheckInDateCriterion c) {
                        if (c.getBiddableAdGroupCriterion().getCriterion() instanceof HotelCheckInDateCriterion) {

                            ((HotelCheckInDateCriterion) c.getBiddableAdGroupCriterion().getCriterion())
                                    .setStartDate(StringExtensions.parseOptional(v, new Function<String, Calendar>() {
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
                }));

        m.add(new SimpleBulkMapping<BulkAdGroupHotelCheckInDateCriterion, String>(StringTable.MaxTargetValue,
                new Function<BulkAdGroupHotelCheckInDateCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupHotelCheckInDateCriterion c) {
                        if (c.getBiddableAdGroupCriterion().getCriterion() instanceof HotelCheckInDateCriterion) {
                            HotelCheckInDateCriterion criterion = ((HotelCheckInDateCriterion) c.getBiddableAdGroupCriterion().getCriterion());
                            if (criterion == null || criterion.getEndDate() == null) {
                                return null;
                            }
                            SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                            format.setTimeZone(TimeZone.getTimeZone("UTC"));

                            return format.format(criterion.getEndDate().getTime());

                        }
                        return null;
                    }
                }, new BiConsumer<String, BulkAdGroupHotelCheckInDateCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupHotelCheckInDateCriterion c) {
                        if (c.getBiddableAdGroupCriterion().getCriterion() instanceof HotelCheckInDateCriterion) {

                            ((HotelCheckInDateCriterion) c.getBiddableAdGroupCriterion().getCriterion())
                                    .setEndDate(StringExtensions.parseOptional(v, new Function<String, Calendar>() {
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
                }));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        super.processMappingsFromRowValues(values);
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    @Override
    protected Criterion createCriterion() {
        return new HotelCheckInDateCriterion();
    }

}
