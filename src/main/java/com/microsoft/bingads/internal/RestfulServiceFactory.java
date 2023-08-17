package com.microsoft.bingads.internal;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.internal.restful.CampaignManagementRestfulServiceClient;
import com.microsoft.bingads.internal.restful.RestfulServiceClient;

public class RestfulServiceFactory {

    public static RestfulServiceClient createServiceClient(AuthorizationData authorizationData, ApiEnvironment environment, Class serviceInterface) {
        switch (serviceInterface.getSimpleName()) {
        case "ICampaignManagementService":
            return new CampaignManagementRestfulServiceClient(authorizationData, environment, serviceInterface);
        }
        return null;
    }

}
