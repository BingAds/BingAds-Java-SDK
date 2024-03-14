
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAppUrl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAppUrl">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AppUrl" type="{https://bingads.microsoft.com/CampaignManagement/v13}AppUrl" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAppUrl", propOrder = {
    "appUrls"
})
public class ArrayOfAppUrl {

    @XmlElement(name = "AppUrl", nillable = true)
    protected List<AppUrl> appUrls;
    public ArrayOfAppUrl()
    {
      this.appUrls = new ArrayList<AppUrl>();
    }
    @JsonCreator
    public ArrayOfAppUrl(List<AppUrl> appurls)
    {
      this.appUrls = appurls;
    }

    /**
     * Gets the value of the appUrls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the appUrls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppUrl }
     * 
     * 
     * @return
     *     The value of the appUrls property.
     */
    public List<AppUrl> getAppUrls() {
        if (appUrls == null) {
            appUrls = new ArrayList<>();
        }
        return this.appUrls;
    }

}
