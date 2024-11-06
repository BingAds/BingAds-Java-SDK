
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfKeywordLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeywordLocation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordLocation" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordLocation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordLocation", propOrder = {
    "keywordLocations"
})
public class ArrayOfKeywordLocation {

    @XmlElement(name = "KeywordLocation", nillable = true)
    protected List<KeywordLocation> keywordLocations;
    public ArrayOfKeywordLocation()
    {
      this.keywordLocations = new ArrayList<KeywordLocation>();
    }
    @JsonCreator
    public ArrayOfKeywordLocation(List<KeywordLocation> keywordlocations)
    {
      this.keywordLocations = keywordlocations;
    }

    /**
     * Gets the value of the keywordLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keywordLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordLocation }
     * 
     * 
     * @return
     *     The value of the keywordLocations property.
     */
    public List<KeywordLocation> getKeywordLocations() {
        if (keywordLocations == null) {
            keywordLocations = new ArrayList<>();
        }
        return this.keywordLocations;
    }

}
