
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfKeywordIdeaAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeywordIdeaAttribute">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordIdeaAttribute" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordIdeaAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordIdeaAttribute", propOrder = {
    "keywordIdeaAttributes"
})
public class ArrayOfKeywordIdeaAttribute {

    @XmlElement(name = "KeywordIdeaAttribute")
    @XmlSchemaType(name = "string")
    protected List<KeywordIdeaAttribute> keywordIdeaAttributes;
    public ArrayOfKeywordIdeaAttribute()
    {
      this.keywordIdeaAttributes = new ArrayList<KeywordIdeaAttribute>();
    }
    @JsonCreator
    public ArrayOfKeywordIdeaAttribute(List<KeywordIdeaAttribute> keywordideaattributes)
    {
      this.keywordIdeaAttributes = keywordideaattributes;
    }

    /**
     * Gets the value of the keywordIdeaAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keywordIdeaAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordIdeaAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordIdeaAttribute }
     * 
     * 
     * @return
     *     The value of the keywordIdeaAttributes property.
     */
    public List<KeywordIdeaAttribute> getKeywordIdeaAttributes() {
        if (keywordIdeaAttributes == null) {
            keywordIdeaAttributes = new ArrayList<>();
        }
        return this.keywordIdeaAttributes;
    }

}
