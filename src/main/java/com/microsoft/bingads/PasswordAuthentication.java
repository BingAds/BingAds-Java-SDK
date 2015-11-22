package com.microsoft.bingads;

import com.microsoft.bingads.internal.HttpHeaders;
import java.util.List;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import org.apache.http.HttpRequest;

/**
 * Represents a legacy Bing Ads authentication method using user name and password.
 */
public class PasswordAuthentication extends Authentication {

    private final String userName;
    private final String password;

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

    @Override
    public void addHeaders(HeadersImpl headersImplementation) {
        headersImplementation.addHeader(HttpHeaders.USER_NAME, this.userName);
        headersImplementation.addHeader(HttpHeaders.PASSWORD, this.password);
    }

    /**
     * Gets the user name.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Gets the password.
     */
    public String getPassword() {
        return password;
    }   
}
