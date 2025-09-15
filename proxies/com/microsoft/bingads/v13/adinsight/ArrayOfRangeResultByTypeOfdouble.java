
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfRangeResultByTypeOfdouble complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfRangeResultByTypeOfdouble">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RangeResultByTypeOfdouble" type="{https://bingads.microsoft.com/AdInsight/v13}RangeResultByTypeOfdouble" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRangeResultByTypeOfdouble", propOrder = {
    "rangeResultByTypeOfdoubles"
})
public class ArrayOfRangeResultByTypeOfdouble {

    @XmlElement(name = "RangeResultByTypeOfdouble", nillable = true)
    protected List<RangeResultByTypeOfdouble> rangeResultByTypeOfdoubles;
    public ArrayOfRangeResultByTypeOfdouble()
    {
      this.rangeResultByTypeOfdoubles = new ArrayList<RangeResultByTypeOfdouble>();
    }
    @JsonCreator
    public ArrayOfRangeResultByTypeOfdouble(List<RangeResultByTypeOfdouble> rangeresultbytypeofdoubles)
    {
      this.rangeResultByTypeOfdoubles = rangeresultbytypeofdoubles;
    }

    /**
     * Gets the value of the rangeResultByTypeOfdoubles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rangeResultByTypeOfdoubles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRangeResultByTypeOfdoubles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RangeResultByTypeOfdouble }
     * 
     * 
     * @return
     *     The value of the rangeResultByTypeOfdoubles property.
     */
    public List<RangeResultByTypeOfdouble> getRangeResultByTypeOfdoubles() {
        if (rangeResultByTypeOfdoubles == null) {
            rangeResultByTypeOfdoubles = new ArrayList<>();
        }
        return this.rangeResultByTypeOfdoubles;
    }

}
