
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <element name="Justification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AnnotationOptOuts" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAnnotationOptOut" minOccurs="0"/>
 *         <element name="IsAccountOptOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsCustomerOptOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsCustomerOptOutOfEverything" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="PartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBatchError" minOccurs="0"/>
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
    "justification",
    "annotationOptOuts",
    "isAccountOptOut",
    "isCustomerOptOut",
    "isCustomerOptOutOfEverything",
    "partialErrors"
})
@XmlRootElement(name = "GetAnnotationOptOutResponse")
public class GetAnnotationOptOutResponse {

    @XmlElement(name = "Justification", nillable = true)
    protected String justification;
    @XmlElement(name = "AnnotationOptOuts", nillable = true)
    protected ArrayOfAnnotationOptOut annotationOptOuts;
    @XmlElement(name = "IsAccountOptOut")
    protected Boolean isAccountOptOut;
    @XmlElement(name = "IsCustomerOptOut")
    protected Boolean isCustomerOptOut;
    @XmlElement(name = "IsCustomerOptOutOfEverything")
    protected Boolean isCustomerOptOutOfEverything;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;

    /**
     * Gets the value of the justification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustification() {
        return justification;
    }

    /**
     * Sets the value of the justification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustification(String value) {
        this.justification = value;
    }

    /**
     * Gets the value of the annotationOptOuts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnnotationOptOut }
     *     
     */
    public ArrayOfAnnotationOptOut getAnnotationOptOuts() {
        return annotationOptOuts;
    }

    /**
     * Sets the value of the annotationOptOuts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnnotationOptOut }
     *     
     */
    public void setAnnotationOptOuts(ArrayOfAnnotationOptOut value) {
        this.annotationOptOuts = value;
    }

    /**
     * Gets the value of the isAccountOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsAccountOptOut() {
        return isAccountOptOut;
    }

    /**
     * Sets the value of the isAccountOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAccountOptOut(Boolean value) {
        this.isAccountOptOut = value;
    }

    /**
     * Gets the value of the isCustomerOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsCustomerOptOut() {
        return isCustomerOptOut;
    }

    /**
     * Sets the value of the isCustomerOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomerOptOut(Boolean value) {
        this.isCustomerOptOut = value;
    }

    /**
     * Gets the value of the isCustomerOptOutOfEverything property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsCustomerOptOutOfEverything() {
        return isCustomerOptOutOfEverything;
    }

    /**
     * Sets the value of the isCustomerOptOutOfEverything property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomerOptOutOfEverything(Boolean value) {
        this.isCustomerOptOutOfEverything = value;
    }

    /**
     * Gets the value of the partialErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public ArrayOfBatchError getPartialErrors() {
        return partialErrors;
    }

    /**
     * Sets the value of the partialErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public void setPartialErrors(ArrayOfBatchError value) {
        this.partialErrors = value;
    }

}
