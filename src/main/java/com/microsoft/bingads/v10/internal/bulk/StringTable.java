package com.microsoft.bingads.v10.internal.bulk;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Contains a large amount of String variable which serves as the canonical
 * source for Strings (particularly headers)
 *
 */

public class StringTable {
    private static Map<String, String> variableNameToHeader;

    // CSV header strings
    public static final String ClientId = "Client Id";

    public static final String Type = "Type";

    public static final String Status = "Status";

    public static final String Campaign = "Campaign";

    public static final String Id = "Id";

    public static final String BusinessId = "Business Id";

    public static final String ParentId = "Parent Id";

    public static final String TimeZone = "Time Zone";

    public static final String Budget = "Budget";

    public static final String BudgetType = "Budget Type";
    public static final String KeywordVariantMatchEnabled = "KeywordVariantMatchEnabled";

    public static final String AdGroup = "Ad Group";
    public static final String Keyword = "Keyword";

    public static final String TextAd = "Text Ad";
    public static final String ProductAd = "Product Ad";
    public static final String AppInstallAd = "App Install Ad";

    public static final String Title = "Title";
    public static final String EditorialStatus = "Editorial Status";
    public static final String EditorialAppealStatus = "Editorial Appeal Status";
    public static final String Error = "Error";
    public static final String ErrorNumber = "Error Number";
    public static final String FieldPath = "Field Path";
    public static final String EditorialLocation = "Editorial Location";
    public static final String EditorialTerm = "Editorial Term";
    public static final String EditorialReasonCode = "Editorial Reason Code";

    public static final String MigrationErrors = "Migration Errors";

    public static final String DisplayUrl = "Display Url";
    public static final String DestinationUrl = "Destination Url";
    public static final String BusinessName = "Business Name";
    public static final String PhoneNumber = "Phone Number";
    public static final String PromotionalText = "Promotion";
    public static final String MatchType = "Match Type";
    public static final String Param1 = "Param1";
    public static final String Param2 = "Param2";
    public static final String Param3 = "Param3";
    public static final String DevicePreference = "Device Preference";

    public static final String CampaignNegativeKeyword = "Campaign Negative Keyword";
    public static final String CampaignNegativeSite = "Campaign Negative Site";
    public static final String AdGroupNegativeKeyword = "Ad Group Negative Keyword";
    public static final String KeywordNegativeKeyword = "Keyword Negative Keyword";

    public static final String AdGroupNegativeSite = "Ad Group Negative Site";
    public static final String Text = "Text";
    public static final String Website = "Website";

    public static final String Target = "Target";

    public static final String PhysicalIntent = "Physical Intent";

    public static final String Bid = "Bid";

    public static final String BidAdjustment = "Bid Adjustment";
    public static final String SubType = "Sub Type";

    public static final String OsNames = "OS Names";

    public static final String StartDate = "Start Date";
    public static final String EndDate = "End Date";
    public static final String NetworkDistribution = "Network Distribution";
    public static final String SearchNetwork = "Search Network";
    public static final String ContentNetwork = "Content Network";
    public static final String PricingModel = "Pricing Model";
    public static final String Language = "Language";
    public static final String SearchBid = "Search Bid";
    public static final String ContentBid = "Content Bid";
    public static final String AdRotation = "Ad Rotation";

    public static final String Account = "Account";
    public static final String SyncTime = "Sync Time";
    public static final String Name = "Name";

    public static final String LastModifiedTime = "Modified Time";
    
    public static final String NativePreference = "Ad Format Preference";
    
    // entity types
    public static final String SemanticVersion = "Format Version";
    public static final String LocationTarget = "Location Target";
    public static final String RadiusTarget = "Radius Target";
    public static final String BusinessTarget = "Business Location Target";
    public static final String RadiusTargetId = "Radius Target Id";
    public static final String NegativeLocationTarget = "Negative Location Target";
    public static final String AgeTarget = "Age Target";
    public static final String GenderTarget = "Gender Target";
    public static final String DayTarget = "Day Target";
    public static final String HourTarget = "Hour Target";
    public static final String DeviceOsTarget = "DeviceOS Target";
    public static final String Radius = "Radius";
    public static final String Unit = "Unit";
    public static final String TargetAll = "Target All";

    public static final String SiteLinksAdExtension = "Sitelink Ad Extension";
    public static final String LocationAdExtension = "Location Ad Extension";

    public static final String CallAdExtension = "Call Ad Extension";
    public static final String ImageAdExtension = "Image Ad Extension";
    public static final String SocialNetworkAdExtension = "Social Network Ad Extension";

    public static final String Version = "Version";

