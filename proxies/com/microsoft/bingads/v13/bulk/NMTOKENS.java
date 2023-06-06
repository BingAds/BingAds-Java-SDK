
package com.microsoft.bingads.v13.bulk;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for NMTOKENS simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <simpleType name="NMTOKENS">
 *   <restriction>
 *     <simpleType>
 *       <list itemType="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     </simpleType>
 *     <minLength value="1"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NMTOKENS", namespace = "http://www.w3.org/2001/XMLSchema", propOrder = {
    "values"
})
public class NMTOKENS {

    @XmlValue
    @XmlSchemaType(name = "NMTOKENS")
    protected List<NMTOKEN> values;

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NMTOKEN }
     * 
     * 
     * @return
     *     The value of the values property.
     */
    public List<NMTOKEN> getValues() {
        if (values == null) {
            values = new ArrayList<>();
        }
        return this.values;
    }

}
