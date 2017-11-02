
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MigrationStatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MigrationStatusInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MigrationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StartTimeInUtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Status" type="{https://bingads.microsoft.com/CampaignManagement/v11}MigrationStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    @XmlElement(name = "MigrationType", required = true, nillable = true)
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
