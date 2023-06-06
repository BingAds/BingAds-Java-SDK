
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
 *         <element name="Result" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfPerformanceInsightsDetail" minOccurs="0"/>
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
    "result"
})
@XmlRootElement(name = "GetPerformanceInsightsDetailDataByAccountIdResponse")
public class GetPerformanceInsightsDetailDataByAccountIdResponse {

    @XmlElement(name = "Result", nillable = true)
    protected ArrayOfPerformanceInsightsDetail result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPerformanceInsightsDetail }
     *     
     */
    public ArrayOfPerformanceInsightsDetail getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPerformanceInsightsDetail }
     *     
     */
    public void setResult(ArrayOfPerformanceInsightsDetail value) {
        this.result = value;
    }

}
