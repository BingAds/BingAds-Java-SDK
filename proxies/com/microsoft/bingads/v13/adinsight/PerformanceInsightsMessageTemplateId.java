
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformanceInsightsMessageTemplateId.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PerformanceInsightsMessageTemplateId">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FluxImprIncreaseAcct"/>
 *     <enumeration value="FluxImprDecreaseAcct"/>
 *     <enumeration value="FluxImprIncreaseInfinityAcct"/>
 *     <enumeration value="FluxImprIncreaseAcctPrevDay"/>
 *     <enumeration value="FluxImprDecreaseAcctPrevDay"/>
 *     <enumeration value="FluxImprIncreaseInfinityAcctPrevDay"/>
 *     <enumeration value="FluxClickIncreaseAcct"/>
 *     <enumeration value="FluxClickDecreaseAcct"/>
 *     <enumeration value="FluxClickIncreaseInfinityAcct"/>
 *     <enumeration value="FluxClickIncreaseAcctPrevDay"/>
 *     <enumeration value="FluxClickDecreaseAcctPrevDay"/>
 *     <enumeration value="FluxClickIncreaseInfinityAcctPrevDay"/>
 *     <enumeration value="FluxCostIncreaseAcct"/>
 *     <enumeration value="FluxCostDecreaseAcct"/>
 *     <enumeration value="FluxCostIncreaseInfinityAcct"/>
 *     <enumeration value="FluxCostIncreaseAcctPrevDay"/>
 *     <enumeration value="FluxCostDecreaseAcctPrevDay"/>
 *     <enumeration value="FluxCostIncreaseInfinityAcctPrevDay"/>
 *     <enumeration value="FluxImprIncreaseCampaign"/>
 *     <enumeration value="FluxImprDecreaseCampaign"/>
 *     <enumeration value="FluxImprIncreaseInfinityCampaign"/>
 *     <enumeration value="FluxImprIncreaseCampaignPrevDay"/>
 *     <enumeration value="FluxImprDecreaseCampaignPrevDay"/>
 *     <enumeration value="FluxImprIncreaseInfinityCampaignPrevDay"/>
 *     <enumeration value="FluxClickIncreaseCampaign"/>
 *     <enumeration value="FluxClickDecreaseCampaign"/>
 *     <enumeration value="FluxClickIncreaseInfinityCampaign"/>
 *     <enumeration value="FluxClickIncreaseCampaignPrevDay"/>
 *     <enumeration value="FluxClickDecreaseCampaignPrevDay"/>
 *     <enumeration value="FluxClickIncreaseInfinityCampaignPrevDay"/>
 *     <enumeration value="FluxCostIncreaseCampaign"/>
 *     <enumeration value="FluxCostDecreaseCampaign"/>
 *     <enumeration value="FluxCostIncreaseInfinityCampaign"/>
 *     <enumeration value="FluxCostIncreaseCampaignPrevDay"/>
 *     <enumeration value="FluxCostDecreaseCampaignPrevDay"/>
 *     <enumeration value="FluxCostIncreaseInfinityCampaignPrevDay"/>
 *     <enumeration value="FluxConversionDecreaseAcct"/>
 *     <enumeration value="FluxConversionZeroAcct"/>
 *     <enumeration value="RCAudienceIncrease"/>
 *     <enumeration value="RCAudienceDecrease"/>
 *     <enumeration value="RCBidIncrease"/>
 *     <enumeration value="RCBidDecrease"/>
 *     <enumeration value="RCBudgetIncrease"/>
 *     <enumeration value="RCBudgetDecrease"/>
 *     <enumeration value="RCClickIncrease"/>
 *     <enumeration value="RCClickDecrease"/>
 *     <enumeration value="RCConversionGoalIssue"/>
 *     <enumeration value="RCDeviceTargetingBidChange"/>
 *     <enumeration value="RCEditorialApproval"/>
 *     <enumeration value="RCEditorialDisapproval"/>
 *     <enumeration value="RCEntityAdditionWithCount"/>
 *     <enumeration value="RCEntityDeletionWithCount"/>
 *     <enumeration value="RCEntityPauseWithCount"/>
 *     <enumeration value="RCEntityUnpauseWithCount"/>
 *     <enumeration value="RCMoreCompetitive"/>
 *     <enumeration value="RCNetworkLessRestrict"/>
 *     <enumeration value="RCNetworkMoreRestrict"/>
 *     <enumeration value="RCPaymentIssueInvoiceAccountPaused"/>
 *     <enumeration value="RCPaymentIssueInvoiceAccountOnHold"/>
 *     <enumeration value="RCPaymentIssuePrepayAccountPaused"/>
 *     <enumeration value="RCPaymentIssueThresholdAccountOnHold"/>
 *     <enumeration value="RCPaymentIssueYesterday"/>
 *     <enumeration value="RCSearchTermIncrease"/>
 *     <enumeration value="RCSearchTermIncreaseClick"/>
 *     <enumeration value="RCSearchTermDecrease"/>
 *     <enumeration value="RCSearchTermDecreaseClick"/>
 *     <enumeration value="RCSearchTermCompetitionIncrease"/>
 *     <enumeration value="RCSearchTermCompetitionIncreaseClick"/>
 *     <enumeration value="RCSearchTermCompetitionDecrease"/>
 *     <enumeration value="RCSearchTermCompetitionDecreaseClick"/>
 *     <enumeration value="RCSingleCampaignAddition"/>
 *     <enumeration value="RCSingleCampaignPause"/>
 *     <enumeration value="RCSingleCampaignUnpause"/>
 *     <enumeration value="RCSingleCampaignBudgetIncrease"/>
 *     <enumeration value="RCSingleCampaignBudgetDecrease"/>
 *     <enumeration value="RCSingleCampaignDeviceTargetingBidChange"/>
 *     <enumeration value="RCStrongerCompetitorAdQuality"/>
 *     <enumeration value="RCStrongerCompetitorBid"/>
 *     <enumeration value="RCSyndTrafficIncrease"/>
 *     <enumeration value="RCSyndTrafficDecrease"/>
 *     <enumeration value="ActAdsOppr"/>
 *     <enumeration value="ActAllAvailableOppr"/>
 *     <enumeration value="ActBMAdoptionOppr"/>
 *     <enumeration value="ActBMMKeywordOppr"/>
 *     <enumeration value="ActCampaignContextKeywordOppr"/>
 *     <enumeration value="ActCheckPublisherWebsite"/>
 *     <enumeration value="ActCompetitionAuctionInsight"/>
 *     <enumeration value="ActCompetitiveBudgetOppr"/>
 *     <enumeration value="ActCompetitiveKeywordOppr"/>
 *     <enumeration value="ActCompetitiveLocationTargetOppr"/>
 *     <enumeration value="ActCTRQualityBundle"/>
 *     <enumeration value="ActEditorialReviewProcess"/>
 *     <enumeration value="ActFixConversionGoalSettingOppr"/>
 *     <enumeration value="ActFixConversionTrackingOppr"/>
 *     <enumeration value="ActGeneralBudgetOppr"/>
 *     <enumeration value="ActNewConversionGoalOppr"/>
 *     <enumeration value="ActInvoiceAccountPaused"/>
 *     <enumeration value="ActInvoiceAccountOnHold"/>
 *     <enumeration value="ActPrepayAccountPaused"/>
 *     <enumeration value="ActReallocateBudgetOppr"/>
 *     <enumeration value="ActRepairKeywordsOppr"/>
 *     <enumeration value="ActRSAOppr"/>
 *     <enumeration value="ActSearchTerm"/>
 *     <enumeration value="ActSetupConversionTrackingOppr"/>
 *     <enumeration value="ActSiteLinkOppr"/>
 *     <enumeration value="ActThresholdAccountOnHold"/>
 *     <enumeration value="ActWebsiteExclusion"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PerformanceInsightsMessageTemplateId")
