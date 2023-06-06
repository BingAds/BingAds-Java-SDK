
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTextAssetSuggestions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTextAssetSuggestions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TextAssetSuggestions" type="{https://bingads.microsoft.com/AdInsight/v13}TextAssetSuggestions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    /**
     * Gets the value of the textAssetSuggestions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textAssetSuggestions property.
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
     */
    public List<TextAssetSuggestions> getTextAssetSuggestions() {
        if (textAssetSuggestions == null) {
            textAssetSuggestions = new ArrayList<TextAssetSuggestions>();
        }
        return this.textAssetSuggestions;
    }

}
