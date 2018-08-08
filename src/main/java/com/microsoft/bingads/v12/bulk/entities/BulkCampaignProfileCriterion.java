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
import com.microsoft.bingads.v12.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v12.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v12.campaignmanagement.CampaignCriterionStatus;
import com.microsoft.bingads.v12.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v12.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an profile criterion that is assigned to a campaign. Each profile
 * criterion can be read or written in a bulk file.
 *
 * <p>
 * For more information, see Bulk File Schema at <a
 * href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public abstract class BulkCampaignProfileCriterion extends SingleRecordBulkEntity {

    private BiddableCampaignCriterion biddableCampaignCriterion;

    private String campaignName;

    private String profileName;

    private static final List<BulkMapping<BulkCampaignProfileCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignProfileCriterion>> m = new ArrayList<BulkMapping<BulkCampaignProfileCriterion>>();

        m.add(new SimpleBulkMapping<BulkCampaignProfileCriterion, String>(StringTable.Status,
                new Function<BulkCampaignProfileCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignProfileCriterion c) {
                        CampaignCriterionStatus status = c.getBiddableCampaignCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                }, new BiConsumer<String, BulkCampaignProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignProfileCriterion c) {
                        c.getBiddableCampaignCriterion().setStatus(
                                StringExtensions.parseOptional(v, new Function<String, CampaignCriterionStatus>() {
                                    @Override
                                    public CampaignCriterionStatus apply(String s) {
                                        return CampaignCriterionStatus.fromValue(s);
                                    }
                                }));
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCampaignProfileCriterion, Long>(StringTable.Id,
                new Function<BulkCampaignProfileCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignProfileCriterion c) {
                        return c.getBiddableCampaignCriterion().getId();
                    }
                }, new BiConsumer<String, BulkCampaignProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignProfileCriterion c) {
                        c.getBiddableCampaignCriterion()
                                .setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                                    @Override
                                    public Long apply(String s) {
                                        return Long.parseLong(s);
                                    }
                                }));
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCampaignProfileCriterion, Long>(StringTable.ParentId,
                new Function<BulkCampaignProfileCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignProfileCriterion c) {
                        return c.getBiddableCampaignCriterion().getCampaignId();
                    }
                }, new BiConsumer<String, BulkCampaignProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignProfileCriterion c) {
                        c.getBiddableCampaignCriterion().setCampaignId(Long.parseLong(v));
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCampaignProfileCriterion, String>(StringTable.Campaign,
                new Function<BulkCampaignProfileCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignProfileCriterion c) {
                        return c.getCampaignName();
                    }
                }, new BiConsumer<String, BulkCampaignProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignProfileCriterion c) {
                        c.setCampaignName(v);
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCampaignProfileCriterion, String>(StringTable.BidAdjustment,
                new Function<BulkCampaignProfileCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignProfileCriterion c) {
                        if (c.getBiddableCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            CriterionBid bid = ((BiddableCampaignCriterion) c.getBiddableCampaignCriterion())
                                    .getCriterionBid();
                            if (bid == null) {
                                return null;
                            } else {
                                return StringExtensions
                                        .toCriterionBidMultiplierBulkString(((BidMultiplier) bid).getMultiplier());
                            }
                        } else {
                            return null;
                        }
                    }
                }, new BiConsumer<String, BulkCampaignProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignProfileCriterion c) {
                        if (c.getBiddableCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            ((BidMultiplier) ((BiddableCampaignCriterion) c.getBiddableCampaignCriterion())
                                    .getCriterionBid()).setMultiplier(StringExtensions.nullOrDouble(v));
                        }
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCampaignProfileCriterion, String>(StringTable.Profile,
                new Function<BulkCampaignProfileCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignProfileCriterion c) {
                        return c.getProfileName();
                    }
                }, new BiConsumer<String, BulkCampaignProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignProfileCriterion c) {
                        c.setProfileName(v);
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCampaignProfileCriterion, Long>(StringTable.ProfileId,
                new Function<BulkCampaignProfileCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignProfileCriterion c) {
                        if (c.getBiddableCampaignCriterion().getCriterion() instanceof ProfileCriterion) {
                            return ((ProfileCriterion) c.getBiddableCampaignCriterion().getCriterion()).getProfileId();
                        }
                        return null;
                    }
                }, new BiConsumer<String, BulkCampaignProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignProfileCriterion c) {
                        if (c.getBiddableCampaignCriterion().getCriterion() instanceof ProfileCriterion) {
                            ((ProfileCriterion) c.getBiddableCampaignCriterion().getCriterion())
                                    .setProfileId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                                        @Override
                                        public Long apply(String s) {
                                            return Long.parseLong(s);
                                        }
                                    }));
                        }
                    }
                }));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        BiddableCampaignCriterion campaignCriterion = new BiddableCampaignCriterion();

        BidMultiplier bidMultiplier = new BidMultiplier();
        bidMultiplier.setType(BidMultiplier.class.getSimpleName());

        ProfileCriterion criterion = new ProfileCriterion();
        setProfileType(criterion);
        campaignCriterion.setCriterion(criterion);
        campaignCriterion.getCriterion().setType(ProfileCriterion.class.getSimpleName());
        campaignCriterion.setCriterionBid(bidMultiplier);
        campaignCriterion.setType(BiddableCampaignCriterion.class.getSimpleName());

        setBiddableCampaignCriterion(campaignCriterion);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }
    

    public abstract void setProfileType(ProfileCriterion criterion);

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getBiddableCampaignCriterion(), BiddableCampaignCriterion.class.getSimpleName());

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets a Campaign Criterion.
     */
    public BiddableCampaignCriterion getBiddableCampaignCriterion() {
        return biddableCampaignCriterion;
    }

    /**
     * Sets a Campaign Criterion
     */
    public void setBiddableCampaignCriterion(BiddableCampaignCriterion biddableCampaignCriterion) {
        this.biddableCampaignCriterion = biddableCampaignCriterion;
    }

    /**
     * Gets the name of the campaign. Corresponds to the 'Campaign' field in the
     * bulk file.
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the name of the campaign. Corresponds to the 'Campaign' field in the
     * bulk file.
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * Sets the name of the Profile. Corresponds to the 'Profile' field in
     * the bulk file.
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Gets the name of the profile. Corresponds to the 'Profile' field in
     * the bulk file.
     */
    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

}
