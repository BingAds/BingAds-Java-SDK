package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a negative keyword that is assigned to an ad group. Each negative keyword can be read or written in a bulk file. 
 */
public class BulkAdGroupNegativeKeyword extends BulkEntityNegativeKeyword {

    private String campaignName;

    private static final List<BulkMapping<BulkAdGroupNegativeKeyword>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupNegativeKeyword>> m = new ArrayList<BulkMapping<BulkAdGroupNegativeKeyword>>();

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeKeyword, String>(StringTable.Campaign,
                new Function<BulkAdGroupNegativeKeyword, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeKeyword c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeKeyword>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeKeyword c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    public Long getAdGroupId() {
        return getParentId();
    }

    public void setAdGroupId(Long adGroupId) {
        setParentId(adGroupId);
    }

    public String getAdGroupName() {
        return getEntityName();
    }

    public void setAdGroupName(String adGroupName) {
        setEntityName(adGroupName);
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
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
    String getEntityColumnName() {
        return StringTable.AdGroup;
    }
}
