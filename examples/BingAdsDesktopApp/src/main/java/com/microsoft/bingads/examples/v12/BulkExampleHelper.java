package com.microsoft.bingads.examples.v12;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;
import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.bulk.*;

class BulkExampleHelper
{
    static ServiceClient<IBulkService> BulkService;
    static DownloadCampaignsByAccountIdsResponse downloadCampaignsByAccountIds(
        ArrayOflong accountIds,
        CompressionType compressionType,
        ArrayList<DataScope> dataScope,
        ArrayOfDownloadEntity downloadEntities,
        DownloadFileType downloadFileType,
        java.lang.String formatVersion,
        Calendar lastSyncTimeInUTC,
        PerformanceStatsDateRange performanceStatsDateRange) throws RemoteException, Exception
    {
        DownloadCampaignsByAccountIdsRequest request = new DownloadCampaignsByAccountIdsRequest();

        request.setAccountIds(accountIds);
        request.setCompressionType(compressionType);
        request.setDataScope(dataScope);
        request.setDownloadEntities(downloadEntities);
        request.setDownloadFileType(downloadFileType);
        request.setFormatVersion(formatVersion);
        request.setLastSyncTimeInUTC(lastSyncTimeInUTC);
        request.setPerformanceStatsDateRange(performanceStatsDateRange);

        return BulkService.getService().downloadCampaignsByAccountIds(request);
    }
    static DownloadCampaignsByCampaignIdsResponse downloadCampaignsByCampaignIds(
        ArrayOfCampaignScope campaigns,
        CompressionType compressionType,
        ArrayList<DataScope> dataScope,
        ArrayOfDownloadEntity downloadEntities,
        DownloadFileType downloadFileType,
        java.lang.String formatVersion,
        Calendar lastSyncTimeInUTC,
        PerformanceStatsDateRange performanceStatsDateRange) throws RemoteException, Exception
    {
        DownloadCampaignsByCampaignIdsRequest request = new DownloadCampaignsByCampaignIdsRequest();

        request.setCampaigns(campaigns);
        request.setCompressionType(compressionType);
        request.setDataScope(dataScope);
        request.setDownloadEntities(downloadEntities);
        request.setDownloadFileType(downloadFileType);
        request.setFormatVersion(formatVersion);
        request.setLastSyncTimeInUTC(lastSyncTimeInUTC);
        request.setPerformanceStatsDateRange(performanceStatsDateRange);

        return BulkService.getService().downloadCampaignsByCampaignIds(request);
    }
    static GetBulkDownloadStatusResponse getBulkDownloadStatus(
        java.lang.String requestId) throws RemoteException, Exception
    {
        GetBulkDownloadStatusRequest request = new GetBulkDownloadStatusRequest();

        request.setRequestId(requestId);

        return BulkService.getService().getBulkDownloadStatus(request);
    }
    static GetBulkUploadStatusResponse getBulkUploadStatus(
        java.lang.String requestId) throws RemoteException, Exception
    {
        GetBulkUploadStatusRequest request = new GetBulkUploadStatusRequest();

        request.setRequestId(requestId);

        return BulkService.getService().getBulkUploadStatus(request);
    }
    static GetBulkUploadUrlResponse getBulkUploadUrl(
        ResponseMode responseMode,
        java.lang.Long accountId) throws RemoteException, Exception
    {
        GetBulkUploadUrlRequest request = new GetBulkUploadUrlRequest();

        request.setResponseMode(responseMode);
        request.setAccountId(accountId);

        return BulkService.getService().getBulkUploadUrl(request);
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
    static void outputBatchError(BatchError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Details: %s", dataObject.getDetails()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("FieldPath: %s", dataObject.getFieldPath()));
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("Index: %s", dataObject.getIndex()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof EditorialError)
            {
                outputEditorialError((EditorialError)dataObject);
            }
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
    static void outputCampaignScope(CampaignScope dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
            outputStatusMessage(String.format("ParentAccountId: %s", dataObject.getParentAccountId()));
        }
    }
    static void outputArrayOfCampaignScope(ArrayOfCampaignScope dataObjects)
    {
        if (null != dataObjects)
        {
            for (CampaignScope dataObject : dataObjects.getCampaignScopes())
            {
                outputCampaignScope(dataObject);
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
    static void outputEditorialError(EditorialError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Appealable: %s", dataObject.getAppealable()));
            outputStatusMessage(String.format("DisapprovedText: %s", dataObject.getDisapprovedText()));
            outputStatusMessage(String.format("Location: %s", dataObject.getLocation()));
            outputStatusMessage(String.format("PublisherCountry: %s", dataObject.getPublisherCountry()));
            outputStatusMessage(String.format("ReasonCode: %s", dataObject.getReasonCode()));
        }
    }
    static void outputArrayOfEditorialError(ArrayList<EditorialError> dataObjects)
    {
        if (null != dataObjects)
        {
            for (EditorialError dataObject : dataObjects)
            {
                outputEditorialError(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputKeyValuePairOfstringstring(KeyValuePairOfstringstring dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Key: %s", dataObject.getKey()));
            outputStatusMessage(String.format("Value: %s", dataObject.getValue()));
        }
    }
    static void outputArrayOfKeyValuePairOfstringstring(ArrayOfKeyValuePairOfstringstring dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeyValuePairOfstringstring dataObject : dataObjects.getKeyValuePairOfstringstrings())
            {
                outputKeyValuePairOfstringstring(dataObject);
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
    static void outputPerformanceStatsDateRange(PerformanceStatsDateRange dataObject)
    {
        if (null != dataObject)
        {
            outputDate(dataObject.getCustomDateRangeEnd());
            outputDate(dataObject.getCustomDateRangeStart());
            outputStatusMessage(String.format("PredefinedTime: %s", dataObject.getPredefinedTime()));
        }
    }
    static void outputArrayOfPerformanceStatsDateRange(ArrayList<PerformanceStatsDateRange> dataObjects)
    {
        if (null != dataObjects)
        {
            for (PerformanceStatsDateRange dataObject : dataObjects)
            {
                outputPerformanceStatsDateRange(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputCompressionType(CompressionType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CompressionType value : CompressionType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCompressionType(ArrayList<CompressionType> valueSets)
    {
        if (null != valueSets)
        {
            for (CompressionType valueSet : valueSets)
            {
                outputCompressionType(valueSet);
            }
        }
    }
    static void outputDataScope(DataScope valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (DataScope value : DataScope.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfDataScope(ArrayList<DataScope> valueSets)
    {
        if (null != valueSets)
        {
            for (DataScope valueSet : valueSets)
            {
                outputDataScope(valueSet);
            }
        }
    }
    static void outputDownloadEntity(DownloadEntity valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (DownloadEntity value : DownloadEntity.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfDownloadEntity(ArrayOfDownloadEntity valueSets)
    {
        if (null != valueSets)
        {
            for (DownloadEntity valueSet : valueSets.getDownloadEntities())
            {
                outputDownloadEntity(valueSet);
            }
        }
    }
    static void outputDownloadFileType(DownloadFileType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (DownloadFileType value : DownloadFileType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfDownloadFileType(ArrayList<DownloadFileType> valueSets)
    {
        if (null != valueSets)
        {
            for (DownloadFileType valueSet : valueSets)
            {
                outputDownloadFileType(valueSet);
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
    static void outputResponseMode(ResponseMode valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ResponseMode value : ResponseMode.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfResponseMode(ArrayList<ResponseMode> valueSets)
    {
        if (null != valueSets)
        {
            for (ResponseMode valueSet : valueSets)
            {
                outputResponseMode(valueSet);
            }
        }
    }
    // Prints the string to System.out
    static void outputStatusMessage(java.lang.String message)
    {
        System.out.println(message);
    }
}
