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
import com.microsoft.bingads.v13.campaignmanagement.HotelDateSelectionType;
import com.microsoft.bingads.v13.campaignmanagement.HotelDateSelectionTypeCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a HotelDateSelectionTypeCriterion that is assigned to an ad group. Each HotelDateSelectionTypeCriterion
 * can be read or written in a bulk file.
 *
 * <p>
 * For more information, see Ad Group HotelDateSelectionTypeCriterion at <a
 * href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupHotelDateSelectionTypeCriterion extends BulkAdGroupBiddableCriterion {

    private static final List<BulkMapping<BulkAdGroupHotelDateSelectionTypeCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupHotelDateSelectionTypeCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupHotelDateSelectionTypeCriterion>>();

        m.add(new SimpleBulkMapping<BulkAdGroupHotelDateSelectionTypeCriterion, String>(StringTable.Target,
                new Function<BulkAdGroupHotelDateSelectionTypeCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupHotelDateSelectionTypeCriterion c) {
                        if (c.getBiddableAdGroupCriterion().getCriterion() instanceof HotelDateSelectionTypeCriterion) {
                            HotelDateSelectionTypeCriterion criterion = ((HotelDateSelectionTypeCriterion) c.getBiddableAdGroupCriterion().getCriterion());
                            return criterion == null || criterion.getHotelDateSelectionType() == null ? null : criterion.getHotelDateSelectionType().value();
                        }
                        return null;
                    }
                }, new BiConsumer<String, BulkAdGroupHotelDateSelectionTypeCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupHotelDateSelectionTypeCriterion c) {
                        if (c.getBiddableAdGroupCriterion().getCriterion() instanceof HotelDateSelectionTypeCriterion) {
                            ((HotelDateSelectionTypeCriterion) c.getBiddableAdGroupCriterion().getCriterion())
                                    .setHotelDateSelectionType(StringExtensions.parseOptional(v, new Function<String, HotelDateSelectionType>() {
                                        @Override
                                        public HotelDateSelectionType apply(String t) {
                                            return StringExtensions.fromValueOptional(t, HotelDateSelectionType.class);
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
        return new HotelDateSelectionTypeCriterion();
    }

}
