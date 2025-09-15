
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfLocationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfLocationInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LocationInfo" type="{https://bingads.microsoft.com/AdInsight/v13}LocationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLocationInfo", propOrder = {
    "locationInfos"
})
public class ArrayOfLocationInfo {

    @XmlElement(name = "LocationInfo", nillable = true)
    protected List<LocationInfo> locationInfos;
    public ArrayOfLocationInfo()
    {
      this.locationInfos = new ArrayList<LocationInfo>();
    }
    @JsonCreator
    public ArrayOfLocationInfo(List<LocationInfo> locationinfos)
    {
      this.locationInfos = locationinfos;
    }

    /**
     * Gets the value of the locationInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the locationInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationInfo }
     * 
     * 
     * @return
     *     The value of the locationInfos property.
     */
    public List<LocationInfo> getLocationInfos() {
        if (locationInfos == null) {
            locationInfos = new ArrayList<>();
        }
        return this.locationInfos;
    }

}
