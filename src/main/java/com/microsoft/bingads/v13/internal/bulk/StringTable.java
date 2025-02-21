package com.microsoft.bingads.v13.internal.bulk;

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

    //Bulk File Format Version
    public static final String FORMAT_VERSION = "6.0";
    public static final String FORMAT_VERSION_SIMPLE = "6";
    
    // CSV header strings
    public static final String ClientId = "Client Id";

    public static final String Type = "Type";

    public static final String Status = "Status";

    public static final String Campaign = "Campaign";

    public static final String Id = "Id";

    public static final String BusinessId = "Business Id";
    
    public static final String CampaignId = "Campaign Id";

    public static final String ParentId = "Parent Id";

    public static final String TimeZone = "Time Zone";

    public static final String Budget = "Budget";
    public static final String BudgetId = "Budget Id";
    public static final String BudgetType = "Budget Type";
    public static final String BudgetName = "Budget Name";
    

    public static final String Experiment = "Experiment";
    public static final String TrafficSplitPercent = "Traffic Split Percent";
    public static final String BaseCampaignId = "Base Campaign Id";
    public static final String ExperimentCampaignId = "Experiment Campaign Id";
    public static final String ExperimentId = "Experiment Id";
    public static final String ExperimentType = "Experiment Type";
    		
    public static final String AdGroup = "Ad Group";
    public static final String Keyword = "Keyword";
    public static final String AdGroupType = "Ad Group Type";

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

    public static final String Feed = "Feed";
    public static final String FeedItem = "Feed Item";
    public static final String FeedName = "Feed Name";
    public static final String CustomAttributes = "Custom Attributes";
    public static final String TargetAdGroupId = "Target Ad Group Id";
    public static final String TargetCampaignId = "Target Campaign Id";
    public static final String Schedule = "Schedule";
    
    public static final String PhysicalIntent = "Physical Intent";

    public static final String Bid = "Bid";

    public static final String Profile = "Profile";
    public static final String ProfileId = "Profile Id";

    public static final String BidAdjustment = "Bid Adjustment";
    public static final String CashbackAdjustment = "Cashback Percent";
    public static final String SubType = "Sub Type";
    public static final String MultiMediaAdBidAdjustment = "MultiMediaAdBidAdjustment";

    public static final String OsNames = "OS Names";

    public static final String StartDate = "Start Date";
    public static final String EndDate = "End Date";
    public static final String NetworkDistribution = "Network Distribution";
    public static final String Language = "Language";
    public static final String CpcBid = "Cpc Bid";
    public static final String ContentBid = "Content Bid";
    public static final String AdRotation = "Ad Rotation";
    public static final String PrivacyStatus = "Privacy Status";

    public static final String Account = "Account";
    public static final String SyncTime = "Sync Time";
    public static final String Name = "Name";

    public static final String LastModifiedTime = "Modified Time";
    
    public static final String AdFormatPreference = "Ad Format Preference";

    public static final String FinalUrlSuffix = "Final Url Suffix";
    
    public static final String FeedId = "Feed Id";
    
    public static final String DynamicDescriptionEnabled = "Dynamic Description Enabled";
    
    public static final String VerifiedTrackingData = "Verified Tracking Setting";
    public static final String VerifiedTrackingDatas = "Verified Tracking Settings";
    
    public static final String CpvBid = "Cpv Bid";
    public static final String CpmBid = "Cpm Bid";
    public static final String FrequencyCapSettings = "Frequency Cap Settings";
    public static final String FinalUrlExpansionOptOut = "Url Expansion Opt Out";

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

    public static final String Version = "Version";

    //Image ad extension
    public static final String AltText = "Alternative Text";
    public static final String MediaIds = "Media Ids";
    public static final String ImageAdExtension = "Image Ad Extension";
    public static final String AccountImageAdExtension = "Account Image Ad Extension";
    public static final String CampaignImageAdExtension = "Campaign Image Ad Extension";
    public static final String AdGroupImageAdExtension = "Ad Group Image Ad Extension";
    public static final String Layouts = "Layouts";
    public static final String DisplayText = "Display Text";
    
    // Filter Link ad extension
    public static final String FilterLinkAdExtension = "Filter Link Ad Extension";
    public static final String AccountFilterLinkAdExtension = "Account Filter Link Ad Extension";
    public static final String CampaignFilterLinkAdExtension = "Campaign Filter Link Ad Extension";
    public static final String AdGroupFilterLinkAdExtension = "Ad Group Filter Link Ad Extension";
    public static final String AdExtensionHeaderType = "AdExtension Header Type";
    public static final String Texts = "Texts";

    // Sitelink Ad Extension
    public static final String SitelinkAdExtension = "Sitelink Ad Extension";
    public static final String AccountSitelinkAdExtension = "Account Sitelink Ad Extension";
    public static final String CampaignSitelinkAdExtension = "Campaign Sitelink Ad Extension";
    public static final String AdGroupSitelinkAdExtension = "Ad Group Sitelink Ad Extension";
    public static final String SiteLinkExtensionOrder = "Sitelink Extension Order";
    public static final String SiteLinkDisplayText = "Sitelink Extension Link Text";
    public static final String SiteLinkDestinationUrl = "Sitelink Extension Destination Url";
    public static final String SiteLinkDescription1 = "Sitelink Extension Description1";
    public static final String SiteLinkDescription2 = "Sitelink Extension Description2";

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
    public static final String LocationAdExtension = "Location Ad Extension";
    public static final String AccountLocationAdExtension = "Account Location Ad Extension";
    public static final String CampaignLocationAdExtension = "Campaign Location Ad Extension";

    // Call ad extensions
    public static final String CountryCode = "Country Code";
    public static final String IsCallOnly = "Call Only";
    public static final String CallAdExtension = "Call Ad Extension";
    public static final String CampaignCallAdExtension = "Campaign Call Ad Extension";
    public static final String IsCallTrackingEnabled = "Call Tracking Enabled";
    public static final String RequireTollFreeTrackingNumber = "Toll Free";
    
    // Flyer Ad Extension
    public static final String FlyerAdExtension = "Flyer Ad Extension";
    public static final String AccountFlyerAdExtension = "Account Flyer Ad Extension";
    public static final String CampaignFlyerAdExtension = "Campaign Flyer Ad Extension";
    public static final String AdGroupFlyerAdExtension = "Ad Group Flyer Ad Extension";
    public static final String FlyerName = "Flyer Name";
    public static final String MediaUrls = "Media Urls";

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
    public static final String MerchantCenterId = "Store Id";

    // App Ad Extension
    public static final String AppAdExtension = "App Ad Extension";
    public static final String AppPlatform = "App Platform";
    public static final String AppStoreId = "App Id";
    public static final String CampaignAppAdExtension = "Campaign App Ad Extension";
    public static final String AccountAppAdExtension = "Account App Ad Extension";
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

    // Bing Shopping Campaigns
    public static final String IsExcluded = "Is Excluded";
    public static final String ParentAdGroupCriterionId = "Parent Criterion Id";
    public static final String CampaignType = "Campaign Type";
    public static final String CampaignPriority = "Priority";
    public static final String LocalInventoryAdsEnabled = "LocalInventoryAdsEnabled";
    public static final String FeedLabel = "FeedLabel";
    public static final String ShoppableAdsEnabled = "ShoppableAdsEnabled";
    
    // App Campaign
    public static final String AppStore = "App Store";
    
    // SPA
    public static final String CampaignNegativeStoreCriterion = "Campaign Negative Store Criterion";

    // CoOp
    public static final String BidOption = "Bid Option";
    public static final String BidBoostValue = "Bid Boost Value";
    public static final String MaximumBid = "Maximum Bid";
    
    //Upgrade URL
    public static final String FinalUrl = "Final Url";
    public static final String FinalMobileUrl = "Mobile Final Url";
    public static final String TrackingTemplate = "Tracking Template";
    public static final String CustomParameter = "Custom Parameter";

    // Review Ad Extension
    public static final String ReviewAdExtension = "Review Ad Extension";
    public static final String AccountReviewAdExtension = "Account Review Ad Extension";
    public static final String CampaignReviewAdExtension = "Campaign Review Ad Extension";
    public static final String AdGroupReviewAdExtension = "Ad Group Review Ad Extension";
    public static final String IsExact = "Is Exact";
    public static final String Source = "Source";
    public static final String Url = "Url";

    // Price Ad Extension
    public static final String PriceAdExtension = "Price Ad Extension";
    public static final String AccountPriceAdExtension = "Account Price Ad Extension";
    public static final String CampaignPriceAdExtension = "Campaign Price Ad Extension";
    public static final String AdGroupPriceAdExtension = "Ad Group Price Ad Extension";
    public static final String PriceExtensionType = "Price Extension Type";
    public static final String HeaderColumnPrefix = "Header ";
    public static final String Header1 = "Header 1";
    public static final String Header2 = "Header 2";  
    public static final String Header3 = "Header 3";
    public static final String Header4 = "Header 4";
    public static final String Header5 = "Header 5";
    public static final String Header6 = "Header 6";
    public static final String Header7 = "Header 7";
    public static final String Header8 = "Header 8";
    public static final String PriceDescriptionColumnPrefix = "Price Description ";
    public static final String PriceDescription1 = "Price Description 1";
    public static final String PriceDescription2 = "Price Description 2";
    public static final String PriceDescription3 = "Price Description 3";
    public static final String PriceDescription4 = "Price Description 4";
    public static final String PriceDescription5 = "Price Description 5";
    public static final String PriceDescription6 = "Price Description 6";
    public static final String PriceDescription7 = "Price Description 7";
    public static final String PriceDescription8 = "Price Description 8";
    public static final String FinalUrlColumnPrefix = "Final Url ";
    public static final String FinalUrl1 = "Final Url 1";
    public static final String FinalUrl2 = "Final Url 2";
    public static final String FinalUrl3 = "Final Url 3";
    public static final String FinalUrl4 = "Final Url 4";
    public static final String FinalUrl5 = "Final Url 5";
    public static final String FinalUrl6 = "Final Url 6";
    public static final String FinalUrl7 = "Final Url 7";
    public static final String FinalUrl8 = "Final Url 8";
    public static final String FinalMobileUrlColumnPrefix = "Final Mobile Url ";
    public static final String FinalMobileUrl1 = "Final Mobile Url 1";
    public static final String FinalMobileUrl2 = "Final Mobile Url 2";
    public static final String FinalMobileUrl3 = "Final Mobile Url 3";
    public static final String FinalMobileUrl4 = "Final Mobile Url 4";
    public static final String FinalMobileUrl5 = "Final Mobile Url 5";
    public static final String FinalMobileUrl6 = "Final Mobile Url 6";
    public static final String FinalMobileUrl7 = "Final Mobile Url 7";
    public static final String FinalMobileUrl8 = "Final Mobile Url 8";
    public static final String PriceColumnPrefix = "Price ";
    public static final String Price1 = "Price 1"; 
    public static final String Price2 = "Price 2";
    public static final String Price3 = "Price 3";
    public static final String Price4 = "Price 4";
    public static final String Price5 = "Price 5";
    public static final String Price6 = "Price 6";
    public static final String Price7 = "Price 7";
    public static final String Price8 = "Price 8";
    public static final String CurrencyCodeColumnPrefix = "Currency Code ";
    public static final String CurrencyCode1 = "Currency Code 1";
    public static final String CurrencyCode2 = "Currency Code 2";
    public static final String CurrencyCode3 = "Currency Code 3";
    public static final String CurrencyCode4 = "Currency Code 4";
    public static final String CurrencyCode5 = "Currency Code 5";
    public static final String CurrencyCode6 = "Currency Code 6";
    public static final String CurrencyCode7 = "Currency Code 7";
    public static final String CurrencyCode8 = "Currency Code 8";
    public static final String PriceUnitColumnPrefix = "Price Unit ";
    public static final String PriceUnit1 = "Price Unit 1";
    public static final String PriceUnit2 = "Price Unit 2";
    public static final String PriceUnit3 = "Price Unit 3";
    public static final String PriceUnit4 = "Price Unit 4";
    public static final String PriceUnit5 = "Price Unit 5";
    public static final String PriceUnit6 = "Price Unit 6";
    public static final String PriceUnit7 = "Price Unit 7";
    public static final String PriceUnit8 = "Price Unit 8";
    public static final String PriceQualifierColumnPrefix = "Price Qualifier ";
    public static final String PriceQualifier1 = "Price Qualifier 1";
    public static final String PriceQualifier2 = "Price Qualifier 2";
    public static final String PriceQualifier3 = "Price Qualifier 3";
    public static final String PriceQualifier4 = "Price Qualifier 4";
    public static final String PriceQualifier5 = "Price Qualifier 5";
    public static final String PriceQualifier6 = "Price Qualifier 6";
    public static final String PriceQualifier7 = "Price Qualifier 7";
    public static final String PriceQualifier8 = "Price Qualifier 8";

    // Callout Ad Extension
    public static final String CalloutAdExtension = "Callout Ad Extension";
    public static final String AccountCalloutAdExtension = "Account Callout Ad Extension";
    public static final String CampaignCalloutAdExtension = "Campaign Callout Ad Extension";
    public static final String AdGroupCalloutAdExtension = "Ad Group Callout Ad Extension";
    public static final String CalloutText = "Callout Text";
    
    // Action Ad Extension
    public static final String ActionAdExtension = "Action Ad Extension";
    public static final String AccountActionAdExtension = "Account Action Ad Extension";
    public static final String CampaignActionAdExtension = "Campaign Action Ad Extension";
    public static final String AdGroupActionAdExtension = "Ad Group Action Ad Extension";
    public static final String ActionType = "Action Type";
    public static final String ActionText= "Action Text";
    
    // Video Ad Extension
    public static final String VideoAdExtension = "Video Ad Extension";
    public static final String ThumbnailUrl = "Thumbnail Url";
    public static final String ThumbnailId = "Thumbnail Id";
    public static final String VideoId = "Video Id";
    public static final String AccountVideoAdExtension = "Account Video Ad Extension";
    public static final String CampaignVideoAdExtension = "Campaign Video Ad Extension";
    public static final String AdGroupVideoAdExtension = "Ad Group Video Ad Extension";
    
    //Promotion AdExtension
    public static final String PromotionAdExtension = "Promotion Ad Extension";
    public static final String AccountPromotionAdExtension = "Account Promotion Ad Extension";
    public static final String CampaignPromotionAdExtension = "Campaign Promotion Ad Extension";
    public static final String AdGroupPromotionAdExtension = "Ad Group Promotion Ad Extension";
    public static final String PromotionTarget = "Promotion Target";
    public static final String DiscountModifier = "Discount Modifier";
    public static final String PercentOff = "Percent Off";
    public static final String MoneyAmountOff = "Money Amount Off";
    public static final String PromotionCode = "Promotion Code";
    public static final String OrdersOverAmount = "Orders Over Amount";
    public static final String Occasion = "Occasion";
    public static final String PromotionStart = "Promotion Start";
    public static final String PromotionEnd = "Promotion End";
    public static final String CurrencyCode = "Currency Code";
    
    //DisclaimerAdExtension
    public static final String DisclaimerAdExtension = "Disclaimer Ad Extension";
    public static final String DisclaimerAdsEnabled = "Disclaimer Ads Enabled";
    public static final String DisclaimerName = "Disclaimer Name";
    public static final String DisclaimerTitle = "Disclaimer Title";
    public static final String CampaignDisclaimerAdExtension = "Campaign Disclaimer Ad Extension";
    public static final String DisclaimerLayout= "Disclaimer Layout";
    public static final String DisclaimerPopupText = "Disclaimer Popup Text";
    public static final String DisclaimerLineText = "Disclaimer Line Text";
    
    // AutoBidding
    public static final String BidStrategy = "Bid Strategy";
    public static final String BidStrategyId = "Bid Strategy Id";
    public static final String BidStrategyName = "Bid Strategy Name";
    public static final String BidStrategyType = "Bid Strategy Type";
    public static final String BidStrategyMaxCpc = "Bid Strategy MaxCpc";
    public static final String BidStrategyTargetCpa = "Bid Strategy TargetCpa";
    public static final String InheritedBidStrategyType = "Inherited Bid Strategy Type";
    public static final String BidStrategyTargetRoas = "Bid Strategy TargetRoas";
    public static final String BidStrategyTargetAdPosition = "Bid Strategy TargetAdPosition";
    public static final String BidStrategyTargetImpressionShare = "Bid Strategy TargetImpressionShare";
    public static final String BidStrategyPercentMaxCpc = "Bid Strategy PercentMaxCpc";
    public static final String BidStrategyCommissionRate = "Bid Strategy CommissionRate";
    public static final String BidStrategyTargetCostPerSale = "Bid Strategy TargetCostPerSale";

    // Audience
    public static final String RemarketingList = "Remarketing List";
    public static final String AdGroupRemarketingListAssociation = "Ad Group Remarketing List Association";
    public static final String AdGroupNegativeRemarketingListAssociation = "Ad Group Negative Remarketing List Association";
    public static final String CampaignRemarketingListAssociation = "Campaign Remarketing List Association";
    public static final String CampaignNegativeRemarketingListAssociation = "Campaign Negative Remarketing List Association";
    public static final String CustomAudience = "Custom Audience";
    public static final String AdGroupCustomAudienceAssociation = "Ad Group Custom Audience Association";
    public static final String AdGroupNegativeCustomAudienceAssociation = "Ad Group Negative Custom Audience Association";
    public static final String CampaignCustomAudienceAssociation = "Campaign Custom Audience Association";
    public static final String CampaignNegativeCustomAudienceAssociation = "Campaign Negative Custom Audience Association";
    public static final String InMarketAudience = "In Market Audience";
    public static final String AdGroupInMarketAudienceAssociation = "Ad Group In Market Audience Association";
    public static final String AdGroupNegativeInMarketAudienceAssociation = "Ad Group Negative In Market Audience Association";
    public static final String CampaignInMarketAudienceAssociation = "Campaign In Market Audience Association";
    public static final String CampaignNegativeInMarketAudienceAssociation = "Campaign Negative In Market Audience Association";
    public static final String SimilarRemarketingList = "Similar Remarketing List";
    public static final String AdGroupSimilarRemarketingListAssociation = "Ad Group Similar Remarketing List Association";
    public static final String AdGroupNegativeSimilarRemarketingListAssociation = "Ad Group Negative Similar Remarketing List Association";
    public static final String CampaignSimilarRemarketingListAssociation = "Campaign Similar Remarketing List Association";
    public static final String CampaignNegativeSimilarRemarketingListAssociation = "Campaign Negative Similar Remarketing List Association";
    public static final String Audience = "Audience";
    public static final String ProductAudience = "Product Audience";
    public static final String AdGroupProductAudienceAssociation = "Ad Group Product Audience Association";
    public static final String AdGroupNegativeProductAudienceAssociation = "Ad Group Negative Product Audience Association";
    public static final String CampaignProductAudienceAssociation = "Campaign Product Audience Association";
    public static final String CampaignNegativeProductAudienceAssociation = "Campaign Negative Product Audience Association";
    public static final String AudienceNetworkSize = "Audience Network Size";
    public static final String SupportedCampaignTypes = "Supported Campaign Types";
    public static final String ProductAudienceType = "Product Audience Type";
    public static final String AudienceSearchSize = "Audience Search Size";
    public static final String CombinedList = "Combined List";
    public static final String AdGroupCombinedListAssociation = "Ad Group Combined List Association";
    public static final String AdGroupNegativeCombinedListAssociation = "Ad Group Negative Combined List Association";
    public static final String CampaignCombinedListAssociation = "Campaign Combined List Association";
    public static final String CampaignNegativeCombinedListAssociation = "Campaign Negative Combined List Association";
    public static final String Description = "Description";
    public static final String MembershipDuration = "Membership Duration";
    public static final String Scope = "Scope";
    public static final String TagId = "UET Tag Id";
    public static final String SourceId = "Source Id";
    public static final String AudienceId = "Audience Id";
    public static final String TargetSetting = "Target Setting";
    public static final String RemarketingRule = "Remarketing Rule";
    public static final String CombinationRule = "Combination Rule";        
    public static final String CustomerList = "Customer List";
    public static final String CustomerListItem = "Customer List Item";
    public static final String AdGroupCustomerListAssociation = "Ad Group Customer List Association";
    public static final String AdGroupNegativeCustomerListAssociation = "Ad Group Negative Customer List Association";
    public static final String CampaignCustomerListAssociation = "Campaign Customer List Association";
    public static final String CampaignNegativeCustomerListAssociation = "Campaign Negative Customer List Association";
    public static final String ImpressionBasedRemarketingList = "Impression Based Remarketing List";
    public static final String AdGroupImpressionBasedRemarketingListAssociation = "Ad Group Impression Based Remarketing List Association";
    public static final String AdGroupNegativeImpressionBasedRemarketingListAssociation = "Ad Group Negative Impression Based Remarketing List Association";
    public static final String CampaignImpressionBasedRemarketingListAssociation = "Campaign Impression Based Remarketing List Association";
    public static final String CampaignNegativeImpressionBasedRemarketingListAssociation = "Campaign Negative Impression Based Remarketing List Association";
    public static final String EntityType = "Entity Type";
    public static final String ImpressionCampaignId = "Impression Campaign Id";
    public static final String ImpressionAdGroupId = "Impression Ad Group Id";

    
    // Structured Snippet Ad Extension
    public static final String AccountStructuredSnippetAdExtension = "Account Structured Snippet Ad Extension";
    public static final String CampaignStructuredSnippetAdExtension = "Campaign Structured Snippet Ad Extension";
    public static final String AdGroupStructuredSnippetAdExtension = "Ad Group Structured Snippet Ad Extension";
    public static final String StructuredSnippetAdExtension = "Structured Snippet Ad Extension";
    public static final String StructuredSnippetHeader = "Structured Snippet Header";
    public static final String StructuredSnippetValues = "Structured Snippet Values";

    // Expanded Text Ad
    public static final String ExpandedTextAd = "Expanded Text Ad";
    public static final String TitlePart1 = "Title Part 1";
    public static final String TitlePart2 = "Title Part 2";
    public static final String TitlePart3 = "Title Part 3";
    public static final String TextPart2 = "Text Part 2";
    public static final String Path1 = "Path 1";
    public static final String Path2 = "Path 2";
    public static final String Domain = "Domain";
    
    // Ad Extension Schedule
    public static final String AdSchedule = "Ad Schedule";
    
    // Use Searcher Time Zone
    public static final String UseSearcherTimeZone = "Use Searcher Time Zone";
    public static final String AdScheduleUseSearcherTimeZone = "Ad Schedule Use Searcher Time Zone";

    // Responsive Ad
    public static final String ResponsiveAd = "Responsive Ad";
    public static final String CallToAction = "Call To Action";
    public static final String CallToActionLanguage = "Call To Action Language";
    public static final String Descriptions = "Descriptions";
    public static final String Headline = "Headline";
    public static final String Headlines = "Headlines";
    public static final String Images = "Images";
    public static final String LandscapeImageMediaId = "Landscape Image Media Id";
    public static final String LandscapeLogoMediaId = "Landscape Logo Media Id";
    public static final String LongHeadline = "Long Headline";
    public static final String LongHeadlines = "Long Headlines";
    public static final String SquareImageMediaId = "Square Image Media Id";
    public static final String SquareLogoMediaId = "Square Logo Media Id";
    public static final String ImpressionTrackingUrls = "Impression Tracking Urls";
    public static final String Videos = "Videos";
    
    // Responsive Search Ad
    public static final String ResponsiveSearchAd = "Responsive Search Ad";
    
    // Image
    public static final String Image = "Image";
    public static final String Height = "Height";
    public static final String Width = "Width";
    
    // Video
    public static final String Video = "Video";
    public static final String SourceUrl = "Source Url";
    public static final String AspectRatio = "Aspect Ratio";
    public static final String DurationInMillionSeconds = "Duration In Milliseconds";
    
    // Dynamic Search Ad   
    public static final String DynamicSearchAd = "Dynamic Search Ad";
    public static final String CampaignNegativeDynamicSearchAdTarget = "Campaign Negative Dynamic Search Ad Target";
    public static final String AdGroupNegativeDynamicSearchAdTarget = "Ad Group Negative Dynamic Search Ad Target";
    public static final String AdGroupDynamicSearchAdTarget = "Ad Group Dynamic Search Ad Target";
    public static final String PageFeedIds = "Page Feed Ids";
        
    public static final String DomainLanguage = "Domain Language";
    public static final String DynamicAdTargetConditionColumnPrefix = "Dynamic Ad Target Condition ";
    public static final String DynamicAdTargetCondition1 = "Dynamic Ad Target Condition 1";
    public static final String DynamicAdTargetCondition2 = "Dynamic Ad Target Condition 2";
    public static final String DynamicAdTargetCondition3 = "Dynamic Ad Target Condition 3";
    public static final String DynamicAdTargetValueColumnPrefix = "Dynamic Ad Target Value ";
    public static final String DynamicAdTargetValue1 = "Dynamic Ad Target Value 1";
    public static final String DynamicAdTargetValue2 = "Dynamic Ad Target Value 2";
    public static final String DynamicAdTargetValue3 = "Dynamic Ad Target Value 3";
    public static final String DynamicAdTargetConditionOperatorPrefix = "Dynamic Ad Target Condition Operator ";
    public static final String DynamicAdTargetConditionOperator1 = "Dynamic Ad Target Condition Operator 1";
    public static final String DynamicAdTargetConditionOperator2 = "Dynamic Ad Target Condition Operator 2";
    public static final String DynamicAdTargetConditionOperator3 = "Dynamic Ad Target Condition Operator 3";
    
    // AdGroup Criterion
    public static final String AdGroupAgeCriterion = "Ad Group Age Criterion";
    public static final String AdGroupDayTimeCriterion = "Ad Group DayTime Criterion";
    public static final String AdGroupDeviceCriterion = "Ad Group DeviceOS Criterion";
    public static final String AdGroupGenderCriterion = "Ad Group Gender Criterion";
    public static final String AdGroupRadiusCriterion = "Ad Group Radius Criterion";
    public static final String AdGroupLocationCriterion = "Ad Group Location Criterion";
    public static final String AdGroupLocationIntentCriterion = "Ad Group Location Intent Criterion";
    public static final String AdGroupNegativeLocationCriterion = "Ad Group Negative Location Criterion";    
    public static final String AdGroupCompanyNameCriterion = "Ad Group Company Name Criterion";
    public static final String AdGroupIndustryCriterion = "Ad Group Industry Criterion";
    public static final String AdGroupJobFunctionCriterion = "Ad Group Job Function Criterion";
    public static final String AdGroupNegativeAgeCriterion = "Ad Group Negative Age Criterion";
    public static final String AdGroupNegativeCompanyNameCriterion = "Ad Group Negative Company Name Criterion";
    public static final String AdGroupNegativeGenderCriterion = "Ad Group Negative Gender Criterion";
    public static final String AdGroupNegativeIndustryCriterion = "Ad Group Negative Industry Criterion";
    public static final String AdGroupNegativeJobFunctionCriterion = "Ad Group Negative Job Function Criterion";
    public static final String AdGroupGenreCriterion = "Ad Group Genre Criterion";

    // Campaign Criterion
    public static final String CampaignAgeCriterion = "Campaign Age Criterion";
    public static final String CampaignCompanyNameCriterion = "Campaign Company Name Criterion";
    public static final String CampaignDayTimeCriterion = "Campaign DayTime Criterion";
    public static final String CampaignDeviceCriterion = "Campaign DeviceOS Criterion";
    public static final String CampaignGenderCriterion = "Campaign Gender Criterion";
    public static final String CampaignIndustryCriterion = "Campaign Industry Criterion";
    public static final String CampaignJobFunctionCriterion = "Campaign Job Function Criterion";
    public static final String CampaignRadiusCriterion = "Campaign Radius Criterion";
    public static final String CampaignLocationCriterion = "Campaign Location Criterion";
    public static final String CampaignLocationIntentCriterion = "Campaign Location Intent Criterion";
    public static final String CampaignNegativeLocationCriterion = "Campaign Negative Location Criterion";
    public static final String CampaignDealCriterion = "Campaign Deal Criterion";

    // Label
    public static final String ColorCode = "Color";
    public static final String Label = "Label";
    public static final String CampaignLabel = "Campaign Label";
    public static final String AdGroupLabel = "Ad Group Label";
    public static final String KeywordLabel = "Keyword Label";
    public static final String AppInstallAdLabel = "App Install Ad Label";
    public static final String DynamicSearchAdLabel = "Dynamic Search Ad Label";
    public static final String ExpandedTextAdLabel = "Expanded Text Ad Label";
    public static final String ProductAdLabel = "Product Ad Label";
    public static final String TextAdLabel = "Text Ad Label";
    public static final String ResponsiveAdLabel = "Responsive Ad Label";
    public static final String ResponsiveSearchAdLabel = "Responsive Search Ad Label";

    // Offline Conversions
    public static final String OfflineConversion = "Offline Conversion";
    public static final String ConversionCurrencyCode = "Conversion Currency Code";
    public static final String ConversionName = "Conversion Name";
    public static final String ConversionTime = "Conversion Time";
    public static final String ConversionValue = "Conversion Value";
    public static final String MicrosoftClickId = "Microsoft Click Id";
    public static final String AdjustmentValue = "Adjustment Value";
    public static final String AdjustmentTime = "Adjustment Time";
    public static final String AdjustmentCurrencyCode = "Adjustment Currency Code";
    public static final String AdjustmentType = "Adjustment Type";
    public static final String ExternalAttributionModel = "External Attribution Model";
    public static final String ExternalAttributionCredit = "External Attribution Credit";
    public static final String HashedEmailAddress = "Hashed Email Address";
    public static final String HashedPhoneNumber = "Hashed Phone Number";

    // Account
    public static final String MSCLKIDAutoTaggingEnabled = "MSCLKID Auto Tagging Enabled";
    public static final String IncludeViewThroughConversions = "Include View Through Conversions";
    public static final String ProfileExpansionEnabled = "Profile Expansion Enabled";
    public static final String AdClickParallelTracking = "Ad Click Parallel Tracking";
    public static final String AutoApplyRecommendations = "Auto Apply Recommendations";
    public static final String AllowImageAutoRetrieve = "Allow Image Auto Retrieve";
    public static final String BusinessAttributes = "Business Attributes";

    
    //AdCustomizerAttribute
    public static final String AdCustomizerAttribute = "Adcustomizer Attribute";
    public static final String AdcustomizerCampaign = "Campaign Adcustomizer Attribute";
    public static final String AdcustomizerAdGroup = "Adgroup Adcustomizer Attribute";
    public static final String AdcustomizerKeyword = "Keyword Adcustomizer Attribute";
    public static final String AdCustomizerDataType = "AdCustomizer DataType";
    public static final String AdCustomizerAttributeValue = "AdCustomizer AttributeValue";
    
    // Campaign Conversion Goal
    public static final String CampaignConversionGoal = "Campaign Conversion Goal";
    public static final String GoalId = "Goal Id";
    

    public static final String HotelAdGroupType = "Hotel Ad Group Type";
    public static final String CommissionRate = "Commission Rate";
    public static final String PercentCpcBid = "Percent Cpc Bid";
    public static final String UseOptimizedTargeting = "Use Optimized Targeting";
    

    // Online Conversion
    public static final String OnlineConversionAdjustment = "Online Conversion Adjustment";
    public static final String TransactionId = "Transaction Id";
    
    // Hotel Ad

    public static final String HotelListingGroupType = "Ad Group Hotel Listing Group";
    public static final String HotelAttribute = "Hotel Attribute";
    public static final String HotelAttributeValue = "Hotel Attribute Value";

    public static final String AdGroupAdvanceBookingWindowCriterion = "Ad Group Advance Booking Window Criterion";
    public static final String AdGroupCheckInDayCriterion = "Ad Group Check In Day Criterion";
    public static final String AdGroupLengthOfStayCriterion = "Ad Group Length of Stay Criterion";
    public static final String AdGroupHotelDateSelectionTypeCriterion = "Ad Group Hotel Date Selection Type Criterion";
    public static final String AdGroupCheckInDateCriterion = "Ad Group Check In Date Criterion";
    
    public static final String MinTargetValue = "Min Target Value";
    public static final String MaxTargetValue = "Max Target Value";
    
    //PMax
    public static final String AssetGroup = "Asset Group";
    public static final String AudienceGroup = "Audience Group";
    public static final String CampaignNegativeWebpage = "Campaign Negative Webpage";
    public static final String AssetGroupListingGroup = "Asset Group Listing Group";
    public static final String AudienceGroupAssetGroupAssociation = "Audience Group Asset Group Association";
    public static final String Audiences = "Audiences";
    public static final String AudienceGroupName = "Audience Group Name";
    public static final String AgeRanges = "Age Ranges";
    public static final String GenderTypes = "Gender Types";
    public static final String ParentListingGroupId = "Parent Listing Group Id";
    public static final String AutoGeneratedTextOptOut = "Auto Generated Text Assets Opt Out";
    public static final String AutoGeneratedImageOptOut = "Auto Generated Image Assets Opt Out";
    public static final String CostPerSaleOptOut = "Cost Per Sale Opt Out";
    public static final String AssetGroupSearchTheme = "Asset Group Search Theme";
    public static final String SearchTheme = "Search Theme";
    
    // MultiChannel Campaign
    public static final String DestinationChannel = "Destination Channel";
    public static final String IsMultiChannelCampaign = "Is Multi Channel Campaign";
    
    // Seasonality Adjustment
    public static final String SeasonalityAdjustment = "Seasonality Adjustment";
    public static final String DataExclusion = "Data Exclusion";
    public static final String DeviceType = "Device Type";
    public static final String CampaignAssociations = "Campaign Associations";
    
    // DNV Serving on MSAN
    public static final String ShouldServeOnMSAN = "Should Serve On MSAN";
    
    // Conversion Goal
    public static final String AttributionModelType = "Attribution Model Type";
    public static final String ConversionWindowInMinutes = "Conversion Window In Minutes";
    public static final String CountType = "Count Type";
    public static final String ExcludeFromBidding = "Exclude From Bidding";
    public static final String GoalCategory = "Goal Category";
    public static final String IsEnhancedConversionsEnabled = "Is Enhanced Conversions Enabled";
    public static final String RevenueType = "Revenue Type";
    public static final String RevenueValue = "Revenue Value";
    public static final String TrackingStatus = "Tracking Status";
    public static final String ViewThroughConversionWindowInMinutes = "View Through Conversion Window In Minutes";
    public static final String MinimumDurationInSecond = "Minimum Duration In Second";
    public static final String ActionExpression = "Action Expression";
    public static final String ActionOperator = "Action Operator";
    public static final String CategoryExpression = "Category Expression";
    public static final String CategoryOperator = "Category Operator";
    public static final String LabelExpression = "Label Expression";
    public static final String LabelOperator = "Label Operator";
    public static final String EventValue = "Event Value";
    public static final String EventValueOperator = "Event Value Operator";
    public static final String IsExternallyAttributed = "Is Externally Attributed";
    public static final String MinimumPagesViewed = "Minimum Pages Viewed";
    public static final String UrlExpression = "URL Expression";
    public static final String UrlOperator = "URL Operator";
    public static final String ConversionGoal = "Conversion Goal";
    public static final String EventGoal = "Event Goal";
    public static final String AppInstallGoal = "AppInstall Goal";
    public static final String MultiStageGoal = "MultiStage Goal";
    public static final String DurationGoal = "Duration Goal";
    public static final String OfflineConversionGoal = "OfflineConversion Goal";
    public static final String UrlGoal = "URL Goal";
    public static final String InStoreTransactionGoal = "InStoreTransaction Goal";
    public static final String PagesViewedPerVisitGoal = "PagesViewedPerVisit Goal";
    public static final String SmartGoal = "Smart Goal";
    public static final String InStoreVisitGoal = "InStoreVisit Goal";
    public static final String ProductGoal = "Product Goal";
    
    // Brand List
    public static final String BrandList = "Brand List";
    public static final String BrandItem = "Brand Item";
    public static final String CampaignBrandList = "Campaign Brand List Association";
    public static final String BrandId = "Brand Id";
    public static final String BrandUrl = "Brand Url";
    public static final String BrandName = "Brand Name";
    public static final String StatusDateTime = "Editorial Status Date";
    
    // Asset Group Url Target
    public static final String AssetGroupUrlTarget = "Asset Group Url Target";
    public static final String AssetGroupTargetCondition1 = "Asset Group Target Condition 1";
    public static final String AssetGroupTargetCondition2 = "Asset Group Target Condition 2";
    public static final String AssetGroupTargetCondition3 = "Asset Group Target Condition 3";
    public static final String AssetGroupTargetConditionOperator1 = "Asset Group Target Condition Operator 1";
    public static final String AssetGroupTargetConditionOperator2 = "Asset Group Target Condition Operator 2";
    public static final String AssetGroupTargetConditionOperator3 = "Asset Group Target Condition Operator 3";
    public static final String AssetGroupTargetValue1 = "Asset Group Target Value 1";
    public static final String AssetGroupTargetValue2 = "Asset Group Target Value 2";
    public static final String AssetGroupTargetValue3 = "Asset Group Target Value 3";
    
    // New Customer Acquisition Goal
    public static final String NewCustomerAcquisitionGoal = "New Customer Acquisition Goal";
    public static final String AdditionalConversionValue = "Additional Conversion Value";
    public static final String NewCustomerAcquisitionGoalId = "New Customer Acquisition Goal Id";
    public static final String NewCustomerAcquisitionBidOnlyMode = "New Customer Acquisition Bid Only Mode";
    
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
