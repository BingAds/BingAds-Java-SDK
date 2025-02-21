
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfClipchampTemplateInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfClipchampTemplateInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClipchampTemplateInfo" type="{https://bingads.microsoft.com/CampaignManagement/v13}ClipchampTemplateInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClipchampTemplateInfo", propOrder = {
    "clipchampTemplateInfos"
})
public class ArrayOfClipchampTemplateInfo {

    @XmlElement(name = "ClipchampTemplateInfo", nillable = true)
    protected List<ClipchampTemplateInfo> clipchampTemplateInfos;
    public ArrayOfClipchampTemplateInfo()
    {
      this.clipchampTemplateInfos = new ArrayList<ClipchampTemplateInfo>();
    }
    @JsonCreator
    public ArrayOfClipchampTemplateInfo(List<ClipchampTemplateInfo> clipchamptemplateinfos)
    {
      this.clipchampTemplateInfos = clipchamptemplateinfos;
    }

    /**
     * Gets the value of the clipchampTemplateInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clipchampTemplateInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClipchampTemplateInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClipchampTemplateInfo }
     * 
     * 
     * @return
     *     The value of the clipchampTemplateInfos property.
     */
    public List<ClipchampTemplateInfo> getClipchampTemplateInfos() {
        if (clipchampTemplateInfos == null) {
            clipchampTemplateInfos = new ArrayList<>();
        }
        return this.clipchampTemplateInfos;
    }

}
