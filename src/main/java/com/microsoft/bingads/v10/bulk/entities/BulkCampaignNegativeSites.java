package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.internal.bulk.entities.BulkCampaignNegativeSitesIdentifier;
import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v10.campaignmanagement.CampaignNegativeSites;
import com.microsoft.bingads.v10.bulk.BulkOperation;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
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
 * <a href="http://go.microsoft.com/fwlink/?LinkID=620242">http://go.microsoft.com/fwlink/?LinkID=620242</a>
 * </p>
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

    private CampaignNegativeSites campaignNegativeSites;

    /**
     * Gets the CampaignNegativeSites Data Object of the Campaign Management Service.
     * A subset of CampaignNegativeSites properties are available in the
     * Campaign Negative Site record.
     *
     * <p>
     * For more information, see Campaign Negative Site at
     * <a href="http://go.microsoft.com/fwlink/?LinkID=620242">http://go.microsoft.com/fwlink/?LinkID=620242</a>.
     * </p>
     */
    public CampaignNegativeSites getCampaignNegativeSites() {
        return campaignNegativeSites;
    }

    /**
     * Sets the CampaignNegativeSites Data Object of the Campaign Management Service.
     * A subset of CampaignNegativeSites properties are available in the
     * Campaign Negative Site record.
     *
     * <p>
     * For more information, see Campaign Negative Site at
     * <a href="http://go.microsoft.com/fwlink/?LinkID=620242">http://go.microsoft.com/fwlink/?LinkID=620242</a>.
     * </p>
     */
    public void setCampaignNegativeSites(CampaignNegativeSites campaignNegativeSites) {
        this.campaignNegativeSites = campaignNegativeSites;
    }

    private String campaignName;

    /**
     * Gets the name of the campaign that the negative site is assigned.
     *
     * <p>
     * Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the name of the campaign that the negative site is assigned.
     *
     * <p>
     * Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * Initializes a new instance of the BulkCampaignNegativeSites class.
     */
    public BulkCampaignNegativeSites() {
    }

    BulkCampaignNegativeSites(BulkCampaignNegativeSite site) {
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
