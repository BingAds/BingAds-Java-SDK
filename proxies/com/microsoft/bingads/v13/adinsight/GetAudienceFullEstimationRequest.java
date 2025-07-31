
package com.microsoft.bingads.v13.adinsight;

import java.math.BigDecimal;
import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Age" type="{https://bingads.microsoft.com/AdInsight/v13}SelectionOfAgeEnum" minOccurs="0"/>
 *         <element name="Gender" type="{https://bingads.microsoft.com/AdInsight/v13}SelectionOfGenderEnum" minOccurs="0"/>
 *         <element name="Audience" type="{https://bingads.microsoft.com/AdInsight/v13}SelectionOflong" minOccurs="0"/>
 *         <element name="Company" type="{https://bingads.microsoft.com/AdInsight/v13}SelectionOflong" minOccurs="0"/>
 *         <element name="Industry" type="{https://bingads.microsoft.com/AdInsight/v13}SelectionOflong" minOccurs="0"/>
 *         <element name="JobFunction" type="{https://bingads.microsoft.com/AdInsight/v13}SelectionOflong" minOccurs="0"/>
 *         <element name="Location" type="{https://bingads.microsoft.com/AdInsight/v13}SelectionOflong" minOccurs="0"/>
 *         <element name="RadiusTargets" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfRadiusTarget" minOccurs="0"/>
 *         <element name="CampaignBiddingStrategy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CampaignSubType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Feed" type="{https://bingads.microsoft.com/AdInsight/v13}Feed" minOccurs="0"/>
 *         <element name="DailyBudget" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="Bid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="Currency" type="{https://bingads.microsoft.com/AdInsight/v13}Currency" minOccurs="0"/>
 *         <element name="MultiAdTypes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="TotalBudget" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "age",
    "gender",
    "audience",
    "company",
    "industry",
    "jobFunction",
    "location",
    "radiusTargets",
    "campaignBiddingStrategy",
    "campaignSubType",
    "feed",
    "dailyBudget",
    "bid",
    "currency",
    "multiAdTypes",
    "startDate",
    "endDate",
    "totalBudget"
})
@XmlRootElement(name = "GetAudienceFullEstimationRequest")
public class GetAudienceFullEstimationRequest {

    @XmlElement(name = "Age", nillable = true)
    protected SelectionOfAgeEnum age;
    @XmlElement(name = "Gender", nillable = true)
    protected SelectionOfGenderEnum gender;
    @XmlElement(name = "Audience", nillable = true)
    protected SelectionOflong audience;
    @XmlElement(name = "Company", nillable = true)
    protected SelectionOflong company;
    @XmlElement(name = "Industry", nillable = true)
    protected SelectionOflong industry;
    @XmlElement(name = "JobFunction", nillable = true)
    protected SelectionOflong jobFunction;
    @XmlElement(name = "Location", nillable = true)
    protected SelectionOflong location;
    @XmlElement(name = "RadiusTargets", nillable = true)
    protected ArrayOfRadiusTarget radiusTargets;
    @XmlElement(name = "CampaignBiddingStrategy", nillable = true)
    protected Integer campaignBiddingStrategy;
    @XmlElement(name = "CampaignSubType", nillable = true)
    protected Integer campaignSubType;
    @XmlElement(name = "Feed", nillable = true)
    protected Feed feed;
    @XmlElement(name = "DailyBudget", nillable = true)
    protected BigDecimal dailyBudget;
    @XmlElement(name = "Bid", nillable = true)
    protected BigDecimal bid;
    @XmlElement(name = "Currency", nillable = true)
    @XmlSchemaType(name = "string")
    protected Currency currency;
    @XmlElement(name = "MultiAdTypes", nillable = true)
    protected Integer multiAdTypes;
    @XmlElement(name = "StartDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startDate;
    @XmlElement(name = "EndDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endDate;
    @XmlElement(name = "TotalBudget", nillable = true)
    protected BigDecimal totalBudget;

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionOfAgeEnum }
     *     
     */
    public SelectionOfAgeEnum getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionOfAgeEnum }
     *     
     */
    public void setAge(SelectionOfAgeEnum value) {
        this.age = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionOfGenderEnum }
     *     
     */
    public SelectionOfGenderEnum getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionOfGenderEnum }
     *     
     */
    public void setGender(SelectionOfGenderEnum value) {
        this.gender = value;
    }

    /**
     * Gets the value of the audience property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionOflong }
     *     
     */
    public SelectionOflong getAudience() {
        return audience;
    }

    /**
     * Sets the value of the audience property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionOflong }
     *     
     */
    public void setAudience(SelectionOflong value) {
        this.audience = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionOflong }
     *     
     */
    public SelectionOflong getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionOflong }
     *     
     */
    public void setCompany(SelectionOflong value) {
        this.company = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionOflong }
     *     
     */
    public SelectionOflong getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionOflong }
     *     
     */
    public void setIndustry(SelectionOflong value) {
        this.industry = value;
    }

    /**
     * Gets the value of the jobFunction property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionOflong }
     *     
     */
    public SelectionOflong getJobFunction() {
        return jobFunction;
    }

    /**
     * Sets the value of the jobFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionOflong }
     *     
     */
    public void setJobFunction(SelectionOflong value) {
        this.jobFunction = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionOflong }
     *     
     */
    public SelectionOflong getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionOflong }
     *     
     */
    public void setLocation(SelectionOflong value) {
        this.location = value;
    }

    /**
     * Gets the value of the radiusTargets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRadiusTarget }
     *     
     */
    public ArrayOfRadiusTarget getRadiusTargets() {
        return radiusTargets;
    }

    /**
     * Sets the value of the radiusTargets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRadiusTarget }
     *     
     */
    public void setRadiusTargets(ArrayOfRadiusTarget value) {
        this.radiusTargets = value;
    }

    /**
     * Gets the value of the campaignBiddingStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCampaignBiddingStrategy() {
        return campaignBiddingStrategy;
    }

    /**
     * Sets the value of the campaignBiddingStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCampaignBiddingStrategy(Integer value) {
        this.campaignBiddingStrategy = value;
    }

    /**
     * Gets the value of the campaignSubType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCampaignSubType() {
        return campaignSubType;
    }

    /**
     * Sets the value of the campaignSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCampaignSubType(Integer value) {
        this.campaignSubType = value;
    }

    /**
     * Gets the value of the feed property.
     * 
     * @return
     *     possible object is
     *     {@link Feed }
     *     
     */
    public Feed getFeed() {
        return feed;
    }

    /**
     * Sets the value of the feed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Feed }
     *     
     */
    public void setFeed(Feed value) {
        this.feed = value;
    }

    /**
     * Gets the value of the dailyBudget property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDailyBudget() {
        return dailyBudget;
    }

    /**
     * Sets the value of the dailyBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDailyBudget(BigDecimal value) {
        this.dailyBudget = value;
    }

    /**
     * Gets the value of the bid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBid() {
        return bid;
    }

    /**
     * Sets the value of the bid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBid(BigDecimal value) {
        this.bid = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the multiAdTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultiAdTypes() {
        return multiAdTypes;
    }

    /**
     * Sets the value of the multiAdTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultiAdTypes(Integer value) {
        this.multiAdTypes = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(Calendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Calendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the totalBudget property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalBudget() {
        return totalBudget;
    }

    /**
     * Sets the value of the totalBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalBudget(BigDecimal value) {
        this.totalBudget = value;
    }

}
