package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.campaignmanagement.AdGroupNegativeSites;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v10.bulk.BulkOperation;
import com.microsoft.bingads.v10.internal.bulk.entities.BulkAdGroupNegativeSitesIdentifier;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Represents one or more negative sites that are assigned to an ad group. Each
 * negative site can be read or written in a bulk file. This class exposes
 * properties that can be read and written as fields of the Ad Group Negative
 * Site record in a bulk file.
 * </p>
 *
 * <p>
 * For more information, see Ad Group Negative Site at
 * <a href="http://go.microsoft.com/fwlink/?LinkID=620254">http://go.microsoft.com/fwlink/?LinkID=620254</a>
 * </p>
 *
 * <p>
 * One {@link BulkAdGroupNegativeSites} has one or more
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
public class BulkAdGroupNegativeSites extends BulkNegativeSites<BulkAdGroupNegativeSite, BulkAdGroupNegativeSitesIdentifier> {

    private AdGroupNegativeSites adGroupNegativeSites;// { get; set; }

    /**
     * Gets the AdGroupNegativeSites Data Object of the Campaign Management Service.
     *
     * <p>
     * A subset of AdGroupNegativeSites properties are available in the Ad Group
     * Negative Site record. For more information, see Ad Group Negative Site at
     * <a href="http://go.microsoft.com/fwlink/?LinkID=620254">http://go.microsoft.com/fwlink/?LinkID=620254</a>.
     * </p>
     */
    public AdGroupNegativeSites getAdGroupNegativeSites() {
        return adGroupNegativeSites;
    }

    /**
     * Sets the AdGroupNegativeSites Data Object of the Campaign Management Service.
     *
     * <p>
     * A subset of AdGroupNegativeSites properties are available in the Ad Group
     * Negative Site record. For more information, see Ad Group Negative Site at
     * <a href="http://go.microsoft.com/fwlink/?LinkID=620254">http://go.microsoft.com/fwlink/?LinkID=620254</a>.
     * </p>
     */
    public void setAdGroupNegativeSites(AdGroupNegativeSites adGroupNegativeSites) {
        this.adGroupNegativeSites = adGroupNegativeSites;
    }

    private String adGroupName;

    /**
     * Gets the name of the ad group that the negative site is assigned.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public String getAdGroupName() {
        return adGroupName;
    }

    /**
     * Sets the name of the ad group that the negative site is assigned.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public void setAdGroupName(String adGroupName) {
        this.adGroupName = adGroupName;
    }

    private String campaignName;

    /**
     * Gets the name of the campaign that the negative site is assigned.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the name of the campaign that the negative site is assigned.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * Initializes a new instance of the BulkAdGroupNegativeSites class.
     */
    public BulkAdGroupNegativeSites() {
    }

    BulkAdGroupNegativeSites(BulkAdGroupNegativeSite site) {
        super(site, BulkAdGroupNegativeSite.class, BulkAdGroupNegativeSitesIdentifier.class);
        setDataFromIdentifier(site.getIdentifier());
    }

    /**
     * Reserved for internal use.
     */
    public BulkAdGroupNegativeSites(BulkAdGroupNegativeSitesIdentifier identifier) {
        super(identifier, BulkAdGroupNegativeSite.class, BulkAdGroupNegativeSitesIdentifier.class);
        setDataFromIdentifier(identifier);
    }

    private void setDataFromIdentifier(BulkAdGroupNegativeSitesIdentifier identifier) {
        this.adGroupNegativeSites = new AdGroupNegativeSites();
        this.adGroupNegativeSites.setAdGroupId(identifier.getAdGroupId());

        this.adGroupName = identifier.getAdGroupName();
        this.campaignName = identifier.getCampaignName();
    }

    /**
     * Reserved for internal use.
     */
    @Override
    protected Iterable<BulkAdGroupNegativeSite> convertApiToBulkNegativeSites() {
        validateListNotNullOrEmpty(this.adGroupNegativeSites.getNegativeSites(), "AdGroupNegativeSites.NegativeSites");

        List<BulkAdGroupNegativeSite> bulkSites = new ArrayList<BulkAdGroupNegativeSite>();

        List<String> negativeSites = adGroupNegativeSites.getNegativeSites().getStrings();

        for (String negativeSite : negativeSites) {
            BulkAdGroupNegativeSite bulkSite = new BulkAdGroupNegativeSite();

            if (adGroupNegativeSites.getAdGroupId() != null) {
                bulkSite.setAdGroupId(adGroupNegativeSites.getAdGroupId());
            }
            
            bulkSite.setWebsite(negativeSite);
            bulkSite.setAdGroupName(getAdGroupName());
            bulkSite.setCampaignName(getCampaignName());

            bulkSites.add(bulkSite);
        }

        return bulkSites;
    }

    /**
     * Reserved for internal use.
     */
    private void validateListNotNullOrEmpty(ArrayOfstring negativeSites, String propertyName) {
        super.validateListNotNullOrEmpty(negativeSites, negativeSites.getStrings(), propertyName);
    }

    @Override
    protected void reconstructApiObjects() {
        ArrayOfstring websitesArray = new ArrayOfstring();

        for (BulkAdGroupNegativeSite bulkNegativeSite : getNegativeSites()) {
            websitesArray.getStrings().add(bulkNegativeSite.getWebsite());
        }

        this.adGroupNegativeSites.setNegativeSites(websitesArray);
    }

    /**
     * Reserved for internal use.
     */
    @Override
    protected BulkAdGroupNegativeSitesIdentifier createIdentifier() {
        BulkAdGroupNegativeSitesIdentifier identifier = new BulkAdGroupNegativeSitesIdentifier();
        
        if (adGroupNegativeSites.getAdGroupId() != null) {
            identifier.setAdGroupId(this.adGroupNegativeSites.getAdGroupId());
        }
        
        identifier.setAdGroupName(this.adGroupName);
        identifier.setCampaignName(this.campaignName);

        return identifier;
    }

    /**
     * Reserved for internal use.
     */
    @Override
    protected void validatePropertiesNotNull() {
        validatePropertyNotNull(adGroupNegativeSites, "AdGroupNegativeSites");
    }
}
