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
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a label that is applied to an campaign. Each label can be read or written in a bulk file.
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
public class BulkCampaignLabel extends BulkLabelAssociation {

    private String campaign;

    private static final List<BulkMapping<BulkCampaignLabel>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignLabel>> m = new ArrayList<BulkMapping<BulkCampaignLabel>>();

        m.add(new SimpleBulkMapping<BulkCampaignLabel, String>(StringTable.Campaign,
                new Function<BulkCampaignLabel, String>() {
                    @Override
                    public String apply(BulkCampaignLabel c) {
                        return c.getCampaign();
                    }
                },
                new BiConsumer<String, BulkCampaignLabel>() {
                    @Override
                    public void accept(String v, BulkCampaignLabel c) {
                        c.setCampaign(v);
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

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        super.processMappingsFromRowValues(values);
        MappingHelpers.<BulkCampaignLabel>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
