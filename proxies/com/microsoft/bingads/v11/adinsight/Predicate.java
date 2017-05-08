
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Predicate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Predicate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilteringField" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}Field" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}Operator" minOccurs="0"/>
 *         &lt;element name="Values" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Predicate", propOrder = {
    "filteringField",
    "operator",
    "values"
})
public class Predicate {

    @XmlElement(name = "FilteringField")
    @XmlSchemaType(name = "string")
    protected Field filteringField;
    @XmlElement(name = "Operator")
    @XmlSchemaType(name = "string")
    protected Operator operator;
    @XmlElement(name = "Values", nillable = true)
    protected ArrayOfstring values;

    /**
     * Gets the value of the filteringField property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getFilteringField() {
        return filteringField;
    }

    /**
     * Sets the value of the filteringField property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setFilteringField(Field value) {
        this.filteringField = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperator(Operator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setValues(ArrayOfstring value) {
        this.values = value;
    }

}
