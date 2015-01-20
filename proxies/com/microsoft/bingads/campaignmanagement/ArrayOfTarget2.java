
package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTarget2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTarget2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Target2" type="{https://bingads.microsoft.com/CampaignManagement/v9}Target2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTarget2", propOrder = {
    "target2S"
})
public class ArrayOfTarget2 {

    @XmlElement(name = "Target2", nillable = true)
    protected List<Target2> target2S;

    /**
     * Gets the value of the target2S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the target2S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarget2s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Target2 }
     * 
     * 
     */
    public List<Target2> getTarget2s() {
        if (target2S == null) {
            target2S = new ArrayList<Target2>();
        }
        return this.target2S;
    }

}
