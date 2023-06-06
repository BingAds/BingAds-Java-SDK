
package com.microsoft.bingads.v13.adinsight;

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
 *         <element name="AutoApplyRecommendationsStatus" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfAutoApplyRecommendationsInfo" minOccurs="0"/>
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
    "autoApplyRecommendationsStatus"
})
@XmlRootElement(name = "GetAutoApplyOptInStatusResponse")
public class GetAutoApplyOptInStatusResponse {

    @XmlElement(name = "AutoApplyRecommendationsStatus", nillable = true)
    protected ArrayOfAutoApplyRecommendationsInfo autoApplyRecommendationsStatus;

    /**
     * Gets the value of the autoApplyRecommendationsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAutoApplyRecommendationsInfo }
     *     
     */
    public ArrayOfAutoApplyRecommendationsInfo getAutoApplyRecommendationsStatus() {
        return autoApplyRecommendationsStatus;
    }

    /**
     * Sets the value of the autoApplyRecommendationsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAutoApplyRecommendationsInfo }
     *     
     */
    public void setAutoApplyRecommendationsStatus(ArrayOfAutoApplyRecommendationsInfo value) {
        this.autoApplyRecommendationsStatus = value;
    }

}
