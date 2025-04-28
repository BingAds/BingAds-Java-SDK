
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfSupportedFont complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfSupportedFont">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SupportedFont" type="{https://bingads.microsoft.com/CampaignManagement/v13}SupportedFont" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSupportedFont", propOrder = {
    "supportedFonts"
})
public class ArrayOfSupportedFont {

    @XmlElement(name = "SupportedFont", nillable = true)
    protected List<SupportedFont> supportedFonts;
    public ArrayOfSupportedFont()
    {
      this.supportedFonts = new ArrayList<SupportedFont>();
    }
    @JsonCreator
    public ArrayOfSupportedFont(List<SupportedFont> supportedfonts)
    {
      this.supportedFonts = supportedfonts;
    }

    /**
     * Gets the value of the supportedFonts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the supportedFonts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedFonts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportedFont }
     * 
     * 
     * @return
     *     The value of the supportedFonts property.
     */
    public List<SupportedFont> getSupportedFonts() {
        if (supportedFonts == null) {
            supportedFonts = new ArrayList<>();
        }
        return this.supportedFonts;
    }

}
