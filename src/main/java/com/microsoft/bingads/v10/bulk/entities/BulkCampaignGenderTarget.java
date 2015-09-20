package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkOperation;

/**
 * Represents a gender target that is associated with a campaign.
 *
 * This class exposes the {@link BulkGenderTarget#setGenderTarget} and {@link BulkGenderTarget#getGenderTarget}
 * methods that can be used to read and write fields of the Campaign Gender Target record in a bulk file.
 *
 * <p>
 *     One {@link BulkCampaignGenderTarget} exposes a read only list of {@link BulkCampaignGenderTargetBid}.
 *     Each {@link BulkCampaignGenderTargetBid} instance corresponds to one Campaign Gender Target record in the bulk file.
 *     If you upload a {@link BulkCampaignGenderTarget},
 *     then you are effectively replacing any existing bids for the corresponding gender target.
 * </p>
 *
 * <p>
 *     For more information, see Campaign Gender Target at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=620246">http://go.microsoft.com/fwlink/?LinkID=620246</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignGenderTarget extends BulkGenderTarget<BulkCampaignGenderTargetBid> {

    /**
     * Initializes a new instanced of the BulkCampaignGenderTarget class.
     */
    public BulkCampaignGenderTarget() {
        super(BulkCampaignGenderTargetBid.class);
    }

    /**
     * Gets the identifier of the campaign that the target is associated.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getCampaignId() {
        return getEntityId();
    }

    /**
     * Sets the identifier of the campaign that the target is associated.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setCampaignId(Long campaignId) {
        setEntityId(campaignId);
    }

    /**
     * Gets the name of the campaign that target is associated.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public String getCampaignName() {
        return getEntityName();
    }

    /**
     * Sets the name of the campaign that target is associated.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public void setCampaignName(String campaignName) {
        setEntityName(campaignName);
    }

    /**
     * Reserved for internal use.
     */
    @Override
    BulkCampaignGenderTargetBid createBid() {
        return new BulkCampaignGenderTargetBid();
    }    
}
