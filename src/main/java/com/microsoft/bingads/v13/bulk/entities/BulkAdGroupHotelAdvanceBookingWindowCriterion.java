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
import com.microsoft.bingads.v13.campaignmanagement.Criterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelAdvanceBookingWindowCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a HotelAdvanceBookingWindowCriterion that is assigned to an ad group. Each
 * HotelAdvanceBookingWindowCriterion criterion can be read or written in a bulk file.
 *
 * <p>
 * For more information, see Ad Group HotelAdvanceBookingWindowCriterion at <a
 * href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupHotelAdvanceBookingWindowCriterion extends BulkAdGroupBiddableCriterion {

    private static final List<BulkMapping<BulkAdGroupHotelAdvanceBookingWindowCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupHotelAdvanceBookingWindowCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupHotelAdvanceBookingWindowCriterion>>();

        m.add(new SimpleBulkMapping<BulkAdGroupHotelAdvanceBookingWindowCriterion, String>(StringTable.MinTargetValue,
                new Function<BulkAdGroupHotelAdvanceBookingWindowCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupHotelAdvanceBookingWindowCriterion c) {
                        if (c.getBiddableAdGroupCriterion().getCriterion() instanceof HotelAdvanceBookingWindowCriterion) {
                            HotelAdvanceBookingWindowCriterion criterion = ((HotelAdvanceBookingWindowCriterion) c.getBiddableAdGroupCriterion()
                                    .getCriterion());
                            return criterion == null ? null : StringExtensions.toBulkString(criterion.getMinDays());
                        }
                        return null;
                    }
                }, new BiConsumer<String, BulkAdGroupHotelAdvanceBookingWindowCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupHotelAdvanceBookingWindowCriterion c) {
                        if (c.getBiddableAdGroupCriterion().getCriterion() instanceof HotelAdvanceBookingWindowCriterion) {

                            ((HotelAdvanceBookingWindowCriterion) c.getBiddableAdGroupCriterion().getCriterion())
                                    .setMinDays(StringExtensions.parseOptional(v, new Function<String, Integer>() {
                                        @Override
                                        public Integer apply(String s) {
                                            return Integer.parseInt(s);
                                        }
                                    }));
                        }
                    }
                }));

        m.add(new SimpleBulkMapping<BulkAdGroupHotelAdvanceBookingWindowCriterion, String>(StringTable.MaxTargetValue,
                new Function<BulkAdGroupHotelAdvanceBookingWindowCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupHotelAdvanceBookingWindowCriterion c) {
                        if (c.getBiddableAdGroupCriterion().getCriterion() instanceof HotelAdvanceBookingWindowCriterion) {
                            HotelAdvanceBookingWindowCriterion criterion = ((HotelAdvanceBookingWindowCriterion) c.getBiddableAdGroupCriterion()
                                    .getCriterion());
                            return criterion == null ? null : StringExtensions.toBulkString(criterion.getMaxDays());
                        }
                        return null;
                    }
                }, new BiConsumer<String, BulkAdGroupHotelAdvanceBookingWindowCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupHotelAdvanceBookingWindowCriterion c) {
                        if (c.getBiddableAdGroupCriterion().getCriterion() instanceof HotelAdvanceBookingWindowCriterion) {

                            ((HotelAdvanceBookingWindowCriterion) c.getBiddableAdGroupCriterion().getCriterion())
                                    .setMaxDays(StringExtensions.parseOptional(v, new Function<String, Integer>() {
                                        @Override
                                        public Integer apply(String s) {
                                            return Integer.parseInt(s);
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
        return new HotelAdvanceBookingWindowCriterion();
    }

}
