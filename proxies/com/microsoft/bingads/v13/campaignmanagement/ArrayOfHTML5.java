
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfHTML5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHTML5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HTML5" type="{https://bingads.microsoft.com/CampaignManagement/v13}HTML5" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHTML5", propOrder = {
    "html5S"
})
public class ArrayOfHTML5 {

    @XmlElement(name = "HTML5", nillable = true)
    protected List<HTML5> html5S;
    public ArrayOfHTML5()
    {
      this.html5S = new ArrayList<HTML5>();
    }
    @JsonCreator
    public ArrayOfHTML5(List<HTML5> html5s)
    {
      this.html5S = html5s;
    }

    /**
     * Gets the value of the html5S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the html5S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHTML5S().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HTML5 }
     * 
     * 
     * @return
     *     The value of the html5S property.
     */
    public List<HTML5> getHTML5S() {
        if (html5S == null) {
            html5S = new ArrayList<>();
        }
        return this.html5S;
    }

}
