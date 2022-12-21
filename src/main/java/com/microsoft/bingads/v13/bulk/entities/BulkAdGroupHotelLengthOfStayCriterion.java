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
import com.microsoft.bingads.v13.campaignmanagement.HotelLengthOfStayCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a HotelLengthOfStayCriterion that is assigned to an ad group. Each HotelLengthOfStayCriterion criterion
 * can be read or written in a bulk file.
 *
 * <p>
 * For more information, see Ad Group HotelLengthOfStayCriterion at <a
 * href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupHotelLengthOfStayCriterion extends BulkAdGroupBiddableCriterion {

    private static final List<BulkMapping<BulkAdGroupHotelLengthOfStayCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupHotelLengthOfStayCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupHotelLengthOfStayCriterion>>();

        m.add(new SimpleBulkMapping<BulkAdGroupHotelLengthOfStayCriterion, String>(StringTable.MinTargetValue,
                new Function<BulkAdGroupHotelLengthOfStayCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupHotelLengthOfStayCriterion c) {
                        if (c.getBiddableAdGroupCriterion().getCriterion() instanceof HotelLengthOfStayCriterion) {
                            HotelLengthOfStayCriterion criterion = ((HotelLengthOfStayCriterion) c.getBiddableAdGroupCriterion().getCriterion());
                            return criterion == null ? null : StringExtensions.toBulkString(criterion.getMinNights());
                        }
                        return null;
                    }
                }, new BiConsumer<String, BulkAdGroupHotelLengthOfStayCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupHotelLengthOfStayCriterion c) {
                        if (c.getBiddableAdGroupCriterion().getCriterion() instanceof HotelLengthOfStayCriterion) {

                            ((HotelLengthOfStayCriterion) c.getBiddableAdGroupCriterion().getCriterion())
                                    .setMinNights(StringExtensions.parseOptional(v, new Function<String, Integer>() {
                                        @Override
                                        public Integer apply(String s) {
                                            return Integer.parseInt(s);
                                        }
                                    }));
                        }
                    }
                }));

        m.add(new SimpleBulkMapping<BulkAdGroupHotelLengthOfStayCriterion, String>(StringTable.MaxTargetValue,
                new Function<BulkAdGroupHotelLengthOfStayCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupHotelLengthOfStayCriterion c) {
                        if (c.getBiddableAdGroupCriterion().getCriterion() instanceof HotelLengthOfStayCriterion) {
                            HotelLengthOfStayCriterion criterion = ((HotelLengthOfStayCriterion) c.getBiddableAdGroupCriterion().getCriterion());
                            return criterion == null ? null : StringExtensions.toBulkString(criterion.getMaxNights());
                        }
                        return null;
                    }
                }, new BiConsumer<String, BulkAdGroupHotelLengthOfStayCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupHotelLengthOfStayCriterion c) {
                        if (c.getBiddableAdGroupCriterion().getCriterion() instanceof HotelLengthOfStayCriterion) {

                            ((HotelLengthOfStayCriterion) c.getBiddableAdGroupCriterion().getCriterion())
                                    .setMaxNights(StringExtensions.parseOptional(v, new Function<String, Integer>() {
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
        return new HotelLengthOfStayCriterion();
    }

}
