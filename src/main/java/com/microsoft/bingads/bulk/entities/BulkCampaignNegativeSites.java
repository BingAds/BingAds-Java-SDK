package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.campaignmanagement.CampaignNegativeSites;
import com.microsoft.bingads.internal.bulk.entities.BulkCampaignNegativeSitesIdentifier;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Represents one or more negative sites that are assigned to a campaign. Each
 * negative site can be read or written in a bulk file. This class exposes
 * properties that can be read and written as fields of the Campaign Negative
 * Site record in a bulk file.
 * </p>
 * <p>
 * For more information, see Campaign Negative Site at
 * {@link http://go.microsoft.com/fwlink/?LinkID=511524}. </p>
 *
 * <p>
 * One {@link BulkCampaignNegativeSites} has one or more
 * {@link BulkCampaignNegativeSite}. Each {@link BulkCampaignNegativeSite}
 * instance corresponds to one Campaign Negative Site record in the bulk file.
 * If you upload a {@link BulkCampaignNegativeSites}, then you are effectively
 * replacing any existing negative sites assigned to the campaign.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignNegativeSites extends BulkNegativeSites<BulkCampaignNegativeSite, BulkCampaignNegativeSitesIdentifier> {

    /**
     * The CampaignNegativeSites Data Object of the Campaign Management Service.
     * A subset of CampaignNegativeSites properties are available in the
     * Campaign Negative Site record. For more information, see Campaign
     * Negative Site at http://go.microsoft.com/fwlink/?LinkID=511524.
     */
    private CampaignNegativeSites campaignNegativeSites;// { get; set; }

    public CampaignNegativeSites getCampaignNegativeSites() {
        return campaignNegativeSites;
    }

    public void setCampaignNegativeSites(CampaignNegativeSites campaignNegativeSites) {
        this.campaignNegativeSites = campaignNegativeSites;
    }

    /**
     * The name of the campaign that the negative site is assigned. Corresponds
     * to the 'Campaign' field in the bulk file.
     */
    private String campaignName;// { get; set; }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * Initializes a new instance of the BulkCampaignNegativeSites class.
     */
    public BulkCampaignNegativeSites() {
    }

    public BulkCampaignNegativeSites(BulkCampaignNegativeSite site) {
        super(site, BulkCampaignNegativeSite.class, BulkCampaignNegativeSitesIdentifier.class);
        setDataFromIdentifier(site.getIdentifier());
    }

    public BulkCampaignNegativeSites(BulkCampaignNegativeSitesIdentifier identifier) {
        super(identifier, BulkCampaignNegativeSite.class, BulkCampaignNegativeSitesIdentifier.class);
        setDataFromIdentifier(identifier);
    }

    private void setDataFromIdentifier(BulkCampaignNegativeSitesIdentifier identifier) {
        this.campaignNegativeSites = new CampaignNegativeSites();
        this.campaignNegativeSites.setCampaignId(identifier.getCampaignId());

        this.campaignName = identifier.getCampaignName();
    }

    /**
     * Reserved for internal use.
     */
    @Override
    protected Iterable<BulkCampaignNegativeSite> convertApiToBulkNegativeSites() {
        validateListNotNullOrEmpty(this.campaignNegativeSites.getNegativeSites(), this.campaignNegativeSites.getNegativeSites().getStrings(), "CampaignNegativeSites.NegativeSites");

        List<BulkCampaignNegativeSite> bulkSites = new ArrayList<BulkCampaignNegativeSite>();

        List<String> negativeSites = campaignNegativeSites.getNegativeSites().getStrings();

        for (String negativeSite : negativeSites) {
            BulkCampaignNegativeSite bulkSite = new BulkCampaignNegativeSite();

            if (campaignNegativeSites.getCampaignId() != null) {
                bulkSite.setCampaignId(campaignNegativeSites.getCampaignId());
            }
            bulkSite.setWebsite(negativeSite);
            bulkSite.setCampaignName(getCampaignName());

            bulkSites.add(bulkSite);
        }

        return bulkSites;
    }

    /**
     * Reserved for internal use.
     */
    @Override
    protected void reconstructApiObjects() {
        ArrayOfstring websitesArray = new ArrayOfstring();

        for (BulkCampaignNegativeSite bulkNegativeSite : getNegativeSites()) {
            websitesArray.getStrings().add(bulkNegativeSite.getWebsite());
        }

        this.campaignNegativeSites.setNegativeSites(websitesArray);
    }

    /**
     * Reserved for internal use.
     */
    @Override
    protected BulkCampaignNegativeSitesIdentifier createIdentifier() {
        BulkCampaignNegativeSitesIdentifier identifier = new BulkCampaignNegativeSitesIdentifier();
        if (this.campaignNegativeSites.getCampaignId() != null) {
            identifier.setCampaignId(this.campaignNegativeSites.getCampaignId());
        }
        identifier.setCampaignName(this.campaignName);
        return identifier;
    }

    /**
     * Reserved for internal use.
     */
    @Override
    protected void validatePropertiesNotNull() {
        validatePropertyNotNull(campaignNegativeSites, "CampaignNegativeSites");
    }
}
