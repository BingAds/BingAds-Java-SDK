package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.internal.bulk.StringTable;
import com.microsoft.bingads.v10.internal.bulk.BulkMapping;
import com.microsoft.bingads.v10.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v10.internal.bulk.RowValues;
import com.microsoft.bingads.v10.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This abstract class provides properties that are shared by all bulk campaign ad extension association classes.
 */
public abstract class BulkCampaignAdExtensionAssociation extends BulkAdExtensionAssociation {
    private String campaignName;

    private static final List<BulkMapping<BulkCampaignAdExtensionAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignAdExtensionAssociation>> m = new ArrayList<BulkMapping<BulkCampaignAdExtensionAssociation>>();

        m.add(new SimpleBulkMapping<BulkCampaignAdExtensionAssociation, String>(StringTable.Campaign,
                new Function<BulkCampaignAdExtensionAssociation, String>() {
                    @Override
                    public String apply(BulkCampaignAdExtensionAssociation c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkCampaignAdExtensionAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignAdExtensionAssociation c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * The name of the campaign containing the ad group that the ad extension is associated.
     * <p/>
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public String getCampaignName() {
        return this.campaignName;
    }
}

