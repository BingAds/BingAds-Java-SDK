package com.microsoft.bingads.v10.internal.bulk;

import com.microsoft.bingads.v10.internal.bulk.StringTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Creates and provides a column name to positional index mapping
 */
public class CsvHeaders {

    public final static String[] HiddenHeaders = {};

    public final static String[] Headers = new String[]{

            // common
            StringTable.Type,
            StringTable.Status,
            StringTable.Id,
            StringTable.ParentId,
            StringTable.SubType,
            StringTable.Campaign,
            StringTable.AdGroup,
            StringTable.Website,
            StringTable.SyncTime,
            StringTable.ClientId,
            StringTable.LastModifiedTime,

            // campaign
            StringTable.TimeZone,
            StringTable.Budget,
            StringTable.BudgetType,
            StringTable.KeywordVariantMatchEnabled,

            // Ad Group
            StringTable.StartDate,
            StringTable.EndDate,
            StringTable.NetworkDistribution,
            StringTable.PricingModel,
            StringTable.AdRotation,
            StringTable.SearchNetwork,
            StringTable.SearchBid,
            StringTable.ContentNetwork,
            StringTable.ContentBid,
            StringTable.Language,

            // Ads
            StringTable.Title,
            StringTable.Text,
            StringTable.DisplayUrl,
            StringTable.DestinationUrl,
            StringTable.BusinessName,
            StringTable.PhoneNumber,
            StringTable.PromotionalText,
            StringTable.EditorialStatus,
            StringTable.EditorialLocation,
            StringTable.EditorialTerm,
            StringTable.EditorialReasonCode,
            StringTable.EditorialAppealStatus,
            StringTable.DevicePreference,
            

            // Keywords
            StringTable.Keyword,
            StringTable.MatchType,
            StringTable.Bid,
            StringTable.Param1,
            StringTable.Param2,
            StringTable.Param3,

            // location target
            StringTable.Target,
            StringTable.PhysicalIntent,
            StringTable.TargetAll,
            StringTable.BidAdjustment,
            StringTable.RadiusTargetId,
            StringTable.Name,
            StringTable.OsNames,
            StringTable.Radius,
            StringTable.Unit,
            StringTable.BusinessId,

            // DayTime target
            StringTable.FromHour,
            StringTable.FromMinute,
            StringTable.ToHour,
            StringTable.ToMinute,

            // AdExtensions common
            StringTable.Version,

            // Site link ad extensions
            StringTable.SiteLinkExtensionOrder,
            StringTable.SiteLinkDisplayText,
            StringTable.SiteLinkDestinationUrl,
            StringTable.SiteLinkDescription1,
            StringTable.SiteLinkDescription2,

            // Location ad extensions
            StringTable.GeoCodeStatus,
            StringTable.IconMediaId,
            StringTable.ImageMediaId,
            StringTable.AddressLine1,
            StringTable.AddressLine2,
            StringTable.PostalCode,
            StringTable.City,
            StringTable.StateOrProvince,
            StringTable.ProvinceName,
            StringTable.Latitude,
            StringTable.Longitude,

            // Call ad extensions
            StringTable.CountryCode,
            StringTable.IsCallOnly,
            StringTable.IsCallTrackingEnabled,
            StringTable.RequireTollFreeTrackingNumber,

            // Image ad extension
            StringTable.AltText,
            StringTable.MediaIds,
            StringTable.PublisherCountries,

            // Product target
            StringTable.BingMerchantCenterId,
            StringTable.BingMerchantCenterName,
            StringTable.ProductCondition1,
            StringTable.ProductValue1,
            StringTable.ProductCondition2,
            StringTable.ProductValue2,
            StringTable.ProductCondition3,
            StringTable.ProductValue3,
            StringTable.ProductCondition4,
            StringTable.ProductValue4,
            StringTable.ProductCondition5,
            StringTable.ProductValue5,
            StringTable.ProductCondition6,
            StringTable.ProductValue6,
            StringTable.ProductCondition7,
            StringTable.ProductValue7,
            StringTable.ProductCondition8,
            StringTable.ProductValue8,

            // BI
            StringTable.Spend,
            StringTable.Impressions,
            StringTable.Clicks,
            StringTable.CTR,
            StringTable.AvgCPC,
            StringTable.AvgCPM,
            StringTable.AvgPosition,
            StringTable.Conversions,
            StringTable.CPA,
            StringTable.QualityScore,
            StringTable.KeywordRelevance,
            StringTable.LandingPageRelevance,
            StringTable.LandingPageUserExperience,

            // Social Network Ad Extension
            //TODO-social: NOTE: Also comment/uncomment entry in headerToImportColumnMapping of ImportRowToMicrosoftRowTranslator.
            //TODO-social: Headers and properties need to be in sync for Unknown type errors.
            //StringTable.SocialNetworkType,

            // App Ad Extension
            StringTable.AppPlatform,
            StringTable.AppStoreId,
            StringTable.IsTrackingEnabled,

            StringTable.Error,
            StringTable.ErrorNumber,
            StringTable.FieldPath,

            // Bing Shopping Campaigns
            StringTable.IsExcluded,
            StringTable.ParentAdGroupCriterionId,
            StringTable.CampaignType,
            StringTable.CampaignPriority,
            
            //Upgrade Url
            StringTable.FinalUrl,
            StringTable.FinalMobileUrl,
            StringTable.TrackingTemplate,
            StringTable.CustomParameter,

            // Review Ad Extension
            StringTable.IsExact,
            StringTable.Source,
            StringTable.Url,

            // Callout Ad Extension
            StringTable.CalloutText,
            
            // AutoBidding
            StringTable.BidStrategyType,
            
            // Native Preference
            StringTable.NativePreference,
            
            // Remarketing
            StringTable.RemarketingList,
            StringTable.RemarketingListId,
            StringTable.Description,
            StringTable.MembershipDuration,
            StringTable.Scope,
            StringTable.TagId,
            StringTable.RemarketingTargetingSetting,

            // Structured Snippet Ad Extension
            StringTable.StructuredSnippetHeader,
            StringTable.StructuredSnippetValues,
            
            // Expanded Text Ad
            StringTable.TitlePart1,
            StringTable.TitlePart2,
            StringTable.Path1,
            StringTable.Path2
    };

    private static final Map<String, Integer> columnIndexMap = initializeMap();

    public static Map<String, Integer> getMappings() {
        return columnIndexMap;
    }

    /**
     * Get index for a given column name
     *
     * @param columnName
     * @return the index
     */
    public static int GetColumnIndex(String columnName) {
        if (!columnIndexMap.containsKey(columnName)) {
            throw new IllegalArgumentException(String.format("Column name %s is not present in headers.", columnName));
        }

        Integer index = columnIndexMap.get(columnName);
        return index.intValue();
    }

    /**
     * maps column name into its positional index
     *
     * @return a map to positional indices
     */
    private static Map<String, Integer> initializeMap() {
        Map<String, Integer> mapping = new HashMap<String, Integer>();

        for (int i = 0; i < CsvHeaders.Headers.length; i++) {
            mapping.put(CsvHeaders.Headers[i], new Integer(i));
        }

        return mapping;
    }
}
