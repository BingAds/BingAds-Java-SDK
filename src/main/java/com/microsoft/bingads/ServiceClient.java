package com.microsoft.bingads;

import java.util.Map;
import java.util.HashMap;

import com.microsoft.bingads.internal.IRestfulServiceFactory;
import com.microsoft.bingads.internal.OAuthWithAuthorizationCode;
import com.microsoft.bingads.internal.RestfulServiceFactoryFactory;
import com.microsoft.bingads.internal.ServiceUtils;
import com.microsoft.bingads.v13.adinsight.IAdInsightService;
import com.microsoft.bingads.v13.bulk.IBulkService;
import com.microsoft.bingads.v13.campaignmanagement.ICampaignManagementService;
import com.microsoft.bingads.v13.customerbilling.ICustomerBillingService;
import com.microsoft.bingads.v13.customermanagement.ICustomerManagementService;
import com.microsoft.bingads.v13.reporting.IReportingService;

/**
 * Provides an interface for calling the methods of the specified Bing Ads service.
 * <p>
 *     Note: Valid value of {@link T} are:
 *     <ul>
 *         <li>{@link IAdInsightService}</li>
 *         <li>{@link IBulkService}</li>
 *         <li>{@link ICampaignManagementService}</li>
 *         <li>{@link ICustomerBillingService}</li>
 *         <li>{@link ICustomerManagementService}</li>
 *         <li>{@link IReportingService}</li>
 *     </ul>
 *
 * </p>
 *
 * @param <T> The Bing Ads service interface that should be called. For example, {@link ICampaignManagementService}.
 *
 */
public class ServiceClient<T> {

    /**
     * The revision date this SDK was built against, sent as the Api-Revision HTTP header on every outgoing
     * request. Update in the same PR that bumps the SDK version in pom.xml.
     *
     * <p>Initialised in a static block (not via a compile-time-constant String literal initializer) so that
     * consuming JARs read the value from this SDK at runtime. A {@code public static final String} initialised
     * by a compile-time constant expression (JLS §15.28, §4.12.4, §13.4.9) would be inlined into every
     * consumer's {@code .class} file, leaving downstream JARs pinned to the date that was current when they
     * were compiled — even after this SDK ships a newer one.</p>
     */
    public static final String SDK_API_REVISION;

    static {
        SDK_API_REVISION = "2026-05-20";
    }

    private final AuthorizationData authorizationData;

    private final Class<T> serviceInterface;
    private final IRestfulServiceFactory restfulServiceFactory;
    private ApiEnvironment environment;

    /**
     * Gets the Bing Ads API environment.
     */
    public ApiEnvironment getEnvironment() {
        return environment;
    }

    /**
     * Gets the data representing a user who intends to call the API.
     */
    public AuthorizationData getAuthorizationData() {
        return authorizationData;
    }

    /**
     * Initializes a new instance of this class with the specified authorization data.
     *
     * @param authorizationData Represents a user who intends to access the corresponding customer and account.
     * @param serviceInterface the Bing Ads service interface that should be called
     */
    public ServiceClient(AuthorizationData authorizationData, Class<T> serviceInterface) {
        this(authorizationData, null, serviceInterface);
    }    

    /**
     * Initializes a new instance of this class with the specified authorization data and Bing Ads API environment.
     *
     * @param authorizationData Represents a user who intends to access the corresponding customer and account.
     * @param environment Bing Ads API environment
     * @param serviceInterface the Bing Ads service interface that should be called
     */
    public ServiceClient(AuthorizationData authorizationData, ApiEnvironment environment, Class<T> serviceInterface) {
        this.authorizationData = authorizationData;
        this.serviceInterface = serviceInterface;
        
        if (environment == null) {
            if (authorizationData.getAuthentication() != null) {
                environment = authorizationData.getAuthentication().getEnvironment();
            }
        }

        if (environment == null) {
            environment = ServiceUtils.getEnvironmentFromConfig();
        }

        if (environment == null) {
            environment = ApiEnvironment.PRODUCTION;
        }

        this.environment = environment;
        
        restfulServiceFactory = RestfulServiceFactoryFactory.createServiceFactory();
    }

    /**
     * Creates an object implementing the service interface that needs to be called.
     *
     * @return the service object implementing the service interface
     */
    public T getService() {
        authorizationData.validate();

        final Map<String, String> headers = buildHeaders();
        
        return createRestService(headers);        
    }

    Map<String, String> buildHeaders() {
        final Map<String, String> headers = new HashMap<String, String>();

        headers.put("CustomerAccountId", Long.toString(authorizationData.getAccountId()));

        headers.put("CustomerId", Long.toString(authorizationData.getCustomerId()));

        headers.put("DeveloperToken", authorizationData.getDeveloperToken());

        Authentication authentication = authorizationData.getAuthentication();

        if (authentication instanceof OAuthWithAuthorizationCode) {
            ((OAuthWithAuthorizationCode) authentication).refreshTokensIfNeeded(false);            
        }

        authentication.addHeaders(new HeadersImpl() {
            @Override
            public void addHeader(String name, String value) {
                headers.put(name, value);
            }
        });

        headers.put("Api-Revision", SDK_API_REVISION);

        return headers;
    }

    T createRestService(Map<String, String> headers) {        
        return restfulServiceFactory.createServiceClient(headers, environment, serviceInterface);
    }
}
