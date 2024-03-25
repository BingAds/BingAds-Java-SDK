
package com.microsoft.bingads.v13.bulk;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfDownloadEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDownloadEntity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DownloadEntity" type="{https://bingads.microsoft.com/CampaignManagement/v13}DownloadEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDownloadEntity", propOrder = {
    "downloadEntities"
})
public class ArrayOfDownloadEntity {

    @XmlElement(name = "DownloadEntity")
    @XmlSchemaType(name = "string")
    protected List<DownloadEntity> downloadEntities;
    public ArrayOfDownloadEntity()
    {
      this.downloadEntities = new ArrayList<DownloadEntity>();
    }
    @JsonCreator
    public ArrayOfDownloadEntity(List<DownloadEntity> downloadentitys)
    {
      this.downloadEntities = downloadentitys;
    }

    /**
     * Gets the value of the downloadEntities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the downloadEntities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDownloadEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DownloadEntity }
     * 
     * 
     * @return
     *     The value of the downloadEntities property.
     */
    public List<DownloadEntity> getDownloadEntities() {
        if (downloadEntities == null) {
            downloadEntities = new ArrayList<>();
        }
        return this.downloadEntities;
    }

}
