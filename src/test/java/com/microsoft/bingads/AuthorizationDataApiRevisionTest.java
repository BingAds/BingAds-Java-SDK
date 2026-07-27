package com.microsoft.bingads;

import com.microsoft.bingads.v13.campaignmanagement.ICampaignManagementService;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.regex.Pattern;

public class AuthorizationDataApiRevisionTest {

    private static final Pattern STRICT_YMD = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

    // Minimal Authentication stub — addHeaders is a no-op.
    private static final Authentication NO_OP_AUTH = new Authentication() {
        @Override
        public void addHeaders(HeadersImpl headersImplementation) {}
    };

    @Test
    public void sdkApiRevision_isStrictYyyyMmDd() {
        // Catches a release-time typo in SDK_API_REVISION before the SDK ships.
        Assert.assertTrue(
            "SDK_API_REVISION '" + ServiceClient.SDK_API_REVISION + "' is not strict yyyy-MM-dd",
            STRICT_YMD.matcher(ServiceClient.SDK_API_REVISION).matches());
    }

    @Test
    public void buildHeaders_alwaysContainsSdkApiRevision() {
        AuthorizationData data = new AuthorizationData();
        data.setDeveloperToken("dev");
        data.setAuthentication(NO_OP_AUTH);

        ServiceClient<ICampaignManagementService> client =
            new ServiceClient<>(data, ICampaignManagementService.class);

        Map<String, String> headers = client.buildHeaders();

        Assert.assertEquals(ServiceClient.SDK_API_REVISION, headers.get("Api-Revision"));
    }
}
