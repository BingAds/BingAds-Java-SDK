package com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelListingGroup;

public abstract class BulkAdGroupHotelListingGroupTest extends BulkEntityTest<BulkAdGroupHotelListingGroup> {

    @Override
    protected void onEntityCreation(BulkAdGroupHotelListingGroup entity) {
        int i =0;
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdGroupHotelListingGroup, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupHotelListingGroup>() {
                    @Override
                    public BulkAdGroupHotelListingGroup get() {
                        return new BulkAdGroupHotelListingGroup();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupHotelListingGroup, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupHotelListingGroup>() {
                    @Override
                    public BulkAdGroupHotelListingGroup get() {
                        return new BulkAdGroupHotelListingGroup();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupHotelListingGroup, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupHotelListingGroup>() {
                    @Override
                    public BulkAdGroupHotelListingGroup get() {
                        return new BulkAdGroupHotelListingGroup();
                    }
                }
        );
    }
}
