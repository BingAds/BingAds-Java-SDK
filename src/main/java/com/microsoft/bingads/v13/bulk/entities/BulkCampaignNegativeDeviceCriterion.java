package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.campaignmanagement.Criterion;
import com.microsoft.bingads.v13.campaignmanagement.DeviceCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

public class BulkCampaignNegativeDeviceCriterion extends BulkCampaignNegativeCriterion {

    private static final List<BulkMapping<BulkCampaignNegativeDeviceCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignNegativeDeviceCriterion>> mappings =
                new ArrayList<BulkMapping<BulkCampaignNegativeDeviceCriterion>>();

        mappings.add(new SimpleBulkMapping<BulkCampaignNegativeDeviceCriterion, String>(StringTable.Target,
                new Function<BulkCampaignNegativeDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeDeviceCriterion entity) {
                        Criterion criterion = entity.getNegativeCampaignCriterion().getCriterion();
                        return criterion instanceof DeviceCriterion ? ((DeviceCriterion) criterion).getDeviceName() : null;
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeDeviceCriterion>() {
                    @Override
                    public void accept(String value, BulkCampaignNegativeDeviceCriterion entity) {
                        Criterion criterion = entity.getNegativeCampaignCriterion().getCriterion();
                        if (criterion instanceof DeviceCriterion) {
                            ((DeviceCriterion) criterion).setDeviceName(value);
                        }
                    }
                }
        ));

        mappings.add(new SimpleBulkMapping<BulkCampaignNegativeDeviceCriterion, String>(StringTable.OsNames,
                new Function<BulkCampaignNegativeDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeDeviceCriterion entity) {
                        Criterion criterion = entity.getNegativeCampaignCriterion().getCriterion();
                        return criterion instanceof DeviceCriterion ? ((DeviceCriterion) criterion).getOSName() : null;
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeDeviceCriterion>() {
                    @Override
                    public void accept(String value, BulkCampaignNegativeDeviceCriterion entity) {
                        Criterion criterion = entity.getNegativeCampaignCriterion().getCriterion();
                        if (criterion instanceof DeviceCriterion) {
                            ((DeviceCriterion) criterion).setOSName(value);
                        }
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(mappings);
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
        return new DeviceCriterion();
    }
}
