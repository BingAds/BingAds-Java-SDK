
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAd">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ad" type="{https://bingads.microsoft.com/CampaignManagement/v13}Ad" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAd", propOrder = {
    "ads"
})
public class ArrayOfAd {

    @XmlElement(name = "Ad", nillable = true)
    protected List<Ad> ads;
    public ArrayOfAd()
    {
      this.ads = new ArrayList<Ad>();
    }
    @JsonCreator
    public ArrayOfAd(List<Ad> ads)
    {
      this.ads = ads;
    }

    /**
     * Gets the value of the ads property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ads property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ad }
     * 
     * 
     * @return
     *     The value of the ads property.
     */
    public List<Ad> getAds() {
        if (ads == null) {
            ads = new ArrayList<>();
        }
        return this.ads;
    }

}
