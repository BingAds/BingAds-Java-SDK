package com.microsoft.bingads.v11.internal.bulk.entities;

import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupNegativeSites;
import com.microsoft.bingads.v11.internal.bulk.StringTable;
import com.microsoft.bingads.v11.internal.bulk.BulkMapping;
import com.microsoft.bingads.v11.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v11.internal.bulk.RowValues;
import com.microsoft.bingads.v11.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import static com.microsoft.bingads.internal.utilities.Comparer.compareNullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    public void writeToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.writeToRowValues(values, excludeReadonlyData);
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

        boolean isNameNotEmpty = getAdGroupName() != null &&
                getAdGroupName().length() != 0 &&
                getCampaignName() != null &&
                getCampaignName().length() != 0;

        return compareNullable(getAdGroupId(), otherIdentifier.getAdGroupId()) ||
                (
                        isNameNotEmpty &&
                                compareNullable(getAdGroupName(), otherIdentifier.getAdGroupName()) &&
                                compareNullable(getCampaignName(), otherIdentifier.getCampaignName())
                );
    }
}
