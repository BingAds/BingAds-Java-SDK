package com.microsoft.bingads.api.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.OAuthAuthCodeForDesktopMobileAppTest;
import com.microsoft.bingads.OAuthAuthCodeForWebAppTest;
import com.microsoft.bingads.OAuthImplicitGrantForDesktopMobileAppTest;
import com.microsoft.bingads.api.internal.oauth.LiveComOAuthServiceTest;

@RunWith(Suite.class)
@SuiteClasses({LiveComOAuthServiceTest.class,
    OAuthAuthCodeForDesktopMobileAppTest.class,
    OAuthAuthCodeForWebAppTest.class,
    OAuthImplicitGrantForDesktopMobileAppTest.class
})
public class OAuthTests {

}
