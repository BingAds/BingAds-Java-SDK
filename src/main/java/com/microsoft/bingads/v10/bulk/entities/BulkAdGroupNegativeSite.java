package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.bulk.BulkOperation;
import com.microsoft.bingads.v10.internal.bulk.entities.BulkAdGroupNegativeSitesIdentifier;
import com.microsoft.bingads.v10.internal.bulk.entities.MultiRecordBulkEntity;

/**
 * <p>
 * Represents a negative site that is assigned to an ad group. Each negative
 * site can be read or written in a bulk file. This class exposes properties
 * that can be read and written as fields of the Ad Group Negative Site record
 * in a bulk file.
 * </p>
 *
 * <p>
 * For more information, see Ad Group Negative Site at
 * <a href="http://go.microsoft.com/fwlink/?LinkID=620254">http://go.microsoft.com/fwlink/?LinkID=620254</a>
 * </p>
 *
 * <p>
 * One {@link BulkAdGroupNegativeSites} exposes a read only list of
 * {@link BulkAdGroupNegativeSite}. Each {@link BulkAdGroupNegativeSite}
 * instance corresponds to one Ad Group Negative Site record in the bulk file.
 * If you upload a {@link BulkAdGroupNegativeSites}, then you are effectively
 * replacing any existing negative sites assigned to the ad group.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupNegativeSite extends BulkNegativeSite<BulkAdGroupNegativeSitesIdentifier> {

    /**
     * Gets the identifier of the ad group that the negative site is assigned.
     *
     * <p>
     *      Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public long getAdGroupId() {
        return this.getIdentifier().getAdGroupId();
    }

    /**
     * Sets the identifier of the ad group that the negative site is assigned.
     *
     * <p>
     *      Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setAdGroupId(long value) {
        this.getIdentifier().setAdGroupId(value);
    }

    /**
     * Gets the name of the ad group that the negative site is assigned.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public String getAdGroupName() {
        return this.getIdentifier().getAdGroupName();
    }

    /**
     * Sets the name of the ad group that the negative site is assigned.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public void setAdGroupName(String value) {
        this.getIdentifier().setAdGroupName(value);
    }

    /**
     * Gets the name of the ad group that the negative site is assigned.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public String getCampaignName() {
        return this.getIdentifier().getCampaignName();
    }

    /**
     * Sets the name of the ad group that the negative site is assigned.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public void setCampaignName(String value) {
        this.getIdentifier().setCampaignName(value);
    }

    /**
     * Initializes a new instance of the BulkAdGroupNegativeSite class.
     */
    public BulkAdGroupNegativeSite() {
        super(new BulkAdGroupNegativeSitesIdentifier());
    }

    @Override
    MultiRecordBulkEntity createNegativeSitesWithThisNegativeSite() {
        return new BulkAdGroupNegativeSites(this);
    }
}
