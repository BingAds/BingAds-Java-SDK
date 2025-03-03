package com.microsoft.bingads;

import java.util.Map;
import java.util.function.Supplier;

import com.microsoft.bingads.internal.restful.CampaignManagementService;
import com.microsoft.bingads.internal.restful.ReportingService;
import com.microsoft.bingads.internal.restful.BulkService;
import com.microsoft.bingads.internal.restful.CustomerManagementService;
import com.microsoft.bingads.internal.restful.CustomerBillingService;
import com.microsoft.bingads.internal.IRestfulServiceFactory;
import com.microsoft.bingads.internal.restful.AdInsightService;
import com.microsoft.bingads.v13.bulk.IBulkService;
import com.microsoft.bingads.v13.campaignmanagement.ICampaignManagementService;
import com.microsoft.bingads.v13.reporting.IReportingService;
import com.microsoft.bingads.v13.customermanagement.ICustomerManagementService;
import com.microsoft.bingads.v13.customerbilling.ICustomerBillingService;
import com.microsoft.bingads.v13.adinsight.IAdInsightService;

public class RestfulServiceFactory implements IRestfulServiceFactory {

    public <T> T createServiceClient(Map<String, String> headers, ApiEnvironment environment, Class<T> serviceInterface, Supplier<T> createSoapPort) {
        if (serviceInterface == ICampaignManagementService.class) {
            return serviceInterface.cast(new CampaignManagementService(headers, environment, () -> (ICampaignManagementService)createSoapPort.get()));
        }
        if (serviceInterface == IBulkService.class) {
            return serviceInterface.cast(new BulkService(headers, environment, () -> (IBulkService)createSoapPort.get()));
        }
        if (serviceInterface == IReportingService.class) {
            return serviceInterface.cast(new ReportingService(headers, environment, () -> (IReportingService)createSoapPort.get()));
        }
        if (serviceInterface == ICustomerManagementService.class) {
            return serviceInterface.cast(new CustomerManagementService(headers, environment, () -> (ICustomerManagementService)createSoapPort.get()));
        }
        if (serviceInterface == ICustomerBillingService.class) {
            return serviceInterface.cast(new CustomerBillingService(headers, environment, () -> (ICustomerBillingService)createSoapPort.get()));
        }
        if (serviceInterface == IAdInsightService.class) {
            return serviceInterface.cast(new AdInsightService(headers, environment, () -> (IAdInsightService)createSoapPort.get()));
        }
        throw new InternalException(new Exception("Unknown service interface " + serviceInterface));
    }
}
