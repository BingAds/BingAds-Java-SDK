package com.microsoft.bingads.internal;

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
