
package com.microsoft.bingads.v11.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSearchCampaignChangeHistoryReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSearchCampaignChangeHistoryReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchCampaignChangeHistoryReportColumn" type="{https://bingads.microsoft.com/Reporting/v11}SearchCampaignChangeHistoryReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchCampaignChangeHistoryReportColumn", propOrder = {
    "searchCampaignChangeHistoryReportColumns"
})
public class ArrayOfSearchCampaignChangeHistoryReportColumn {

    @XmlElement(name = "SearchCampaignChangeHistoryReportColumn")
    @XmlSchemaType(name = "string")
    protected List<SearchCampaignChangeHistoryReportColumn> searchCampaignChangeHistoryReportColumns;

    /**
     * Gets the value of the searchCampaignChangeHistoryReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCampaignChangeHistoryReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCampaignChangeHistoryReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchCampaignChangeHistoryReportColumn }
     * 
     * 
     */
    public List<SearchCampaignChangeHistoryReportColumn> getSearchCampaignChangeHistoryReportColumns() {
        if (searchCampaignChangeHistoryReportColumns == null) {
            searchCampaignChangeHistoryReportColumns = new ArrayList<SearchCampaignChangeHistoryReportColumn>();
        }
        return this.searchCampaignChangeHistoryReportColumns;
    }

}
