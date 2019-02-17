package com.microsoft.bingads.examples.v12;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;
import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.reporting.*;

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
            outputStatusMessage("* * * Begin OutputAccountPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("DeviceOS: %s", dataObject.getDeviceOS()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage("* * * End OutputAccountPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfAccountPerformanceReportFilter(ArrayList<AccountPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AccountPerformanceReportFilter dataObject : dataObjects)
            {
                outputAccountPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputAccountPerformanceReportRequest(AccountPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAccountPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfAccountPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputAccountPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputAccountPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfAccountPerformanceReportRequest(ArrayList<AccountPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AccountPerformanceReportRequest dataObject : dataObjects)
            {
                outputAccountPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputAccountReportScope(AccountReportScope dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAccountReportScope * * *");
            outputStatusMessage("AccountIds:");
            outputArrayOflong(dataObject.getAccountIds());
            outputStatusMessage("* * * End OutputAccountReportScope * * *");
        }
    }
    static void outputArrayOfAccountReportScope(ArrayList<AccountReportScope> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AccountReportScope dataObject : dataObjects)
            {
                outputAccountReportScope(dataObject);
            }
        }
    }
    static void outputAccountThroughAdGroupReportScope(AccountThroughAdGroupReportScope dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAccountThroughAdGroupReportScope * * *");
            outputStatusMessage("AccountIds:");
            outputArrayOflong(dataObject.getAccountIds());
            outputStatusMessage("AdGroups:");
            outputArrayOfAdGroupReportScope(dataObject.getAdGroups());
            outputStatusMessage("Campaigns:");
            outputArrayOfCampaignReportScope(dataObject.getCampaigns());
            outputStatusMessage("* * * End OutputAccountThroughAdGroupReportScope * * *");
        }
    }
    static void outputArrayOfAccountThroughAdGroupReportScope(ArrayList<AccountThroughAdGroupReportScope> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AccountThroughAdGroupReportScope dataObject : dataObjects)
            {
                outputAccountThroughAdGroupReportScope(dataObject);
            }
        }
    }
    static void outputAccountThroughCampaignReportScope(AccountThroughCampaignReportScope dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAccountThroughCampaignReportScope * * *");
            outputStatusMessage("AccountIds:");
            outputArrayOflong(dataObject.getAccountIds());
            outputStatusMessage("Campaigns:");
            outputArrayOfCampaignReportScope(dataObject.getCampaigns());
            outputStatusMessage("* * * End OutputAccountThroughCampaignReportScope * * *");
        }
    }
    static void outputArrayOfAccountThroughCampaignReportScope(ArrayList<AccountThroughCampaignReportScope> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AccountThroughCampaignReportScope dataObject : dataObjects)
            {
                outputAccountThroughCampaignReportScope(dataObject);
            }
        }
    }
    static void outputAdApiError(AdApiError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdApiError * * *");
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Detail: %s", dataObject.getDetail()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
            outputStatusMessage("* * * End OutputAdApiError * * *");
        }
    }
    static void outputArrayOfAdApiError(ArrayOfAdApiError dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdApiError dataObject : dataObjects.getAdApiErrors())
            {
                outputAdApiError(dataObject);
            }
        }
    }
    static void outputAdApiFaultDetail(AdApiFaultDetail dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdApiFaultDetail * * *");
            outputStatusMessage("Errors:");
            outputArrayOfAdApiError(dataObject.getErrors());
            outputStatusMessage("* * * End OutputAdApiFaultDetail * * *");
        }
    }
    static void outputArrayOfAdApiFaultDetail(ArrayList<AdApiFaultDetail> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdApiFaultDetail dataObject : dataObjects)
            {
                outputAdApiFaultDetail(dataObject);
            }
        }
    }
    static void outputAdDynamicTextPerformanceReportFilter(AdDynamicTextPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdDynamicTextPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("AdType: %s", dataObject.getAdType()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage(String.format("KeywordStatus: %s", dataObject.getKeywordStatus()));
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("* * * End OutputAdDynamicTextPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfAdDynamicTextPerformanceReportFilter(ArrayList<AdDynamicTextPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdDynamicTextPerformanceReportFilter dataObject : dataObjects)
            {
                outputAdDynamicTextPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputAdDynamicTextPerformanceReportRequest(AdDynamicTextPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdDynamicTextPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfAdDynamicTextPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputAdDynamicTextPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputAdDynamicTextPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfAdDynamicTextPerformanceReportRequest(ArrayList<AdDynamicTextPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdDynamicTextPerformanceReportRequest dataObject : dataObjects)
            {
                outputAdDynamicTextPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputAdExtensionByAdReportFilter(AdExtensionByAdReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdExtensionByAdReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceOS: %s", dataObject.getDeviceOS()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage("* * * End OutputAdExtensionByAdReportFilter * * *");
        }
    }
    static void outputArrayOfAdExtensionByAdReportFilter(ArrayList<AdExtensionByAdReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionByAdReportFilter dataObject : dataObjects)
            {
                outputAdExtensionByAdReportFilter(dataObject);
            }
        }
    }
    static void outputAdExtensionByAdReportRequest(AdExtensionByAdReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdExtensionByAdReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfAdExtensionByAdReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputAdExtensionByAdReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputAdExtensionByAdReportRequest * * *");
        }
    }
    static void outputArrayOfAdExtensionByAdReportRequest(ArrayList<AdExtensionByAdReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionByAdReportRequest dataObject : dataObjects)
            {
                outputAdExtensionByAdReportRequest(dataObject);
            }
        }
    }
    static void outputAdExtensionByKeywordReportFilter(AdExtensionByKeywordReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdExtensionByKeywordReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceOS: %s", dataObject.getDeviceOS()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage(String.format("KeywordStatus: %s", dataObject.getKeywordStatus()));
            outputStatusMessage("* * * End OutputAdExtensionByKeywordReportFilter * * *");
        }
    }
    static void outputArrayOfAdExtensionByKeywordReportFilter(ArrayList<AdExtensionByKeywordReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionByKeywordReportFilter dataObject : dataObjects)
            {
                outputAdExtensionByKeywordReportFilter(dataObject);
            }
        }
    }
    static void outputAdExtensionByKeywordReportRequest(AdExtensionByKeywordReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdExtensionByKeywordReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfAdExtensionByKeywordReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputAdExtensionByKeywordReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputAdExtensionByKeywordReportRequest * * *");
        }
    }
    static void outputArrayOfAdExtensionByKeywordReportRequest(ArrayList<AdExtensionByKeywordReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionByKeywordReportRequest dataObject : dataObjects)
            {
                outputAdExtensionByKeywordReportRequest(dataObject);
            }
        }
    }
    static void outputAdExtensionDetailReportFilter(AdExtensionDetailReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdExtensionDetailReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceOS: %s", dataObject.getDeviceOS()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage("* * * End OutputAdExtensionDetailReportFilter * * *");
        }
    }
    static void outputArrayOfAdExtensionDetailReportFilter(ArrayList<AdExtensionDetailReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionDetailReportFilter dataObject : dataObjects)
            {
                outputAdExtensionDetailReportFilter(dataObject);
            }
        }
    }
    static void outputAdExtensionDetailReportRequest(AdExtensionDetailReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdExtensionDetailReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfAdExtensionDetailReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputAdExtensionDetailReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputAdExtensionDetailReportRequest * * *");
        }
    }
    static void outputArrayOfAdExtensionDetailReportRequest(ArrayList<AdExtensionDetailReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdExtensionDetailReportRequest dataObject : dataObjects)
            {
                outputAdExtensionDetailReportRequest(dataObject);
            }
        }
    }
    static void outputAdGroupPerformanceReportFilter(AdGroupPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdGroupPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceOS: %s", dataObject.getDeviceOS()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
            outputStatusMessage("* * * End OutputAdGroupPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfAdGroupPerformanceReportFilter(ArrayList<AdGroupPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupPerformanceReportFilter dataObject : dataObjects)
            {
                outputAdGroupPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputAdGroupPerformanceReportRequest(AdGroupPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdGroupPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfAdGroupPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputAdGroupPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputAdGroupPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfAdGroupPerformanceReportRequest(ArrayList<AdGroupPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupPerformanceReportRequest dataObject : dataObjects)
            {
                outputAdGroupPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputAdGroupReportScope(AdGroupReportScope dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdGroupReportScope * * *");
            outputStatusMessage(String.format("AccountId: %s", dataObject.getAccountId()));
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
            outputStatusMessage(String.format("AdGroupId: %s", dataObject.getAdGroupId()));
            outputStatusMessage("* * * End OutputAdGroupReportScope * * *");
        }
    }
    static void outputArrayOfAdGroupReportScope(ArrayOfAdGroupReportScope dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdGroupReportScope dataObject : dataObjects.getAdGroupReportScopes())
            {
                outputAdGroupReportScope(dataObject);
            }
        }
    }
    static void outputAdPerformanceReportFilter(AdPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("AdType: %s", dataObject.getAdType()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("* * * End OutputAdPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfAdPerformanceReportFilter(ArrayList<AdPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdPerformanceReportFilter dataObject : dataObjects)
            {
                outputAdPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputAdPerformanceReportRequest(AdPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfAdPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputAdPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputAdPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfAdPerformanceReportRequest(ArrayList<AdPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdPerformanceReportRequest dataObject : dataObjects)
            {
                outputAdPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputAgeGenderAudienceReportFilter(AgeGenderAudienceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAgeGenderAudienceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("* * * End OutputAgeGenderAudienceReportFilter * * *");
        }
    }
    static void outputArrayOfAgeGenderAudienceReportFilter(ArrayList<AgeGenderAudienceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AgeGenderAudienceReportFilter dataObject : dataObjects)
            {
                outputAgeGenderAudienceReportFilter(dataObject);
            }
        }
    }
    static void outputAgeGenderAudienceReportRequest(AgeGenderAudienceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAgeGenderAudienceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfAgeGenderAudienceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputAgeGenderAudienceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputAgeGenderAudienceReportRequest * * *");
        }
    }
    static void outputArrayOfAgeGenderAudienceReportRequest(ArrayList<AgeGenderAudienceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AgeGenderAudienceReportRequest dataObject : dataObjects)
            {
                outputAgeGenderAudienceReportRequest(dataObject);
            }
        }
    }
    static void outputAgeGenderDemographicReportFilter(AgeGenderDemographicReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAgeGenderDemographicReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("* * * End OutputAgeGenderDemographicReportFilter * * *");
        }
    }
    static void outputArrayOfAgeGenderDemographicReportFilter(ArrayList<AgeGenderDemographicReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AgeGenderDemographicReportFilter dataObject : dataObjects)
            {
                outputAgeGenderDemographicReportFilter(dataObject);
            }
        }
    }
    static void outputAgeGenderDemographicReportRequest(AgeGenderDemographicReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAgeGenderDemographicReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfAgeGenderDemographicReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputAgeGenderDemographicReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputAgeGenderDemographicReportRequest * * *");
        }
    }
    static void outputArrayOfAgeGenderDemographicReportRequest(ArrayList<AgeGenderDemographicReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AgeGenderDemographicReportRequest dataObject : dataObjects)
            {
                outputAgeGenderDemographicReportRequest(dataObject);
            }
        }
    }
    static void outputApiFaultDetail(ApiFaultDetail dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputApiFaultDetail * * *");
            outputStatusMessage("BatchErrors:");
            outputArrayOfBatchError(dataObject.getBatchErrors());
            outputStatusMessage("OperationErrors:");
            outputArrayOfOperationError(dataObject.getOperationErrors());
            outputStatusMessage("* * * End OutputApiFaultDetail * * *");
        }
    }
    static void outputArrayOfApiFaultDetail(ArrayList<ApiFaultDetail> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApiFaultDetail dataObject : dataObjects)
            {
                outputApiFaultDetail(dataObject);
            }
        }
    }
    static void outputApplicationFault(ApplicationFault dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputApplicationFault * * *");
            outputStatusMessage(String.format("TrackingId: %s", dataObject.getTrackingId()));
            if(dataObject instanceof AdApiFaultDetail)
            {
                outputAdApiFaultDetail((AdApiFaultDetail)dataObject);
            }
            if(dataObject instanceof ApiFaultDetail)
            {
                outputApiFaultDetail((ApiFaultDetail)dataObject);
            }
            outputStatusMessage("* * * End OutputApplicationFault * * *");
        }
    }
    static void outputArrayOfApplicationFault(ArrayList<ApplicationFault> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApplicationFault dataObject : dataObjects)
            {
                outputApplicationFault(dataObject);
            }
        }
    }
    static void outputAudiencePerformanceReportFilter(AudiencePerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAudiencePerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage("* * * End OutputAudiencePerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfAudiencePerformanceReportFilter(ArrayList<AudiencePerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AudiencePerformanceReportFilter dataObject : dataObjects)
            {
                outputAudiencePerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputAudiencePerformanceReportRequest(AudiencePerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAudiencePerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfAudiencePerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputAudiencePerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputAudiencePerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfAudiencePerformanceReportRequest(ArrayList<AudiencePerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AudiencePerformanceReportRequest dataObject : dataObjects)
            {
                outputAudiencePerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputBatchError(BatchError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBatchError * * *");
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Details: %s", dataObject.getDetails()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("Index: %s", dataObject.getIndex()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
            outputStatusMessage("* * * End OutputBatchError * * *");
        }
    }
    static void outputArrayOfBatchError(ArrayOfBatchError dataObjects)
    {
        if (null != dataObjects)
        {
            for (BatchError dataObject : dataObjects.getBatchErrors())
            {
                outputBatchError(dataObject);
            }
        }
    }
    static void outputBudgetSummaryReportRequest(BudgetSummaryReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBudgetSummaryReportRequest * * *");
            outputStatusMessage("Columns:");
            outputArrayOfBudgetSummaryReportColumn(dataObject.getColumns());
            outputStatusMessage("Scope:");
            outputAccountThroughCampaignReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputBudgetSummaryReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputBudgetSummaryReportRequest * * *");
        }
    }
    static void outputArrayOfBudgetSummaryReportRequest(ArrayList<BudgetSummaryReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (BudgetSummaryReportRequest dataObject : dataObjects)
            {
                outputBudgetSummaryReportRequest(dataObject);
            }
        }
    }
    static void outputBudgetSummaryReportTime(BudgetSummaryReportTime dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBudgetSummaryReportTime * * *");
            outputStatusMessage("CustomDateRangeEnd:");
            outputDate(dataObject.getCustomDateRangeEnd());
            outputStatusMessage("CustomDateRangeStart:");
            outputDate(dataObject.getCustomDateRangeStart());
            outputStatusMessage(String.format("PredefinedTime: %s", dataObject.getPredefinedTime()));
            outputStatusMessage(String.format("ReportTimeZone: %s", dataObject.getReportTimeZone()));
            outputStatusMessage("* * * End OutputBudgetSummaryReportTime * * *");
        }
    }
    static void outputArrayOfBudgetSummaryReportTime(ArrayList<BudgetSummaryReportTime> dataObjects)
    {
        if (null != dataObjects)
        {
            for (BudgetSummaryReportTime dataObject : dataObjects)
            {
                outputBudgetSummaryReportTime(dataObject);
            }
        }
    }
    static void outputCallDetailReportFilter(CallDetailReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCallDetailReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage("* * * End OutputCallDetailReportFilter * * *");
        }
    }
    static void outputArrayOfCallDetailReportFilter(ArrayList<CallDetailReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CallDetailReportFilter dataObject : dataObjects)
            {
                outputCallDetailReportFilter(dataObject);
            }
        }
    }
    static void outputCallDetailReportRequest(CallDetailReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCallDetailReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfCallDetailReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputCallDetailReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputCallDetailReportRequest * * *");
        }
    }
    static void outputArrayOfCallDetailReportRequest(ArrayList<CallDetailReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CallDetailReportRequest dataObject : dataObjects)
            {
                outputCallDetailReportRequest(dataObject);
            }
        }
    }
    static void outputCampaignPerformanceReportFilter(CampaignPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCampaignPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("DeviceOS: %s", dataObject.getDeviceOS()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
            outputStatusMessage("* * * End OutputCampaignPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfCampaignPerformanceReportFilter(ArrayList<CampaignPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CampaignPerformanceReportFilter dataObject : dataObjects)
            {
                outputCampaignPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputCampaignPerformanceReportRequest(CampaignPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCampaignPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfCampaignPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputCampaignPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughCampaignReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputCampaignPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfCampaignPerformanceReportRequest(ArrayList<CampaignPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (CampaignPerformanceReportRequest dataObject : dataObjects)
            {
                outputCampaignPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputCampaignReportScope(CampaignReportScope dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCampaignReportScope * * *");
            outputStatusMessage(String.format("AccountId: %s", dataObject.getAccountId()));
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
            outputStatusMessage("* * * End OutputCampaignReportScope * * *");
        }
    }
    static void outputArrayOfCampaignReportScope(ArrayOfCampaignReportScope dataObjects)
    {
        if (null != dataObjects)
        {
            for (CampaignReportScope dataObject : dataObjects.getCampaignReportScopes())
            {
                outputCampaignReportScope(dataObject);
            }
        }
    }
    static void outputConversionPerformanceReportFilter(ConversionPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputConversionPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage(String.format("KeywordStatus: %s", dataObject.getKeywordStatus()));
            outputStatusMessage("Keywords:");
            outputArrayOfstring(dataObject.getKeywords());
            outputStatusMessage("* * * End OutputConversionPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfConversionPerformanceReportFilter(ArrayList<ConversionPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ConversionPerformanceReportFilter dataObject : dataObjects)
            {
                outputConversionPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputConversionPerformanceReportRequest(ConversionPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputConversionPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfConversionPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputConversionPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputConversionPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfConversionPerformanceReportRequest(ArrayList<ConversionPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ConversionPerformanceReportRequest dataObject : dataObjects)
            {
                outputConversionPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputDate(Date dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDate * * *");
            outputStatusMessage(String.format("Day: %s", dataObject.getDay()));
            outputStatusMessage(String.format("Month: %s", dataObject.getMonth()));
            outputStatusMessage(String.format("Year: %s", dataObject.getYear()));
            outputStatusMessage("* * * End OutputDate * * *");
        }
    }
    static void outputArrayOfDate(ArrayList<Date> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Date dataObject : dataObjects)
            {
                outputDate(dataObject);
            }
        }
    }
    static void outputDestinationUrlPerformanceReportFilter(DestinationUrlPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDestinationUrlPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("* * * End OutputDestinationUrlPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfDestinationUrlPerformanceReportFilter(ArrayList<DestinationUrlPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DestinationUrlPerformanceReportFilter dataObject : dataObjects)
            {
                outputDestinationUrlPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputDestinationUrlPerformanceReportRequest(DestinationUrlPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDestinationUrlPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfDestinationUrlPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputDestinationUrlPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputDestinationUrlPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfDestinationUrlPerformanceReportRequest(ArrayList<DestinationUrlPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DestinationUrlPerformanceReportRequest dataObject : dataObjects)
            {
                outputDestinationUrlPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputDSAAutoTargetPerformanceReportFilter(DSAAutoTargetPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDSAAutoTargetPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("BidStrategyType: %s", dataObject.getBidStrategyType()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DynamicAdTargetStatus: %s", dataObject.getDynamicAdTargetStatus()));
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("* * * End OutputDSAAutoTargetPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfDSAAutoTargetPerformanceReportFilter(ArrayList<DSAAutoTargetPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DSAAutoTargetPerformanceReportFilter dataObject : dataObjects)
            {
                outputDSAAutoTargetPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputDSAAutoTargetPerformanceReportRequest(DSAAutoTargetPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDSAAutoTargetPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfDSAAutoTargetPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputDSAAutoTargetPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputDSAAutoTargetPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfDSAAutoTargetPerformanceReportRequest(ArrayList<DSAAutoTargetPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DSAAutoTargetPerformanceReportRequest dataObject : dataObjects)
            {
                outputDSAAutoTargetPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputDSACategoryPerformanceReportFilter(DSACategoryPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDSACategoryPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("* * * End OutputDSACategoryPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfDSACategoryPerformanceReportFilter(ArrayList<DSACategoryPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DSACategoryPerformanceReportFilter dataObject : dataObjects)
            {
                outputDSACategoryPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputDSACategoryPerformanceReportRequest(DSACategoryPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDSACategoryPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfDSACategoryPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputDSACategoryPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputDSACategoryPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfDSACategoryPerformanceReportRequest(ArrayList<DSACategoryPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DSACategoryPerformanceReportRequest dataObject : dataObjects)
            {
                outputDSACategoryPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputDSASearchQueryPerformanceReportFilter(DSASearchQueryPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDSASearchQueryPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("ExcludeZeroClicks: %s", dataObject.getExcludeZeroClicks()));
            outputStatusMessage(String.format("FeedUrl: %s", dataObject.getFeedUrl()));
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("SearchQueries:");
            outputArrayOfstring(dataObject.getSearchQueries());
            outputStatusMessage("* * * End OutputDSASearchQueryPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfDSASearchQueryPerformanceReportFilter(ArrayList<DSASearchQueryPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DSASearchQueryPerformanceReportFilter dataObject : dataObjects)
            {
                outputDSASearchQueryPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputDSASearchQueryPerformanceReportRequest(DSASearchQueryPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDSASearchQueryPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfDSASearchQueryPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputDSASearchQueryPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputDSASearchQueryPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfDSASearchQueryPerformanceReportRequest(ArrayList<DSASearchQueryPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DSASearchQueryPerformanceReportRequest dataObject : dataObjects)
            {
                outputDSASearchQueryPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputGeographicPerformanceReportFilter(GeographicPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputGeographicPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage("CountryCode:");
            outputArrayOfstring(dataObject.getCountryCode());
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("* * * End OutputGeographicPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfGeographicPerformanceReportFilter(ArrayList<GeographicPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (GeographicPerformanceReportFilter dataObject : dataObjects)
            {
                outputGeographicPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputGeographicPerformanceReportRequest(GeographicPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputGeographicPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfGeographicPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputGeographicPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputGeographicPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfGeographicPerformanceReportRequest(ArrayList<GeographicPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (GeographicPerformanceReportRequest dataObject : dataObjects)
            {
                outputGeographicPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputGoalsAndFunnelsReportFilter(GoalsAndFunnelsReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputGoalsAndFunnelsReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceOS: %s", dataObject.getDeviceOS()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage("GoalIds:");
            outputArrayOflong(dataObject.getGoalIds());
            outputStatusMessage(String.format("KeywordStatus: %s", dataObject.getKeywordStatus()));
            outputStatusMessage("* * * End OutputGoalsAndFunnelsReportFilter * * *");
        }
    }
    static void outputArrayOfGoalsAndFunnelsReportFilter(ArrayList<GoalsAndFunnelsReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (GoalsAndFunnelsReportFilter dataObject : dataObjects)
            {
                outputGoalsAndFunnelsReportFilter(dataObject);
            }
        }
    }
    static void outputGoalsAndFunnelsReportRequest(GoalsAndFunnelsReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputGoalsAndFunnelsReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfGoalsAndFunnelsReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputGoalsAndFunnelsReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputGoalsAndFunnelsReportRequest * * *");
        }
    }
    static void outputArrayOfGoalsAndFunnelsReportRequest(ArrayList<GoalsAndFunnelsReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (GoalsAndFunnelsReportRequest dataObject : dataObjects)
            {
                outputGoalsAndFunnelsReportRequest(dataObject);
            }
        }
    }
    static void outputKeywordPerformanceReportFilter(KeywordPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage("AdRelevance:");
            outputArrayOfint(dataObject.getAdRelevance());
            outputStatusMessage(String.format("AdType: %s", dataObject.getAdType()));
            outputStatusMessage(String.format("BidMatchType: %s", dataObject.getBidMatchType()));
            outputStatusMessage(String.format("BidStrategyType: %s", dataObject.getBidStrategyType()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeliveredMatchType: %s", dataObject.getDeliveredMatchType()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage("ExpectedCtr:");
            outputArrayOfint(dataObject.getExpectedCtr());
            outputStatusMessage(String.format("KeywordStatus: %s", dataObject.getKeywordStatus()));
            outputStatusMessage("Keywords:");
            outputArrayOfstring(dataObject.getKeywords());
            outputStatusMessage("LandingPageExperience:");
            outputArrayOfint(dataObject.getLandingPageExperience());
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("QualityScore:");
            outputArrayOfint(dataObject.getQualityScore());
            outputStatusMessage("* * * End OutputKeywordPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfKeywordPerformanceReportFilter(ArrayList<KeywordPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordPerformanceReportFilter dataObject : dataObjects)
            {
                outputKeywordPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputKeywordPerformanceReportRequest(KeywordPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfKeywordPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputKeywordPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage(String.format("MaxRows: %s", dataObject.getMaxRows()));
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Sort:");
            outputArrayOfKeywordPerformanceReportSort(dataObject.getSort());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputKeywordPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfKeywordPerformanceReportRequest(ArrayList<KeywordPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordPerformanceReportRequest dataObject : dataObjects)
            {
                outputKeywordPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputKeywordPerformanceReportSort(KeywordPerformanceReportSort dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeywordPerformanceReportSort * * *");
            outputStatusMessage(String.format("SortColumn: %s", dataObject.getSortColumn()));
            outputStatusMessage(String.format("SortOrder: %s", dataObject.getSortOrder()));
            outputStatusMessage("* * * End OutputKeywordPerformanceReportSort * * *");
        }
    }
    static void outputArrayOfKeywordPerformanceReportSort(ArrayOfKeywordPerformanceReportSort dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeywordPerformanceReportSort dataObject : dataObjects.getKeywordPerformanceReportSorts())
            {
                outputKeywordPerformanceReportSort(dataObject);
            }
        }
    }
    static void outputNegativeKeywordConflictReportFilter(NegativeKeywordConflictReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputNegativeKeywordConflictReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("KeywordStatus: %s", dataObject.getKeywordStatus()));
            outputStatusMessage("* * * End OutputNegativeKeywordConflictReportFilter * * *");
        }
    }
    static void outputArrayOfNegativeKeywordConflictReportFilter(ArrayList<NegativeKeywordConflictReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (NegativeKeywordConflictReportFilter dataObject : dataObjects)
            {
                outputNegativeKeywordConflictReportFilter(dataObject);
            }
        }
    }
    static void outputNegativeKeywordConflictReportRequest(NegativeKeywordConflictReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputNegativeKeywordConflictReportRequest * * *");
            outputStatusMessage("Columns:");
            outputArrayOfNegativeKeywordConflictReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputNegativeKeywordConflictReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("* * * End OutputNegativeKeywordConflictReportRequest * * *");
        }
    }
    static void outputArrayOfNegativeKeywordConflictReportRequest(ArrayList<NegativeKeywordConflictReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (NegativeKeywordConflictReportRequest dataObject : dataObjects)
            {
                outputNegativeKeywordConflictReportRequest(dataObject);
            }
        }
    }
    static void outputOperationError(OperationError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputOperationError * * *");
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Details: %s", dataObject.getDetails()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
            outputStatusMessage("* * * End OutputOperationError * * *");
        }
    }
    static void outputArrayOfOperationError(ArrayOfOperationError dataObjects)
    {
        if (null != dataObjects)
        {
            for (OperationError dataObject : dataObjects.getOperationErrors())
            {
                outputOperationError(dataObject);
            }
        }
    }
    static void outputProductDimensionPerformanceReportFilter(ProductDimensionPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProductDimensionPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("* * * End OutputProductDimensionPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfProductDimensionPerformanceReportFilter(ArrayList<ProductDimensionPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductDimensionPerformanceReportFilter dataObject : dataObjects)
            {
                outputProductDimensionPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputProductDimensionPerformanceReportRequest(ProductDimensionPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProductDimensionPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfProductDimensionPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputProductDimensionPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputProductDimensionPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfProductDimensionPerformanceReportRequest(ArrayList<ProductDimensionPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductDimensionPerformanceReportRequest dataObject : dataObjects)
            {
                outputProductDimensionPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputProductMatchCountReportRequest(ProductMatchCountReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProductMatchCountReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfProductMatchCountReportColumn(dataObject.getColumns());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputProductMatchCountReportRequest * * *");
        }
    }
    static void outputArrayOfProductMatchCountReportRequest(ArrayList<ProductMatchCountReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductMatchCountReportRequest dataObject : dataObjects)
            {
                outputProductMatchCountReportRequest(dataObject);
            }
        }
    }
    static void outputProductPartitionPerformanceReportFilter(ProductPartitionPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProductPartitionPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("* * * End OutputProductPartitionPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfProductPartitionPerformanceReportFilter(ArrayList<ProductPartitionPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductPartitionPerformanceReportFilter dataObject : dataObjects)
            {
                outputProductPartitionPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputProductPartitionPerformanceReportRequest(ProductPartitionPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProductPartitionPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfProductPartitionPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputProductPartitionPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputProductPartitionPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfProductPartitionPerformanceReportRequest(ArrayList<ProductPartitionPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductPartitionPerformanceReportRequest dataObject : dataObjects)
            {
                outputProductPartitionPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputProductPartitionUnitPerformanceReportFilter(ProductPartitionUnitPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProductPartitionUnitPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("* * * End OutputProductPartitionUnitPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfProductPartitionUnitPerformanceReportFilter(ArrayList<ProductPartitionUnitPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductPartitionUnitPerformanceReportFilter dataObject : dataObjects)
            {
                outputProductPartitionUnitPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputProductPartitionUnitPerformanceReportRequest(ProductPartitionUnitPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProductPartitionUnitPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfProductPartitionUnitPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputProductPartitionUnitPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputProductPartitionUnitPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfProductPartitionUnitPerformanceReportRequest(ArrayList<ProductPartitionUnitPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductPartitionUnitPerformanceReportRequest dataObject : dataObjects)
            {
                outputProductPartitionUnitPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputProductSearchQueryPerformanceReportFilter(ProductSearchQueryPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProductSearchQueryPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("AdType: %s", dataObject.getAdType()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("ExcludeZeroClicks: %s", dataObject.getExcludeZeroClicks()));
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("SearchQueries:");
            outputArrayOfstring(dataObject.getSearchQueries());
            outputStatusMessage("* * * End OutputProductSearchQueryPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfProductSearchQueryPerformanceReportFilter(ArrayList<ProductSearchQueryPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductSearchQueryPerformanceReportFilter dataObject : dataObjects)
            {
                outputProductSearchQueryPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputProductSearchQueryPerformanceReportRequest(ProductSearchQueryPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProductSearchQueryPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfProductSearchQueryPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputProductSearchQueryPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputProductSearchQueryPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfProductSearchQueryPerformanceReportRequest(ArrayList<ProductSearchQueryPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProductSearchQueryPerformanceReportRequest dataObject : dataObjects)
            {
                outputProductSearchQueryPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputProfessionalDemographicsAudienceReportFilter(ProfessionalDemographicsAudienceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProfessionalDemographicsAudienceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("* * * End OutputProfessionalDemographicsAudienceReportFilter * * *");
        }
    }
    static void outputArrayOfProfessionalDemographicsAudienceReportFilter(ArrayList<ProfessionalDemographicsAudienceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProfessionalDemographicsAudienceReportFilter dataObject : dataObjects)
            {
                outputProfessionalDemographicsAudienceReportFilter(dataObject);
            }
        }
    }
    static void outputProfessionalDemographicsAudienceReportRequest(ProfessionalDemographicsAudienceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputProfessionalDemographicsAudienceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfProfessionalDemographicsAudienceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputProfessionalDemographicsAudienceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputProfessionalDemographicsAudienceReportRequest * * *");
        }
    }
    static void outputArrayOfProfessionalDemographicsAudienceReportRequest(ArrayList<ProfessionalDemographicsAudienceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ProfessionalDemographicsAudienceReportRequest dataObject : dataObjects)
            {
                outputProfessionalDemographicsAudienceReportRequest(dataObject);
            }
        }
    }
    static void outputPublisherUsagePerformanceReportFilter(PublisherUsagePerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputPublisherUsagePerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("* * * End OutputPublisherUsagePerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfPublisherUsagePerformanceReportFilter(ArrayList<PublisherUsagePerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (PublisherUsagePerformanceReportFilter dataObject : dataObjects)
            {
                outputPublisherUsagePerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputPublisherUsagePerformanceReportRequest(PublisherUsagePerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputPublisherUsagePerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfPublisherUsagePerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputPublisherUsagePerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputPublisherUsagePerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfPublisherUsagePerformanceReportRequest(ArrayList<PublisherUsagePerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (PublisherUsagePerformanceReportRequest dataObject : dataObjects)
            {
                outputPublisherUsagePerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputReportRequest(ReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputReportRequest * * *");
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
            if(dataObject instanceof AgeGenderAudienceReportRequest)
            {
                outputAgeGenderAudienceReportRequest((AgeGenderAudienceReportRequest)dataObject);
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
            if(dataObject instanceof ProductMatchCountReportRequest)
            {
                outputProductMatchCountReportRequest((ProductMatchCountReportRequest)dataObject);
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
            if(dataObject instanceof ProfessionalDemographicsAudienceReportRequest)
            {
                outputProfessionalDemographicsAudienceReportRequest((ProfessionalDemographicsAudienceReportRequest)dataObject);
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
            outputStatusMessage("* * * End OutputReportRequest * * *");
        }
    }
    static void outputArrayOfReportRequest(ArrayList<ReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ReportRequest dataObject : dataObjects)
            {
                outputReportRequest(dataObject);
            }
        }
    }
    static void outputReportRequestStatus(ReportRequestStatus dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputReportRequestStatus * * *");
            outputStatusMessage(String.format("ReportDownloadUrl: %s", dataObject.getReportDownloadUrl()));
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
            outputStatusMessage("* * * End OutputReportRequestStatus * * *");
        }
    }
    static void outputArrayOfReportRequestStatus(ArrayList<ReportRequestStatus> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ReportRequestStatus dataObject : dataObjects)
            {
                outputReportRequestStatus(dataObject);
            }
        }
    }
    static void outputReportTime(ReportTime dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputReportTime * * *");
            outputStatusMessage("CustomDateRangeEnd:");
            outputDate(dataObject.getCustomDateRangeEnd());
            outputStatusMessage("CustomDateRangeStart:");
            outputDate(dataObject.getCustomDateRangeStart());
            outputStatusMessage(String.format("PredefinedTime: %s", dataObject.getPredefinedTime()));
            outputStatusMessage(String.format("ReportTimeZone: %s", dataObject.getReportTimeZone()));
            outputStatusMessage("* * * End OutputReportTime * * *");
        }
    }
    static void outputArrayOfReportTime(ArrayList<ReportTime> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ReportTime dataObject : dataObjects)
            {
                outputReportTime(dataObject);
            }
        }
    }
    static void outputSearchCampaignChangeHistoryReportFilter(SearchCampaignChangeHistoryReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputSearchCampaignChangeHistoryReportFilter * * *");
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("HowChanged: %s", dataObject.getHowChanged()));
            outputStatusMessage(String.format("ItemChanged: %s", dataObject.getItemChanged()));
            outputStatusMessage("* * * End OutputSearchCampaignChangeHistoryReportFilter * * *");
        }
    }
    static void outputArrayOfSearchCampaignChangeHistoryReportFilter(ArrayList<SearchCampaignChangeHistoryReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (SearchCampaignChangeHistoryReportFilter dataObject : dataObjects)
            {
                outputSearchCampaignChangeHistoryReportFilter(dataObject);
            }
        }
    }
    static void outputSearchCampaignChangeHistoryReportRequest(SearchCampaignChangeHistoryReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputSearchCampaignChangeHistoryReportRequest * * *");
            outputStatusMessage("Columns:");
            outputArrayOfSearchCampaignChangeHistoryReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputSearchCampaignChangeHistoryReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputSearchCampaignChangeHistoryReportRequest * * *");
        }
    }
    static void outputArrayOfSearchCampaignChangeHistoryReportRequest(ArrayList<SearchCampaignChangeHistoryReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (SearchCampaignChangeHistoryReportRequest dataObject : dataObjects)
            {
                outputSearchCampaignChangeHistoryReportRequest(dataObject);
            }
        }
    }
    static void outputSearchQueryPerformanceReportFilter(SearchQueryPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputSearchQueryPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("AdStatus: %s", dataObject.getAdStatus()));
            outputStatusMessage(String.format("AdType: %s", dataObject.getAdType()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeliveredMatchType: %s", dataObject.getDeliveredMatchType()));
            outputStatusMessage(String.format("ExcludeZeroClicks: %s", dataObject.getExcludeZeroClicks()));
            outputStatusMessage(String.format("KeywordStatus: %s", dataObject.getKeywordStatus()));
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("SearchQueries:");
            outputArrayOfstring(dataObject.getSearchQueries());
            outputStatusMessage("* * * End OutputSearchQueryPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfSearchQueryPerformanceReportFilter(ArrayList<SearchQueryPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (SearchQueryPerformanceReportFilter dataObject : dataObjects)
            {
                outputSearchQueryPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputSearchQueryPerformanceReportRequest(SearchQueryPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputSearchQueryPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfSearchQueryPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputSearchQueryPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputSearchQueryPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfSearchQueryPerformanceReportRequest(ArrayList<SearchQueryPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (SearchQueryPerformanceReportRequest dataObject : dataObjects)
            {
                outputSearchQueryPerformanceReportRequest(dataObject);
            }
        }
    }
    static void outputShareOfVoiceReportFilter(ShareOfVoiceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputShareOfVoiceReportFilter * * *");
            outputStatusMessage(String.format("AccountStatus: %s", dataObject.getAccountStatus()));
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage(String.format("AdGroupStatus: %s", dataObject.getAdGroupStatus()));
            outputStatusMessage(String.format("BidMatchType: %s", dataObject.getBidMatchType()));
            outputStatusMessage(String.format("BidStrategyType: %s", dataObject.getBidStrategyType()));
            outputStatusMessage(String.format("CampaignStatus: %s", dataObject.getCampaignStatus()));
            outputStatusMessage(String.format("DeliveredMatchType: %s", dataObject.getDeliveredMatchType()));
            outputStatusMessage(String.format("DeviceType: %s", dataObject.getDeviceType()));
            outputStatusMessage(String.format("KeywordStatus: %s", dataObject.getKeywordStatus()));
            outputStatusMessage("Keywords:");
            outputArrayOfstring(dataObject.getKeywords());
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("* * * End OutputShareOfVoiceReportFilter * * *");
        }
    }
    static void outputArrayOfShareOfVoiceReportFilter(ArrayList<ShareOfVoiceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ShareOfVoiceReportFilter dataObject : dataObjects)
            {
                outputShareOfVoiceReportFilter(dataObject);
            }
        }
    }
    static void outputShareOfVoiceReportRequest(ShareOfVoiceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputShareOfVoiceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfShareOfVoiceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputShareOfVoiceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputShareOfVoiceReportRequest * * *");
        }
    }
    static void outputArrayOfShareOfVoiceReportRequest(ArrayList<ShareOfVoiceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ShareOfVoiceReportRequest dataObject : dataObjects)
            {
                outputShareOfVoiceReportRequest(dataObject);
            }
        }
    }
    static void outputUserLocationPerformanceReportFilter(UserLocationPerformanceReportFilter dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputUserLocationPerformanceReportFilter * * *");
            outputStatusMessage(String.format("AdDistribution: %s", dataObject.getAdDistribution()));
            outputStatusMessage("CountryCode:");
            outputArrayOfstring(dataObject.getCountryCode());
            outputStatusMessage("LanguageCode:");
            outputArrayOfstring(dataObject.getLanguageCode());
            outputStatusMessage("* * * End OutputUserLocationPerformanceReportFilter * * *");
        }
    }
    static void outputArrayOfUserLocationPerformanceReportFilter(ArrayList<UserLocationPerformanceReportFilter> dataObjects)
    {
        if (null != dataObjects)
        {
            for (UserLocationPerformanceReportFilter dataObject : dataObjects)
            {
                outputUserLocationPerformanceReportFilter(dataObject);
            }
        }
    }
    static void outputUserLocationPerformanceReportRequest(UserLocationPerformanceReportRequest dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputUserLocationPerformanceReportRequest * * *");
            outputStatusMessage(String.format("Aggregation: %s", dataObject.getAggregation()));
            outputStatusMessage("Columns:");
            outputArrayOfUserLocationPerformanceReportColumn(dataObject.getColumns());
            outputStatusMessage("Filter:");
            outputUserLocationPerformanceReportFilter(dataObject.getFilter());
            outputStatusMessage("Scope:");
            outputAccountThroughAdGroupReportScope(dataObject.getScope());
            outputStatusMessage("Time:");
            outputReportTime(dataObject.getTime());
            outputStatusMessage("* * * End OutputUserLocationPerformanceReportRequest * * *");
        }
    }
    static void outputArrayOfUserLocationPerformanceReportRequest(ArrayList<UserLocationPerformanceReportRequest> dataObjects)
    {
        if (null != dataObjects)
        {
            for (UserLocationPerformanceReportRequest dataObject : dataObjects)
            {
                outputUserLocationPerformanceReportRequest(dataObject);
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
    static void outputReportTimeZone(ReportTimeZone valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ReportTimeZone value : ReportTimeZone.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfReportTimeZone(ArrayList<ReportTimeZone> valueSets)
    {
        if (null != valueSets)
        {
            for (ReportTimeZone valueSet : valueSets)
            {
                outputReportTimeZone(valueSet);
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
    static void outputAgeGenderAudienceReportColumn(AgeGenderAudienceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AgeGenderAudienceReportColumn value : AgeGenderAudienceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAgeGenderAudienceReportColumn(ArrayOfAgeGenderAudienceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (AgeGenderAudienceReportColumn valueSet : valueSets.getAgeGenderAudienceReportColumns())
            {
                outputAgeGenderAudienceReportColumn(valueSet);
            }
        }
    }
    static void outputProfessionalDemographicsAudienceReportColumn(ProfessionalDemographicsAudienceReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ProfessionalDemographicsAudienceReportColumn value : ProfessionalDemographicsAudienceReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfProfessionalDemographicsAudienceReportColumn(ArrayOfProfessionalDemographicsAudienceReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (ProfessionalDemographicsAudienceReportColumn valueSet : valueSets.getProfessionalDemographicsAudienceReportColumns())
            {
                outputProfessionalDemographicsAudienceReportColumn(valueSet);
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
    static void outputProductMatchCountReportColumn(ProductMatchCountReportColumn valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ProductMatchCountReportColumn value : ProductMatchCountReportColumn.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfProductMatchCountReportColumn(ArrayOfProductMatchCountReportColumn valueSets)
    {
        if (null != valueSets)
        {
            for (ProductMatchCountReportColumn valueSet : valueSets.getProductMatchCountReportColumns())
            {
                outputProductMatchCountReportColumn(valueSet);
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
                outputStatusMessage(String.format("%s", item));
            }
        }
    }
    static void outputArrayOflong(ArrayOflong items)
    {
        if (null != items)
        {
            for (java.lang.Long item : items.getLongs())
            {
                outputStatusMessage(String.format("%s", item));
            }
        }
    }
    static void outputArrayOfint(ArrayOfint items)
    {
        if (null != items)
        {
            for (java.lang.Integer item : items.getInts())
            {
                outputStatusMessage(String.format("%s", item));
            }
        }
    }
}