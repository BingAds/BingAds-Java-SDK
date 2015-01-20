package com.microsoft.bingads.internal.bulk.entities.negativesites;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import com.microsoft.bingads.bulk.entities.BulkAdGroupNegativeSites;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import com.microsoft.bingads.internal.bulk.file.RowValues;
import com.microsoft.bingads.internal.bulk.mapping.BulkMapping;
import com.microsoft.bingads.internal.bulk.mapping.MappingHelpers;
import com.microsoft.bingads.internal.bulk.mapping.SimpleBulkMapping;
import static com.microsoft.bingads.internal.utilities.Comparer.compareNullable;

/**
 * Reserved for internal use.
 */
public class BulkAdGroupNegativeSitesIdentifier extends BulkNegativeSiteIdentifier {

    /**
     * Reserved for internal use.
     */
    public long getAdGroupId() {
        return this.getEntityId();
    }

    public void setAdGroupId(long value) {
        this.setEntityId(value);
    }

    /**
     * Reserved for internal use.
     */
    public String getAdGroupName() {
        return this.getEntityName();
    }

    public void setAdGroupName(String value) {
        this.setEntityName(value);
    }

    private String campaignName;// { get; set; }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    private static List<BulkMapping<BulkAdGroupNegativeSitesIdentifier>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupNegativeSitesIdentifier>> m = new ArrayList<BulkMapping<BulkAdGroupNegativeSitesIdentifier>>();

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeSitesIdentifier, String>(StringTable.Campaign,
                new Function<BulkAdGroupNegativeSitesIdentifier, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeSitesIdentifier c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeSitesIdentifier>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeSitesIdentifier c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void readFromRowValues(RowValues values) {
        super.readFromRowValues(values);
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void writeToRowValues(RowValues values) {
        super.writeToRowValues(values);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    @Override
    public MultiRecordBulkEntity createEntityWithThisIdentifier() {
        return new BulkAdGroupNegativeSites(this);
    }

    @Override
    protected String getParentColumnName() {
        return StringTable.AdGroup;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BulkAdGroupNegativeSitesIdentifier)) {
            return false;
        }
        
        BulkAdGroupNegativeSitesIdentifier otherIdentifier = (BulkAdGroupNegativeSitesIdentifier) other;

        return compareNullable(getAdGroupId(), otherIdentifier.getAdGroupId()) ||
               compareNullable(getAdGroupName(), otherIdentifier.getAdGroupName()) && compareNullable(getCampaignName(), otherIdentifier.getCampaignName());
    }
}
