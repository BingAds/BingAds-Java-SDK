
package com.microsoft.bingads.v13.customermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeyValuePairOfstringbase64Binary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValuePairOfstringbase64Binary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValuePairOfstringbase64Binary" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfstringbase64Binary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValuePairOfstringbase64Binary", namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", propOrder = {
    "keyValuePairOfstringbase64Binaries"
})
public class ArrayOfKeyValuePairOfstringbase64Binary {

    @XmlElement(name = "KeyValuePairOfstringbase64Binary")
    protected List<KeyValuePairOfstringbase64Binary> keyValuePairOfstringbase64Binaries;

    /**
     * Gets the value of the keyValuePairOfstringbase64Binaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValuePairOfstringbase64Binaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairOfstringbase64Binaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairOfstringbase64Binary }
     * 
     * 
     */
    public List<KeyValuePairOfstringbase64Binary> getKeyValuePairOfstringbase64Binaries() {
        if (keyValuePairOfstringbase64Binaries == null) {
            keyValuePairOfstringbase64Binaries = new ArrayList<KeyValuePairOfstringbase64Binary>();
        }
        return this.keyValuePairOfstringbase64Binaries;
    }

}
