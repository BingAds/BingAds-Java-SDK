
package com.microsoft.bingads.v13.customerbilling;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <element name="Predicates" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfPredicate" minOccurs="0"/>
 *         <element name="Ordering" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfOrderBy" minOccurs="0"/>
 *         <element name="PageInfo" type="{https://bingads.microsoft.com/Customer/v13/Entities}Paging" minOccurs="0"/>
 *         <element name="ReturnAdditionalFields" type="{https://bingads.microsoft.com/Customer/v13/Entities}AccountAdditionalField" minOccurs="0"/>
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
    "predicates",
    "ordering",
    "pageInfo",
    "returnAdditionalFields"
})
@XmlRootElement(name = "SearchCouponsRequest")
public class SearchCouponsRequest {

    @XmlElement(name = "Predicates", nillable = true)
    protected ArrayOfPredicate predicates;
    @XmlElement(name = "Ordering", nillable = true)
    protected ArrayOfOrderBy ordering;
    @XmlElement(name = "PageInfo", nillable = true)
    protected Paging pageInfo;
    @XmlElement(name = "ReturnAdditionalFields", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Collection<AccountAdditionalField> returnAdditionalFields;

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

    /**
     * Gets the value of the returnAdditionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AccountAdditionalField> getReturnAdditionalFields() {
        return returnAdditionalFields;
    }

    /**
     * Sets the value of the returnAdditionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAdditionalFields(Collection<AccountAdditionalField> value) {
        this.returnAdditionalFields = value;
    }

}
