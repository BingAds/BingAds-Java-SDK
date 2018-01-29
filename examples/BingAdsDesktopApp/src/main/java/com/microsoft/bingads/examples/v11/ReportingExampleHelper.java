package com.microsoft.bingads.examples.v11;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;
import com.microsoft.bingads.*;
import com.microsoft.bingads.v11.reporting.*;

class ReportingExampleHelper
{
    static ServiceClient<IReportingService> ReportingService;
    static PollGenerateReportResponse pollGenerateReport(
        java.lang.String reportRequestId) throws RemoteException, Exception
    {
        PollGenerateReportRequest request = new PollGenerateReportRequest();

        request.setReportRequestId(reportRequestId);

        return ReportingService.getService().pollGenerateReport(request);
    }
    static SubmitGenerateReportResponse submitGenerateReport(
        ReportRequest reportRequest) throws RemoteException, Exception
    {
        SubmitGenerateReportRequest request = new SubmitGenerateReportRequest();

        request.setReportRequest(reportRequest);

        return ReportingService.getService().submitGenerateReport(request);
    }
    static void outputAccountPerformanceReportFilter(AccountPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("DeviceOS: %s", dataObject.getDeviceOS()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
        }
    }
    static void outputArrayOfAccountPerformanceReportFilter(ArrayList<AccountPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AccountPerformanceReportFilter dataObject : dataObjects)
            {
                outputAccountPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAccountPerformanceReportRequest(AccountPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfAccountPerformanceReportColumn(dataObject.getColumns());
            outputAccountPerformanceReportFilter(dataObject.getFilter());
            outputAccountReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfAccountPerformanceReportRequest(ArrayList<AccountPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AccountPerformanceReportRequest dataObject : dataObjects)
            {
                outputAccountPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAccountReportScope(AccountReportScope dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOflong(dataObject.getAccountIds());
        }
    }
    static void outputArrayOfAccountReportScope(ArrayList<AccountReportScope> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AccountReportScope dataObject : dataObjects)
            {
                outputAccountReportScope(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAccountThroughAdGroupReportScope(AccountThroughAdGroupReportScope dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOflong(dataObject.getAccountIds());
            outputArrayOfAdGroupReportScope(dataObject.getAdGroups());
            outputArrayOfCampaignReportScope(dataObject.getCampaigns());
        }
    }
    static void outputArrayOfAccountThroughAdGroupReportScope(ArrayList<AccountThroughAdGroupReportScope> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AccountThroughAdGroupReportScope dataObject : dataObjects)
            {
                outputAccountThroughAdGroupReportScope(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAccountThroughCampaignReportScope(AccountThroughCampaignReportScope dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOflong(dataObject.getAccountIds());
            outputArrayOfCampaignReportScope(dataObject.getCampaigns());
        }
    }
    static void outputArrayOfAccountThroughCampaignReportScope(ArrayList<AccountThroughCampaignReportScope> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AccountThroughCampaignReportScope dataObject : dataObjects)
            {
                outputAccountThroughCampaignReportScope(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdApiError(AdApiError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Detail: %s", dataObject.getDetail()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
        }
    }
    static void outputArrayOfAdApiError(ArrayOfAdApiError dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdApiError dataObject : dataObjects.getAdApiErrors())
            {
                outputAdApiError(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdApiFaultDetail(AdApiFaultDetail dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfAdApiError(dataObject.getErrors());
        }
    }
    static void outputArrayOfAdApiFaultDetail(ArrayList<AdApiFaultDetail> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdApiFaultDetail dataObject : dataObjects)
            {
                outputAdApiFaultDetail(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdDynamicTextPerformanceReportFilter(AdDynamicTextPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("AdType: %s", dataObject.getAdType()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage(String.format("KeywordStatus: %s", dataObject.getKeywordStatus()));
            outputArrayOfstring(dataObject.getLanguageCode());
        }
    }
    static void outputArrayOfAdDynamicTextPerformanceReportFilter(ArrayList<AdDynamicTextPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdDynamicTextPerformanceReportFilter dataObject : dataObjects)
            {
                outputAdDynamicTextPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdDynamicTextPerformanceReportRequest(AdDynamicTextPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfAdDynamicTextPerformanceReportColumn(dataObject.getColumns());
            outputAdDynamicTextPerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfAdDynamicTextPerformanceReportRequest(ArrayList<AdDynamicTextPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdDynamicTextPerformanceReportRequest dataObject : dataObjects)
            {
                outputAdDynamicTextPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdExtensionByAdReportFilter(AdExtensionByAdReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceOS: %s", dataObject.getDeviceOS()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
        }
    }
    static void outputArrayOfAdExtensionByAdReportFilter(ArrayList<AdExtensionByAdReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionByAdReportFilter dataObject : dataObjects)
            {
                outputAdExtensionByAdReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdExtensionByAdReportRequest(AdExtensionByAdReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfAdExtensionByAdReportColumn(dataObject.getColumns());
            outputAdExtensionByAdReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfAdExtensionByAdReportRequest(ArrayList<AdExtensionByAdReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionByAdReportRequest dataObject : dataObjects)
            {
                outputAdExtensionByAdReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdExtensionByKeywordReportFilter(AdExtensionByKeywordReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceOS: %s", dataObject.getDeviceOS()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage(String.format("KeywordStatus: %s", dataObject.getKeywordStatus()));
        }
    }
    static void outputArrayOfAdExtensionByKeywordReportFilter(ArrayList<AdExtensionByKeywordReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionByKeywordReportFilter dataObject : dataObjects)
            {
                outputAdExtensionByKeywordReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdExtensionByKeywordReportRequest(AdExtensionByKeywordReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfAdExtensionByKeywordReportColumn(dataObject.getColumns());
            outputAdExtensionByKeywordReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfAdExtensionByKeywordReportRequest(ArrayList<AdExtensionByKeywordReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionByKeywordReportRequest dataObject : dataObjects)
            {
                outputAdExtensionByKeywordReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdExtensionDetailReportFilter(AdExtensionDetailReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceOS: %s", dataObject.getDeviceOS()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
        }
    }
    static void outputArrayOfAdExtensionDetailReportFilter(ArrayList<AdExtensionDetailReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionDetailReportFilter dataObject : dataObjects)
            {
                outputAdExtensionDetailReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdExtensionDetailReportRequest(AdExtensionDetailReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfAdExtensionDetailReportColumn(dataObject.getColumns());
            outputAdExtensionDetailReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfAdExtensionDetailReportRequest(ArrayList<AdExtensionDetailReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionDetailReportRequest dataObject : dataObjects)
            {
                outputAdExtensionDetailReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdGroupPerformanceReportFilter(AdGroupPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceOS: %s", dataObject.getDeviceOS()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
        }
    }
    static void outputArrayOfAdGroupPerformanceReportFilter(ArrayList<AdGroupPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupPerformanceReportFilter dataObject : dataObjects)
            {
                outputAdGroupPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdGroupPerformanceReportRequest(AdGroupPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfAdGroupPerformanceReportColumn(dataObject.getColumns());
            outputAdGroupPerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfAdGroupPerformanceReportRequest(ArrayList<AdGroupPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupPerformanceReportRequest dataObject : dataObjects)
            {
                outputAdGroupPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdGroupReportScope(AdGroupReportScope dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountId: %s", dataObject.getAccountId()));
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
        }
    }
    static void outputArrayOfAdGroupReportScope(ArrayOfAdGroupReportScope dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupReportScope dataObject : dataObjects.getAdGroupReportScopes())
            {
                outputAdGroupReportScope(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdPerformanceReportFilter(AdPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("AdType: %s", dataObject.getAdType()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputArrayOfstring(dataObject.getLanguageCode());
        }
    }
    static void outputArrayOfAdPerformanceReportFilter(ArrayList<AdPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdPerformanceReportFilter dataObject : dataObjects)
            {
                outputAdPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAdPerformanceReportRequest(AdPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfAdPerformanceReportColumn(dataObject.getColumns());
            outputAdPerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfAdPerformanceReportRequest(ArrayList<AdPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdPerformanceReportRequest dataObject : dataObjects)
            {
                outputAdPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAgeGenderDemographicReportFilter(AgeGenderDemographicReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputArrayOfstring(dataObject.getLanguageCode());
        }
    }
    static void outputArrayOfAgeGenderDemographicReportFilter(ArrayList<AgeGenderDemographicReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AgeGenderDemographicReportFilter dataObject : dataObjects)
            {
                outputAgeGenderDemographicReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAgeGenderDemographicReportRequest(AgeGenderDemographicReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfAgeGenderDemographicReportColumn(dataObject.getColumns());
            outputAgeGenderDemographicReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfAgeGenderDemographicReportRequest(ArrayList<AgeGenderDemographicReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AgeGenderDemographicReportRequest dataObject : dataObjects)
            {
                outputAgeGenderDemographicReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputApiFaultDetail(ApiFaultDetail dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfBatchError(dataObject.getBatchErrors());
            outputArrayOfOperationError(dataObject.getOperationErrors());
        }
    }
    static void outputArrayOfApiFaultDetail(ArrayList<ApiFaultDetail> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApiFaultDetail dataObject : dataObjects)
            {
                outputApiFaultDetail(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputApplicationFault(ApplicationFault dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("TrackingId: %s", dataObject.getTrackingId()));
            if(dataObject instanceof AdApiFaultDetail)
            {
                outputAdApiFaultDetail((AdApiFaultDetail)dataObject);
            }
            if(dataObject instanceof ApiFaultDetail)
            {
                outputApiFaultDetail((ApiFaultDetail)dataObject);
            }
        }
    }
    static void outputArrayOfApplicationFault(ArrayList<ApplicationFault> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApplicationFault dataObject : dataObjects)
            {
                outputApplicationFault(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAudiencePerformanceReportFilter(AudiencePerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
        }
    }
    static void outputArrayOfAudiencePerformanceReportFilter(ArrayList<AudiencePerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AudiencePerformanceReportFilter dataObject : dataObjects)
            {
                outputAudiencePerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputAudiencePerformanceReportRequest(AudiencePerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfAudiencePerformanceReportColumn(dataObject.getColumns());
            outputAudiencePerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfAudiencePerformanceReportRequest(ArrayList<AudiencePerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AudiencePerformanceReportRequest dataObject : dataObjects)
            {
                outputAudiencePerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputBatchError(BatchError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Details: %s", dataObject.getDetails()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("Index: %s", dataObject.getIndex()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
        }
    }
    static void outputArrayOfBatchError(ArrayOfBatchError dataObjects)
    {
        if (null != dataObjects)
        {
            for (BatchError dataObject : dataObjects.getBatchErrors())
            {
                outputBatchError(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputBudgetSummaryReportRequest(BudgetSummaryReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfBudgetSummaryReportColumn(dataObject.getColumns());
            outputAccountThroughCampaignReportScope(dataObject.getScope());
            outputBudgetSummaryReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfBudgetSummaryReportRequest(ArrayList<BudgetSummaryReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (BudgetSummaryReportRequest dataObject : dataObjects)
            {
                outputBudgetSummaryReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputBudgetSummaryReportTime(BudgetSummaryReportTime dataObject)
    {
        if (null != dataObject)
        {
            outputDate(dataObject.getCustomDateRangeEnd());
            outputDate(dataObject.getCustomDateRangeStart());
            outputStatusMessage(String.format("PredefinedTime: %s", dataObject.getPredefinedTime()));
        }
    }
    static void outputArrayOfBudgetSummaryReportTime(ArrayList<BudgetSummaryReportTime> dataObjects)
    {
        if (null != dataObjects)
        {
            for (BudgetSummaryReportTime dataObject : dataObjects)
            {
                outputBudgetSummaryReportTime(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputCallDetailReportFilter(CallDetailReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
        }
    }
    static void outputArrayOfCallDetailReportFilter(ArrayList<CallDetailReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CallDetailReportFilter dataObject : dataObjects)
            {
                outputCallDetailReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputCallDetailReportRequest(CallDetailReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfCallDetailReportColumn(dataObject.getColumns());
            outputCallDetailReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfCallDetailReportRequest(ArrayList<CallDetailReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CallDetailReportRequest dataObject : dataObjects)
            {
                outputCallDetailReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputCampaignPerformanceReportFilter(CampaignPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("DeviceOS: %s", dataObject.getDeviceOS()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
        }
    }
    static void outputArrayOfCampaignPerformanceReportFilter(ArrayList<CampaignPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CampaignPerformanceReportFilter dataObject : dataObjects)
            {
                outputCampaignPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputCampaignPerformanceReportRequest(CampaignPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfCampaignPerformanceReportColumn(dataObject.getColumns());
            outputCampaignPerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughCampaignReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfCampaignPerformanceReportRequest(ArrayList<CampaignPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CampaignPerformanceReportRequest dataObject : dataObjects)
            {
                outputCampaignPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputCampaignReportScope(CampaignReportScope dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountId: %s", dataObject.getAccountId()));
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
        }
    }
    static void outputArrayOfCampaignReportScope(ArrayOfCampaignReportScope dataObjects)
    {
        if (null != dataObjects)
        {
            for (CampaignReportScope dataObject : dataObjects.getCampaignReportScopes())
            {
                outputCampaignReportScope(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputConversionPerformanceReportFilter(ConversionPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage(String.format("KeywordStatus: %s", dataObject.getKeywordStatus()));
            outputArrayOfstring(dataObject.getKeywords());
        }
    }
    static void outputArrayOfConversionPerformanceReportFilter(ArrayList<ConversionPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ConversionPerformanceReportFilter dataObject : dataObjects)
            {
                outputConversionPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputConversionPerformanceReportRequest(ConversionPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfConversionPerformanceReportColumn(dataObject.getColumns());
            outputConversionPerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfConversionPerformanceReportRequest(ArrayList<ConversionPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ConversionPerformanceReportRequest dataObject : dataObjects)
            {
                outputConversionPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputDate(Date dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Day: %s", dataObject.getDay()));
            outputStatusMessage(String.format("Month: %s", dataObject.getMonth()));
            outputStatusMessage(String.format("Year: %s", dataObject.getYear()));
        }
    }
    static void outputArrayOfDate(ArrayList<Date> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Date dataObject : dataObjects)
            {
                outputDate(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputDestinationUrlPerformanceReportFilter(DestinationUrlPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputArrayOfstring(dataObject.getLanguageCode());
        }
    }
    static void outputArrayOfDestinationUrlPerformanceReportFilter(ArrayList<DestinationUrlPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DestinationUrlPerformanceReportFilter dataObject : dataObjects)
            {
                outputDestinationUrlPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputDestinationUrlPerformanceReportRequest(DestinationUrlPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfDestinationUrlPerformanceReportColumn(dataObject.getColumns());
            outputDestinationUrlPerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfDestinationUrlPerformanceReportRequest(ArrayList<DestinationUrlPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DestinationUrlPerformanceReportRequest dataObject : dataObjects)
            {
                outputDestinationUrlPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputDSAAutoTargetPerformanceReportFilter(DSAAutoTargetPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("BidStrategyType: %s", dataObject.getBidStrategyType()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DynamicAdTargetStatus: %s", dataObject.getDynamicAdTargetStatus()));
            outputArrayOfstring(dataObject.getLanguageCode());
        }
    }
    static void outputArrayOfDSAAutoTargetPerformanceReportFilter(ArrayList<DSAAutoTargetPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DSAAutoTargetPerformanceReportFilter dataObject : dataObjects)
            {
                outputDSAAutoTargetPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputDSAAutoTargetPerformanceReportRequest(DSAAutoTargetPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfDSAAutoTargetPerformanceReportColumn(dataObject.getColumns());
            outputDSAAutoTargetPerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfDSAAutoTargetPerformanceReportRequest(ArrayList<DSAAutoTargetPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DSAAutoTargetPerformanceReportRequest dataObject : dataObjects)
            {
                outputDSAAutoTargetPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputDSACategoryPerformanceReportFilter(DSACategoryPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputArrayOfstring(dataObject.getLanguageCode());
        }
    }
    static void outputArrayOfDSACategoryPerformanceReportFilter(ArrayList<DSACategoryPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DSACategoryPerformanceReportFilter dataObject : dataObjects)
            {
                outputDSACategoryPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputDSACategoryPerformanceReportRequest(DSACategoryPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfDSACategoryPerformanceReportColumn(dataObject.getColumns());
            outputDSACategoryPerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfDSACategoryPerformanceReportRequest(ArrayList<DSACategoryPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DSACategoryPerformanceReportRequest dataObject : dataObjects)
            {
                outputDSACategoryPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputDSASearchQueryPerformanceReportFilter(DSASearchQueryPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("ExcludeZeroClicks: %s", dataObject.getExcludeZeroClicks()));
            outputArrayOfstring(dataObject.getLanguageCode());
            outputArrayOfstring(dataObject.getSearchQueries());
        }
    }
    static void outputArrayOfDSASearchQueryPerformanceReportFilter(ArrayList<DSASearchQueryPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DSASearchQueryPerformanceReportFilter dataObject : dataObjects)
            {
                outputDSASearchQueryPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputDSASearchQueryPerformanceReportRequest(DSASearchQueryPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfDSASearchQueryPerformanceReportColumn(dataObject.getColumns());
            outputDSASearchQueryPerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfDSASearchQueryPerformanceReportRequest(ArrayList<DSASearchQueryPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DSASearchQueryPerformanceReportRequest dataObject : dataObjects)
            {
                outputDSASearchQueryPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputGeographicPerformanceReportFilter(GeographicPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputArrayOfstring(dataObject.getCountryCode());
            outputArrayOfstring(dataObject.getLanguageCode());
        }
    }
    static void outputArrayOfGeographicPerformanceReportFilter(ArrayList<GeographicPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (GeographicPerformanceReportFilter dataObject : dataObjects)
            {
                outputGeographicPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputGeographicPerformanceReportRequest(GeographicPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfGeographicPerformanceReportColumn(dataObject.getColumns());
            outputGeographicPerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfGeographicPerformanceReportRequest(ArrayList<GeographicPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (GeographicPerformanceReportRequest dataObject : dataObjects)
            {
                outputGeographicPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputGoalsAndFunnelsReportFilter(GoalsAndFunnelsReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceOS: %s", dataObject.getDeviceOS()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputArrayOflong(dataObject.getGoalIds());
            outputStatusMessage(String.format("KeywordStatus: %s", dataObject.getKeywordStatus()));
        }
    }
    static void outputArrayOfGoalsAndFunnelsReportFilter(ArrayList<GoalsAndFunnelsReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (GoalsAndFunnelsReportFilter dataObject : dataObjects)
            {
                outputGoalsAndFunnelsReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputGoalsAndFunnelsReportRequest(GoalsAndFunnelsReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfGoalsAndFunnelsReportColumn(dataObject.getColumns());
            outputGoalsAndFunnelsReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfGoalsAndFunnelsReportRequest(ArrayList<GoalsAndFunnelsReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (GoalsAndFunnelsReportRequest dataObject : dataObjects)
            {
                outputGoalsAndFunnelsReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordPerformanceReportFilter(KeywordPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputArrayOfint(dataObject.getAdRelevance());
            outputStatusMessage(String.format("AdType: %s", dataObject.getAdType()));
            outputStatusMessage(String.format("BidMatchType: %s", dataObject.getBidMatchType()));
            outputStatusMessage(String.format("BidStrategyType: %s", dataObject.getBidStrategyType()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeliveredMatchType: %s", dataObject.getDeliveredMatchType()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputArrayOfint(dataObject.getExpectedCtr());
            outputStatusMessage(String.format("KeywordStatus: %s", dataObject.getKeywordStatus()));
            outputArrayOfstring(dataObject.getKeywords());
            outputArrayOfint(dataObject.getLandingPageExperience());
            outputArrayOfstring(dataObject.getLanguageCode());
            outputArrayOfint(dataObject.getQualityScore());
        }
    }
    static void outputArrayOfKeywordPerformanceReportFilter(ArrayList<KeywordPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordPerformanceReportFilter dataObject : dataObjects)
            {
                outputKeywordPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordPerformanceReportRequest(KeywordPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfKeywordPerformanceReportColumn(dataObject.getColumns());
            outputKeywordPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage(String.format("MaxRows: %s", dataObject.getMaxRows()));
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputArrayOfKeywordPerformanceReportSort(dataObject.getSort());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfKeywordPerformanceReportRequest(ArrayList<KeywordPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordPerformanceReportRequest dataObject : dataObjects)
            {
                outputKeywordPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeywordPerformanceReportSort(KeywordPerformanceReportSort dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("SortColumn: %s", dataObject.getSortColumn()));
            outputStatusMessage(String.format("SortOrder: %s", dataObject.getSortOrder()));
        }
    }
    static void outputArrayOfKeywordPerformanceReportSort(ArrayOfKeywordPerformanceReportSort dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordPerformanceReportSort dataObject : dataObjects.getKeywordPerformanceReportSorts())
            {
                outputKeywordPerformanceReportSort(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputNegativeKeywordConflictReportFilter(NegativeKeywordConflictReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("KeywordStatus: %s", dataObject.getKeywordStatus()));
        }
    }
    static void outputArrayOfNegativeKeywordConflictReportFilter(ArrayList<NegativeKeywordConflictReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (NegativeKeywordConflictReportFilter dataObject : dataObjects)
            {
                outputNegativeKeywordConflictReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputNegativeKeywordConflictReportRequest(NegativeKeywordConflictReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfNegativeKeywordConflictReportColumn(dataObject.getColumns());
            outputNegativeKeywordConflictReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
        }
    }
    static void outputArrayOfNegativeKeywordConflictReportRequest(ArrayList<NegativeKeywordConflictReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (NegativeKeywordConflictReportRequest dataObject : dataObjects)
            {
                outputNegativeKeywordConflictReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputOperationError(OperationError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Details: %s", dataObject.getDetails()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
        }
    }
    static void outputArrayOfOperationError(ArrayOfOperationError dataObjects)
    {
        if (null != dataObjects)
        {
            for (OperationError dataObject : dataObjects.getOperationErrors())
            {
                outputOperationError(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputProductDimensionPerformanceReportFilter(ProductDimensionPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputArrayOfstring(dataObject.getLanguageCode());
        }
    }
    static void outputArrayOfProductDimensionPerformanceReportFilter(ArrayList<ProductDimensionPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductDimensionPerformanceReportFilter dataObject : dataObjects)
            {
                outputProductDimensionPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputProductDimensionPerformanceReportRequest(ProductDimensionPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfProductDimensionPerformanceReportColumn(dataObject.getColumns());
            outputProductDimensionPerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfProductDimensionPerformanceReportRequest(ArrayList<ProductDimensionPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductDimensionPerformanceReportRequest dataObject : dataObjects)
            {
                outputProductDimensionPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputProductPartitionPerformanceReportFilter(ProductPartitionPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputArrayOfstring(dataObject.getLanguageCode());
        }
    }
    static void outputArrayOfProductPartitionPerformanceReportFilter(ArrayList<ProductPartitionPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductPartitionPerformanceReportFilter dataObject : dataObjects)
            {
                outputProductPartitionPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputProductPartitionPerformanceReportRequest(ProductPartitionPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfProductPartitionPerformanceReportColumn(dataObject.getColumns());
            outputProductPartitionPerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfProductPartitionPerformanceReportRequest(ArrayList<ProductPartitionPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductPartitionPerformanceReportRequest dataObject : dataObjects)
            {
                outputProductPartitionPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputProductPartitionUnitPerformanceReportFilter(ProductPartitionUnitPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputArrayOfstring(dataObject.getLanguageCode());
        }
    }
    static void outputArrayOfProductPartitionUnitPerformanceReportFilter(ArrayList<ProductPartitionUnitPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductPartitionUnitPerformanceReportFilter dataObject : dataObjects)
            {
                outputProductPartitionUnitPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputProductPartitionUnitPerformanceReportRequest(ProductPartitionUnitPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfProductPartitionUnitPerformanceReportColumn(dataObject.getColumns());
            outputProductPartitionUnitPerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfProductPartitionUnitPerformanceReportRequest(ArrayList<ProductPartitionUnitPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductPartitionUnitPerformanceReportRequest dataObject : dataObjects)
            {
                outputProductPartitionUnitPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputProductSearchQueryPerformanceReportFilter(ProductSearchQueryPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("AdType: %s", dataObject.getAdType()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("ExcludeZeroClicks: %s", dataObject.getExcludeZeroClicks()));
            outputArrayOfstring(dataObject.getLanguageCode());
            outputArrayOfstring(dataObject.getSearchQueries());
        }
    }
    static void outputArrayOfProductSearchQueryPerformanceReportFilter(ArrayList<ProductSearchQueryPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductSearchQueryPerformanceReportFilter dataObject : dataObjects)
            {
                outputProductSearchQueryPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputProductSearchQueryPerformanceReportRequest(ProductSearchQueryPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfProductSearchQueryPerformanceReportColumn(dataObject.getColumns());
            outputProductSearchQueryPerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfProductSearchQueryPerformanceReportRequest(ArrayList<ProductSearchQueryPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductSearchQueryPerformanceReportRequest dataObject : dataObjects)
            {
                outputProductSearchQueryPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputPublisherUsagePerformanceReportFilter(PublisherUsagePerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputArrayOfstring(dataObject.getLanguageCode());
        }
    }
    static void outputArrayOfPublisherUsagePerformanceReportFilter(ArrayList<PublisherUsagePerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (PublisherUsagePerformanceReportFilter dataObject : dataObjects)
            {
                outputPublisherUsagePerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputPublisherUsagePerformanceReportRequest(PublisherUsagePerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfPublisherUsagePerformanceReportColumn(dataObject.getColumns());
            outputPublisherUsagePerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfPublisherUsagePerformanceReportRequest(ArrayList<PublisherUsagePerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (PublisherUsagePerformanceReportRequest dataObject : dataObjects)
            {
                outputPublisherUsagePerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputReportRequest(ReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("ExcludeColumnHeaders: %s", dataObject.getExcludeColumnHeaders()));
            outputStatusMessage(String.format("ExcludeReportFooter: %s", dataObject.getExcludeReportFooter()));
            outputStatusMessage(String.format("ExcludeReportHeader: %s", dataObject.getExcludeReportHeader()));
            outputStatusMessage(String.format("Format: %s", dataObject.getFormat()));
            outputStatusMessage(String.format("Language: %s", dataObject.getLanguage()));
            outputStatusMessage(String.format("ReportName: %s", dataObject.getReportName()));
            outputStatusMessage(String.format("ReturnOnlyCompleteData: %s", dataObject.getReturnOnlyCompleteData()));
            if(dataObject instanceof AccountPerformanceReportRequest)
            {
                outputAccountPerformanceReportRequest((AccountPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof AdDynamicTextPerformanceReportRequest)
            {
                outputAdDynamicTextPerformanceReportRequest((AdDynamicTextPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof AdExtensionByAdReportRequest)
            {
                outputAdExtensionByAdReportRequest((AdExtensionByAdReportRequest)dataObject);
            }
            if(dataObject instanceof AdExtensionByKeywordReportRequest)
            {
                outputAdExtensionByKeywordReportRequest((AdExtensionByKeywordReportRequest)dataObject);
            }
            if(dataObject instanceof AdExtensionDetailReportRequest)
            {
                outputAdExtensionDetailReportRequest((AdExtensionDetailReportRequest)dataObject);
            }
            if(dataObject instanceof AdGroupPerformanceReportRequest)
            {
                outputAdGroupPerformanceReportRequest((AdGroupPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof AdPerformanceReportRequest)
            {
                outputAdPerformanceReportRequest((AdPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof AgeGenderDemographicReportRequest)
            {
                outputAgeGenderDemographicReportRequest((AgeGenderDemographicReportRequest)dataObject);
            }
            if(dataObject instanceof AudiencePerformanceReportRequest)
            {
                outputAudiencePerformanceReportRequest((AudiencePerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof BudgetSummaryReportRequest)
            {
                outputBudgetSummaryReportRequest((BudgetSummaryReportRequest)dataObject);
            }
            if(dataObject instanceof CallDetailReportRequest)
            {
                outputCallDetailReportRequest((CallDetailReportRequest)dataObject);
            }
            if(dataObject instanceof CampaignPerformanceReportRequest)
            {
                outputCampaignPerformanceReportRequest((CampaignPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof ConversionPerformanceReportRequest)
            {
                outputConversionPerformanceReportRequest((ConversionPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof DestinationUrlPerformanceReportRequest)
            {
                outputDestinationUrlPerformanceReportRequest((DestinationUrlPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof DSAAutoTargetPerformanceReportRequest)
            {
                outputDSAAutoTargetPerformanceReportRequest((DSAAutoTargetPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof DSACategoryPerformanceReportRequest)
            {
                outputDSACategoryPerformanceReportRequest((DSACategoryPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof DSASearchQueryPerformanceReportRequest)
            {
                outputDSASearchQueryPerformanceReportRequest((DSASearchQueryPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof GeographicPerformanceReportRequest)
            {
                outputGeographicPerformanceReportRequest((GeographicPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof GoalsAndFunnelsReportRequest)
            {
                outputGoalsAndFunnelsReportRequest((GoalsAndFunnelsReportRequest)dataObject);
            }
            if(dataObject instanceof KeywordPerformanceReportRequest)
            {
                outputKeywordPerformanceReportRequest((KeywordPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof NegativeKeywordConflictReportRequest)
            {
                outputNegativeKeywordConflictReportRequest((NegativeKeywordConflictReportRequest)dataObject);
            }
            if(dataObject instanceof ProductDimensionPerformanceReportRequest)
            {
                outputProductDimensionPerformanceReportRequest((ProductDimensionPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof ProductPartitionPerformanceReportRequest)
            {
                outputProductPartitionPerformanceReportRequest((ProductPartitionPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof ProductPartitionUnitPerformanceReportRequest)
            {
                outputProductPartitionUnitPerformanceReportRequest((ProductPartitionUnitPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof ProductSearchQueryPerformanceReportRequest)
            {
                outputProductSearchQueryPerformanceReportRequest((ProductSearchQueryPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof PublisherUsagePerformanceReportRequest)
            {
                outputPublisherUsagePerformanceReportRequest((PublisherUsagePerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof SearchCampaignChangeHistoryReportRequest)
            {
                outputSearchCampaignChangeHistoryReportRequest((SearchCampaignChangeHistoryReportRequest)dataObject);
            }
            if(dataObject instanceof SearchQueryPerformanceReportRequest)
            {
                outputSearchQueryPerformanceReportRequest((SearchQueryPerformanceReportRequest)dataObject);
            }
            if(dataObject instanceof ShareOfVoiceReportRequest)
            {
                outputShareOfVoiceReportRequest((ShareOfVoiceReportRequest)dataObject);
            }
            if(dataObject instanceof UserLocationPerformanceReportRequest)
            {
                outputUserLocationPerformanceReportRequest((UserLocationPerformanceReportRequest)dataObject);
            }
        }
    }
    static void outputArrayOfReportRequest(ArrayList<ReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ReportRequest dataObject : dataObjects)
            {
                outputReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputReportRequestStatus(ReportRequestStatus dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("ReportDownloadUrl: %s", dataObject.getReportDownloadUrl()));
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
        }
    }
    static void outputArrayOfReportRequestStatus(ArrayList<ReportRequestStatus> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ReportRequestStatus dataObject : dataObjects)
            {
                outputReportRequestStatus(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputReportTime(ReportTime dataObject)
    {
        if (null != dataObject)
        {
            outputDate(dataObject.getCustomDateRangeEnd());
            outputDate(dataObject.getCustomDateRangeStart());
            outputStatusMessage(String.format("PredefinedTime: %s", dataObject.getPredefinedTime()));
        }
    }
    static void outputArrayOfReportTime(ArrayList<ReportTime> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ReportTime dataObject : dataObjects)
            {
                outputReportTime(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputSearchCampaignChangeHistoryReportFilter(SearchCampaignChangeHistoryReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("HowChanged: %s", dataObject.getHowChanged()));
            outputStatusMessage(String.format("ItemChanged: %s", dataObject.getItemChanged()));
        }
    }
    static void outputArrayOfSearchCampaignChangeHistoryReportFilter(ArrayList<SearchCampaignChangeHistoryReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (SearchCampaignChangeHistoryReportFilter dataObject : dataObjects)
            {
                outputSearchCampaignChangeHistoryReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputSearchCampaignChangeHistoryReportRequest(SearchCampaignChangeHistoryReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfSearchCampaignChangeHistoryReportColumn(dataObject.getColumns());
            outputSearchCampaignChangeHistoryReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfSearchCampaignChangeHistoryReportRequest(ArrayList<SearchCampaignChangeHistoryReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (SearchCampaignChangeHistoryReportRequest dataObject : dataObjects)
            {
                outputSearchCampaignChangeHistoryReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputSearchQueryPerformanceReportFilter(SearchQueryPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("AdType: %s", dataObject.getAdType()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeliveredMatchType: %s", dataObject.getDeliveredMatchType()));
            outputStatusMessage(String.format("ExcludeZeroClicks: %s", dataObject.getExcludeZeroClicks()));
            outputStatusMessage(String.format("KeywordStatus: %s", dataObject.getKeywordStatus()));
            outputArrayOfstring(dataObject.getLanguageCode());
            outputArrayOfstring(dataObject.getSearchQueries());
        }
    }
    static void outputArrayOfSearchQueryPerformanceReportFilter(ArrayList<SearchQueryPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (SearchQueryPerformanceReportFilter dataObject : dataObjects)
            {
                outputSearchQueryPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputSearchQueryPerformanceReportRequest(SearchQueryPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfSearchQueryPerformanceReportColumn(dataObject.getColumns());
            outputSearchQueryPerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfSearchQueryPerformanceReportRequest(ArrayList<SearchQueryPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (SearchQueryPerformanceReportRequest dataObject : dataObjects)
            {
                outputSearchQueryPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputShareOfVoiceReportFilter(ShareOfVoiceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("BidMatchType: %s", dataObject.getBidMatchType()));
            outputStatusMessage(String.format("BidStrategyType: %s", dataObject.getBidStrategyType()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeliveredMatchType: %s", dataObject.getDeliveredMatchType()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage(String.format("KeywordStatus: %s", dataObject.getKeywordStatus()));
            outputArrayOfstring(dataObject.getKeywords());
            outputArrayOfstring(dataObject.getLanguageCode());
        }
    }
    static void outputArrayOfShareOfVoiceReportFilter(ArrayList<ShareOfVoiceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ShareOfVoiceReportFilter dataObject : dataObjects)
            {
                outputShareOfVoiceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputShareOfVoiceReportRequest(ShareOfVoiceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfShareOfVoiceReportColumn(dataObject.getColumns());
            outputShareOfVoiceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfShareOfVoiceReportRequest(ArrayList<ShareOfVoiceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ShareOfVoiceReportRequest dataObject : dataObjects)
            {
                outputShareOfVoiceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputUserLocationPerformanceReportFilter(UserLocationPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputArrayOfstring(dataObject.getCountryCode());
            outputArrayOfstring(dataObject.getLanguageCode());
        }
    }
    static void outputArrayOfUserLocationPerformanceReportFilter(ArrayList<UserLocationPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (UserLocationPerformanceReportFilter dataObject : dataObjects)
            {
                outputUserLocationPerformanceReportFilter(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputUserLocationPerformanceReportRequest(UserLocationPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputArrayOfUserLocationPerformanceReportColumn(dataObject.getColumns());
            outputUserLocationPerformanceReportFilter(dataObject.getFilter());
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputReportTime(dataObject.getTime());
        }
    }
    static void outputArrayOfUserLocationPerformanceReportRequest(ArrayList<UserLocationPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (UserLocationPerformanceReportRequest dataObject : dataObjects)
            {
                outputUserLocationPerformanceReportRequest(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputReportFormat(ReportFormat valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ReportFormat value : ReportFormat.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfReportFormat(ArrayList<ReportFormat> valueSets)
    {
        if (null != valueSets)
        {
            for (ReportFormat valueSet : valueSets)
            {
                outputReportFormat(valueSet);
            }
        }
    }
    static void outputReportLanguage(ReportLanguage valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ReportLanguage value : ReportLanguage.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfReportLanguage(ArrayList<ReportLanguage> valueSets)
    {
        if (null != valueSets)
        {
            for (ReportLanguage valueSet : valueSets)
            {
                outputReportLanguage(valueSet);
            }
        }
    }
    static void outputReportAggregation(ReportAggregation valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ReportAggregation value : ReportAggregation.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfReportAggregation(ArrayList<ReportAggregation> valueSets)
    {
        if (null != valueSets)
        {
            for (ReportAggregation valueSet : valueSets)
            {
                outputReportAggregation(valueSet);
            }
        }
    }
    static void outputAccountPerformanceReportColumn(AccountPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AccountPerformanceReportColumn value : AccountPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAccountPerformanceReportColumn(ArrayOfAccountPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (AccountPerformanceReportColumn valueSet : valueSets.getAccountPerformanceReportColumns())
            {
                outputAccountPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputAccountStatusReportFilter(AccountStatusReportFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AccountStatusReportFilter value : AccountStatusReportFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAccountStatusReportFilter(ArrayList<AccountStatusReportFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (AccountStatusReportFilter valueSet : valueSets)
            {
                outputAccountStatusReportFilter(valueSet);
            }
        }
    }
    static void outputAdDistributionReportFilter(AdDistributionReportFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdDistributionReportFilter value : AdDistributionReportFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdDistributionReportFilter(ArrayList<AdDistributionReportFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (AdDistributionReportFilter valueSet : valueSets)
            {
                outputAdDistributionReportFilter(valueSet);
            }
        }
    }
    static void outputDeviceOSReportFilter(DeviceOSReportFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (DeviceOSReportFilter value : DeviceOSReportFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfDeviceOSReportFilter(ArrayList<DeviceOSReportFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (DeviceOSReportFilter valueSet : valueSets)
            {
                outputDeviceOSReportFilter(valueSet);
            }
        }
    }
    static void outputDeviceTypeReportFilter(DeviceTypeReportFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (DeviceTypeReportFilter value : DeviceTypeReportFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfDeviceTypeReportFilter(ArrayList<DeviceTypeReportFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (DeviceTypeReportFilter valueSet : valueSets)
            {
                outputDeviceTypeReportFilter(valueSet);
            }
        }
    }
    static void outputReportTimePeriod(ReportTimePeriod valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ReportTimePeriod value : ReportTimePeriod.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfReportTimePeriod(ArrayList<ReportTimePeriod> valueSets)
    {
        if (null != valueSets)
        {
            for (ReportTimePeriod valueSet : valueSets)
            {
                outputReportTimePeriod(valueSet);
            }
        }
    }
    static void outputCampaignPerformanceReportColumn(CampaignPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CampaignPerformanceReportColumn value : CampaignPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCampaignPerformanceReportColumn(ArrayOfCampaignPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (CampaignPerformanceReportColumn valueSet : valueSets.getCampaignPerformanceReportColumns())
            {
                outputCampaignPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputCampaignStatusReportFilter(CampaignStatusReportFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CampaignStatusReportFilter value : CampaignStatusReportFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCampaignStatusReportFilter(ArrayList<CampaignStatusReportFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (CampaignStatusReportFilter valueSet : valueSets)
            {
                outputCampaignStatusReportFilter(valueSet);
            }
        }
    }
    static void outputNonHourlyReportAggregation(NonHourlyReportAggregation valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (NonHourlyReportAggregation value : NonHourlyReportAggregation.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfNonHourlyReportAggregation(ArrayList<NonHourlyReportAggregation> valueSets)
    {
        if (null != valueSets)
        {
            for (NonHourlyReportAggregation valueSet : valueSets)
            {
                outputNonHourlyReportAggregation(valueSet);
            }
        }
    }
    static void outputAdDynamicTextPerformanceReportColumn(AdDynamicTextPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdDynamicTextPerformanceReportColumn value : AdDynamicTextPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdDynamicTextPerformanceReportColumn(ArrayOfAdDynamicTextPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (AdDynamicTextPerformanceReportColumn valueSet : valueSets.getAdDynamicTextPerformanceReportColumns())
            {
                outputAdDynamicTextPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputAdGroupStatusReportFilter(AdGroupStatusReportFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdGroupStatusReportFilter value : AdGroupStatusReportFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdGroupStatusReportFilter(ArrayList<AdGroupStatusReportFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (AdGroupStatusReportFilter valueSet : valueSets)
            {
                outputAdGroupStatusReportFilter(valueSet);
            }
        }
    }
    static void outputAdStatusReportFilter(AdStatusReportFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdStatusReportFilter value : AdStatusReportFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdStatusReportFilter(ArrayList<AdStatusReportFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (AdStatusReportFilter valueSet : valueSets)
            {
                outputAdStatusReportFilter(valueSet);
            }
        }
    }
    static void outputAdTypeReportFilter(AdTypeReportFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdTypeReportFilter value : AdTypeReportFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdTypeReportFilter(ArrayList<AdTypeReportFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (AdTypeReportFilter valueSet : valueSets)
            {
                outputAdTypeReportFilter(valueSet);
            }
        }
    }
    static void outputKeywordStatusReportFilter(KeywordStatusReportFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (KeywordStatusReportFilter value : KeywordStatusReportFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfKeywordStatusReportFilter(ArrayList<KeywordStatusReportFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (KeywordStatusReportFilter valueSet : valueSets)
            {
                outputKeywordStatusReportFilter(valueSet);
            }
        }
    }
    static void outputAdGroupPerformanceReportColumn(AdGroupPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdGroupPerformanceReportColumn value : AdGroupPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdGroupPerformanceReportColumn(ArrayOfAdGroupPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (AdGroupPerformanceReportColumn valueSet : valueSets.getAdGroupPerformanceReportColumns())
            {
                outputAdGroupPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputAdPerformanceReportColumn(AdPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdPerformanceReportColumn value : AdPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdPerformanceReportColumn(ArrayOfAdPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (AdPerformanceReportColumn valueSet : valueSets.getAdPerformanceReportColumns())
            {
                outputAdPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputKeywordPerformanceReportColumn(KeywordPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (KeywordPerformanceReportColumn value : KeywordPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfKeywordPerformanceReportColumn(ArrayOfKeywordPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (KeywordPerformanceReportColumn valueSet : valueSets.getKeywordPerformanceReportColumns())
            {
                outputKeywordPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputBidMatchTypeReportFilter(BidMatchTypeReportFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (BidMatchTypeReportFilter value : BidMatchTypeReportFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfBidMatchTypeReportFilter(ArrayList<BidMatchTypeReportFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (BidMatchTypeReportFilter valueSet : valueSets)
            {
                outputBidMatchTypeReportFilter(valueSet);
            }
        }
    }
    static void outputBidStrategyTypeReportFilter(BidStrategyTypeReportFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (BidStrategyTypeReportFilter value : BidStrategyTypeReportFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfBidStrategyTypeReportFilter(ArrayList<BidStrategyTypeReportFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (BidStrategyTypeReportFilter valueSet : valueSets)
            {
                outputBidStrategyTypeReportFilter(valueSet);
            }
        }
    }
    static void outputDeliveredMatchTypeReportFilter(DeliveredMatchTypeReportFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (DeliveredMatchTypeReportFilter value : DeliveredMatchTypeReportFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfDeliveredMatchTypeReportFilter(ArrayList<DeliveredMatchTypeReportFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (DeliveredMatchTypeReportFilter valueSet : valueSets)
            {
                outputDeliveredMatchTypeReportFilter(valueSet);
            }
        }
    }
    static void outputSortOrder(SortOrder valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (SortOrder value : SortOrder.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfSortOrder(ArrayList<SortOrder> valueSets)
    {
        if (null != valueSets)
        {
            for (SortOrder valueSet : valueSets)
            {
                outputSortOrder(valueSet);
            }
        }
    }
    static void outputDestinationUrlPerformanceReportColumn(DestinationUrlPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (DestinationUrlPerformanceReportColumn value : DestinationUrlPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfDestinationUrlPerformanceReportColumn(ArrayOfDestinationUrlPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (DestinationUrlPerformanceReportColumn valueSet : valueSets.getDestinationUrlPerformanceReportColumns())
            {
                outputDestinationUrlPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputBudgetSummaryReportColumn(BudgetSummaryReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (BudgetSummaryReportColumn value : BudgetSummaryReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfBudgetSummaryReportColumn(ArrayOfBudgetSummaryReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (BudgetSummaryReportColumn valueSet : valueSets.getBudgetSummaryReportColumns())
            {
                outputBudgetSummaryReportColumn(valueSet);
            }
        }
    }
    static void outputBudgetSummaryReportTimePeriod(BudgetSummaryReportTimePeriod valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (BudgetSummaryReportTimePeriod value : BudgetSummaryReportTimePeriod.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfBudgetSummaryReportTimePeriod(ArrayList<BudgetSummaryReportTimePeriod> valueSets)
    {
        if (null != valueSets)
        {
            for (BudgetSummaryReportTimePeriod valueSet : valueSets)
            {
                outputBudgetSummaryReportTimePeriod(valueSet);
            }
        }
    }
    static void outputAgeGenderDemographicReportColumn(AgeGenderDemographicReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AgeGenderDemographicReportColumn value : AgeGenderDemographicReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAgeGenderDemographicReportColumn(ArrayOfAgeGenderDemographicReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (AgeGenderDemographicReportColumn valueSet : valueSets.getAgeGenderDemographicReportColumns())
            {
                outputAgeGenderDemographicReportColumn(valueSet);
            }
        }
    }
    static void outputUserLocationPerformanceReportColumn(UserLocationPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (UserLocationPerformanceReportColumn value : UserLocationPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfUserLocationPerformanceReportColumn(ArrayOfUserLocationPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (UserLocationPerformanceReportColumn valueSet : valueSets.getUserLocationPerformanceReportColumns())
            {
                outputUserLocationPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputPublisherUsagePerformanceReportColumn(PublisherUsagePerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (PublisherUsagePerformanceReportColumn value : PublisherUsagePerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfPublisherUsagePerformanceReportColumn(ArrayOfPublisherUsagePerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (PublisherUsagePerformanceReportColumn valueSet : valueSets.getPublisherUsagePerformanceReportColumns())
            {
                outputPublisherUsagePerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputSearchQueryReportAggregation(SearchQueryReportAggregation valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (SearchQueryReportAggregation value : SearchQueryReportAggregation.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfSearchQueryReportAggregation(ArrayList<SearchQueryReportAggregation> valueSets)
    {
        if (null != valueSets)
        {
            for (SearchQueryReportAggregation valueSet : valueSets)
            {
                outputSearchQueryReportAggregation(valueSet);
            }
        }
    }
    static void outputSearchQueryPerformanceReportColumn(SearchQueryPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (SearchQueryPerformanceReportColumn value : SearchQueryPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfSearchQueryPerformanceReportColumn(ArrayOfSearchQueryPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (SearchQueryPerformanceReportColumn valueSet : valueSets.getSearchQueryPerformanceReportColumns())
            {
                outputSearchQueryPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputConversionPerformanceReportColumn(ConversionPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ConversionPerformanceReportColumn value : ConversionPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfConversionPerformanceReportColumn(ArrayOfConversionPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (ConversionPerformanceReportColumn valueSet : valueSets.getConversionPerformanceReportColumns())
            {
                outputConversionPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputGoalsAndFunnelsReportColumn(GoalsAndFunnelsReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (GoalsAndFunnelsReportColumn value : GoalsAndFunnelsReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfGoalsAndFunnelsReportColumn(ArrayOfGoalsAndFunnelsReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (GoalsAndFunnelsReportColumn valueSet : valueSets.getGoalsAndFunnelsReportColumns())
            {
                outputGoalsAndFunnelsReportColumn(valueSet);
            }
        }
    }
    static void outputNegativeKeywordConflictReportColumn(NegativeKeywordConflictReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (NegativeKeywordConflictReportColumn value : NegativeKeywordConflictReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfNegativeKeywordConflictReportColumn(ArrayOfNegativeKeywordConflictReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (NegativeKeywordConflictReportColumn valueSet : valueSets.getNegativeKeywordConflictReportColumns())
            {
                outputNegativeKeywordConflictReportColumn(valueSet);
            }
        }
    }
    static void outputSearchCampaignChangeHistoryReportColumn(SearchCampaignChangeHistoryReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (SearchCampaignChangeHistoryReportColumn value : SearchCampaignChangeHistoryReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfSearchCampaignChangeHistoryReportColumn(ArrayOfSearchCampaignChangeHistoryReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (SearchCampaignChangeHistoryReportColumn valueSet : valueSets.getSearchCampaignChangeHistoryReportColumns())
            {
                outputSearchCampaignChangeHistoryReportColumn(valueSet);
            }
        }
    }
    static void outputChangeTypeReportFilter(ChangeTypeReportFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ChangeTypeReportFilter value : ChangeTypeReportFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfChangeTypeReportFilter(ArrayList<ChangeTypeReportFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (ChangeTypeReportFilter valueSet : valueSets)
            {
                outputChangeTypeReportFilter(valueSet);
            }
        }
    }
    static void outputChangeEntityReportFilter(ChangeEntityReportFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ChangeEntityReportFilter value : ChangeEntityReportFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfChangeEntityReportFilter(ArrayList<ChangeEntityReportFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (ChangeEntityReportFilter valueSet : valueSets)
            {
                outputChangeEntityReportFilter(valueSet);
            }
        }
    }
    static void outputAdExtensionByAdReportColumn(AdExtensionByAdReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdExtensionByAdReportColumn value : AdExtensionByAdReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdExtensionByAdReportColumn(ArrayOfAdExtensionByAdReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (AdExtensionByAdReportColumn valueSet : valueSets.getAdExtensionByAdReportColumns())
            {
                outputAdExtensionByAdReportColumn(valueSet);
            }
        }
    }
    static void outputAdExtensionByKeywordReportColumn(AdExtensionByKeywordReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdExtensionByKeywordReportColumn value : AdExtensionByKeywordReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdExtensionByKeywordReportColumn(ArrayOfAdExtensionByKeywordReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (AdExtensionByKeywordReportColumn valueSet : valueSets.getAdExtensionByKeywordReportColumns())
            {
                outputAdExtensionByKeywordReportColumn(valueSet);
            }
        }
    }
    static void outputAudiencePerformanceReportColumn(AudiencePerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AudiencePerformanceReportColumn value : AudiencePerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAudiencePerformanceReportColumn(ArrayOfAudiencePerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (AudiencePerformanceReportColumn valueSet : valueSets.getAudiencePerformanceReportColumns())
            {
                outputAudiencePerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputAdExtensionDetailReportColumn(AdExtensionDetailReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AdExtensionDetailReportColumn value : AdExtensionDetailReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAdExtensionDetailReportColumn(ArrayOfAdExtensionDetailReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (AdExtensionDetailReportColumn valueSet : valueSets.getAdExtensionDetailReportColumns())
            {
                outputAdExtensionDetailReportColumn(valueSet);
            }
        }
    }
    static void outputShareOfVoiceReportColumn(ShareOfVoiceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ShareOfVoiceReportColumn value : ShareOfVoiceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfShareOfVoiceReportColumn(ArrayOfShareOfVoiceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (ShareOfVoiceReportColumn valueSet : valueSets.getShareOfVoiceReportColumns())
            {
                outputShareOfVoiceReportColumn(valueSet);
            }
        }
    }
    static void outputProductDimensionPerformanceReportColumn(ProductDimensionPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ProductDimensionPerformanceReportColumn value : ProductDimensionPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfProductDimensionPerformanceReportColumn(ArrayOfProductDimensionPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (ProductDimensionPerformanceReportColumn valueSet : valueSets.getProductDimensionPerformanceReportColumns())
            {
                outputProductDimensionPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputProductPartitionPerformanceReportColumn(ProductPartitionPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ProductPartitionPerformanceReportColumn value : ProductPartitionPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfProductPartitionPerformanceReportColumn(ArrayOfProductPartitionPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (ProductPartitionPerformanceReportColumn valueSet : valueSets.getProductPartitionPerformanceReportColumns())
            {
                outputProductPartitionPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputProductPartitionUnitPerformanceReportColumn(ProductPartitionUnitPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ProductPartitionUnitPerformanceReportColumn value : ProductPartitionUnitPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfProductPartitionUnitPerformanceReportColumn(ArrayOfProductPartitionUnitPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (ProductPartitionUnitPerformanceReportColumn valueSet : valueSets.getProductPartitionUnitPerformanceReportColumns())
            {
                outputProductPartitionUnitPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputProductSearchQueryPerformanceReportColumn(ProductSearchQueryPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ProductSearchQueryPerformanceReportColumn value : ProductSearchQueryPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfProductSearchQueryPerformanceReportColumn(ArrayOfProductSearchQueryPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (ProductSearchQueryPerformanceReportColumn valueSet : valueSets.getProductSearchQueryPerformanceReportColumns())
            {
                outputProductSearchQueryPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputCallDetailReportColumn(CallDetailReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CallDetailReportColumn value : CallDetailReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCallDetailReportColumn(ArrayOfCallDetailReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (CallDetailReportColumn valueSet : valueSets.getCallDetailReportColumns())
            {
                outputCallDetailReportColumn(valueSet);
            }
        }
    }
    static void outputGeographicPerformanceReportColumn(GeographicPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (GeographicPerformanceReportColumn value : GeographicPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfGeographicPerformanceReportColumn(ArrayOfGeographicPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (GeographicPerformanceReportColumn valueSet : valueSets.getGeographicPerformanceReportColumns())
            {
                outputGeographicPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputDSASearchQueryPerformanceReportColumn(DSASearchQueryPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (DSASearchQueryPerformanceReportColumn value : DSASearchQueryPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfDSASearchQueryPerformanceReportColumn(ArrayOfDSASearchQueryPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (DSASearchQueryPerformanceReportColumn valueSet : valueSets.getDSASearchQueryPerformanceReportColumns())
            {
                outputDSASearchQueryPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputDSAAutoTargetPerformanceReportColumn(DSAAutoTargetPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (DSAAutoTargetPerformanceReportColumn value : DSAAutoTargetPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfDSAAutoTargetPerformanceReportColumn(ArrayOfDSAAutoTargetPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (DSAAutoTargetPerformanceReportColumn valueSet : valueSets.getDSAAutoTargetPerformanceReportColumns())
            {
                outputDSAAutoTargetPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputDynamicAdTargetStatusReportFilter(DynamicAdTargetStatusReportFilter valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (DynamicAdTargetStatusReportFilter value : DynamicAdTargetStatusReportFilter.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfDynamicAdTargetStatusReportFilter(ArrayList<DynamicAdTargetStatusReportFilter> valueSets)
    {
        if (null != valueSets)
        {
            for (DynamicAdTargetStatusReportFilter valueSet : valueSets)
            {
                outputDynamicAdTargetStatusReportFilter(valueSet);
            }
        }
    }
    static void outputDSACategoryPerformanceReportColumn(DSACategoryPerformanceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (DSACategoryPerformanceReportColumn value : DSACategoryPerformanceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfDSACategoryPerformanceReportColumn(ArrayOfDSACategoryPerformanceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (DSACategoryPerformanceReportColumn valueSet : valueSets.getDSACategoryPerformanceReportColumns())
            {
                outputDSACategoryPerformanceReportColumn(valueSet);
            }
        }
    }
    static void outputReportRequestStatusType(ReportRequestStatusType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ReportRequestStatusType value : ReportRequestStatusType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfReportRequestStatusType(ArrayList<ReportRequestStatusType> valueSets)
    {
        if (null != valueSets)
        {
            for (ReportRequestStatusType valueSet : valueSets)
            {
                outputReportRequestStatusType(valueSet);
            }
        }
    }
    // Prints the string to System.out
    static void outputStatusMessage(java.lang.String message)
    {
        System.out.println(message);
    }
    static void outputArrayOfstring(ArrayOfstring items)
    {
        if (null != items)
        {
            for (java.lang.String item : items.getStrings())
            {
                outputStatusMessage(String.format("Value of the string: %s", item));
            }
        }
    }
    static void outputArrayOflong(ArrayOflong items)
    {
        if (null != items)
        {
            for (java.lang.Long item : items.getLongs())
            {
                outputStatusMessage(String.format("Value of the long: %s", item));
            }
        }
    }
    static void outputArrayOfint(ArrayOfint items)
    {
        if (null != items)
        {
            for (java.lang.Integer item : items.getInts())
            {
                outputStatusMessage(String.format("Value of the int: %s", item));
            }
        }
    }
}