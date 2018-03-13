package com.microsoft.bingads.v11.internal.bulk;

import com.microsoft.bingads.internal.UriOAuthServiceTest;
import com.microsoft.bingads.internal.OAuthAuthCodeForDesktopMobileAppTest;
import com.microsoft.bingads.internal.OAuthAuthCodeForWebAppTest;
import com.microsoft.bingads.internal.OAuthImplicitGrantForDesktopMobileAppTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({UriOAuthServiceTest.class,
    OAuthAuthCodeForDesktopMobileAppTest.class,
    OAuthAuthCodeForWebAppTest.class,
    OAuthImplicitGrantForDesktopMobileAppTest.class
})
public class OAuthTests {

}
