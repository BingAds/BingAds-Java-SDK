package com.microsoft.bingads;

import org.apache.http.HttpRequest;

import com.microsoft.bingads.internal.oauth.HttpHeaders;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;

/**
 * Represents a legacy Bing Ads user name and password set. You can use an
 * instance of this class as the Authentication property of a
 * {@link AuthorizationData} object to authenticate with Bing Ads services.
 *
 * Existing users with legacy Bing Ads credentials may continue to specify the
 * UserName and Password header elements. In future versions of the API, Bing
 * Ads will transition exclusively to Microsoft Account authentication. New
 * customers are required to sign up for Bing Ads with a Microsoft Account, and
 * to manage those accounts you must use OAuth. For example instead of using
 * this PasswordAuthentication class, you would authenticate with an instance of
 * either
 * {@link OAuthDesktopMobileAuthCodeGrant}, {@link OAuthDesktopMobileImplicitGrant},
 * or {@link OAuthWebAuthCodeGrant}.
 *
 */
public class PasswordAuthentication extends Authentication {

    private String userName;
    private String password;

    /**
     * Initializes a new instance of the PasswordAuthentication class.
     *
     * @param userName The Bing Ads user's sign-in user name. You may not set
     * this element to a Microsoft account.
     * @param password The Bing Ads user's sign-in password.
     */
    public PasswordAuthentication(String userName, String password) {
        super();
        this.userName = userName;
        this.password = password;
    }

    /**
     * Adds the UserName and Password web client authentication header elements
     * for the corresponding bulk file upload operation.
     *
     * @param request The request to which add the headers to
     */
    @Override
    public void addAuthenticationHeadersToFileUploadRequest(HttpRequest request) {
        request.addHeader(HttpHeaders.USER_NAME, this.userName);
        request.addHeader(HttpHeaders.PASSWORD, this.password);
    }
    
    @Override
    public void addAuthenticationHeadersApiRequest(List<Header> headers, String namespace) {
        try {
            headers.add(new Header(new QName(namespace, HttpHeaders.USER_NAME), this.userName, new JAXBDataBinding(String.class)));        
            headers.add(new Header(new QName(namespace, HttpHeaders.PASSWORD), this.password, new JAXBDataBinding(String.class)));
        } catch (JAXBException ex) {
            throw new InternalException(ex);
        }
    }
    
    @Override
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
