
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdeaTextSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IdeaTextSearchParameter">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}SearchParameter">
 *       <sequence>
 *         <element name="Excluded" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeyword" minOccurs="0"/>
 *         <element name="Included" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeyword" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdeaTextSearchParameter", propOrder = {
    "excluded",
    "included"
})
public class IdeaTextSearchParameter
    extends SearchParameter
{
    public IdeaTextSearchParameter() {
      this.type = "IdeaTextSearchParameter";
    }

    @XmlElement(name = "Excluded", nillable = true)
    protected ArrayOfKeyword excluded;
    @XmlElement(name = "Included", nillable = true)
    protected ArrayOfKeyword included;

    /**
     * Gets the value of the excluded property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyword }
     *     
     */
    public ArrayOfKeyword getExcluded() {
        return excluded;
    }

    /**
     * Sets the value of the excluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyword }
     *     
     */
    public void setExcluded(ArrayOfKeyword value) {
        this.excluded = value;
    }

    /**
     * Gets the value of the included property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyword }
     *     
     */
    public ArrayOfKeyword getIncluded() {
        return included;
    }

    /**
     * Sets the value of the included property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyword }
     *     
     */
    public void setIncluded(ArrayOfKeyword value) {
        this.included = value;
    }

}
