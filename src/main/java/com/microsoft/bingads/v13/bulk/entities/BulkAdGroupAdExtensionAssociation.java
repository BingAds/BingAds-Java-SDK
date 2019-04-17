package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * This abstract class provides properties that are shared by all bulk ad group ad extension association classes.
 */
public abstract class BulkAdGroupAdExtensionAssociation extends BulkAdExtensionAssociation {
    private String adGroupName;

    private String campaignName;

    private static final List<BulkMapping<BulkAdGroupAdExtensionAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupAdExtensionAssociation>> m = new ArrayList<BulkMapping<BulkAdGroupAdExtensionAssociation>>();

        m.add(new SimpleBulkMapping<BulkAdGroupAdExtensionAssociation, String>(StringTable.AdGroup,
                new Function<BulkAdGroupAdExtensionAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupAdExtensionAssociation c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupAdExtensionAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupAdExtensionAssociation c) {
                        c.setAdGroupName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupAdExtensionAssociation, String>(StringTable.Campaign,
                new Function<BulkAdGroupAdExtensionAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupAdExtensionAssociation c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupAdExtensionAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupAdExtensionAssociation c) {
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

    public void setAdGroupName(String adGroupName) {
        this.adGroupName = adGroupName;
    }

    /**
     * The name of the ad group that the ad extension is associated.
     * <p/>
     * Corresponds to the 'AdGroup' field in the bulk file.
     */
    public String getAdGroupName() {
        return this.adGroupName;
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
