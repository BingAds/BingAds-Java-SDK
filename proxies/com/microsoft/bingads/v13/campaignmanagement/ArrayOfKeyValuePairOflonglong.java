
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfKeyValuePairOflonglong complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeyValuePairOflonglong">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeyValuePairOflonglong" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOflonglong" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public ArrayOfKeyValuePairOflonglong()
    {
      this.keyValuePairOflonglongs = new ArrayList<KeyValuePairOflonglong>();
    }
    @JsonCreator
    public ArrayOfKeyValuePairOflonglong(List<KeyValuePairOflonglong> keyvaluepairoflonglongs)
    {
      this.keyValuePairOflonglongs = keyvaluepairoflonglongs;
    }

    /**
     * Gets the value of the keyValuePairOflonglongs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyValuePairOflonglongs property.
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
     * @return
     *     The value of the keyValuePairOflonglongs property.
     */
    public List<KeyValuePairOflonglong> getKeyValuePairOflonglongs() {
        if (keyValuePairOflonglongs == null) {
            keyValuePairOflonglongs = new ArrayList<>();
        }
        return this.keyValuePairOflonglongs;
    }

}
