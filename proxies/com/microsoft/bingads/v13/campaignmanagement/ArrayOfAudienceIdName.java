
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAudienceIdName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAudienceIdName">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AudienceIdName" type="{https://bingads.microsoft.com/CampaignManagement/v13}AudienceIdName" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAudienceIdName", propOrder = {
    "audienceIdNames"
})
public class ArrayOfAudienceIdName {

    @XmlElement(name = "AudienceIdName", nillable = true)
    protected List<AudienceIdName> audienceIdNames;
    public ArrayOfAudienceIdName()
    {
      this.audienceIdNames = new ArrayList<AudienceIdName>();
    }
    @JsonCreator
    public ArrayOfAudienceIdName(List<AudienceIdName> audienceidnames)
    {
      this.audienceIdNames = audienceidnames;
    }

    /**
     * Gets the value of the audienceIdNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the audienceIdNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudienceIdNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudienceIdName }
     * 
     * 
     * @return
     *     The value of the audienceIdNames property.
     */
    public List<AudienceIdName> getAudienceIdNames() {
        if (audienceIdNames == null) {
            audienceIdNames = new ArrayList<>();
        }
        return this.audienceIdNames;
    }

}
