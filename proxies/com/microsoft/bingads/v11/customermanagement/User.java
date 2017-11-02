
package com.microsoft.bingads.v11.customermanagement;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactInfo" type="{https://bingads.microsoft.com/Customer/v11/Entities}ContactInfo" minOccurs="0"/>
 *         &lt;element name="CustomerAppScope" type="{https://bingads.microsoft.com/Customer/v11/Entities}ApplicationType" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedByUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Lcid" type="{https://bingads.microsoft.com/Customer/v11/Entities}LCID" minOccurs="0"/>
 *         &lt;element name="Name" type="{https://bingads.microsoft.com/Customer/v11/Entities}PersonName" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecretAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecretQuestion" type="{https://bingads.microsoft.com/Customer/v11/Entities}SecretQuestion" minOccurs="0"/>
 *         &lt;element name="UserLifeCycleStatus" type="{https://bingads.microsoft.com/Customer/v11/Entities}UserLifeCycleStatus" minOccurs="0"/>
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsMigratedToMicrosoftAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", namespace = "https://bingads.microsoft.com/Customer/v11/Entities", propOrder = {
    "contactInfo",
    "customerAppScope",
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
    "isMigratedToMicrosoftAccount"
})
public class User {

    @XmlElement(name = "ContactInfo", nillable = true)
    protected ContactInfo contactInfo;
    @XmlElement(name = "CustomerAppScope", nillable = true)
    @XmlSchemaType(name = "string")
    protected ApplicationType customerAppScope;
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
    @XmlElement(name = "IsMigratedToMicrosoftAccount")
    protected Boolean isMigratedToMicrosoftAccount;

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
     * Gets the value of the customerAppScope property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType }
     *     
     */
    public ApplicationType getCustomerAppScope() {
        return customerAppScope;
    }

    /**
     * Sets the value of the customerAppScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType }
     *     
     */
    public void setCustomerAppScope(ApplicationType value) {
        this.customerAppScope = value;
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
     * Gets the value of the isMigratedToMicrosoftAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsMigratedToMicrosoftAccount() {
        return isMigratedToMicrosoftAccount;
    }

    /**
     * Sets the value of the isMigratedToMicrosoftAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMigratedToMicrosoftAccount(Boolean value) {
        this.isMigratedToMicrosoftAccount = value;
    }

}
