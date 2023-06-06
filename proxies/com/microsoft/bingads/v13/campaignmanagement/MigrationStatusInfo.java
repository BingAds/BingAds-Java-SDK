
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MigrationStatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MigrationStatusInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MigrationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="StartTimeInUtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Status" type="{https://bingads.microsoft.com/CampaignManagement/v13}MigrationStatus"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrationStatusInfo", propOrder = {
    "migrationType",
    "startTimeInUtc",
    "status"
})
public class MigrationStatusInfo {

    @XmlElement(name = "MigrationType", nillable = true)
    protected String migrationType;
    @XmlElement(name = "StartTimeInUtc", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startTimeInUtc;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected MigrationStatus status;

    /**
     * Gets the value of the migrationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigrationType() {
        return migrationType;
    }

    /**
     * Sets the value of the migrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigrationType(String value) {
        this.migrationType = value;
    }

    /**
     * Gets the value of the startTimeInUtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartTimeInUtc() {
        return startTimeInUtc;
    }

    /**
     * Sets the value of the startTimeInUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeInUtc(Calendar value) {
        this.startTimeInUtc = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MigrationStatus }
     *     
     */
    public MigrationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MigrationStatus }
     *     
     */
    public void setStatus(MigrationStatus value) {
        this.status = value;
    }

}
