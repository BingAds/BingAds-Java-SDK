
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfTextAssetSuggestions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfTextAssetSuggestions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TextAssetSuggestions" type="{https://bingads.microsoft.com/AdInsight/v13}TextAssetSuggestions" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTextAssetSuggestions", propOrder = {
    "textAssetSuggestions"
})
public class ArrayOfTextAssetSuggestions {

    @XmlElement(name = "TextAssetSuggestions", nillable = true)
    protected List<TextAssetSuggestions> textAssetSuggestions;
    public ArrayOfTextAssetSuggestions()
    {
      this.textAssetSuggestions = new ArrayList<TextAssetSuggestions>();
    }
    @JsonCreator
    public ArrayOfTextAssetSuggestions(List<TextAssetSuggestions> textassetsuggestionss)
    {
      this.textAssetSuggestions = textassetsuggestionss;
    }

    /**
     * Gets the value of the textAssetSuggestions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the textAssetSuggestions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextAssetSuggestions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextAssetSuggestions }
     * 
     * 
     * @return
     *     The value of the textAssetSuggestions property.
     */
    public List<TextAssetSuggestions> getTextAssetSuggestions() {
        if (textAssetSuggestions == null) {
            textAssetSuggestions = new ArrayList<>();
        }
        return this.textAssetSuggestions;
    }

}
