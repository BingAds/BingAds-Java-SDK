
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAudienceGroupDimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAudienceGroupDimension">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AudienceGroupDimension" type="{https://bingads.microsoft.com/CampaignManagement/v13}AudienceGroupDimension" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAudienceGroupDimension", propOrder = {
    "audienceGroupDimensions"
})
public class ArrayOfAudienceGroupDimension {

    @XmlElement(name = "AudienceGroupDimension", nillable = true)
    protected List<AudienceGroupDimension> audienceGroupDimensions;
    public ArrayOfAudienceGroupDimension()
    {
      this.audienceGroupDimensions = new ArrayList<AudienceGroupDimension>();
    }
    @JsonCreator
    public ArrayOfAudienceGroupDimension(List<AudienceGroupDimension> audiencegroupdimensions)
    {
      this.audienceGroupDimensions = audiencegroupdimensions;
    }

    /**
     * Gets the value of the audienceGroupDimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the audienceGroupDimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudienceGroupDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudienceGroupDimension }
     * 
     * 
     * @return
     *     The value of the audienceGroupDimensions property.
     */
    public List<AudienceGroupDimension> getAudienceGroupDimensions() {
        if (audienceGroupDimensions == null) {
            audienceGroupDimensions = new ArrayList<>();
        }
        return this.audienceGroupDimensions;
    }

}
