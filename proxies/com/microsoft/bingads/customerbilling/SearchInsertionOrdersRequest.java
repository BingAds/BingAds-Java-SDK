
package com.microsoft.bingads.customerbilling;

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
 *         &lt;element name="Predicates" type="{https://bingads.microsoft.com/Customer/v9/Entities}ArrayOfPredicate" minOccurs="0"/>
 *         &lt;element name="Ordering" type="{https://bingads.microsoft.com/Customer/v9/Entities}ArrayOfOrderBy" minOccurs="0"/>
 *         &lt;element name="PageInfo" type="{https://bingads.microsoft.com/Customer/v9/Entities}Paging" minOccurs="0"/>
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
    "predicates",
    "ordering",
    "pageInfo"
})
@XmlRootElement(name = "SearchInsertionOrdersRequest")
public class SearchInsertionOrdersRequest {

    @XmlElement(name = "Predicates", nillable = true)
    protected ArrayOfPredicate predicates;
    @XmlElement(name = "Ordering", nillable = true)
    protected ArrayOfOrderBy ordering;
    @XmlElement(name = "PageInfo", nillable = true)
    protected Paging pageInfo;

    /**
     * Gets the value of the predicates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPredicate }
     *     
     */
    public ArrayOfPredicate getPredicates() {
        return predicates;
    }

    /**
     * Sets the value of the predicates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPredicate }
     *     
     */
    public void setPredicates(ArrayOfPredicate value) {
        this.predicates = value;
    }

    /**
     * Gets the value of the ordering property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderBy }
     *     
     */
    public ArrayOfOrderBy getOrdering() {
        return ordering;
    }

    /**
     * Sets the value of the ordering property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderBy }
     *     
     */
    public void setOrdering(ArrayOfOrderBy value) {
        this.ordering = value;
    }

    /**
     * Gets the value of the pageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPageInfo() {
        return pageInfo;
    }

    /**
     * Sets the value of the pageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPageInfo(Paging value) {
        this.pageInfo = value;
    }

}
