
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeyValuePairOflonglong complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValuePairOflonglong">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValuePairOflonglong" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOflonglong" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValuePairOflonglong", namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", propOrder = {
    "keyValuePairOflonglongs"
})
public class ArrayOfKeyValuePairOflonglong {

    @XmlElement(name = "KeyValuePairOflonglong")
    protected List<KeyValuePairOflonglong> keyValuePairOflonglongs;

    /**
     * Gets the value of the keyValuePairOflonglongs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValuePairOflonglongs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairOflonglongs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairOflonglong }
     * 
     * 
     */
    public List<KeyValuePairOflonglong> getKeyValuePairOflonglongs() {
        if (keyValuePairOflonglongs == null) {
            keyValuePairOflonglongs = new ArrayList<KeyValuePairOflonglong>();
        }
        return this.keyValuePairOflonglongs;
    }

}
