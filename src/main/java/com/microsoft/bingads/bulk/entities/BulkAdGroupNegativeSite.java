package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.internal.bulk.entities.BulkAdGroupNegativeSitesIdentifier;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;

/**
 * <p>
 * Represents a negative site that is assigned to an ad group. Each negative
 * site can be read or written in a bulk file. This class exposes properties
 * that can be read and written as fields of the Ad Group Negative Site record
 * in a bulk file.
 * </p>
 * <p>
 * For more information, see Ad Group Negative Site at
 * {@link http://go.microsoft.com/fwlink/?LinkID=511539}. </p>
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
     * The identifier of the ad group that the negative site is assigned.
     * Corresponds to the 'Parent Id' field in the bulk file.
     */
    public long getAdGroupId() {
        return this.getIdentifier().getAdGroupId();
    }

    public void setAdGroupId(long value) {
        this.getIdentifier().setAdGroupId(value);
    }

    /**
     * The name of the ad group that the negative site is assigned. Corresponds
     * to the 'Ad Group' field in the bulk file.
     */
    public String getAdGroupName() {
        return this.getIdentifier().getAdGroupName();
    }

    public void setAdGroupName(String value) {
        this.getIdentifier().setAdGroupName(value);
    }

    /**
     * The name of the ad group that the negative site is assigned. Corresponds
     * to the 'Ad Group' field in the bulk file.
     */
    public String getCampaignName() {
        return this.getIdentifier().getCampaignName();
    }

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
