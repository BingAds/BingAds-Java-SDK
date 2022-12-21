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
import com.microsoft.bingads.v13.campaignmanagement.Day;
import com.microsoft.bingads.v13.campaignmanagement.HotelCheckInDayCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelDateSelectionTypeCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a HotelCheckInDayCriterion that is assigned to an ad group. Each HotelCheckInDayCriterion can be read or
 * written in a bulk file.
 *
 * <p>
 * For more information, see Ad Group HotelCheckInDayCriterion at <a
 * href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupHotelCheckInDayCriterion extends BulkAdGroupBiddableCriterion {

    private static final List<BulkMapping<BulkAdGroupHotelCheckInDayCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupHotelCheckInDayCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupHotelCheckInDayCriterion>>();

        m.add(new SimpleBulkMapping<BulkAdGroupHotelCheckInDayCriterion, String>(StringTable.Target,
                new Function<BulkAdGroupHotelCheckInDayCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupHotelCheckInDayCriterion c) {
                        if (c.getBiddableAdGroupCriterion().getCriterion() instanceof HotelCheckInDayCriterion) {
                            HotelCheckInDayCriterion criterion = ((HotelCheckInDayCriterion) c.getBiddableAdGroupCriterion().getCriterion());
                            return criterion == null || criterion.getCheckInDay() == null ? null : criterion.getCheckInDay().value();
                        }
                        return null;
                    }
                }, new BiConsumer<String, BulkAdGroupHotelCheckInDayCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupHotelCheckInDayCriterion c) {
                        if (c.getBiddableAdGroupCriterion().getCriterion() instanceof HotelCheckInDayCriterion) {
                            ((HotelCheckInDayCriterion) c.getBiddableAdGroupCriterion().getCriterion())
                                    .setCheckInDay(StringExtensions.parseOptional(v, new Function<String, Day>() {
                                        @Override
                                        public Day apply(String t) {
                                            return Day.fromValue(t);
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
        return new HotelCheckInDayCriterion();
    }

}
