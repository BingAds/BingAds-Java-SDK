package com.microsoft.bingads.examples.v11;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;
import com.microsoft.bingads.*;
import com.microsoft.bingads.v11.customerbilling.*;

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
        ArrayOflong documentIds,
        DataType type) throws RemoteException, Exception
    {
        GetBillingDocumentsRequest request = new GetBillingDocumentsRequest();

        request.setDocumentIds(documentIds);
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
    static GetInsertionOrdersByAccountResponse getInsertionOrdersByAccount(
        java.lang.Long accountId,
        ArrayOflong insertionOrderIds) throws RemoteException, Exception
    {
        GetInsertionOrdersByAccountRequest request = new GetInsertionOrdersByAccountRequest();

        request.setAccountId(accountId);
        request.setInsertionOrderIds(insertionOrderIds);

        return CustomerBillingService.getService().getInsertionOrdersByAccount(request);
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
    static void outputApiBatchFault(ApiBatchFault dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfBatchError(dataObject.getBatchErrors());
        }
    }
    static void outputArrayOfApiBatchFault(ArrayList<ApiBatchFault> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApiBatchFault dataObject : dataObjects)
            {
                outputApiBatchFault(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputApiFault(ApiFault dataObject)
    {
        if (null != dataObject)
        {
            outputArrayOfOperationError(dataObject.getOperationErrors());
            if(dataObject instanceof ApiBatchFault)
            {
                outputApiBatchFault((ApiBatchFault)dataObject);
            }
        }
    }
    static void outputArrayOfApiFault(ArrayList<ApiFault> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApiFault dataObject : dataObjects)
            {
                outputApiFault(dataObject);
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
            if(dataObject instanceof ApiFault)
            {
                outputApiFault((ApiFault)dataObject);
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
    static void outputBillingDocument(BillingDocument dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Data: %s", dataObject.getData()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
        }
    }
    static void outputArrayOfBillingDocument(ArrayOfBillingDocument dataObjects)
    {
        if (null != dataObjects)
        {
            for (BillingDocument dataObject : dataObjects.getBillingDocuments())
            {
                outputBillingDocument(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputBillingDocumentInfo(BillingDocumentInfo dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountId: %s", dataObject.getAccountId()));
            outputStatusMessage(String.format("AccountName: %s", dataObject.getAccountName()));
            outputStatusMessage(String.format("AccountNumber: %s", dataObject.getAccountNumber()));
            outputStatusMessage(String.format("Amount: %s", dataObject.getAmount()));
            outputStatusMessage(String.format("CurrencyCode: %s", dataObject.getCurrencyCode()));
            outputStatusMessage(String.format("DocumentDate: %s", dataObject.getDocumentDate()));
            outputStatusMessage(String.format("DocumentId: %s", dataObject.getDocumentId()));
        }
    }
    static void outputArrayOfBillingDocumentInfo(ArrayOfBillingDocumentInfo dataObjects)
    {
        if (null != dataObjects)
        {
            for (BillingDocumentInfo dataObject : dataObjects.getBillingDocumentInfos())
            {
                outputBillingDocumentInfo(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputInsertionOrder(InsertionOrder dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("AccountId: %s", dataObject.getAccountId()));
            outputStatusMessage(String.format("BalanceAmount: %s", dataObject.getBalanceAmount()));
            outputStatusMessage(String.format("BookingCountryCode: %s", dataObject.getBookingCountryCode()));
            outputStatusMessage(String.format("Comment: %s", dataObject.getComment()));
            outputStatusMessage(String.format("EndDate: %s", dataObject.getEndDate()));
            outputStatusMessage(String.format("InsertionOrderId: %s", dataObject.getInsertionOrderId()));
            outputStatusMessage(String.format("LastModifiedByUserId: %s", dataObject.getLastModifiedByUserId()));
            outputStatusMessage(String.format("LastModifiedTime: %s", dataObject.getLastModifiedTime()));
            outputStatusMessage(String.format("NotificationThreshold: %s", dataObject.getNotificationThreshold()));
            outputStatusMessage(String.format("ReferenceId: %s", dataObject.getReferenceId()));
            outputStatusMessage(String.format("SpendCapAmount: %s", dataObject.getSpendCapAmount()));
            outputStatusMessage(String.format("StartDate: %s", dataObject.getStartDate()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
            outputStatusMessage(String.format("PurchaseOrder: %s", dataObject.getPurchaseOrder()));
            outputStatusMessage(String.format("ChangePendingReview: %s", dataObject.getChangePendingReview()));
        }
    }
    static void outputArrayOfInsertionOrder(ArrayOfInsertionOrder dataObjects)
    {
        if (null != dataObjects)
        {
            for (InsertionOrder dataObject : dataObjects.getInsertionOrders())
            {
                outputInsertionOrder(dataObject);
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
    static void outputOrderBy(OrderBy dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Field: %s", dataObject.getField()));
            outputStatusMessage(String.format("Order: %s", dataObject.getOrder()));
        }
    }
    static void outputArrayOfOrderBy(ArrayOfOrderBy dataObjects)
    {
        if (null != dataObjects)
        {
            for (OrderBy dataObject : dataObjects.getOrderBies())
            {
                outputOrderBy(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputPaging(Paging dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Index: %s", dataObject.getIndex()));
            outputStatusMessage(String.format("Size: %s", dataObject.getSize()));
        }
    }
    static void outputArrayOfPaging(ArrayList<Paging> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Paging dataObject : dataObjects)
            {
                outputPaging(dataObject);
                outputStatusMessage("\n");
            }
        }
    }
    static void outputPredicate(Predicate dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage(String.format("Field: %s", dataObject.getField()));
            outputStatusMessage(String.format("Operator: %s", dataObject.getOperator()));
            outputStatusMessage(String.format("Value: %s", dataObject.getValue()));
        }
    }
    static void outputArrayOfPredicate(ArrayOfPredicate dataObjects)
    {
        if (null != dataObjects)
        {
            for (Predicate dataObject : dataObjects.getPredicates())
            {
                outputPredicate(dataObject);
                outputStatusMessage("\n");
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