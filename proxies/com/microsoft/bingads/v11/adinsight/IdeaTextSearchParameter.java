
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdeaTextSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdeaTextSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity.SearchParameters}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="Excluded" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity.Common}ArrayOfKeyword" minOccurs="0"/>
 *         &lt;element name="Included" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity.Common}ArrayOfKeyword" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdeaTextSearchParameter", namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity.SearchParameters", propOrder = {
    "excluded",
    "included"
})
public class IdeaTextSearchParameter
    extends SearchParameter
{

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
