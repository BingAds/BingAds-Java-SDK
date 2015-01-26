
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RichAdComponentPerformanceReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RichAdComponentPerformanceReportFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComponentType" type="{https://bingads.microsoft.com/Reporting/v9}ComponentTypeFilter" minOccurs="0"/>
 *         &lt;element name="RichAdSubType" type="{https://bingads.microsoft.com/Reporting/v9}RichAdSubTypeFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RichAdComponentPerformanceReportFilter", propOrder = {
    "componentType",
    "richAdSubType"
})
public class RichAdComponentPerformanceReportFilter {

    @XmlElement(name = "ComponentType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<ComponentTypeFilter> componentType;
    @XmlElement(name = "RichAdSubType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter10 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<RichAdSubTypeFilter> richAdSubType;

    /**
     * Gets the value of the componentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<ComponentTypeFilter> getComponentType() {
        return componentType;
    }

    /**
     * Sets the value of the componentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentType(Collection<ComponentTypeFilter> value) {
        this.componentType = value;
    }

    /**
     * Gets the value of the richAdSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<RichAdSubTypeFilter> getRichAdSubType() {
        return richAdSubType;
    }

    /**
     * Sets the value of the richAdSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRichAdSubType(Collection<RichAdSubTypeFilter> value) {
        this.richAdSubType = value;
    }

}