    // Social network ad extension
    // NOTE: The "Social Network" Bulk Upload/Download column maps to the SocialNetworkType attribute of SocialNetworkAdExtension in the MT
    public static final String SocialNetworkType = "Social Network";
    public static final String CampaignSocialNetworkAdExtension = "Campaign Social Network Ad Extension";
    public static final String AdGroupSocialNetworkAdExtension = "AdGroup Social Network Ad Extension";

    //Image ad extension
    public static final String AltText = "Alternative Text";
    public static final String MediaIds = "Media Ids";
    public static final String CampaignImageAdExtension = "Campaign Image Ad Extension";
    public static final String AdGroupImageAdExtension = "Ad Group Image Ad Extension";

    // Site link ad extensions
    public static final String SiteLinkExtensionOrder = "Sitelink Extension Order";
    public static final String SiteLinkDisplayText = "Sitelink Extension Link Text";
    public static final String SiteLinkDestinationUrl = "Sitelink Extension Destination Url";
    public static final String SiteLinkDescription1 = "Sitelink Extension Description1";
    public static final String SiteLinkDescription2 = "Sitelink Extension Description2";

    public static final String CampaignSiteLinksAdExtension = "Campaign Sitelink Ad Extension";
    public static final String AdGroupSiteLinksAdExtension = "AdGroup Sitelink Ad Extension";

    // location ad extensions
    public static final String AddressLine1 = "Address Line 1";
    public static final String AddressLine2 = "Address Line 2";
    public static final String PostalCode = "Postal Code";
    public static final String City = "City";
    public static final String StateOrProvince = "State Or Province Code";
    public static final String ProvinceName = "Province Name";

    public static final String GeoCodeStatus = "Geo Code Status";
    public static final String IconMediaId = "Map Icon";
    public static final String ImageMediaId = "Business Icon";
    public static final String CampaignLocationAdExtension = "Campaign Location Ad Extension";

    // Call ad extensions
    public static final String CountryCode = "Country Code";
    public static final String IsCallOnly = "Call Only";
    public static final String CampaignCallAdExtension = "Campaign Call Ad Extension";
    public static final String IsCallTrackingEnabled = "Call Tracking Enabled";
    public static final String RequireTollFreeTrackingNumber = "Toll Free";

    // Editorial rejection reasons
    public static final String PublisherCountries = "Publisher Countries";

    // Product Target
    public static final String ProductTargetType = "Ad Group Product Target";

    public static final String ProductConditionColumnPrefix = "Product Condition ";
    public static final String ProductCondition1 = "Product Condition 1";
    public static final String ProductCondition2 = "Product Condition 2";
    public static final String ProductCondition3 = "Product Condition 3";
    public static final String ProductValueColumnPrefix = "Product Value ";
    public static final String ProductValue1 = "Product Value 1";
    public static final String ProductValue2 = "Product Value 2";
    public static final String ProductValue3 = "Product Value 3";

    // BTE types
    public static final String KeywordFirstPageBidType = "Keyword First Page Bid";
    public static final String KeywordMainLineBidType = "Keyword Main Line Bid";
    public static final String KeywordBestPositionBidType = "Keyword Best Position Bid";

    // Product ad extension

    public static final String ProductCondition4 = "Product Condition 4";
    public static final String ProductCondition5 = "Product Condition 5";
    public static final String ProductCondition6 = "Product Condition 6";
    public static final String ProductCondition7 = "Product Condition 7";
    public static final String ProductCondition8 = "Product Condition 8";
    public static final String ProductValue4 = "Product Value 4";
    public static final String ProductValue5 = "Product Value 5";
    public static final String ProductValue6 = "Product Value 6";
    public static final String ProductValue7 = "Product Value 7";
    public static final String ProductValue8 = "Product Value 8";
    public static final String BingMerchantCenterId = "Store Id";
    public static final String BingMerchantCenterName = "Store Name";

    // App Ad Extension
    public static final String AppAdExtension = "App Ad Extension";
    public static final String AppPlatform = "App Platform";
    public static final String AppStoreId = "App Id";
    public static final String CampaignAppAdExtension = "Campaign App Ad Extension";
    public static final String AdGroupAppAdExtension = "Ad Group App Ad Extension";
    public static final String IsTrackingEnabled = "Tracking Enabled";

    // misc stuff
    public static final String EntityActiveStatus = "Active";
    public static final String EntityDeletedStatus = "Deleted";
    public static final char IntraFieldSeparator = ';';
    public static final String Active = "Active";
    public static final String Latitude = "Latitude";
    public static final String Longitude = "Longitude";

