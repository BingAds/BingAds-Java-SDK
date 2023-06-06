
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCompetitionLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCompetitionLevel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CompetitionLevel" type="{https://bingads.microsoft.com/AdInsight/v13}CompetitionLevel" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCompetitionLevel", propOrder = {
    "competitionLevels"
})
public class ArrayOfCompetitionLevel {

    @XmlElement(name = "CompetitionLevel")
    @XmlSchemaType(name = "string")
    protected List<CompetitionLevel> competitionLevels;

    /**
     * Gets the value of the competitionLevels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the competitionLevels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetitionLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetitionLevel }
     * 
     * 
     * @return
     *     The value of the competitionLevels property.
     */
    public List<CompetitionLevel> getCompetitionLevels() {
        if (competitionLevels == null) {
            competitionLevels = new ArrayList<>();
        }
        return this.competitionLevels;
    }

}
