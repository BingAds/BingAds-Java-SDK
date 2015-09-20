package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.campaignmanagement.CityTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.IntentOption;
import com.microsoft.bingads.v10.campaignmanagement.LocationTarget;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkOperation;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;

/**
 * Represents a location target that is associated with a campaign.
 *
 * This class exposes the
 * {@link BulkLocationTargetWithStringLocation#getCityTarget},
 * {@link BulkLocationTargetWithStringLocation#setCityTarget}
 * {@link BulkLocationTargetWithStringLocation#getCountryTarget},
 * {@link BulkLocationTargetWithStringLocation#setCountryTarget},
 * {@link BulkLocationTargetWithStringLocation#getMetroAreaTarget},
 * {@link BulkLocationTargetWithStringLocation#setMetroAreaTarget},
 * {@link BulkLocationTargetWithStringLocation#getPostalCodeTarget},
 * {@link BulkLocationTargetWithStringLocation#setPostalCodeTarget},
 * {@link BulkLocationTargetWithStringLocation#getStateTarget},
 * and {@link BulkLocationTargetWithStringLocation#setStateTarget} methods,
 *
 * that represent geographical location sub types.
 * Each sub type can be read and written as fields of the Campaign Location Target record in a bulk file.
 *
 * <p>
 *    Each location sub type contains a list of bids. For example {@link BulkLocationTargetWithStringLocation#getCityTarget}
 *    contains a list of {@link CityTargetBid}. Each {@link CityTargetBid} instance
 *    corresponds to one Campaign Location Target record in the bulk file.
 *    If you upload a {@link BulkLocationTargetWithStringLocation#getCityTarget},
 *    then you are effectively replacing any existing city bids for the corresponding location target.
 * </p>
 *
 * <p>
 *     The {@link BulkLocationTargetBidWithStringLocation#getLocationType} methods determines the geographical location sub type.
 * </p>
 *
 * <p>
 *     For more information, see Campaign Location Target at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=620243">http://go.microsoft.com/fwlink/?LinkID=620243</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignLocationTarget extends BulkLocationTarget<BulkCampaignLocationTargetBid> {

    /**
     * Initializes a new instanced of the BulkCampaignLocationTarget class.
     */
    public BulkCampaignLocationTarget() {
        super(BulkCampaignLocationTargetBid.class);
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
     * Gets intent options for location targeting.
     */
    public IntentOption getIntentOption() {
        return getLocationProperty(new Function<LocationTarget, IntentOption>() {
            @Override
            public IntentOption apply(LocationTarget t) {
                return t.getIntentOption();
            }
        });
    }

    /**
     * Sets intent options for location targeting.
     */
    public void setIntentOption(final IntentOption intentOption) {
        setLocationProperty(new Consumer<LocationTarget>() {
            @Override
            public void accept(LocationTarget locationTarget) {
                locationTarget.setIntentOption(intentOption);
            }
        });
    }

    /**
     * Reserved for internal use.
     */
    @Override
    BulkCampaignLocationTargetBid createBid() {
        return new BulkCampaignLocationTargetBid();
    }

}
