
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompetitionSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompetitionSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/AdInsight/v13}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="CompetitionLevels" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfCompetitionLevel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
