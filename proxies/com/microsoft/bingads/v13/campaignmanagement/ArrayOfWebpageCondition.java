
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfWebpageCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfWebpageCondition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WebpageCondition" type="{https://bingads.microsoft.com/CampaignManagement/v13}WebpageCondition" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWebpageCondition", propOrder = {
    "webpageConditions"
})
public class ArrayOfWebpageCondition {

    @XmlElement(name = "WebpageCondition", nillable = true)
    protected List<WebpageCondition> webpageConditions;
    public ArrayOfWebpageCondition()
    {
      this.webpageConditions = new ArrayList<WebpageCondition>();
    }
    @JsonCreator
    public ArrayOfWebpageCondition(List<WebpageCondition> webpageconditions)
    {
      this.webpageConditions = webpageconditions;
    }

    /**
     * Gets the value of the webpageConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the webpageConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebpageConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebpageCondition }
     * 
     * 
     * @return
     *     The value of the webpageConditions property.
     */
    public List<WebpageCondition> getWebpageConditions() {
        if (webpageConditions == null) {
            webpageConditions = new ArrayList<>();
        }
        return this.webpageConditions;
    }

}
