
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
    "annotationOptOuts"
})
@XmlRootElement(name = "UpdateAnnotationOptOutRequest")
public class UpdateAnnotationOptOutRequest {

    @XmlElement(name = "Justification", nillable = true)
    protected String justification;
    @XmlElement(name = "AnnotationOptOuts", nillable = true)
    protected ArrayOfAnnotationOptOut annotationOptOuts;

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

}
