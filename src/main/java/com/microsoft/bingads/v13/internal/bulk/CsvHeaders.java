package com.microsoft.bingads.v13.internal.bulk;

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
            StringTable.CampaignId,
            StringTable.SubType,
            StringTable.Campaign,
            StringTable.AdGroup,
            StringTable.Website,
            StringTable.SyncTime,
            StringTable.ClientId,
            StringTable.LastModifiedTime,
            StringTable.MultiMediaAdBidAdjustment,
            StringTable.UseOptimizedTargeting,

            // campaign
            StringTable.TimeZone,
            StringTable.BudgetId,
            StringTable.BudgetName,
            StringTable.Budget,
            StringTable.BudgetType,
            StringTable.FeedId,
            StringTable.DynamicDescriptionEnabled,
            StringTable.VerifiedTrackingData,
            StringTable.VerifiedTrackingDatas,

            // Ad Group
            StringTable.StartDate,
            StringTable.EndDate,
            StringTable.NetworkDistribution,
            StringTable.AdRotation,
            StringTable.CpcBid,
            StringTable.ContentBid,
            StringTable.Language,
            StringTable.PrivacyStatus,
            StringTable.AdGroupType,
            StringTable.CpvBid,
            StringTable.CpmBid,
            StringTable.FrequencyCapSettings,
            StringTable.HotelAdGroupType,
            StringTable.CommissionRate,
            StringTable.PercentCpcBid,
            StringTable.FinalUrlExpansionOptOut,
            
            // OnlineConversionAdjustment
            StringTable.TransactionId,

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
            StringTable.TargetAll,
            StringTable.BidAdjustment,
            StringTable.CashbackAdjustment,
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

            // Profile Criterion
            StringTable.Profile,
            StringTable.ProfileId,

            // AdExtensions common
            StringTable.Version,
            StringTable.AdSchedule,

            // Use Searcher Time Zone
            StringTable.UseSearcherTimeZone,
            StringTable.AdScheduleUseSearcherTimeZone,

            // Action ad extension
            StringTable.ActionType,
            StringTable.ActionText,

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
            
            // Video ad extension
            StringTable.ThumbnailUrl,
            StringTable.ThumbnailId,
            StringTable.VideoId,

            // Flyer ad extension
            StringTable.FlyerName,
            StringTable.MediaUrls,

            // Editorial rejection reasons
            StringTable.PublisherCountries,
            
            StringTable.Layouts,
            StringTable.DisplayText,
            
            // Filter link ad extension
            StringTable.AdExtensionHeaderType,
            StringTable.Texts,


            // Product target
            StringTable.MerchantCenterId,
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
            StringTable.LocalInventoryAdsEnabled,
            StringTable.FeedLabel,
            StringTable.ShoppableAdsEnabled,
            
            // App Campaign
            StringTable.AppStore,

            // experiment
            StringTable.TrafficSplitPercent,
            StringTable.BaseCampaignId,
            StringTable.ExperimentCampaignId,
            StringTable.ExperimentId,
            StringTable.ExperimentType,

            // CoOp
            StringTable.BidOption,
            StringTable.BidBoostValue,
            StringTable.MaximumBid,
			
            //Upgrade Url
            StringTable.FinalUrl,
            StringTable.FinalMobileUrl,
            StringTable.TrackingTemplate,
            StringTable.CustomParameter,

            // Review Ad Extension
            StringTable.IsExact,
            StringTable.Source,
            StringTable.Url,

            // Price Ad Extension
            StringTable.PriceExtensionType,
            StringTable.CurrencyCode1,
            StringTable.CurrencyCode2,
            StringTable.CurrencyCode3,
            StringTable.CurrencyCode4,
            StringTable.CurrencyCode5,
            StringTable.CurrencyCode6,
            StringTable.CurrencyCode7,
            StringTable.CurrencyCode8,
            StringTable.PriceDescription1,
            StringTable.PriceDescription2,
            StringTable.PriceDescription3,
            StringTable.PriceDescription4,
            StringTable.PriceDescription5,
            StringTable.PriceDescription6,
            StringTable.PriceDescription7,
            StringTable.PriceDescription8,
            StringTable.Header1,
            StringTable.Header2,
            StringTable.Header3,
            StringTable.Header4,
            StringTable.Header5,
            StringTable.Header6,
            StringTable.Header7,
            StringTable.Header8,
            StringTable.FinalMobileUrl1,
            StringTable.FinalMobileUrl2,
            StringTable.FinalMobileUrl3,
            StringTable.FinalMobileUrl4,
            StringTable.FinalMobileUrl5,
            StringTable.FinalMobileUrl6,
            StringTable.FinalMobileUrl7,
            StringTable.FinalMobileUrl8,
            StringTable.FinalUrl1,
            StringTable.FinalUrl2,
            StringTable.FinalUrl3,
            StringTable.FinalUrl4,
            StringTable.FinalUrl5,
            StringTable.FinalUrl6,
            StringTable.FinalUrl7,
            StringTable.FinalUrl8,
            StringTable.Price1,
            StringTable.Price2,
            StringTable.Price3,
            StringTable.Price4,
            StringTable.Price5,
            StringTable.Price6,
            StringTable.Price7,
            StringTable.Price8,
            StringTable.PriceQualifier1,
            StringTable.PriceQualifier2,
            StringTable.PriceQualifier3,
            StringTable.PriceQualifier4,
            StringTable.PriceQualifier5,
            StringTable.PriceQualifier6,
            StringTable.PriceQualifier7,
            StringTable.PriceQualifier8,
            StringTable.PriceUnit1,
            StringTable.PriceUnit2,
            StringTable.PriceUnit3,
            StringTable.PriceUnit4,
            StringTable.PriceUnit5,
            StringTable.PriceUnit6,
            StringTable.PriceUnit7,
            StringTable.PriceUnit8,
            
            // Image
            StringTable.Height,
            StringTable.Width,
            
            // Video
            StringTable.SourceUrl,
            StringTable.AspectRatio,
            StringTable.DurationInMillionSeconds,

            // Callout Ad Extension
            StringTable.CalloutText,
            
            // AutoBidding
            StringTable.BidStrategyId,
            StringTable.BidStrategyName,
            StringTable.BidStrategyType,
            StringTable.BidStrategyMaxCpc,
            StringTable.BidStrategyTargetCpa,
            StringTable.BidStrategyTargetRoas,
            StringTable.InheritedBidStrategyType,
            StringTable.BidStrategyTargetAdPosition,
            StringTable.BidStrategyTargetImpressionShare,
            StringTable.BidStrategyCommissionRate,
            StringTable.BidStrategyPercentMaxCpc,
            StringTable.BidStrategyTargetCostPerSale,
            
            // Native Preference
            StringTable.AdFormatPreference,
            
            // Remarketing
            StringTable.Audience,
            StringTable.AudienceId,
            StringTable.Description,
            StringTable.MembershipDuration,
            StringTable.Scope,
            StringTable.TagId,
            StringTable.SourceId,
            StringTable.TargetSetting,
            StringTable.RemarketingRule,
            StringTable.AudienceSearchSize,
            StringTable.AudienceNetworkSize,
            StringTable.SupportedCampaignTypes,
            StringTable.ProductAudienceType,
            StringTable.CombinationRule,
            StringTable.EntityType,
            StringTable.ImpressionCampaignId,
            StringTable.ImpressionAdGroupId,

            // Structured Snippet Ad Extension
            StringTable.StructuredSnippetHeader,
            StringTable.StructuredSnippetValues,
            
            // Promotion Ad Extension
            StringTable.PromotionTarget,
            StringTable.DiscountModifier,
            StringTable.PercentOff,
            StringTable.MoneyAmountOff,
            StringTable.PromotionCode,
            StringTable.OrdersOverAmount,
            StringTable.Occasion,
            StringTable.PromotionStart,
            StringTable.PromotionEnd,
            StringTable.CurrencyCode,
            
            // Disclaimer Ad Extension
            StringTable.DisclaimerAdsEnabled,
            StringTable.DisclaimerName,
            StringTable.DisclaimerTitle,
            StringTable.DisclaimerLayout,
            StringTable.DisclaimerPopupText,
            StringTable.DisclaimerLineText,
            
            // Expanded Text Ad
            StringTable.TitlePart1,
            StringTable.TitlePart2,
            StringTable.TitlePart3,
            StringTable.TextPart2,
            StringTable.Path1,
            StringTable.Path2,
            StringTable.Domain,

            // Responsive Ad
            StringTable.CallToAction,
            StringTable.CallToActionLanguage,
            StringTable.Descriptions,
            StringTable.Headline,
            StringTable.Headlines,
            StringTable.Images,
            StringTable.LandscapeImageMediaId,
            StringTable.LandscapeLogoMediaId,
            StringTable.LongHeadline,
            StringTable.LongHeadlines,
            StringTable.SquareImageMediaId,
            StringTable.SquareLogoMediaId,
            StringTable.ImpressionTrackingUrls,
            StringTable.Videos,
            
            // Dynamic Search Ad
            StringTable.DomainLanguage,
            StringTable.DynamicAdTargetCondition1,
            StringTable.DynamicAdTargetCondition2,
            StringTable.DynamicAdTargetCondition3,
            StringTable.DynamicAdTargetValue1,
            StringTable.DynamicAdTargetValue2,
            StringTable.DynamicAdTargetValue3,
            StringTable.DynamicAdTargetConditionOperator1,
            StringTable.DynamicAdTargetConditionOperator2,
            StringTable.DynamicAdTargetConditionOperator3,
            StringTable.PageFeedIds,

            
            // Labels
            StringTable.ColorCode,
            StringTable.Label,

            // Offline Conversions
            StringTable.ConversionCurrencyCode,
            StringTable.ConversionName,
            StringTable.ConversionTime,
            StringTable.ConversionValue,
            StringTable.MicrosoftClickId,
            StringTable.AdjustmentValue,
            StringTable.AdjustmentTime,
            StringTable.AdjustmentCurrencyCode,
            StringTable.AdjustmentType,
            StringTable.ExternalAttributionCredit,
            StringTable.ExternalAttributionModel,
            StringTable.HashedEmailAddress,
            StringTable.HashedPhoneNumber,
            
            // Account
            StringTable.MSCLKIDAutoTaggingEnabled,
            StringTable.IncludeViewThroughConversions,
            StringTable.ProfileExpansionEnabled,            
            StringTable.AdClickParallelTracking,
            StringTable.AutoApplyRecommendations,
            StringTable.AllowImageAutoRetrieve,
            StringTable.BusinessAttributes,

            StringTable.FinalUrlSuffix,
            
            // Feeds
            StringTable.CustomAttributes,
            StringTable.FeedName,
            StringTable.PhysicalIntent,
            StringTable.TargetAdGroupId,
            StringTable.TargetCampaignId,
            StringTable.Schedule,
            
            // Campaign Conversion Goal
            StringTable.GoalId,
            
            // RSA AdCustomizer
            StringTable.AdCustomizerDataType,
            StringTable.AdCustomizerAttributeValue,
            
            // Hotel Ad
            StringTable.MinTargetValue,
            StringTable.MaxTargetValue,
            StringTable.HotelAttribute,
            StringTable.HotelAttributeValue,
            
            //PMax
            StringTable.Audiences,
            StringTable.AssetGroup,
            StringTable.AudienceGroup,
            StringTable.AgeRanges,
            StringTable.GenderTypes,
            StringTable.ParentListingGroupId,
            StringTable.AudienceGroupName,
            StringTable.CampaignNegativeWebpage,
            StringTable.AssetGroupListingGroup,
            StringTable.AudienceGroupAssetGroupAssociation,
            StringTable.AutoGeneratedTextOptOut,
            StringTable.AutoGeneratedImageOptOut,
            StringTable.CostPerSaleOptOut,
            StringTable.SearchTheme,
            
            // MultiChannel Campaign
            StringTable.DestinationChannel,
            StringTable.IsMultiChannelCampaign,
            
            // Seasonality Adjustment
            StringTable.SeasonalityAdjustment,
            StringTable.DataExclusion,
            StringTable.DeviceType,
            StringTable.CampaignAssociations,
            
            // DNV Serving on MSAN
            StringTable.ShouldServeOnMSAN,
            
            // Goal
            StringTable.AttributionModelType,
            StringTable.ConversionWindowInMinutes,
            StringTable.CountType,
            StringTable.ExcludeFromBidding,
            StringTable.GoalCategory,
            StringTable.IsEnhancedConversionsEnabled,
            StringTable.RevenueType,
            StringTable.RevenueValue,
            StringTable.TrackingStatus,
            StringTable.ViewThroughConversionWindowInMinutes,
            StringTable.MinimumDurationInSecond,
            StringTable.ActionExpression,
            StringTable.ActionOperator,
            StringTable.CategoryExpression,
            StringTable.CategoryOperator,
            StringTable.LabelExpression,
            StringTable.LabelOperator,
            StringTable.EventValue,
            StringTable.EventValueOperator,
            StringTable.IsExternallyAttributed,
            StringTable.MinimumPagesViewed,
            StringTable.UrlExpression,
            StringTable.UrlOperator,
            
            // Brand List
            StringTable.BrandId,
            StringTable.BrandUrl,
            StringTable.BrandName,
            StringTable.StatusDateTime,
            
            //Asset Group Url Target
            StringTable.AssetGroupTargetCondition1,
            StringTable.AssetGroupTargetCondition2,
            StringTable.AssetGroupTargetCondition3,
            StringTable.AssetGroupTargetConditionOperator1,
            StringTable.AssetGroupTargetConditionOperator2,
            StringTable.AssetGroupTargetConditionOperator3,
            StringTable.AssetGroupTargetValue1,
            StringTable.AssetGroupTargetValue2,
            StringTable.AssetGroupTargetValue3,
            
            // New Customer Acquisition Goal
            StringTable.AdditionalConversionValue,
            StringTable.NewCustomerAcquisitionGoalId,
            StringTable.NewCustomerAcquisitionBidOnlyMode,
            
            StringTable.AccountPlacementListItemUrl,
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
