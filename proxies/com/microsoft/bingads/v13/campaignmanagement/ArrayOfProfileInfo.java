
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfProfileInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfProfileInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProfileInfo" type="{https://bingads.microsoft.com/CampaignManagement/v13}ProfileInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfileInfo", propOrder = {
    "profileInfos"
})
public class ArrayOfProfileInfo {

    @XmlElement(name = "ProfileInfo", nillable = true)
    protected List<ProfileInfo> profileInfos;
    public ArrayOfProfileInfo()
    {
      this.profileInfos = new ArrayList<ProfileInfo>();
    }
    @JsonCreator
    public ArrayOfProfileInfo(List<ProfileInfo> profileinfos)
    {
      this.profileInfos = profileinfos;
    }

    /**
     * Gets the value of the profileInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the profileInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileInfo }
     * 
     * 
     * @return
     *     The value of the profileInfos property.
     */
    public List<ProfileInfo> getProfileInfos() {
        if (profileInfos == null) {
            profileInfos = new ArrayList<>();
        }
        return this.profileInfos;
    }

}