    // BI
    public static final String Spend = "Spend";
    public static final String Impressions = "Impressions";
    public static final String Clicks = "Clicks";
    public static final String CTR = "CTR";
    public static final String AvgCPC = "Avg CPC";
    public static final String AvgCPM = "Avg CPM";
    public static final String AvgPosition = "Avg position";
    public static final String Conversions = "Conversions";
    public static final String CPA = "CPA";

    public static final String QualityScore = "Quality Score";
    public static final String KeywordRelevance = "Keyword Relevance";
    public static final String LandingPageRelevance = "Landing Page Relevance";
    public static final String LandingPageUserExperience = "Landing Page User Experience";

    // DayTime target
    public static final String DayTimeTarget = "DayTime Target";
    public static final String FromHour = "From Hour";
    public static final String ToHour = "To Hour";
    public static final String FromMinute = "From Minute";
    public static final String ToMinute = "To Minute";

    // Shared Entities
    public static final String NegativeKeywordList = "Negative Keyword List";
    public static final String CampaignNegativeKeywordList = "Campaign Negative Keyword List Association";
    public static final String ListNegativeKeyword = "Shared Negative Keyword";

    

    // Subtypes
    public static final String MetroAreaSubType = "Metro Area";
    public static final String CountrySubType = "Country";
    public static final String StateSubType = "State";
    public static final String CitySubType = "City";
    public static final String PostalCodeSubType = "Postal Code";

    public static final String DeleteValue = "delete_value";

    //Names for attributes
    public static final String OrWithExisting = "orWithExisting";
    public static final String ReadOnly = "readOnly";
    public static final String CustomParseFunction = "customParseFunction";

    public static final String Search = "Search";
    public static final String Content = "Content";

    public static final String On = "On";
    public static final String Off = "Off";

    public static final Object All = "All";

    public static final String Deleted = "Deleted";

    public static final String SiteLink = "siteLink";

    public static final String SITE_LINKS_AD_EXTENSION = "SiteLinksAdExtension";
    public static final String SITE_LINKS_AD_EXTENSION_SITE_LINKS = "SiteLinksAdExtension.SiteLinks";

    // Bing Shopping Campaigns
    public static final String IsExcluded = "Is Excluded";
    public static final String ParentAdGroupCriterionId = "Parent Criterion Id";
    public static final String CampaignType = "Campaign Type";
    public static final String CampaignPriority = "Priority";
    
    //Upgrade URL
    public static final String FinalUrl = "Final Url";
    public static final String FinalMobileUrl = "Mobile Final Url";
    public static final String TrackingTemplate = "Tracking Template";
    public static final String CustomParameter = "Custom Parameter";

    // Review Ad Extension
    public static final String ReviewAdExtension = "Review Ad Extension";
    public static final String CampaignReviewAdExtension = "Campaign Review Ad Extension";
    public static final String AdGroupReviewAdExtension = "Ad Group Review Ad Extension";
    public static final String IsExact = "Is Exact";
    public static final String Source = "Source";
    public static final String Url = "Url";

    // Callout Ad Extension
    public static final String CalloutAdExtension = "Callout Ad Extension";
    public static final String CampaignCalloutAdExtension = "Campaign Callout Ad Extension";
    public static final String AdGroupCalloutAdExtension = "Ad Group Callout Ad Extension";
    public static final String CalloutText = "Callout Text";
    
    //AutoBidding
    public static final String BidStrategyType = "Bid Strategy Type";
    
    // Remarketing
    public static final String RemarketingList = "Remarketing List";
    public static final String AdGroupRemarketingList = "Ad Group Remarketing List Association";
    public static final String Description = "Description";
    public static final String MembershipDuration = "Membership Duration";
    public static final String Scope = "Scope";
    public static final String TagId = "UET Tag Id";
    public static final String RemarketingListId = "Remarketing List Id";
    public static final String RemarketingTargetingSetting = "Remarketing Targeting Setting";

    static {
        Map<String, String> m = new HashMap<String, String>();

        Field[] fields = StringTable.class.getDeclaredFields();
        for (Field f : fields) {
            if (Modifier.isStatic(f.getModifiers()) && !f.getName().equals("variableNameToHeader")) {
                Object value;
                try {
                    value = f.get(StringTable.class);
                    if (String.class.isInstance(value)) {
                        m.put(f.getName(), (String) value);
                    }
                } catch (IllegalArgumentException e) {
                } catch (IllegalAccessException e) {
                }

            }
        }

        variableNameToHeader = Collections.unmodifiableMap(m);
    }

    public static String transformVariableNameToHeader(String variableName) {
        return variableNameToHeader.get(variableName);
    }
}
