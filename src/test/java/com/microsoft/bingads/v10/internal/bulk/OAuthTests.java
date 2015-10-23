package com.microsoft.bingads.v10.internal.bulk;

import com.microsoft.bingads.internal.LiveComOAuthServiceTest;
import com.microsoft.bingads.internal.OAuthAuthCodeForDesktopMobileAppTest;
import com.microsoft.bingads.internal.OAuthAuthCodeForWebAppTest;
import com.microsoft.bingads.internal.OAuthImplicitGrantForDesktopMobileAppTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({LiveComOAuthServiceTest.class,
    OAuthAuthCodeForDesktopMobileAppTest.class,
    OAuthAuthCodeForWebAppTest.class,
    OAuthImplicitGrantForDesktopMobileAppTest.class
})
public class OAuthTests {

}
