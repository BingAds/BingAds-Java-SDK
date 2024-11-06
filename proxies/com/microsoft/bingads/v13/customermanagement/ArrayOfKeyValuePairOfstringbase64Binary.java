
package com.microsoft.bingads.v13.customermanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfKeyValuePairOfstringbase64Binary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeyValuePairOfstringbase64Binary">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeyValuePairOfstringbase64Binary" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfstringbase64Binary" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public ArrayOfKeyValuePairOfstringbase64Binary()
    {
      this.keyValuePairOfstringbase64Binaries = new ArrayList<KeyValuePairOfstringbase64Binary>();
    }
    @JsonCreator
    public ArrayOfKeyValuePairOfstringbase64Binary(List<KeyValuePairOfstringbase64Binary> keyvaluepairofstringbase64binarys)
    {
      this.keyValuePairOfstringbase64Binaries = keyvaluepairofstringbase64binarys;
    }

    /**
     * Gets the value of the keyValuePairOfstringbase64Binaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyValuePairOfstringbase64Binaries property.
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
     * @return
     *     The value of the keyValuePairOfstringbase64Binaries property.
     */
    public List<KeyValuePairOfstringbase64Binary> getKeyValuePairOfstringbase64Binaries() {
        if (keyValuePairOfstringbase64Binaries == null) {
            keyValuePairOfstringbase64Binaries = new ArrayList<>();
        }
        return this.keyValuePairOfstringbase64Binaries;
    }

}
