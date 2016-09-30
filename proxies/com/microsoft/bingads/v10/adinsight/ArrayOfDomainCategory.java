
package com.microsoft.bingads.v10.adinsight;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDomainCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDomainCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DomainCategory" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity}DomainCategory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDomainCategory", propOrder = {
    "domainCategories"
})
public class ArrayOfDomainCategory {

    @XmlElement(name = "DomainCategory", nillable = true)
    protected List<DomainCategory> domainCategories;

    /**
     * Gets the value of the domainCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomainCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomainCategory }
     * 
     * 
     */
    public List<DomainCategory> getDomainCategories() {
        if (domainCategories == null) {
            domainCategories = new ArrayList<DomainCategory>();
        }
        return this.domainCategories;
    }

}
