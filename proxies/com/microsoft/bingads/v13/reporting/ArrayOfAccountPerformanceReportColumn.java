
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfAccountPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAccountPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}AccountPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAccountPerformanceReportColumn", propOrder = {
    "accountPerformanceReportColumns"
})
public class ArrayOfAccountPerformanceReportColumn {

    @XmlElement(name = "AccountPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<AccountPerformanceReportColumn> accountPerformanceReportColumns;
    public ArrayOfAccountPerformanceReportColumn()
    {
      this.accountPerformanceReportColumns = new ArrayList<AccountPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfAccountPerformanceReportColumn(List<AccountPerformanceReportColumn> accountperformancereportcolumns)
    {
      this.accountPerformanceReportColumns = accountperformancereportcolumns;
    }

    /**
     * Gets the value of the accountPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the accountPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the accountPerformanceReportColumns property.
     */
    public List<AccountPerformanceReportColumn> getAccountPerformanceReportColumns() {
        if (accountPerformanceReportColumns == null) {
            accountPerformanceReportColumns = new ArrayList<>();
        }
        return this.accountPerformanceReportColumns;
    }

}
