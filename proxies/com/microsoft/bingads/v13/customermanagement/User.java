
package com.microsoft.bingads.v13.customermanagement;

import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="User">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ContactInfo" type="{https://bingads.microsoft.com/Customer/v13/Entities}ContactInfo" minOccurs="0"/>
 *         <element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="LastModifiedByUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="LastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Lcid" type="{https://bingads.microsoft.com/Customer/v13/Entities}LCID" minOccurs="0"/>
 *         <element name="Name" type="{https://bingads.microsoft.com/Customer/v13/Entities}PersonName" minOccurs="0"/>
 *         <element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SecretAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SecretQuestion" type="{https://bingads.microsoft.com/Customer/v13/Entities}SecretQuestion" minOccurs="0"/>
 *         <element name="UserLifeCycleStatus" type="{https://bingads.microsoft.com/Customer/v13/Entities}UserLifeCycleStatus" minOccurs="0"/>
 *         <element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         <element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         <element name="AuthenticationToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "contactInfo",
    "customerId",
    "id",
    "jobTitle",
    "lastModifiedByUserId",
    "lastModifiedTime",
    "lcid",
    "name",
    "password",
    "secretAnswer",
    "secretQuestion",
    "userLifeCycleStatus",
    "timeStamp",
    "userName",
    "forwardCompatibilityMap",
    "authenticationToken"
})
public class User {

    @XmlElement(name = "ContactInfo", nillable = true)
    protected ContactInfo contactInfo;
    @XmlElement(name = "CustomerId", nillable = true)
    protected Long customerId;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "JobTitle", nillable = true)
    protected String jobTitle;
    @XmlElement(name = "LastModifiedByUserId", nillable = true)
    protected Long lastModifiedByUserId;
    @XmlElement(name = "LastModifiedTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastModifiedTime;
    @XmlElement(name = "Lcid", nillable = true)
    @XmlSchemaType(name = "string")
    protected LCID lcid;
    @XmlElement(name = "Name", nillable = true)
    protected PersonName name;
    @XmlElement(name = "Password", nillable = true)
    protected String password;
    @XmlElement(name = "SecretAnswer", nillable = true)
    protected String secretAnswer;
    @XmlElement(name = "SecretQuestion")
    @XmlSchemaType(name = "string")
    protected SecretQuestion secretQuestion;
    @XmlElement(name = "UserLifeCycleStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected UserLifeCycleStatus userLifeCycleStatus;
    @XmlElement(name = "TimeStamp", nillable = true)
    protected byte[] timeStamp;
    @XmlElement(name = "UserName", nillable = true)
    protected String userName;
    @XmlElement(name = "ForwardCompatibilityMap", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;
    @XmlElement(name = "AuthenticationToken", nillable = true)
    protected String authenticationToken;

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo }
     *     
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setContactInfo(ContactInfo value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the lastModifiedByUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastModifiedByUserId() {
        return lastModifiedByUserId;
    }

    /**
     * Sets the value of the lastModifiedByUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastModifiedByUserId(Long value) {
        this.lastModifiedByUserId = value;
    }

    /**
     * Gets the value of the lastModifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the value of the lastModifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedTime(Calendar value) {
        this.lastModifiedTime = value;
    }

    /**
     * Gets the value of the lcid property.
     * 
     * @return
     *     possible object is
     *     {@link LCID }
     *     
     */
    public LCID getLcid() {
        return lcid;
    }

    /**
     * Sets the value of the lcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link LCID }
     *     
     */
    public void setLcid(LCID value) {
        this.lcid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setName(PersonName value) {
        this.name = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the secretAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecretAnswer() {
        return secretAnswer;
    }

    /**
     * Sets the value of the secretAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecretAnswer(String value) {
        this.secretAnswer = value;
    }

    /**
     * Gets the value of the secretQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link SecretQuestion }
     *     
     */
    public SecretQuestion getSecretQuestion() {
        return secretQuestion;
    }

    /**
     * Sets the value of the secretQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecretQuestion }
     *     
     */
    public void setSecretQuestion(SecretQuestion value) {
        this.secretQuestion = value;
    }

    /**
     * Gets the value of the userLifeCycleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UserLifeCycleStatus }
     *     
     */
    public UserLifeCycleStatus getUserLifeCycleStatus() {
        return userLifeCycleStatus;
    }

    /**
     * Sets the value of the userLifeCycleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLifeCycleStatus }
     *     
     */
    public void setUserLifeCycleStatus(UserLifeCycleStatus value) {
        this.userLifeCycleStatus = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTimeStamp(byte[] value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the forwardCompatibilityMap property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public ArrayOfKeyValuePairOfstringstring getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }

    /**
     * Sets the value of the forwardCompatibilityMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public void setForwardCompatibilityMap(ArrayOfKeyValuePairOfstringstring value) {
        this.forwardCompatibilityMap = value;
    }

    /**
     * Gets the value of the authenticationToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationToken() {
        return authenticationToken;
    }

    /**
     * Sets the value of the authenticationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationToken(String value) {
        this.authenticationToken = value;
    }

}
