
package com.microsoft.bingads.v11.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for NMTOKENS simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="NMTOKENS">
 *   &lt;restriction>
 *     &lt;simpleType>
 *       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/simpleType>
 *     &lt;minLength value="1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
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
     */
    public List<NMTOKEN> getValues() {
        if (values == null) {
            values = new ArrayList<NMTOKEN>();
        }
        return this.values;
    }

}
