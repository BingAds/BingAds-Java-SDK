
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AutoApplyOptInStatusInputs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "autoApplyOptInStatusInputs"
})
@XmlRootElement(name = "SetAutoApplyOptInStatusRequest")
public class SetAutoApplyOptInStatusRequest {

    @XmlElement(name = "AutoApplyOptInStatusInputs", nillable = true)
    protected ArrayOfstring autoApplyOptInStatusInputs;

    /**
     * Gets the value of the autoApplyOptInStatusInputs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getAutoApplyOptInStatusInputs() {
        return autoApplyOptInStatusInputs;
    }

    /**
     * Sets the value of the autoApplyOptInStatusInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setAutoApplyOptInStatusInputs(ArrayOfstring value) {
        this.autoApplyOptInStatusInputs = value;
    }

}
