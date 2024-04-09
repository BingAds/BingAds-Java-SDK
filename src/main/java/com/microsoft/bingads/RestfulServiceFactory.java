package com.microsoft.bingads;

import java.util.Map;
import java.util.function.Supplier;

import com.microsoft.bingads.internal.restful.CampaignManagementService;
import com.microsoft.bingads.internal.restful.ReportingService;
import com.microsoft.bingads.internal.restful.BulkService;
import com.microsoft.bingads.v13.bulk.IBulkService;
import com.microsoft.bingads.v13.campaignmanagement.ICampaignManagementService;
import com.microsoft.bingads.v13.reporting.IReportingService;

public class RestfulServiceFactory {

    public static <T> T createServiceClient(Authentication authentication, Map<String, String> headers, ApiEnvironment environment, Class<T> serviceInterface, Supplier<T> createSoapPort) {
        if (serviceInterface == ICampaignManagementService.class) {
            return serviceInterface.cast(new CampaignManagementService(authentication, headers, environment, () -> (ICampaignManagementService)createSoapPort.get()));
        }
        if (serviceInterface == IBulkService.class) {
            return serviceInterface.cast(new BulkService(authentication, headers, environment, () -> (IBulkService)createSoapPort.get()));
        }
        if (serviceInterface == IReportingService.class) {
            return serviceInterface.cast(new ReportingService(authentication, headers, environment, () -> (IReportingService)createSoapPort.get()));
        }        
        throw new InternalException(new Exception("Unknown service interface " + serviceInterface));
    }
}
