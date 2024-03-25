package com.microsoft.bingads;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.internal.restful.CampaignManagementRestfulServiceClient;
import com.microsoft.bingads.internal.restful.ReportingRestfulServiceClient;
import com.microsoft.bingads.internal.restful.BulkRestfulServiceClient;
import com.microsoft.bingads.internal.restful.RestfulServiceClient;

public class RestfulServiceFactory {

    public static RestfulServiceClient createServiceClient(AuthorizationData authorizationData, ApiEnvironment environment, Class serviceInterface) {
        switch (serviceInterface.getSimpleName()) {
        case "ICampaignManagementService":
            return new CampaignManagementRestfulServiceClient(authorizationData, environment, serviceInterface);
        case "IBulkService":
            return new BulkRestfulServiceClient(authorizationData, environment, serviceInterface);
        case "IReportingService":
            return new ReportingRestfulServiceClient(authorizationData, environment, serviceInterface);
        }
        
        return null;
    }

}