@XmlEnum
public enum PerformanceInsightsMessageTemplateId {

    @XmlEnumValue("FluxImprIncreaseAcct")
    FLUX_IMPR_INCREASE_ACCT("FluxImprIncreaseAcct"),
    @XmlEnumValue("FluxImprDecreaseAcct")
    FLUX_IMPR_DECREASE_ACCT("FluxImprDecreaseAcct"),
    @XmlEnumValue("FluxImprIncreaseInfinityAcct")
    FLUX_IMPR_INCREASE_INFINITY_ACCT("FluxImprIncreaseInfinityAcct"),
    @XmlEnumValue("FluxImprIncreaseAcctPrevDay")
    FLUX_IMPR_INCREASE_ACCT_PREV_DAY("FluxImprIncreaseAcctPrevDay"),
    @XmlEnumValue("FluxImprDecreaseAcctPrevDay")
    FLUX_IMPR_DECREASE_ACCT_PREV_DAY("FluxImprDecreaseAcctPrevDay"),
    @XmlEnumValue("FluxImprIncreaseInfinityAcctPrevDay")
    FLUX_IMPR_INCREASE_INFINITY_ACCT_PREV_DAY("FluxImprIncreaseInfinityAcctPrevDay"),
    @XmlEnumValue("FluxClickIncreaseAcct")
    FLUX_CLICK_INCREASE_ACCT("FluxClickIncreaseAcct"),
    @XmlEnumValue("FluxClickDecreaseAcct")
    FLUX_CLICK_DECREASE_ACCT("FluxClickDecreaseAcct"),
    @XmlEnumValue("FluxClickIncreaseInfinityAcct")
    FLUX_CLICK_INCREASE_INFINITY_ACCT("FluxClickIncreaseInfinityAcct"),
    @XmlEnumValue("FluxClickIncreaseAcctPrevDay")
    FLUX_CLICK_INCREASE_ACCT_PREV_DAY("FluxClickIncreaseAcctPrevDay"),
    @XmlEnumValue("FluxClickDecreaseAcctPrevDay")
    FLUX_CLICK_DECREASE_ACCT_PREV_DAY("FluxClickDecreaseAcctPrevDay"),
    @XmlEnumValue("FluxClickIncreaseInfinityAcctPrevDay")
    FLUX_CLICK_INCREASE_INFINITY_ACCT_PREV_DAY("FluxClickIncreaseInfinityAcctPrevDay"),
    @XmlEnumValue("FluxCostIncreaseAcct")
    FLUX_COST_INCREASE_ACCT("FluxCostIncreaseAcct"),
    @XmlEnumValue("FluxCostDecreaseAcct")
    FLUX_COST_DECREASE_ACCT("FluxCostDecreaseAcct"),
    @XmlEnumValue("FluxCostIncreaseInfinityAcct")
    FLUX_COST_INCREASE_INFINITY_ACCT("FluxCostIncreaseInfinityAcct"),
    @XmlEnumValue("FluxCostIncreaseAcctPrevDay")
    FLUX_COST_INCREASE_ACCT_PREV_DAY("FluxCostIncreaseAcctPrevDay"),
    @XmlEnumValue("FluxCostDecreaseAcctPrevDay")
    FLUX_COST_DECREASE_ACCT_PREV_DAY("FluxCostDecreaseAcctPrevDay"),
    @XmlEnumValue("FluxCostIncreaseInfinityAcctPrevDay")
    FLUX_COST_INCREASE_INFINITY_ACCT_PREV_DAY("FluxCostIncreaseInfinityAcctPrevDay"),
    @XmlEnumValue("FluxImprIncreaseCampaign")
    FLUX_IMPR_INCREASE_CAMPAIGN("FluxImprIncreaseCampaign"),
    @XmlEnumValue("FluxImprDecreaseCampaign")
    FLUX_IMPR_DECREASE_CAMPAIGN("FluxImprDecreaseCampaign"),
    @XmlEnumValue("FluxImprIncreaseInfinityCampaign")
    FLUX_IMPR_INCREASE_INFINITY_CAMPAIGN("FluxImprIncreaseInfinityCampaign"),
    @XmlEnumValue("FluxImprIncreaseCampaignPrevDay")
    FLUX_IMPR_INCREASE_CAMPAIGN_PREV_DAY("FluxImprIncreaseCampaignPrevDay"),
    @XmlEnumValue("FluxImprDecreaseCampaignPrevDay")
    FLUX_IMPR_DECREASE_CAMPAIGN_PREV_DAY("FluxImprDecreaseCampaignPrevDay"),
    @XmlEnumValue("FluxImprIncreaseInfinityCampaignPrevDay")
    FLUX_IMPR_INCREASE_INFINITY_CAMPAIGN_PREV_DAY("FluxImprIncreaseInfinityCampaignPrevDay"),
    @XmlEnumValue("FluxClickIncreaseCampaign")
    FLUX_CLICK_INCREASE_CAMPAIGN("FluxClickIncreaseCampaign"),
    @XmlEnumValue("FluxClickDecreaseCampaign")
    FLUX_CLICK_DECREASE_CAMPAIGN("FluxClickDecreaseCampaign"),
    @XmlEnumValue("FluxClickIncreaseInfinityCampaign")
    FLUX_CLICK_INCREASE_INFINITY_CAMPAIGN("FluxClickIncreaseInfinityCampaign"),
    @XmlEnumValue("FluxClickIncreaseCampaignPrevDay")
    FLUX_CLICK_INCREASE_CAMPAIGN_PREV_DAY("FluxClickIncreaseCampaignPrevDay"),
    @XmlEnumValue("FluxClickDecreaseCampaignPrevDay")
    FLUX_CLICK_DECREASE_CAMPAIGN_PREV_DAY("FluxClickDecreaseCampaignPrevDay"),
    @XmlEnumValue("FluxClickIncreaseInfinityCampaignPrevDay")
    FLUX_CLICK_INCREASE_INFINITY_CAMPAIGN_PREV_DAY("FluxClickIncreaseInfinityCampaignPrevDay"),
    @XmlEnumValue("FluxCostIncreaseCampaign")
    FLUX_COST_INCREASE_CAMPAIGN("FluxCostIncreaseCampaign"),
    @XmlEnumValue("FluxCostDecreaseCampaign")
    FLUX_COST_DECREASE_CAMPAIGN("FluxCostDecreaseCampaign"),
    @XmlEnumValue("FluxCostIncreaseInfinityCampaign")
    FLUX_COST_INCREASE_INFINITY_CAMPAIGN("FluxCostIncreaseInfinityCampaign"),
    @XmlEnumValue("FluxCostIncreaseCampaignPrevDay")
    FLUX_COST_INCREASE_CAMPAIGN_PREV_DAY("FluxCostIncreaseCampaignPrevDay"),
    @XmlEnumValue("FluxCostDecreaseCampaignPrevDay")
    FLUX_COST_DECREASE_CAMPAIGN_PREV_DAY("FluxCostDecreaseCampaignPrevDay"),
    @XmlEnumValue("FluxCostIncreaseInfinityCampaignPrevDay")
    FLUX_COST_INCREASE_INFINITY_CAMPAIGN_PREV_DAY("FluxCostIncreaseInfinityCampaignPrevDay"),
    @XmlEnumValue("FluxConversionDecreaseAcct")
    FLUX_CONVERSION_DECREASE_ACCT("FluxConversionDecreaseAcct"),
    @XmlEnumValue("FluxConversionZeroAcct")
    FLUX_CONVERSION_ZERO_ACCT("FluxConversionZeroAcct"),
    @XmlEnumValue("RCAudienceIncrease")
    RC_AUDIENCE_INCREASE("RCAudienceIncrease"),
    @XmlEnumValue("RCAudienceDecrease")
    RC_AUDIENCE_DECREASE("RCAudienceDecrease"),
    @XmlEnumValue("RCBidIncrease")
    RC_BID_INCREASE("RCBidIncrease"),
    @XmlEnumValue("RCBidDecrease")
    RC_BID_DECREASE("RCBidDecrease"),
    @XmlEnumValue("RCBudgetIncrease")
    RC_BUDGET_INCREASE("RCBudgetIncrease"),
    @XmlEnumValue("RCBudgetDecrease")
    RC_BUDGET_DECREASE("RCBudgetDecrease"),
    @XmlEnumValue("RCClickIncrease")
    RC_CLICK_INCREASE("RCClickIncrease"),
    @XmlEnumValue("RCClickDecrease")
    RC_CLICK_DECREASE("RCClickDecrease"),
    @XmlEnumValue("RCConversionGoalIssue")
    RC_CONVERSION_GOAL_ISSUE("RCConversionGoalIssue"),
    @XmlEnumValue("RCDeviceTargetingBidChange")
    RC_DEVICE_TARGETING_BID_CHANGE("RCDeviceTargetingBidChange"),
    @XmlEnumValue("RCEditorialApproval")
    RC_EDITORIAL_APPROVAL("RCEditorialApproval"),
    @XmlEnumValue("RCEditorialDisapproval")
    RC_EDITORIAL_DISAPPROVAL("RCEditorialDisapproval"),
    @XmlEnumValue("RCEntityAdditionWithCount")
    RC_ENTITY_ADDITION_WITH_COUNT("RCEntityAdditionWithCount"),
    @XmlEnumValue("RCEntityDeletionWithCount")
    RC_ENTITY_DELETION_WITH_COUNT("RCEntityDeletionWithCount"),
    @XmlEnumValue("RCEntityPauseWithCount")
    RC_ENTITY_PAUSE_WITH_COUNT("RCEntityPauseWithCount"),
    @XmlEnumValue("RCEntityUnpauseWithCount")
    RC_ENTITY_UNPAUSE_WITH_COUNT("RCEntityUnpauseWithCount"),
    @XmlEnumValue("RCMoreCompetitive")
    RC_MORE_COMPETITIVE("RCMoreCompetitive"),
    @XmlEnumValue("RCNetworkLessRestrict")
    RC_NETWORK_LESS_RESTRICT("RCNetworkLessRestrict"),
    @XmlEnumValue("RCNetworkMoreRestrict")
    RC_NETWORK_MORE_RESTRICT("RCNetworkMoreRestrict"),
    @XmlEnumValue("RCPaymentIssueInvoiceAccountPaused")
    RC_PAYMENT_ISSUE_INVOICE_ACCOUNT_PAUSED("RCPaymentIssueInvoiceAccountPaused"),
    @XmlEnumValue("RCPaymentIssueInvoiceAccountOnHold")
    RC_PAYMENT_ISSUE_INVOICE_ACCOUNT_ON_HOLD("RCPaymentIssueInvoiceAccountOnHold"),
    @XmlEnumValue("RCPaymentIssuePrepayAccountPaused")
    RC_PAYMENT_ISSUE_PREPAY_ACCOUNT_PAUSED("RCPaymentIssuePrepayAccountPaused"),
    @XmlEnumValue("RCPaymentIssueThresholdAccountOnHold")
    RC_PAYMENT_ISSUE_THRESHOLD_ACCOUNT_ON_HOLD("RCPaymentIssueThresholdAccountOnHold"),
    @XmlEnumValue("RCPaymentIssueYesterday")
    RC_PAYMENT_ISSUE_YESTERDAY("RCPaymentIssueYesterday"),
    @XmlEnumValue("RCSearchTermIncrease")
    RC_SEARCH_TERM_INCREASE("RCSearchTermIncrease"),
    @XmlEnumValue("RCSearchTermIncreaseClick")
    RC_SEARCH_TERM_INCREASE_CLICK("RCSearchTermIncreaseClick"),
    @XmlEnumValue("RCSearchTermDecrease")
    RC_SEARCH_TERM_DECREASE("RCSearchTermDecrease"),
    @XmlEnumValue("RCSearchTermDecreaseClick")
    RC_SEARCH_TERM_DECREASE_CLICK("RCSearchTermDecreaseClick"),
    @XmlEnumValue("RCSearchTermCompetitionIncrease")
    RC_SEARCH_TERM_COMPETITION_INCREASE("RCSearchTermCompetitionIncrease"),
    @XmlEnumValue("RCSearchTermCompetitionIncreaseClick")
    RC_SEARCH_TERM_COMPETITION_INCREASE_CLICK("RCSearchTermCompetitionIncreaseClick"),
    @XmlEnumValue("RCSearchTermCompetitionDecrease")
    RC_SEARCH_TERM_COMPETITION_DECREASE("RCSearchTermCompetitionDecrease"),
    @XmlEnumValue("RCSearchTermCompetitionDecreaseClick")
    RC_SEARCH_TERM_COMPETITION_DECREASE_CLICK("RCSearchTermCompetitionDecreaseClick"),
    @XmlEnumValue("RCSingleCampaignAddition")
    RC_SINGLE_CAMPAIGN_ADDITION("RCSingleCampaignAddition"),
    @XmlEnumValue("RCSingleCampaignPause")
    RC_SINGLE_CAMPAIGN_PAUSE("RCSingleCampaignPause"),
    @XmlEnumValue("RCSingleCampaignUnpause")
    RC_SINGLE_CAMPAIGN_UNPAUSE("RCSingleCampaignUnpause"),
    @XmlEnumValue("RCSingleCampaignBudgetIncrease")
    RC_SINGLE_CAMPAIGN_BUDGET_INCREASE("RCSingleCampaignBudgetIncrease"),
    @XmlEnumValue("RCSingleCampaignBudgetDecrease")
    RC_SINGLE_CAMPAIGN_BUDGET_DECREASE("RCSingleCampaignBudgetDecrease"),
    @XmlEnumValue("RCSingleCampaignDeviceTargetingBidChange")
    RC_SINGLE_CAMPAIGN_DEVICE_TARGETING_BID_CHANGE("RCSingleCampaignDeviceTargetingBidChange"),
    @XmlEnumValue("RCStrongerCompetitorAdQuality")
    RC_STRONGER_COMPETITOR_AD_QUALITY("RCStrongerCompetitorAdQuality"),
    @XmlEnumValue("RCStrongerCompetitorBid")
    RC_STRONGER_COMPETITOR_BID("RCStrongerCompetitorBid"),
    @XmlEnumValue("RCSyndTrafficIncrease")
    RC_SYND_TRAFFIC_INCREASE("RCSyndTrafficIncrease"),
    @XmlEnumValue("RCSyndTrafficDecrease")
    RC_SYND_TRAFFIC_DECREASE("RCSyndTrafficDecrease"),
    @XmlEnumValue("ActAdsOppr")
    ACT_ADS_OPPR("ActAdsOppr"),
    @XmlEnumValue("ActAllAvailableOppr")
    ACT_ALL_AVAILABLE_OPPR("ActAllAvailableOppr"),
    @XmlEnumValue("ActBMAdoptionOppr")
    ACT_BM_ADOPTION_OPPR("ActBMAdoptionOppr"),
    @XmlEnumValue("ActBMMKeywordOppr")
    ACT_BMM_KEYWORD_OPPR("ActBMMKeywordOppr"),
    @XmlEnumValue("ActCampaignContextKeywordOppr")
    ACT_CAMPAIGN_CONTEXT_KEYWORD_OPPR("ActCampaignContextKeywordOppr"),
    @XmlEnumValue("ActCheckPublisherWebsite")
    ACT_CHECK_PUBLISHER_WEBSITE("ActCheckPublisherWebsite"),
    @XmlEnumValue("ActCompetitionAuctionInsight")
    ACT_COMPETITION_AUCTION_INSIGHT("ActCompetitionAuctionInsight"),
    @XmlEnumValue("ActCompetitiveBudgetOppr")
    ACT_COMPETITIVE_BUDGET_OPPR("ActCompetitiveBudgetOppr"),
    @XmlEnumValue("ActCompetitiveKeywordOppr")
    ACT_COMPETITIVE_KEYWORD_OPPR("ActCompetitiveKeywordOppr"),
    @XmlEnumValue("ActCompetitiveLocationTargetOppr")
    ACT_COMPETITIVE_LOCATION_TARGET_OPPR("ActCompetitiveLocationTargetOppr"),
    @XmlEnumValue("ActCTRQualityBundle")
    ACT_CTR_QUALITY_BUNDLE("ActCTRQualityBundle"),
    @XmlEnumValue("ActEditorialReviewProcess")
    ACT_EDITORIAL_REVIEW_PROCESS("ActEditorialReviewProcess"),
    @XmlEnumValue("ActFixConversionGoalSettingOppr")
    ACT_FIX_CONVERSION_GOAL_SETTING_OPPR("ActFixConversionGoalSettingOppr"),
    @XmlEnumValue("ActFixConversionTrackingOppr")
    ACT_FIX_CONVERSION_TRACKING_OPPR("ActFixConversionTrackingOppr"),
    @XmlEnumValue("ActGeneralBudgetOppr")
    ACT_GENERAL_BUDGET_OPPR("ActGeneralBudgetOppr"),
    @XmlEnumValue("ActNewConversionGoalOppr")
    ACT_NEW_CONVERSION_GOAL_OPPR("ActNewConversionGoalOppr"),
    @XmlEnumValue("ActInvoiceAccountPaused")
    ACT_INVOICE_ACCOUNT_PAUSED("ActInvoiceAccountPaused"),
    @XmlEnumValue("ActInvoiceAccountOnHold")
    ACT_INVOICE_ACCOUNT_ON_HOLD("ActInvoiceAccountOnHold"),
    @XmlEnumValue("ActPrepayAccountPaused")
    ACT_PREPAY_ACCOUNT_PAUSED("ActPrepayAccountPaused"),
    @XmlEnumValue("ActReallocateBudgetOppr")
    ACT_REALLOCATE_BUDGET_OPPR("ActReallocateBudgetOppr"),
    @XmlEnumValue("ActRepairKeywordsOppr")
    ACT_REPAIR_KEYWORDS_OPPR("ActRepairKeywordsOppr"),
    @XmlEnumValue("ActRSAOppr")
    ACT_RSA_OPPR("ActRSAOppr"),
    @XmlEnumValue("ActSearchTerm")
    ACT_SEARCH_TERM("ActSearchTerm"),
    @XmlEnumValue("ActSetupConversionTrackingOppr")
    ACT_SETUP_CONVERSION_TRACKING_OPPR("ActSetupConversionTrackingOppr"),
    @XmlEnumValue("ActSiteLinkOppr")
    ACT_SITE_LINK_OPPR("ActSiteLinkOppr"),
    @XmlEnumValue("ActThresholdAccountOnHold")
    ACT_THRESHOLD_ACCOUNT_ON_HOLD("ActThresholdAccountOnHold"),
    @XmlEnumValue("ActWebsiteExclusion")
    ACT_WEBSITE_EXCLUSION("ActWebsiteExclusion");
    private final String value;

    PerformanceInsightsMessageTemplateId(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PerformanceInsightsMessageTemplateId fromValue(String v) {
        for (PerformanceInsightsMessageTemplateId c: PerformanceInsightsMessageTemplateId.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
