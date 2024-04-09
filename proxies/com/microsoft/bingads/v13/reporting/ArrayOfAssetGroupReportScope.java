
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAssetGroupReportScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAssetGroupReportScope">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssetGroupReportScope" type="{https://bingads.microsoft.com/Reporting/v13}AssetGroupReportScope" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssetGroupReportScope", propOrder = {
    "assetGroupReportScopes"
})
public class ArrayOfAssetGroupReportScope {

    @XmlElement(name = "AssetGroupReportScope", nillable = true)
    protected List<AssetGroupReportScope> assetGroupReportScopes;
    public ArrayOfAssetGroupReportScope()
    {
      this.assetGroupReportScopes = new ArrayList<AssetGroupReportScope>();
    }
    @JsonCreator
    public ArrayOfAssetGroupReportScope(List<AssetGroupReportScope> assetgroupreportscopes)
    {
      this.assetGroupReportScopes = assetgroupreportscopes;
    }

    /**
     * Gets the value of the assetGroupReportScopes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assetGroupReportScopes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetGroupReportScopes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetGroupReportScope }
     * 
     * 
     * @return
     *     The value of the assetGroupReportScopes property.
     */
    public List<AssetGroupReportScope> getAssetGroupReportScopes() {
        if (assetGroupReportScopes == null) {
            assetGroupReportScopes = new ArrayList<>();
        }
        return this.assetGroupReportScopes;
    }

}
