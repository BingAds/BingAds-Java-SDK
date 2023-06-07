
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeywordIdEstimatedPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeywordIdEstimatedPosition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordIdEstimatedPosition" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordIdEstimatedPosition" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordIdEstimatedPosition", propOrder = {
    "keywordIdEstimatedPositions"
})
public class ArrayOfKeywordIdEstimatedPosition {

    @XmlElement(name = "KeywordIdEstimatedPosition", nillable = true)
    protected List<KeywordIdEstimatedPosition> keywordIdEstimatedPositions;

    /**
     * Gets the value of the keywordIdEstimatedPositions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keywordIdEstimatedPositions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordIdEstimatedPositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordIdEstimatedPosition }
     * 
     * 
     * @return
     *     The value of the keywordIdEstimatedPositions property.
     */
    public List<KeywordIdEstimatedPosition> getKeywordIdEstimatedPositions() {
        if (keywordIdEstimatedPositions == null) {
            keywordIdEstimatedPositions = new ArrayList<>();
        }
        return this.keywordIdEstimatedPositions;
    }

}
