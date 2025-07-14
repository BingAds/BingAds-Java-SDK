
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAnnotationOptOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAnnotationOptOut">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AnnotationOptOut" type="{https://bingads.microsoft.com/CampaignManagement/v13}AnnotationOptOut" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAnnotationOptOut", propOrder = {
    "annotationOptOuts"
})
public class ArrayOfAnnotationOptOut {

    @XmlElement(name = "AnnotationOptOut", nillable = true)
    protected List<AnnotationOptOut> annotationOptOuts;
    public ArrayOfAnnotationOptOut()
    {
      this.annotationOptOuts = new ArrayList<AnnotationOptOut>();
    }
    @JsonCreator
    public ArrayOfAnnotationOptOut(List<AnnotationOptOut> annotationoptouts)
    {
      this.annotationOptOuts = annotationoptouts;
    }

    /**
     * Gets the value of the annotationOptOuts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the annotationOptOuts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotationOptOuts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnotationOptOut }
     * 
     * 
     * @return
     *     The value of the annotationOptOuts property.
     */
    public List<AnnotationOptOut> getAnnotationOptOuts() {
        if (annotationOptOuts == null) {
            annotationOptOuts = new ArrayList<>();
        }
        return this.annotationOptOuts;
    }

}
