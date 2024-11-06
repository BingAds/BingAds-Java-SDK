
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfKeywordAndMatchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeywordAndMatchType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordAndMatchType" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordAndMatchType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordAndMatchType", propOrder = {
    "keywordAndMatchTypes"
})
public class ArrayOfKeywordAndMatchType {

    @XmlElement(name = "KeywordAndMatchType", nillable = true)
    protected List<KeywordAndMatchType> keywordAndMatchTypes;
    public ArrayOfKeywordAndMatchType()
    {
      this.keywordAndMatchTypes = new ArrayList<KeywordAndMatchType>();
    }
    @JsonCreator
    public ArrayOfKeywordAndMatchType(List<KeywordAndMatchType> keywordandmatchtypes)
    {
      this.keywordAndMatchTypes = keywordandmatchtypes;
    }

    /**
     * Gets the value of the keywordAndMatchTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keywordAndMatchTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordAndMatchTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordAndMatchType }
     * 
     * 
     * @return
     *     The value of the keywordAndMatchTypes property.
     */
    public List<KeywordAndMatchType> getKeywordAndMatchTypes() {
        if (keywordAndMatchTypes == null) {
            keywordAndMatchTypes = new ArrayList<>();
        }
        return this.keywordAndMatchTypes;
    }

}
