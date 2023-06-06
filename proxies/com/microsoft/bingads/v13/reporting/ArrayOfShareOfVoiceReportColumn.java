
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfShareOfVoiceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfShareOfVoiceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ShareOfVoiceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}ShareOfVoiceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfShareOfVoiceReportColumn", propOrder = {
    "shareOfVoiceReportColumns"
})
public class ArrayOfShareOfVoiceReportColumn {

    @XmlElement(name = "ShareOfVoiceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<ShareOfVoiceReportColumn> shareOfVoiceReportColumns;

    /**
     * Gets the value of the shareOfVoiceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the shareOfVoiceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareOfVoiceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareOfVoiceReportColumn }
     * 
     * 
     * @return
     *     The value of the shareOfVoiceReportColumns property.
     */
    public List<ShareOfVoiceReportColumn> getShareOfVoiceReportColumns() {
        if (shareOfVoiceReportColumns == null) {
            shareOfVoiceReportColumns = new ArrayList<>();
        }
        return this.shareOfVoiceReportColumns;
    }

}
