package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkOperation;
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
 * Represents a negative keyword that is assigned to an ad group. Each negative keyword can be read or written in a bulk file.
 * This class exposes the {@link #setNegativeKeyword} and {@link #getNegativeKeyword} methods that can be used to read and write
 * fields of the Ad Group Negative Keyword record in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Negative Keyword at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=620253">http://go.microsoft.com/fwlink/?LinkID=620253</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
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

    /**
     * Gets the identifier of the ad group that the negative keyword is assigned.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getAdGroupId() {
        return getParentId();
    }

    /**
     * Sets the identifier of the ad group that the negative keyword is assigned.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setAdGroupId(Long adGroupId) {
        setParentId(adGroupId);
    }

    /**
     * Gets the name of the ad group that the negative keyword is assigned.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public String getAdGroupName() {
        return getEntityName();
    }

    /**
     * Sets the name of the ad group that the negative keyword is assigned.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public void setAdGroupName(String adGroupName) {
        setEntityName(adGroupName);
    }

    /**
     * Gets the name of the campaign that the negative keyword is assigned.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the name of the campaign that the negative keyword is assigned.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
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
