package com.microsoft.bingads.v12.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringTable;

/**
 * Represents a label that is applied to an ad group. Each label can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Label at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupLabel extends BulkLabelAssociation {

    private String campaign;

    private String adGroup;

    private static final List<BulkMapping<BulkAdGroupLabel>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupLabel>> m = new ArrayList<BulkMapping<BulkAdGroupLabel>>();

        m.add(new SimpleBulkMapping<BulkAdGroupLabel, String>(StringTable.Campaign,
                new Function<BulkAdGroupLabel, String>() {
                    @Override
                    public String apply(BulkAdGroupLabel c) {
                        return c.getCampaign();
                    }
                },
                new BiConsumer<String, BulkAdGroupLabel>() {
                    @Override
                    public void accept(String v, BulkAdGroupLabel c) {
                        c.setCampaign(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupLabel, String>(StringTable.AdGroup,
                new Function<BulkAdGroupLabel, String>() {
                    @Override
                    public String apply(BulkAdGroupLabel c) {
                        return c.getAdGroup();
                    }
                },
                new BiConsumer<String, BulkAdGroupLabel>() {
                    @Override
                    public void accept(String v, BulkAdGroupLabel c) {
                        c.setAdGroup(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    public String getAdGroup() {
        return adGroup;
    }

    public void setAdGroup(String adGroup) {
        this.adGroup = adGroup;
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        super.processMappingsFromRowValues(values);
        MappingHelpers.<BulkAdGroupLabel>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
