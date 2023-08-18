
package com.microsoft.bingads.v13.customerbilling;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeyValuePairOflongdateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeyValuePairOflongdateTime">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeyValuePairOflongdateTime" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOflongdateTime" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValuePairOflongdateTime", namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", propOrder = {
    "keyValuePairOflongdateTimes"
})
public class ArrayOfKeyValuePairOflongdateTime {

    @XmlElement(name = "KeyValuePairOflongdateTime")
    protected List<KeyValuePairOflongdateTime> keyValuePairOflongdateTimes;

    /**
     * Gets the value of the keyValuePairOflongdateTimes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyValuePairOflongdateTimes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairOflongdateTimes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairOflongdateTime }
     * 
     * 
     * @return
     *     The value of the keyValuePairOflongdateTimes property.
     */
    public List<KeyValuePairOflongdateTime> getKeyValuePairOflongdateTimes() {
        if (keyValuePairOflongdateTimes == null) {
            keyValuePairOflongdateTimes = new ArrayList<>();
        }
        return this.keyValuePairOflongdateTimes;
    }

}
