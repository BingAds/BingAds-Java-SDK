
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAutoApplyRecommendationsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAutoApplyRecommendationsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AutoApplyRecommendationsInfo" type="{https://bingads.microsoft.com/AdInsight/v13}AutoApplyRecommendationsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAutoApplyRecommendationsInfo", propOrder = {
    "autoApplyRecommendationsInfos"
})
public class ArrayOfAutoApplyRecommendationsInfo {

    @XmlElement(name = "AutoApplyRecommendationsInfo", nillable = true)
    protected List<AutoApplyRecommendationsInfo> autoApplyRecommendationsInfos;

    /**
     * Gets the value of the autoApplyRecommendationsInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoApplyRecommendationsInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoApplyRecommendationsInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoApplyRecommendationsInfo }
     * 
     * 
     */
    public List<AutoApplyRecommendationsInfo> getAutoApplyRecommendationsInfos() {
        if (autoApplyRecommendationsInfos == null) {
            autoApplyRecommendationsInfos = new ArrayList<AutoApplyRecommendationsInfo>();
        }
        return this.autoApplyRecommendationsInfos;
    }

}
