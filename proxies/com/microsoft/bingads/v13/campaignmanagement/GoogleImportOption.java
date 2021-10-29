
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoogleImportOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoogleImportOption">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}ImportOption">
 *       &lt;sequence>
 *         &lt;element name="AccountUrlOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdScheduleUseSearcherTimezone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdjustmentForBids" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AdjustmentForCampaignBudgets" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AssociatedStoreId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AssociatedUetTagId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AutoDeviceBidOptimization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeleteRemovedEntities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnableAutoCurrencyConversion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnableParentLocationMapping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewActiveAdsForExistingAdGroups" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewActiveCampaignsAndChildEntities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewAdCustomizerFeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewAdGroupsAndChildEntitiesForExistingCampaigns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewAdSchedules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewAppAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewAudienceTargets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewCallAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewCalloutAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewDemographicTargets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewDeviceTargets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewEntities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewKeywordUrls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewKeywordsForExistingAdGroups" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewLabels" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewLocationAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewLocationTargets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewNegativeKeywordLists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewNegativeKeywordsForExistingParents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewNegativeSites" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewPageFeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewPausedAdsForExistingAdGroups" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewPausedCampaignsAndChildEntities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewPriceAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewProductFilters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewPromotionAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewReviewAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewSitelinkAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewStructuredSnippetAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewUrlOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PauseAIMAdGroupIfAllAudienceCriterionNotImported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PauseCampaignsWithoutSupportedLocations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PauseNewCampaigns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RaiseBidsToMinimum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RaiseCampaignBudgetsToMinimum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RaiseProductGroupBidsToMinimum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SearchAndDsaMixedCampaignAsSearchCampaign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SearchAndReplaceForCampaignNames" type="{https://bingads.microsoft.com/CampaignManagement/v13}ImportSearchAndReplaceForStringProperty" minOccurs="0"/>
 *         &lt;element name="SearchAndReplaceForCustomParameters" type="{https://bingads.microsoft.com/CampaignManagement/v13}ImportSearchAndReplaceForStringProperty" minOccurs="0"/>
 *         &lt;element name="SearchAndReplaceForTrackingTemplates" type="{https://bingads.microsoft.com/CampaignManagement/v13}ImportSearchAndReplaceForStringProperty" minOccurs="0"/>
 *         &lt;element name="SearchAndReplaceForUrls" type="{https://bingads.microsoft.com/CampaignManagement/v13}ImportSearchAndReplaceForStringProperty" minOccurs="0"/>
 *         &lt;element name="SuffixForCampaignNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuffixForTrackingTemplates" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuffixForUrls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateAdCustomizerFeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateAdGroupNetwork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateAdSchedules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateAppAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateAudienceTargets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateBiddingStrategies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateBids" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateCallAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateCalloutAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateCampaignAdGroupLanguages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateCampaignBudgets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateCampaignNames" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateDemographicTargets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateDeviceTargets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateEntities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateKeywordUrls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateLabels" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateLocationAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateLocationTargets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateNegativeKeywordLists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateNegativeSites" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdatePageFeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdatePriceAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateProductFilters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdatePromotionAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateReviewAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateSitelinkAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateStatusForAdGroups" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateStatusForAds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateStatusForCampaigns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateStatusForKeywords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateStructuredSnippetAdExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateUrlOptions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoogleImportOption", propOrder = {
    "accountUrlOptions",
    "adScheduleUseSearcherTimezone",
    "adjustmentForBids",
    "adjustmentForCampaignBudgets",
    "associatedStoreId",
    "associatedUetTagId",
    "autoDeviceBidOptimization",
    "deleteRemovedEntities",
    "enableAutoCurrencyConversion",
    "enableParentLocationMapping",
    "newActiveAdsForExistingAdGroups",
    "newActiveCampaignsAndChildEntities",
    "newAdCustomizerFeeds",
    "newAdGroupsAndChildEntitiesForExistingCampaigns",
    "newAdSchedules",
    "newAppAdExtensions",
    "newAudienceTargets",
    "newCallAdExtensions",
    "newCalloutAdExtensions",
    "newDemographicTargets",
    "newDeviceTargets",
    "newEntities",
    "newKeywordUrls",
    "newKeywordsForExistingAdGroups",
    "newLabels",
    "newLocationAdExtensions",
    "newLocationTargets",
    "newNegativeKeywordLists",
    "newNegativeKeywordsForExistingParents",
    "newNegativeSites",
    "newPageFeeds",
    "newPausedAdsForExistingAdGroups",
    "newPausedCampaignsAndChildEntities",
    "newPriceAdExtensions",
    "newProductFilters",
    "newPromotionAdExtensions",
    "newReviewAdExtensions",
    "newSitelinkAdExtensions",
    "newStructuredSnippetAdExtensions",
    "newUrlOptions",
    "pauseAIMAdGroupIfAllAudienceCriterionNotImported",
    "pauseCampaignsWithoutSupportedLocations",
    "pauseNewCampaigns",
    "raiseBidsToMinimum",
    "raiseCampaignBudgetsToMinimum",
    "raiseProductGroupBidsToMinimum",
    "searchAndDsaMixedCampaignAsSearchCampaign",
    "searchAndReplaceForCampaignNames",
    "searchAndReplaceForCustomParameters",
    "searchAndReplaceForTrackingTemplates",
    "searchAndReplaceForUrls",
    "suffixForCampaignNames",
    "suffixForTrackingTemplates",
    "suffixForUrls",
    "updateAdCustomizerFeeds",
    "updateAdGroupNetwork",
    "updateAdSchedules",
    "updateAppAdExtensions",
    "updateAudienceTargets",
    "updateBiddingStrategies",
    "updateBids",
    "updateCallAdExtensions",
    "updateCalloutAdExtensions",
    "updateCampaignAdGroupLanguages",
    "updateCampaignBudgets",
    "updateCampaignNames",
    "updateDemographicTargets",
    "updateDeviceTargets",
    "updateEntities",
    "updateKeywordUrls",
    "updateLabels",
    "updateLocationAdExtensions",
    "updateLocationTargets",
    "updateNegativeKeywordLists",
    "updateNegativeSites",
    "updatePageFeeds",
    "updatePriceAdExtensions",
    "updateProductFilters",
    "updatePromotionAdExtensions",
    "updateReviewAdExtensions",
    "updateSitelinkAdExtensions",
    "updateStatusForAdGroups",
    "updateStatusForAds",
    "updateStatusForCampaigns",
    "updateStatusForKeywords",
    "updateStructuredSnippetAdExtensions",
    "updateUrlOptions"
})
public class GoogleImportOption
    extends ImportOption
{

    @XmlElement(name = "AccountUrlOptions", nillable = true)
    protected Boolean accountUrlOptions;
    @XmlElement(name = "AdScheduleUseSearcherTimezone", nillable = true)
    protected Boolean adScheduleUseSearcherTimezone;
    @XmlElement(name = "AdjustmentForBids", nillable = true)
    protected Double adjustmentForBids;
    @XmlElement(name = "AdjustmentForCampaignBudgets", nillable = true)
    protected Double adjustmentForCampaignBudgets;
    @XmlElement(name = "AssociatedStoreId", nillable = true)
    protected Long associatedStoreId;
    @XmlElement(name = "AssociatedUetTagId", nillable = true)
    protected Long associatedUetTagId;
    @XmlElement(name = "AutoDeviceBidOptimization", nillable = true)
    protected Boolean autoDeviceBidOptimization;
    @XmlElement(name = "DeleteRemovedEntities", nillable = true)
    protected Boolean deleteRemovedEntities;
    @XmlElement(name = "EnableAutoCurrencyConversion", nillable = true)
    protected Boolean enableAutoCurrencyConversion;
    @XmlElement(name = "EnableParentLocationMapping", nillable = true)
    protected Boolean enableParentLocationMapping;
    @XmlElement(name = "NewActiveAdsForExistingAdGroups", nillable = true)
    protected Boolean newActiveAdsForExistingAdGroups;
    @XmlElement(name = "NewActiveCampaignsAndChildEntities", nillable = true)
    protected Boolean newActiveCampaignsAndChildEntities;
    @XmlElement(name = "NewAdCustomizerFeeds", nillable = true)
    protected Boolean newAdCustomizerFeeds;
    @XmlElement(name = "NewAdGroupsAndChildEntitiesForExistingCampaigns", nillable = true)
    protected Boolean newAdGroupsAndChildEntitiesForExistingCampaigns;
    @XmlElement(name = "NewAdSchedules", nillable = true)
    protected Boolean newAdSchedules;
    @XmlElement(name = "NewAppAdExtensions", nillable = true)
    protected Boolean newAppAdExtensions;
    @XmlElement(name = "NewAudienceTargets", nillable = true)
    protected Boolean newAudienceTargets;
    @XmlElement(name = "NewCallAdExtensions", nillable = true)
    protected Boolean newCallAdExtensions;
    @XmlElement(name = "NewCalloutAdExtensions", nillable = true)
    protected Boolean newCalloutAdExtensions;
    @XmlElement(name = "NewDemographicTargets", nillable = true)
    protected Boolean newDemographicTargets;
    @XmlElement(name = "NewDeviceTargets", nillable = true)
    protected Boolean newDeviceTargets;
    @XmlElement(name = "NewEntities", nillable = true)
    protected Boolean newEntities;
    @XmlElement(name = "NewKeywordUrls", nillable = true)
    protected Boolean newKeywordUrls;
    @XmlElement(name = "NewKeywordsForExistingAdGroups", nillable = true)
    protected Boolean newKeywordsForExistingAdGroups;
    @XmlElement(name = "NewLabels", nillable = true)
    protected Boolean newLabels;
    @XmlElement(name = "NewLocationAdExtensions", nillable = true)
    protected Boolean newLocationAdExtensions;
    @XmlElement(name = "NewLocationTargets", nillable = true)
    protected Boolean newLocationTargets;
    @XmlElement(name = "NewNegativeKeywordLists", nillable = true)
    protected Boolean newNegativeKeywordLists;
    @XmlElement(name = "NewNegativeKeywordsForExistingParents", nillable = true)
    protected Boolean newNegativeKeywordsForExistingParents;
    @XmlElement(name = "NewNegativeSites", nillable = true)
    protected Boolean newNegativeSites;
    @XmlElement(name = "NewPageFeeds", nillable = true)
    protected Boolean newPageFeeds;
    @XmlElement(name = "NewPausedAdsForExistingAdGroups", nillable = true)
    protected Boolean newPausedAdsForExistingAdGroups;
    @XmlElement(name = "NewPausedCampaignsAndChildEntities", nillable = true)
    protected Boolean newPausedCampaignsAndChildEntities;
    @XmlElement(name = "NewPriceAdExtensions", nillable = true)
    protected Boolean newPriceAdExtensions;
    @XmlElement(name = "NewProductFilters", nillable = true)
    protected Boolean newProductFilters;
    @XmlElement(name = "NewPromotionAdExtensions", nillable = true)
    protected Boolean newPromotionAdExtensions;
    @XmlElement(name = "NewReviewAdExtensions", nillable = true)
    protected Boolean newReviewAdExtensions;
    @XmlElement(name = "NewSitelinkAdExtensions", nillable = true)
    protected Boolean newSitelinkAdExtensions;
    @XmlElement(name = "NewStructuredSnippetAdExtensions", nillable = true)
    protected Boolean newStructuredSnippetAdExtensions;
    @XmlElement(name = "NewUrlOptions", nillable = true)
    protected Boolean newUrlOptions;
    @XmlElement(name = "PauseAIMAdGroupIfAllAudienceCriterionNotImported", nillable = true)
    protected Boolean pauseAIMAdGroupIfAllAudienceCriterionNotImported;
    @XmlElement(name = "PauseCampaignsWithoutSupportedLocations", nillable = true)
    protected Boolean pauseCampaignsWithoutSupportedLocations;
    @XmlElement(name = "PauseNewCampaigns", nillable = true)
    protected Boolean pauseNewCampaigns;
    @XmlElement(name = "RaiseBidsToMinimum", nillable = true)
    protected Boolean raiseBidsToMinimum;
    @XmlElement(name = "RaiseCampaignBudgetsToMinimum", nillable = true)
    protected Boolean raiseCampaignBudgetsToMinimum;
    @XmlElement(name = "RaiseProductGroupBidsToMinimum", nillable = true)
    protected Boolean raiseProductGroupBidsToMinimum;
    @XmlElement(name = "SearchAndDsaMixedCampaignAsSearchCampaign", nillable = true)
    protected Boolean searchAndDsaMixedCampaignAsSearchCampaign;
    @XmlElement(name = "SearchAndReplaceForCampaignNames", nillable = true)
    protected ImportSearchAndReplaceForStringProperty searchAndReplaceForCampaignNames;
    @XmlElement(name = "SearchAndReplaceForCustomParameters", nillable = true)
    protected ImportSearchAndReplaceForStringProperty searchAndReplaceForCustomParameters;
    @XmlElement(name = "SearchAndReplaceForTrackingTemplates", nillable = true)
    protected ImportSearchAndReplaceForStringProperty searchAndReplaceForTrackingTemplates;
    @XmlElement(name = "SearchAndReplaceForUrls", nillable = true)
    protected ImportSearchAndReplaceForStringProperty searchAndReplaceForUrls;
    @XmlElement(name = "SuffixForCampaignNames", nillable = true)
    protected String suffixForCampaignNames;
    @XmlElement(name = "SuffixForTrackingTemplates", nillable = true)
    protected String suffixForTrackingTemplates;
    @XmlElement(name = "SuffixForUrls", nillable = true)
    protected String suffixForUrls;
    @XmlElement(name = "UpdateAdCustomizerFeeds", nillable = true)
    protected Boolean updateAdCustomizerFeeds;
    @XmlElement(name = "UpdateAdGroupNetwork", nillable = true)
    protected Boolean updateAdGroupNetwork;
    @XmlElement(name = "UpdateAdSchedules", nillable = true)
    protected Boolean updateAdSchedules;
    @XmlElement(name = "UpdateAppAdExtensions", nillable = true)
    protected Boolean updateAppAdExtensions;
    @XmlElement(name = "UpdateAudienceTargets", nillable = true)
    protected Boolean updateAudienceTargets;
    @XmlElement(name = "UpdateBiddingStrategies", nillable = true)
    protected Boolean updateBiddingStrategies;
    @XmlElement(name = "UpdateBids", nillable = true)
    protected Boolean updateBids;
    @XmlElement(name = "UpdateCallAdExtensions", nillable = true)
    protected Boolean updateCallAdExtensions;
    @XmlElement(name = "UpdateCalloutAdExtensions", nillable = true)
    protected Boolean updateCalloutAdExtensions;
    @XmlElement(name = "UpdateCampaignAdGroupLanguages", nillable = true)
    protected Boolean updateCampaignAdGroupLanguages;
    @XmlElement(name = "UpdateCampaignBudgets", nillable = true)
    protected Boolean updateCampaignBudgets;
    @XmlElement(name = "UpdateCampaignNames", nillable = true)
    protected Boolean updateCampaignNames;
    @XmlElement(name = "UpdateDemographicTargets", nillable = true)
    protected Boolean updateDemographicTargets;
    @XmlElement(name = "UpdateDeviceTargets", nillable = true)
    protected Boolean updateDeviceTargets;
    @XmlElement(name = "UpdateEntities", nillable = true)
    protected Boolean updateEntities;
    @XmlElement(name = "UpdateKeywordUrls", nillable = true)
    protected Boolean updateKeywordUrls;
    @XmlElement(name = "UpdateLabels", nillable = true)
    protected Boolean updateLabels;
    @XmlElement(name = "UpdateLocationAdExtensions", nillable = true)
    protected Boolean updateLocationAdExtensions;
    @XmlElement(name = "UpdateLocationTargets", nillable = true)
    protected Boolean updateLocationTargets;
    @XmlElement(name = "UpdateNegativeKeywordLists", nillable = true)
    protected Boolean updateNegativeKeywordLists;
    @XmlElement(name = "UpdateNegativeSites", nillable = true)
    protected Boolean updateNegativeSites;
    @XmlElement(name = "UpdatePageFeeds", nillable = true)
    protected Boolean updatePageFeeds;
    @XmlElement(name = "UpdatePriceAdExtensions", nillable = true)
    protected Boolean updatePriceAdExtensions;
    @XmlElement(name = "UpdateProductFilters", nillable = true)
    protected Boolean updateProductFilters;
    @XmlElement(name = "UpdatePromotionAdExtensions", nillable = true)
    protected Boolean updatePromotionAdExtensions;
    @XmlElement(name = "UpdateReviewAdExtensions", nillable = true)
    protected Boolean updateReviewAdExtensions;
    @XmlElement(name = "UpdateSitelinkAdExtensions", nillable = true)
    protected Boolean updateSitelinkAdExtensions;
    @XmlElement(name = "UpdateStatusForAdGroups", nillable = true)
    protected Boolean updateStatusForAdGroups;
    @XmlElement(name = "UpdateStatusForAds", nillable = true)
    protected Boolean updateStatusForAds;
    @XmlElement(name = "UpdateStatusForCampaigns", nillable = true)
    protected Boolean updateStatusForCampaigns;
    @XmlElement(name = "UpdateStatusForKeywords", nillable = true)
    protected Boolean updateStatusForKeywords;
    @XmlElement(name = "UpdateStructuredSnippetAdExtensions", nillable = true)
    protected Boolean updateStructuredSnippetAdExtensions;
    @XmlElement(name = "UpdateUrlOptions", nillable = true)
    protected Boolean updateUrlOptions;

    /**
     * Gets the value of the accountUrlOptions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAccountUrlOptions() {
        return accountUrlOptions;
    }

    /**
     * Sets the value of the accountUrlOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountUrlOptions(Boolean value) {
        this.accountUrlOptions = value;
    }

    /**
     * Gets the value of the adScheduleUseSearcherTimezone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAdScheduleUseSearcherTimezone() {
        return adScheduleUseSearcherTimezone;
    }

    /**
     * Sets the value of the adScheduleUseSearcherTimezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdScheduleUseSearcherTimezone(Boolean value) {
        this.adScheduleUseSearcherTimezone = value;
    }

    /**
     * Gets the value of the adjustmentForBids property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustmentForBids() {
        return adjustmentForBids;
    }

    /**
     * Sets the value of the adjustmentForBids property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustmentForBids(Double value) {
        this.adjustmentForBids = value;
    }

    /**
     * Gets the value of the adjustmentForCampaignBudgets property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustmentForCampaignBudgets() {
        return adjustmentForCampaignBudgets;
    }

    /**
     * Sets the value of the adjustmentForCampaignBudgets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustmentForCampaignBudgets(Double value) {
        this.adjustmentForCampaignBudgets = value;
    }

    /**
     * Gets the value of the associatedStoreId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssociatedStoreId() {
        return associatedStoreId;
    }

    /**
     * Sets the value of the associatedStoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssociatedStoreId(Long value) {
        this.associatedStoreId = value;
    }

    /**
     * Gets the value of the associatedUetTagId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssociatedUetTagId() {
        return associatedUetTagId;
    }

    /**
     * Sets the value of the associatedUetTagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssociatedUetTagId(Long value) {
        this.associatedUetTagId = value;
    }

    /**
     * Gets the value of the autoDeviceBidOptimization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutoDeviceBidOptimization() {
        return autoDeviceBidOptimization;
    }

    /**
     * Sets the value of the autoDeviceBidOptimization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoDeviceBidOptimization(Boolean value) {
        this.autoDeviceBidOptimization = value;
    }

    /**
     * Gets the value of the deleteRemovedEntities property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDeleteRemovedEntities() {
        return deleteRemovedEntities;
    }

    /**
     * Sets the value of the deleteRemovedEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteRemovedEntities(Boolean value) {
        this.deleteRemovedEntities = value;
    }

    /**
     * Gets the value of the enableAutoCurrencyConversion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEnableAutoCurrencyConversion() {
        return enableAutoCurrencyConversion;
    }

    /**
     * Sets the value of the enableAutoCurrencyConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAutoCurrencyConversion(Boolean value) {
        this.enableAutoCurrencyConversion = value;
    }

    /**
     * Gets the value of the enableParentLocationMapping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEnableParentLocationMapping() {
        return enableParentLocationMapping;
    }

    /**
     * Sets the value of the enableParentLocationMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableParentLocationMapping(Boolean value) {
        this.enableParentLocationMapping = value;
    }

    /**
     * Gets the value of the newActiveAdsForExistingAdGroups property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewActiveAdsForExistingAdGroups() {
        return newActiveAdsForExistingAdGroups;
    }

    /**
     * Sets the value of the newActiveAdsForExistingAdGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewActiveAdsForExistingAdGroups(Boolean value) {
        this.newActiveAdsForExistingAdGroups = value;
    }

    /**
     * Gets the value of the newActiveCampaignsAndChildEntities property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewActiveCampaignsAndChildEntities() {
        return newActiveCampaignsAndChildEntities;
    }

    /**
     * Sets the value of the newActiveCampaignsAndChildEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewActiveCampaignsAndChildEntities(Boolean value) {
        this.newActiveCampaignsAndChildEntities = value;
    }

    /**
     * Gets the value of the newAdCustomizerFeeds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewAdCustomizerFeeds() {
        return newAdCustomizerFeeds;
    }

    /**
     * Sets the value of the newAdCustomizerFeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewAdCustomizerFeeds(Boolean value) {
        this.newAdCustomizerFeeds = value;
    }

    /**
     * Gets the value of the newAdGroupsAndChildEntitiesForExistingCampaigns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewAdGroupsAndChildEntitiesForExistingCampaigns() {
        return newAdGroupsAndChildEntitiesForExistingCampaigns;
    }

    /**
     * Sets the value of the newAdGroupsAndChildEntitiesForExistingCampaigns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewAdGroupsAndChildEntitiesForExistingCampaigns(Boolean value) {
        this.newAdGroupsAndChildEntitiesForExistingCampaigns = value;
    }

    /**
     * Gets the value of the newAdSchedules property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewAdSchedules() {
        return newAdSchedules;
    }

    /**
     * Sets the value of the newAdSchedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewAdSchedules(Boolean value) {
        this.newAdSchedules = value;
    }

    /**
     * Gets the value of the newAppAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewAppAdExtensions() {
        return newAppAdExtensions;
    }

    /**
     * Sets the value of the newAppAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewAppAdExtensions(Boolean value) {
        this.newAppAdExtensions = value;
    }

    /**
     * Gets the value of the newAudienceTargets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewAudienceTargets() {
        return newAudienceTargets;
    }

    /**
     * Sets the value of the newAudienceTargets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewAudienceTargets(Boolean value) {
        this.newAudienceTargets = value;
    }

    /**
     * Gets the value of the newCallAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewCallAdExtensions() {
        return newCallAdExtensions;
    }

    /**
     * Sets the value of the newCallAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewCallAdExtensions(Boolean value) {
        this.newCallAdExtensions = value;
    }

    /**
     * Gets the value of the newCalloutAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewCalloutAdExtensions() {
        return newCalloutAdExtensions;
    }

    /**
     * Sets the value of the newCalloutAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewCalloutAdExtensions(Boolean value) {
        this.newCalloutAdExtensions = value;
    }

    /**
     * Gets the value of the newDemographicTargets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewDemographicTargets() {
        return newDemographicTargets;
    }

    /**
     * Sets the value of the newDemographicTargets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewDemographicTargets(Boolean value) {
        this.newDemographicTargets = value;
    }

    /**
     * Gets the value of the newDeviceTargets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewDeviceTargets() {
        return newDeviceTargets;
    }

    /**
     * Sets the value of the newDeviceTargets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewDeviceTargets(Boolean value) {
        this.newDeviceTargets = value;
    }

    /**
     * Gets the value of the newEntities property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewEntities() {
        return newEntities;
    }

    /**
     * Sets the value of the newEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewEntities(Boolean value) {
        this.newEntities = value;
    }

    /**
     * Gets the value of the newKeywordUrls property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewKeywordUrls() {
        return newKeywordUrls;
    }

    /**
     * Sets the value of the newKeywordUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewKeywordUrls(Boolean value) {
        this.newKeywordUrls = value;
    }

    /**
     * Gets the value of the newKeywordsForExistingAdGroups property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewKeywordsForExistingAdGroups() {
        return newKeywordsForExistingAdGroups;
    }

    /**
     * Sets the value of the newKeywordsForExistingAdGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewKeywordsForExistingAdGroups(Boolean value) {
        this.newKeywordsForExistingAdGroups = value;
    }

    /**
     * Gets the value of the newLabels property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewLabels() {
        return newLabels;
    }

    /**
     * Sets the value of the newLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewLabels(Boolean value) {
        this.newLabels = value;
    }

    /**
     * Gets the value of the newLocationAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewLocationAdExtensions() {
        return newLocationAdExtensions;
    }

    /**
     * Sets the value of the newLocationAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewLocationAdExtensions(Boolean value) {
        this.newLocationAdExtensions = value;
    }

    /**
     * Gets the value of the newLocationTargets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewLocationTargets() {
        return newLocationTargets;
    }

    /**
     * Sets the value of the newLocationTargets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewLocationTargets(Boolean value) {
        this.newLocationTargets = value;
    }

    /**
     * Gets the value of the newNegativeKeywordLists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewNegativeKeywordLists() {
        return newNegativeKeywordLists;
    }

    /**
     * Sets the value of the newNegativeKeywordLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewNegativeKeywordLists(Boolean value) {
        this.newNegativeKeywordLists = value;
    }

    /**
     * Gets the value of the newNegativeKeywordsForExistingParents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewNegativeKeywordsForExistingParents() {
        return newNegativeKeywordsForExistingParents;
    }

    /**
     * Sets the value of the newNegativeKeywordsForExistingParents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewNegativeKeywordsForExistingParents(Boolean value) {
        this.newNegativeKeywordsForExistingParents = value;
    }

    /**
     * Gets the value of the newNegativeSites property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewNegativeSites() {
        return newNegativeSites;
    }

    /**
     * Sets the value of the newNegativeSites property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewNegativeSites(Boolean value) {
        this.newNegativeSites = value;
    }

    /**
     * Gets the value of the newPageFeeds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewPageFeeds() {
        return newPageFeeds;
    }

    /**
     * Sets the value of the newPageFeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewPageFeeds(Boolean value) {
        this.newPageFeeds = value;
    }

    /**
     * Gets the value of the newPausedAdsForExistingAdGroups property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewPausedAdsForExistingAdGroups() {
        return newPausedAdsForExistingAdGroups;
    }

    /**
     * Sets the value of the newPausedAdsForExistingAdGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewPausedAdsForExistingAdGroups(Boolean value) {
        this.newPausedAdsForExistingAdGroups = value;
    }

    /**
     * Gets the value of the newPausedCampaignsAndChildEntities property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewPausedCampaignsAndChildEntities() {
        return newPausedCampaignsAndChildEntities;
    }

    /**
     * Sets the value of the newPausedCampaignsAndChildEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewPausedCampaignsAndChildEntities(Boolean value) {
        this.newPausedCampaignsAndChildEntities = value;
    }

    /**
     * Gets the value of the newPriceAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewPriceAdExtensions() {
        return newPriceAdExtensions;
    }

    /**
     * Sets the value of the newPriceAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewPriceAdExtensions(Boolean value) {
        this.newPriceAdExtensions = value;
    }

    /**
     * Gets the value of the newProductFilters property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewProductFilters() {
        return newProductFilters;
    }

    /**
     * Sets the value of the newProductFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewProductFilters(Boolean value) {
        this.newProductFilters = value;
    }

    /**
     * Gets the value of the newPromotionAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewPromotionAdExtensions() {
        return newPromotionAdExtensions;
    }

    /**
     * Sets the value of the newPromotionAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewPromotionAdExtensions(Boolean value) {
        this.newPromotionAdExtensions = value;
    }

    /**
     * Gets the value of the newReviewAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewReviewAdExtensions() {
        return newReviewAdExtensions;
    }

    /**
     * Sets the value of the newReviewAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewReviewAdExtensions(Boolean value) {
        this.newReviewAdExtensions = value;
    }

    /**
     * Gets the value of the newSitelinkAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewSitelinkAdExtensions() {
        return newSitelinkAdExtensions;
    }

    /**
     * Sets the value of the newSitelinkAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewSitelinkAdExtensions(Boolean value) {
        this.newSitelinkAdExtensions = value;
    }

    /**
     * Gets the value of the newStructuredSnippetAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewStructuredSnippetAdExtensions() {
        return newStructuredSnippetAdExtensions;
    }

    /**
     * Sets the value of the newStructuredSnippetAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewStructuredSnippetAdExtensions(Boolean value) {
        this.newStructuredSnippetAdExtensions = value;
    }

    /**
     * Gets the value of the newUrlOptions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewUrlOptions() {
        return newUrlOptions;
    }

    /**
     * Sets the value of the newUrlOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewUrlOptions(Boolean value) {
        this.newUrlOptions = value;
    }

    /**
     * Gets the value of the pauseAIMAdGroupIfAllAudienceCriterionNotImported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPauseAIMAdGroupIfAllAudienceCriterionNotImported() {
        return pauseAIMAdGroupIfAllAudienceCriterionNotImported;
    }

    /**
     * Sets the value of the pauseAIMAdGroupIfAllAudienceCriterionNotImported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPauseAIMAdGroupIfAllAudienceCriterionNotImported(Boolean value) {
        this.pauseAIMAdGroupIfAllAudienceCriterionNotImported = value;
    }

    /**
     * Gets the value of the pauseCampaignsWithoutSupportedLocations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPauseCampaignsWithoutSupportedLocations() {
        return pauseCampaignsWithoutSupportedLocations;
    }

    /**
     * Sets the value of the pauseCampaignsWithoutSupportedLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPauseCampaignsWithoutSupportedLocations(Boolean value) {
        this.pauseCampaignsWithoutSupportedLocations = value;
    }

    /**
     * Gets the value of the pauseNewCampaigns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPauseNewCampaigns() {
        return pauseNewCampaigns;
    }

    /**
     * Sets the value of the pauseNewCampaigns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPauseNewCampaigns(Boolean value) {
        this.pauseNewCampaigns = value;
    }

    /**
     * Gets the value of the raiseBidsToMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRaiseBidsToMinimum() {
        return raiseBidsToMinimum;
    }

    /**
     * Sets the value of the raiseBidsToMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRaiseBidsToMinimum(Boolean value) {
        this.raiseBidsToMinimum = value;
    }

    /**
     * Gets the value of the raiseCampaignBudgetsToMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRaiseCampaignBudgetsToMinimum() {
        return raiseCampaignBudgetsToMinimum;
    }

    /**
     * Sets the value of the raiseCampaignBudgetsToMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRaiseCampaignBudgetsToMinimum(Boolean value) {
        this.raiseCampaignBudgetsToMinimum = value;
    }

    /**
     * Gets the value of the raiseProductGroupBidsToMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRaiseProductGroupBidsToMinimum() {
        return raiseProductGroupBidsToMinimum;
    }

    /**
     * Sets the value of the raiseProductGroupBidsToMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRaiseProductGroupBidsToMinimum(Boolean value) {
        this.raiseProductGroupBidsToMinimum = value;
    }

    /**
     * Gets the value of the searchAndDsaMixedCampaignAsSearchCampaign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSearchAndDsaMixedCampaignAsSearchCampaign() {
        return searchAndDsaMixedCampaignAsSearchCampaign;
    }

    /**
     * Sets the value of the searchAndDsaMixedCampaignAsSearchCampaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchAndDsaMixedCampaignAsSearchCampaign(Boolean value) {
        this.searchAndDsaMixedCampaignAsSearchCampaign = value;
    }

    /**
     * Gets the value of the searchAndReplaceForCampaignNames property.
     * 
     * @return
     *     possible object is
     *     {@link ImportSearchAndReplaceForStringProperty }
     *     
     */
    public ImportSearchAndReplaceForStringProperty getSearchAndReplaceForCampaignNames() {
        return searchAndReplaceForCampaignNames;
    }

    /**
     * Sets the value of the searchAndReplaceForCampaignNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportSearchAndReplaceForStringProperty }
     *     
     */
    public void setSearchAndReplaceForCampaignNames(ImportSearchAndReplaceForStringProperty value) {
        this.searchAndReplaceForCampaignNames = value;
    }

    /**
     * Gets the value of the searchAndReplaceForCustomParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ImportSearchAndReplaceForStringProperty }
     *     
     */
    public ImportSearchAndReplaceForStringProperty getSearchAndReplaceForCustomParameters() {
        return searchAndReplaceForCustomParameters;
    }

    /**
     * Sets the value of the searchAndReplaceForCustomParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportSearchAndReplaceForStringProperty }
     *     
     */
    public void setSearchAndReplaceForCustomParameters(ImportSearchAndReplaceForStringProperty value) {
        this.searchAndReplaceForCustomParameters = value;
    }

    /**
     * Gets the value of the searchAndReplaceForTrackingTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link ImportSearchAndReplaceForStringProperty }
     *     
     */
    public ImportSearchAndReplaceForStringProperty getSearchAndReplaceForTrackingTemplates() {
        return searchAndReplaceForTrackingTemplates;
    }

    /**
     * Sets the value of the searchAndReplaceForTrackingTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportSearchAndReplaceForStringProperty }
     *     
     */
    public void setSearchAndReplaceForTrackingTemplates(ImportSearchAndReplaceForStringProperty value) {
        this.searchAndReplaceForTrackingTemplates = value;
    }

    /**
     * Gets the value of the searchAndReplaceForUrls property.
     * 
     * @return
     *     possible object is
     *     {@link ImportSearchAndReplaceForStringProperty }
     *     
     */
    public ImportSearchAndReplaceForStringProperty getSearchAndReplaceForUrls() {
        return searchAndReplaceForUrls;
    }

    /**
     * Sets the value of the searchAndReplaceForUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportSearchAndReplaceForStringProperty }
     *     
     */
    public void setSearchAndReplaceForUrls(ImportSearchAndReplaceForStringProperty value) {
        this.searchAndReplaceForUrls = value;
    }

    /**
     * Gets the value of the suffixForCampaignNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixForCampaignNames() {
        return suffixForCampaignNames;
    }

    /**
     * Sets the value of the suffixForCampaignNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffixForCampaignNames(String value) {
        this.suffixForCampaignNames = value;
    }

    /**
     * Gets the value of the suffixForTrackingTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixForTrackingTemplates() {
        return suffixForTrackingTemplates;
    }

    /**
     * Sets the value of the suffixForTrackingTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffixForTrackingTemplates(String value) {
        this.suffixForTrackingTemplates = value;
    }

    /**
     * Gets the value of the suffixForUrls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixForUrls() {
        return suffixForUrls;
    }

    /**
     * Sets the value of the suffixForUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffixForUrls(String value) {
        this.suffixForUrls = value;
    }

    /**
     * Gets the value of the updateAdCustomizerFeeds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateAdCustomizerFeeds() {
        return updateAdCustomizerFeeds;
    }

    /**
     * Sets the value of the updateAdCustomizerFeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateAdCustomizerFeeds(Boolean value) {
        this.updateAdCustomizerFeeds = value;
    }

    /**
     * Gets the value of the updateAdGroupNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateAdGroupNetwork() {
        return updateAdGroupNetwork;
    }

    /**
     * Sets the value of the updateAdGroupNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateAdGroupNetwork(Boolean value) {
        this.updateAdGroupNetwork = value;
    }

    /**
     * Gets the value of the updateAdSchedules property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateAdSchedules() {
        return updateAdSchedules;
    }

    /**
     * Sets the value of the updateAdSchedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateAdSchedules(Boolean value) {
        this.updateAdSchedules = value;
    }

    /**
     * Gets the value of the updateAppAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateAppAdExtensions() {
        return updateAppAdExtensions;
    }

    /**
     * Sets the value of the updateAppAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateAppAdExtensions(Boolean value) {
        this.updateAppAdExtensions = value;
    }

    /**
     * Gets the value of the updateAudienceTargets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateAudienceTargets() {
        return updateAudienceTargets;
    }

    /**
     * Sets the value of the updateAudienceTargets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateAudienceTargets(Boolean value) {
        this.updateAudienceTargets = value;
    }

    /**
     * Gets the value of the updateBiddingStrategies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateBiddingStrategies() {
        return updateBiddingStrategies;
    }

    /**
     * Sets the value of the updateBiddingStrategies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateBiddingStrategies(Boolean value) {
        this.updateBiddingStrategies = value;
    }

    /**
     * Gets the value of the updateBids property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateBids() {
        return updateBids;
    }

    /**
     * Sets the value of the updateBids property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateBids(Boolean value) {
        this.updateBids = value;
    }

    /**
     * Gets the value of the updateCallAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateCallAdExtensions() {
        return updateCallAdExtensions;
    }

    /**
     * Sets the value of the updateCallAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateCallAdExtensions(Boolean value) {
        this.updateCallAdExtensions = value;
    }

    /**
     * Gets the value of the updateCalloutAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateCalloutAdExtensions() {
        return updateCalloutAdExtensions;
    }

    /**
     * Sets the value of the updateCalloutAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateCalloutAdExtensions(Boolean value) {
        this.updateCalloutAdExtensions = value;
    }

    /**
     * Gets the value of the updateCampaignAdGroupLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateCampaignAdGroupLanguages() {
        return updateCampaignAdGroupLanguages;
    }

    /**
     * Sets the value of the updateCampaignAdGroupLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateCampaignAdGroupLanguages(Boolean value) {
        this.updateCampaignAdGroupLanguages = value;
    }

    /**
     * Gets the value of the updateCampaignBudgets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateCampaignBudgets() {
        return updateCampaignBudgets;
    }

    /**
     * Sets the value of the updateCampaignBudgets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateCampaignBudgets(Boolean value) {
        this.updateCampaignBudgets = value;
    }

    /**
     * Gets the value of the updateCampaignNames property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateCampaignNames() {
        return updateCampaignNames;
    }

    /**
     * Sets the value of the updateCampaignNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateCampaignNames(Boolean value) {
        this.updateCampaignNames = value;
    }

    /**
     * Gets the value of the updateDemographicTargets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateDemographicTargets() {
        return updateDemographicTargets;
    }

    /**
     * Sets the value of the updateDemographicTargets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateDemographicTargets(Boolean value) {
        this.updateDemographicTargets = value;
    }

    /**
     * Gets the value of the updateDeviceTargets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateDeviceTargets() {
        return updateDeviceTargets;
    }

    /**
     * Sets the value of the updateDeviceTargets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateDeviceTargets(Boolean value) {
        this.updateDeviceTargets = value;
    }

    /**
     * Gets the value of the updateEntities property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateEntities() {
        return updateEntities;
    }

    /**
     * Sets the value of the updateEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateEntities(Boolean value) {
        this.updateEntities = value;
    }

    /**
     * Gets the value of the updateKeywordUrls property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateKeywordUrls() {
        return updateKeywordUrls;
    }

    /**
     * Sets the value of the updateKeywordUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateKeywordUrls(Boolean value) {
        this.updateKeywordUrls = value;
    }

    /**
     * Gets the value of the updateLabels property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateLabels() {
        return updateLabels;
    }

    /**
     * Sets the value of the updateLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateLabels(Boolean value) {
        this.updateLabels = value;
    }

    /**
     * Gets the value of the updateLocationAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateLocationAdExtensions() {
        return updateLocationAdExtensions;
    }

    /**
     * Sets the value of the updateLocationAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateLocationAdExtensions(Boolean value) {
        this.updateLocationAdExtensions = value;
    }

    /**
     * Gets the value of the updateLocationTargets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateLocationTargets() {
        return updateLocationTargets;
    }

    /**
     * Sets the value of the updateLocationTargets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateLocationTargets(Boolean value) {
        this.updateLocationTargets = value;
    }

    /**
     * Gets the value of the updateNegativeKeywordLists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateNegativeKeywordLists() {
        return updateNegativeKeywordLists;
    }

    /**
     * Sets the value of the updateNegativeKeywordLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateNegativeKeywordLists(Boolean value) {
        this.updateNegativeKeywordLists = value;
    }

    /**
     * Gets the value of the updateNegativeSites property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateNegativeSites() {
        return updateNegativeSites;
    }

    /**
     * Sets the value of the updateNegativeSites property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateNegativeSites(Boolean value) {
        this.updateNegativeSites = value;
    }

    /**
     * Gets the value of the updatePageFeeds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdatePageFeeds() {
        return updatePageFeeds;
    }

    /**
     * Sets the value of the updatePageFeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdatePageFeeds(Boolean value) {
        this.updatePageFeeds = value;
    }

    /**
     * Gets the value of the updatePriceAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdatePriceAdExtensions() {
        return updatePriceAdExtensions;
    }

    /**
     * Sets the value of the updatePriceAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdatePriceAdExtensions(Boolean value) {
        this.updatePriceAdExtensions = value;
    }

    /**
     * Gets the value of the updateProductFilters property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateProductFilters() {
        return updateProductFilters;
    }

    /**
     * Sets the value of the updateProductFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateProductFilters(Boolean value) {
        this.updateProductFilters = value;
    }

    /**
     * Gets the value of the updatePromotionAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdatePromotionAdExtensions() {
        return updatePromotionAdExtensions;
    }

    /**
     * Sets the value of the updatePromotionAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdatePromotionAdExtensions(Boolean value) {
        this.updatePromotionAdExtensions = value;
    }

    /**
     * Gets the value of the updateReviewAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateReviewAdExtensions() {
        return updateReviewAdExtensions;
    }

    /**
     * Sets the value of the updateReviewAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateReviewAdExtensions(Boolean value) {
        this.updateReviewAdExtensions = value;
    }

    /**
     * Gets the value of the updateSitelinkAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateSitelinkAdExtensions() {
        return updateSitelinkAdExtensions;
    }

    /**
     * Sets the value of the updateSitelinkAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateSitelinkAdExtensions(Boolean value) {
        this.updateSitelinkAdExtensions = value;
    }

    /**
     * Gets the value of the updateStatusForAdGroups property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateStatusForAdGroups() {
        return updateStatusForAdGroups;
    }

    /**
     * Sets the value of the updateStatusForAdGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateStatusForAdGroups(Boolean value) {
        this.updateStatusForAdGroups = value;
    }

    /**
     * Gets the value of the updateStatusForAds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateStatusForAds() {
        return updateStatusForAds;
    }

    /**
     * Sets the value of the updateStatusForAds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateStatusForAds(Boolean value) {
        this.updateStatusForAds = value;
    }

    /**
     * Gets the value of the updateStatusForCampaigns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateStatusForCampaigns() {
        return updateStatusForCampaigns;
    }

    /**
     * Sets the value of the updateStatusForCampaigns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateStatusForCampaigns(Boolean value) {
        this.updateStatusForCampaigns = value;
    }

    /**
     * Gets the value of the updateStatusForKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateStatusForKeywords() {
        return updateStatusForKeywords;
    }

    /**
     * Sets the value of the updateStatusForKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateStatusForKeywords(Boolean value) {
        this.updateStatusForKeywords = value;
    }

    /**
     * Gets the value of the updateStructuredSnippetAdExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateStructuredSnippetAdExtensions() {
        return updateStructuredSnippetAdExtensions;
    }

    /**
     * Sets the value of the updateStructuredSnippetAdExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateStructuredSnippetAdExtensions(Boolean value) {
        this.updateStructuredSnippetAdExtensions = value;
    }

    /**
     * Gets the value of the updateUrlOptions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateUrlOptions() {
        return updateUrlOptions;
    }

    /**
     * Sets the value of the updateUrlOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateUrlOptions(Boolean value) {
        this.updateUrlOptions = value;
    }

}
