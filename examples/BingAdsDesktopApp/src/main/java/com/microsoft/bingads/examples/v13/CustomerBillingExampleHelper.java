package com.microsoft.bingads.examples.v13;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;
import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.customerbilling.*;

class CustomerBillingExampleHelper
{
    static ServiceClient<ICustomerBillingService> CustomerBillingService;
    static AddInsertionOrderResponse addInsertionOrder(
        InsertionOrder insertionOrder) throws RemoteException, Exception
    {
        AddInsertionOrderRequest request = new AddInsertionOrderRequest();

        request.setInsertionOrder(insertionOrder);

        return CustomerBillingService.getService().addInsertionOrder(request);
    }
    static GetAccountMonthlySpendResponse getAccountMonthlySpend(
        java.lang.Long accountId,
        Calendar monthYear) throws RemoteException, Exception
    {
        GetAccountMonthlySpendRequest request = new GetAccountMonthlySpendRequest();

        request.setAccountId(accountId);
        request.setMonthYear(monthYear);

        return CustomerBillingService.getService().getAccountMonthlySpend(request);
    }
    static GetBillingDocumentsResponse getBillingDocuments(
        ArrayOfBillingDocumentInfo billingDocumentsInfo,
        DataType type) throws RemoteException, Exception
    {
        GetBillingDocumentsRequest request = new GetBillingDocumentsRequest();

        request.setBillingDocumentsInfo(billingDocumentsInfo);
        request.setType(type);

        return CustomerBillingService.getService().getBillingDocuments(request);
    }
    static GetBillingDocumentsInfoResponse getBillingDocumentsInfo(
        ArrayOflong accountIds,
        Calendar startDate,
        Calendar endDate) throws RemoteException, Exception
    {
        GetBillingDocumentsInfoRequest request = new GetBillingDocumentsInfoRequest();

        request.setAccountIds(accountIds);
        request.setStartDate(startDate);
        request.setEndDate(endDate);

        return CustomerBillingService.getService().getBillingDocumentsInfo(request);
    }
    static SearchInsertionOrdersResponse searchInsertionOrders(
        ArrayOfPredicate predicates,
        ArrayOfOrderBy ordering,
        Paging pageInfo) throws RemoteException, Exception
    {
        SearchInsertionOrdersRequest request = new SearchInsertionOrdersRequest();

        request.setPredicates(predicates);
        request.setOrdering(ordering);
        request.setPageInfo(pageInfo);

        return CustomerBillingService.getService().searchInsertionOrders(request);
    }
    static UpdateInsertionOrderResponse updateInsertionOrder(
        InsertionOrder insertionOrder) throws RemoteException, Exception
    {
        UpdateInsertionOrderRequest request = new UpdateInsertionOrderRequest();

        request.setInsertionOrder(insertionOrder);

        return CustomerBillingService.getService().updateInsertionOrder(request);
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
    static void outputApiBatchFault(ApiBatchFault dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputApiBatchFault * * *");
            outputStatusMessage("BatchErrors:");
            outputArrayOfBatchError(dataObject.getBatchErrors());
            outputStatusMessage("* * * End OutputApiBatchFault * * *");
        }
    }
    static void outputArrayOfApiBatchFault(ArrayList<ApiBatchFault> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApiBatchFault dataObject : dataObjects)
            {
                outputApiBatchFault(dataObject);
            }
        }
    }
    static void outputApiFault(ApiFault dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputApiFault * * *");
            outputStatusMessage("OperationErrors:");
            outputArrayOfOperationError(dataObject.getOperationErrors());
            if(dataObject instanceof ApiBatchFault)
            {
                outputApiBatchFault((ApiBatchFault)dataObject);
            }
            outputStatusMessage("* * * End OutputApiFault * * *");
        }
    }
    static void outputArrayOfApiFault(ArrayList<ApiFault> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApiFault dataObject : dataObjects)
            {
                outputApiFault(dataObject);
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
            if(dataObject instanceof ApiFault)
            {
                outputApiFault((ApiFault)dataObject);
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
    static void outputBillingDocument(BillingDocument dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBillingDocument * * *");
            outputStatusMessage(String.format("Data: %s", dataObject.getData()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            outputStatusMessage("* * * End OutputBillingDocument * * *");
        }
    }
    static void outputArrayOfBillingDocument(ArrayOfBillingDocument dataObjects)
    {
        if (null != dataObjects)
        {
            for (BillingDocument dataObject : dataObjects.getBillingDocuments())
            {
                outputBillingDocument(dataObject);
            }
        }
    }
    static void outputBillingDocumentInfo(BillingDocumentInfo dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputBillingDocumentInfo * * *");
            outputStatusMessage(String.format("AccountId: %s", dataObject.getAccountId()));
            outputStatusMessage(String.format("AccountName: %s", dataObject.getAccountName()));
            outputStatusMessage(String.format("AccountNumber: %s", dataObject.getAccountNumber()));
            outputStatusMessage(String.format("Amount: %s", dataObject.getAmount()));
            outputStatusMessage(String.format("CurrencyCode: %s", dataObject.getCurrencyCode()));
            outputStatusMessage(String.format("DocumentDate: %s", dataObject.getDocumentDate()));
            outputStatusMessage(String.format("DocumentId: %s", dataObject.getDocumentId()));
            outputStatusMessage(String.format("CustomerId: %s", dataObject.getCustomerId()));
            outputStatusMessage("* * * End OutputBillingDocumentInfo * * *");
        }
    }
    static void outputArrayOfBillingDocumentInfo(ArrayOfBillingDocumentInfo dataObjects)
    {
        if (null != dataObjects)
        {
            for (BillingDocumentInfo dataObject : dataObjects.getBillingDocumentInfos())
            {
                outputBillingDocumentInfo(dataObject);
            }
        }
    }
    static void outputInsertionOrder(InsertionOrder dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputInsertionOrder * * *");
            outputStatusMessage(String.format("AccountId: %s", dataObject.getAccountId()));
            outputStatusMessage(String.format("BookingCountryCode: %s", dataObject.getBookingCountryCode()));
            outputStatusMessage(String.format("Comment: %s", dataObject.getComment()));
            outputStatusMessage(String.format("EndDate: %s", dataObject.getEndDate()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("LastModifiedByUserId: %s", dataObject.getLastModifiedByUserId()));
            outputStatusMessage(String.format("LastModifiedTime: %s", dataObject.getLastModifiedTime()));
            outputStatusMessage(String.format("NotificationThreshold: %s", dataObject.getNotificationThreshold()));
            outputStatusMessage(String.format("ReferenceId: %s", dataObject.getReferenceId()));
            outputStatusMessage(String.format("SpendCapAmount: %s", dataObject.getSpendCapAmount()));
            outputStatusMessage(String.format("StartDate: %s", dataObject.getStartDate()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
            outputStatusMessage(String.format("PurchaseOrder: %s", dataObject.getPurchaseOrder()));
            outputStatusMessage("PendingChanges:");
            outputInsertionOrderPendingChanges(dataObject.getPendingChanges());
            outputStatusMessage(String.format("AccountNumber: %s", dataObject.getAccountNumber()));
            outputStatusMessage(String.format("BudgetRemaining: %s", dataObject.getBudgetRemaining()));
            outputStatusMessage(String.format("BudgetSpent: %s", dataObject.getBudgetSpent()));
            outputStatusMessage(String.format("BudgetRemainingPercent: %s", dataObject.getBudgetRemainingPercent()));
            outputStatusMessage(String.format("BudgetSpentPercent: %s", dataObject.getBudgetSpentPercent()));
            outputStatusMessage(String.format("SeriesName: %s", dataObject.getSeriesName()));
            outputStatusMessage(String.format("IsInSeries: %s", dataObject.getIsInSeries()));
            outputStatusMessage(String.format("SeriesFrequencyType: %s", dataObject.getSeriesFrequencyType()));
            outputStatusMessage("* * * End OutputInsertionOrder * * *");
        }
    }
    static void outputArrayOfInsertionOrder(ArrayOfInsertionOrder dataObjects)
    {
        if (null != dataObjects)
        {
            for (InsertionOrder dataObject : dataObjects.getInsertionOrders())
            {
                outputInsertionOrder(dataObject);
            }
        }
    }
    static void outputInsertionOrderPendingChanges(InsertionOrderPendingChanges dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputInsertionOrderPendingChanges * * *");
            outputStatusMessage(String.format("Comment: %s", dataObject.getComment()));
            outputStatusMessage(String.format("EndDate: %s", dataObject.getEndDate()));
            outputStatusMessage(String.format("RequestedByUserId: %s", dataObject.getRequestedByUserId()));
            outputStatusMessage(String.format("ModifiedDateTime: %s", dataObject.getModifiedDateTime()));
            outputStatusMessage(String.format("NotificationThreshold: %s", dataObject.getNotificationThreshold()));
            outputStatusMessage(String.format("ReferenceId: %s", dataObject.getReferenceId()));
            outputStatusMessage(String.format("SpendCapAmount: %s", dataObject.getSpendCapAmount()));
            outputStatusMessage(String.format("StartDate: %s", dataObject.getStartDate()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("PurchaseOrder: %s", dataObject.getPurchaseOrder()));
            outputStatusMessage(String.format("ChangeStatus: %s", dataObject.getChangeStatus()));
            outputStatusMessage("* * * End OutputInsertionOrderPendingChanges * * *");
        }
    }
    static void outputArrayOfInsertionOrderPendingChanges(ArrayList<InsertionOrderPendingChanges> dataObjects)
    {
        if (null != dataObjects)
        {
            for (InsertionOrderPendingChanges dataObject : dataObjects)
            {
                outputInsertionOrderPendingChanges(dataObject);
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
    static void outputOrderBy(OrderBy dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputOrderBy * * *");
            outputStatusMessage(String.format("Field: %s", dataObject.getField()));
            outputStatusMessage(String.format("Order: %s", dataObject.getOrder()));
            outputStatusMessage("* * * End OutputOrderBy * * *");
        }
    }
    static void outputArrayOfOrderBy(ArrayOfOrderBy dataObjects)
    {
        if (null != dataObjects)
        {
            for (OrderBy dataObject : dataObjects.getOrderBies())
            {
                outputOrderBy(dataObject);
            }
        }
    }
    static void outputPaging(Paging dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputPaging * * *");
            outputStatusMessage(String.format("Index: %s", dataObject.getIndex()));
            outputStatusMessage(String.format("Size: %s", dataObject.getSize()));
            outputStatusMessage("* * * End OutputPaging * * *");
        }
    }
    static void outputArrayOfPaging(ArrayList<Paging> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Paging dataObject : dataObjects)
            {
                outputPaging(dataObject);
            }
        }
    }
    static void outputPredicate(Predicate dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputPredicate * * *");
            outputStatusMessage(String.format("Field: %s", dataObject.getField()));
            outputStatusMessage(String.format("Operator: %s", dataObject.getOperator()));
            outputStatusMessage(String.format("Value: %s", dataObject.getValue()));
            outputStatusMessage("* * * End OutputPredicate * * *");
        }
    }
    static void outputArrayOfPredicate(ArrayOfPredicate dataObjects)
    {
        if (null != dataObjects)
        {
            for (Predicate dataObject : dataObjects.getPredicates())
            {
                outputPredicate(dataObject);
            }
        }
    }
    static void outputDataType(DataType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (DataType value : DataType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfDataType(ArrayList<DataType> valueSets)
    {
        if (null != valueSets)
        {
            for (DataType valueSet : valueSets)
            {
                outputDataType(valueSet);
            }
        }
    }
    static void outputInsertionOrderStatus(InsertionOrderStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (InsertionOrderStatus value : InsertionOrderStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfInsertionOrderStatus(ArrayList<InsertionOrderStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (InsertionOrderStatus valueSet : valueSets)
            {
                outputInsertionOrderStatus(valueSet);
            }
        }
    }
    static void outputInsertionOrderPendingChangesStatus(InsertionOrderPendingChangesStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (InsertionOrderPendingChangesStatus value : InsertionOrderPendingChangesStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfInsertionOrderPendingChangesStatus(ArrayList<InsertionOrderPendingChangesStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (InsertionOrderPendingChangesStatus valueSet : valueSets)
            {
                outputInsertionOrderPendingChangesStatus(valueSet);
            }
        }
    }
    static void outputPredicateOperator(PredicateOperator valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (PredicateOperator value : PredicateOperator.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfPredicateOperator(ArrayList<PredicateOperator> valueSets)
    {
        if (null != valueSets)
        {
            for (PredicateOperator valueSet : valueSets)
            {
                outputPredicateOperator(valueSet);
            }
        }
    }
    static void outputOrderByField(OrderByField valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (OrderByField value : OrderByField.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfOrderByField(ArrayList<OrderByField> valueSets)
    {
        if (null != valueSets)
        {
            for (OrderByField valueSet : valueSets)
            {
                outputOrderByField(valueSet);
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
    // Prints the string to System.out
    static void outputStatusMessage(java.lang.String message)
    {
        System.out.println(message);
    }
}