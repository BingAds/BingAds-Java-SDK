package com.microsoft.bingads;

import com.microsoft.bingads.internal.HttpHeaders;
import java.util.List;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.http.HttpRequest;

/**
 * Represents a legacy Bing Ads authentication method using user name and password.
 */
public class PasswordAuthentication extends Authentication {

    private String userName;
    private String password;

    /**
     * Initializes a new instance of the PasswordAuthentication class using the specified user name and password.
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
     * Reserved for internal use.
     */
    @Override
    public void addAuthenticationHeadersToFileUploadRequest(HttpRequest request) {
        request.addHeader(HttpHeaders.USER_NAME, this.userName);
        request.addHeader(HttpHeaders.PASSWORD, this.password);
    }

    /**
     * Reserved for internal use.
     */
    @Override
    public void addAuthenticationHeadersApiRequest(List<Header> headers, String namespace) {
        try {
            headers.add(new Header(new QName(namespace, HttpHeaders.USER_NAME), this.userName, new JAXBDataBinding(String.class)));        
            headers.add(new Header(new QName(namespace, HttpHeaders.PASSWORD), this.password, new JAXBDataBinding(String.class)));
        } catch (JAXBException ex) {
            throw new InternalException(ex);
        }
    }
    
    /**
     * Gets the user name.
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the user name.
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Gets the password.
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
