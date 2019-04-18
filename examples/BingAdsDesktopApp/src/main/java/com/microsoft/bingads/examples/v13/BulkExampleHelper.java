package com.microsoft.bingads.examples.v13;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;
import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.bulk.*;

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
        Calendar lastSyncTimeInUTC) throws RemoteException, Exception
    {
        DownloadCampaignsByAccountIdsRequest request = new DownloadCampaignsByAccountIdsRequest();

        request.setAccountIds(accountIds);
        request.setCompressionType(compressionType);
        request.setDataScope(dataScope);
        request.setDownloadEntities(downloadEntities);
        request.setDownloadFileType(downloadFileType);
        request.setFormatVersion(formatVersion);
        request.setLastSyncTimeInUTC(lastSyncTimeInUTC);

        return BulkService.getService().downloadCampaignsByAccountIds(request);
    }
    static DownloadCampaignsByCampaignIdsResponse downloadCampaignsByCampaignIds(
        ArrayOfCampaignScope campaigns,
        CompressionType compressionType,
        ArrayList<DataScope> dataScope,
        ArrayOfDownloadEntity downloadEntities,
        DownloadFileType downloadFileType,
        java.lang.String formatVersion,
        Calendar lastSyncTimeInUTC) throws RemoteException, Exception
    {
        DownloadCampaignsByCampaignIdsRequest request = new DownloadCampaignsByCampaignIdsRequest();

        request.setCampaigns(campaigns);
        request.setCompressionType(compressionType);
        request.setDataScope(dataScope);
        request.setDownloadEntities(downloadEntities);
        request.setDownloadFileType(downloadFileType);
        request.setFormatVersion(formatVersion);
        request.setLastSyncTimeInUTC(lastSyncTimeInUTC);

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
    static void outputBatchError(BatchError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBatchError * * *");
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Details: %s", dataObject.getDetails()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("FieldPath: %s", dataObject.getFieldPath()));
            outputStatusMessage("ForwardCompatibilityMap:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("Index: %s", dataObject.getIndex()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            if(dataObject instanceof EditorialError)
            {
                outputEditorialError((EditorialError)dataObject);
            }
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
    static void outputCampaignScope(CampaignScope dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCampaignScope * * *");
            outputStatusMessage(String.format("CampaignId: %s", dataObject.getCampaignId()));
            outputStatusMessage(String.format("ParentAccountId: %s", dataObject.getParentAccountId()));
            outputStatusMessage("* * * End OutputCampaignScope * * *");
        }
    }
    static void outputArrayOfCampaignScope(ArrayOfCampaignScope dataObjects)
    {
        if (null != dataObjects)
        {
            for (CampaignScope dataObject : dataObjects.getCampaignScopes())
            {
                outputCampaignScope(dataObject);
            }
        }
    }
    static void outputEditorialError(EditorialError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputEditorialError * * *");
            outputStatusMessage(String.format("Appealable: %s", dataObject.getAppealable()));
            outputStatusMessage(String.format("DisapprovedText: %s", dataObject.getDisapprovedText()));
            outputStatusMessage(String.format("Location: %s", dataObject.getLocation()));
            outputStatusMessage(String.format("PublisherCountry: %s", dataObject.getPublisherCountry()));
            outputStatusMessage(String.format("ReasonCode: %s", dataObject.getReasonCode()));
            outputStatusMessage("* * * End OutputEditorialError * * *");
        }
    }
    static void outputArrayOfEditorialError(ArrayList<EditorialError> dataObjects)
    {
        if (null != dataObjects)
        {
            for (EditorialError dataObject : dataObjects)
            {
                outputEditorialError(dataObject);
            }
        }
    }
    static void outputKeyValuePairOfstringstring(KeyValuePairOfstringstring dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeyValuePairOfstringstring * * *");
            outputStatusMessage(String.format("Key: %s", dataObject.getKey()));
            outputStatusMessage(String.format("Value: %s", dataObject.getValue()));
            outputStatusMessage("* * * End OutputKeyValuePairOfstringstring * * *");
        }
    }
    static void outputArrayOfKeyValuePairOfstringstring(ArrayOfKeyValuePairOfstringstring dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeyValuePairOfstringstring dataObject : dataObjects.getKeyValuePairOfstringstrings())
            {
                outputKeyValuePairOfstringstring(dataObject);
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