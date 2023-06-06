
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompetitionSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CompetitionSearchParameter">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}SearchParameter">
 *       <sequence>
 *         <element name="CompetitionLevels" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfCompetitionLevel" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompetitionSearchParameter", propOrder = {
    "competitionLevels"
})
public class CompetitionSearchParameter
    extends SearchParameter
{

    @XmlElement(name = "CompetitionLevels", nillable = true)
    protected ArrayOfCompetitionLevel competitionLevels;

    /**
     * Gets the value of the competitionLevels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompetitionLevel }
     *     
     */
    public ArrayOfCompetitionLevel getCompetitionLevels() {
        return competitionLevels;
    }

    /**
     * Sets the value of the competitionLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompetitionLevel }
     *     
     */
    public void setCompetitionLevels(ArrayOfCompetitionLevel value) {
        this.competitionLevels = value;
    }

}
