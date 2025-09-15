
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="Lcid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="BreakdownReturnCategory" type="{https://bingads.microsoft.com/AdInsight/v13}BreakdownCategory" minOccurs="0"/>
 *         <element name="MultiAdTypes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "lcid",
    "breakdownReturnCategory",
    "multiAdTypes"
})
@XmlRootElement(name = "GetAudienceBreakdownRequest")
public class GetAudienceBreakdownRequest {

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
    @XmlElement(name = "Lcid", nillable = true)
    protected Integer lcid;
    @XmlElement(name = "BreakdownReturnCategory")
    @XmlSchemaType(name = "string")
    protected BreakdownCategory breakdownReturnCategory;
    @XmlElement(name = "MultiAdTypes", nillable = true)
    protected Integer multiAdTypes;

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
     * Gets the value of the lcid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLcid() {
        return lcid;
    }

    /**
     * Sets the value of the lcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLcid(Integer value) {
        this.lcid = value;
    }

    /**
     * Gets the value of the breakdownReturnCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BreakdownCategory }
     *     
     */
    public BreakdownCategory getBreakdownReturnCategory() {
        return breakdownReturnCategory;
    }

    /**
     * Sets the value of the breakdownReturnCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreakdownCategory }
     *     
     */
    public void setBreakdownReturnCategory(BreakdownCategory value) {
        this.breakdownReturnCategory = value;
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

}
