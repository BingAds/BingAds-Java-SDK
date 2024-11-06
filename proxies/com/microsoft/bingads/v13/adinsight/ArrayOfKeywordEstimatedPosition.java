
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfKeywordEstimatedPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeywordEstimatedPosition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordEstimatedPosition" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordEstimatedPosition" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordEstimatedPosition", propOrder = {
    "keywordEstimatedPositions"
})
public class ArrayOfKeywordEstimatedPosition {

    @XmlElement(name = "KeywordEstimatedPosition", nillable = true)
    protected List<KeywordEstimatedPosition> keywordEstimatedPositions;
    public ArrayOfKeywordEstimatedPosition()
    {
      this.keywordEstimatedPositions = new ArrayList<KeywordEstimatedPosition>();
    }
    @JsonCreator
    public ArrayOfKeywordEstimatedPosition(List<KeywordEstimatedPosition> keywordestimatedpositions)
    {
      this.keywordEstimatedPositions = keywordestimatedpositions;
    }

    /**
     * Gets the value of the keywordEstimatedPositions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keywordEstimatedPositions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordEstimatedPositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordEstimatedPosition }
     * 
     * 
     * @return
     *     The value of the keywordEstimatedPositions property.
     */
    public List<KeywordEstimatedPosition> getKeywordEstimatedPositions() {
        if (keywordEstimatedPositions == null) {
            keywordEstimatedPositions = new ArrayList<>();
        }
        return this.keywordEstimatedPositions;
    }

}
