
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VanityPharmaWebsiteDescription.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="VanityPharmaWebsiteDescription">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unspecified"/>
 *     <enumeration value="PrescriptionTreatmentWebsite_En"/>
 *     <enumeration value="PrescriptionTreatmentWebsite_Es"/>
 *     <enumeration value="PrescriptionDeviceWebsite_En"/>
 *     <enumeration value="PrescriptionDeviceWebsite_Es"/>
 *     <enumeration value="MedicalDeviceWebsite_En"/>
 *     <enumeration value="MedicalDeviceWebsite_Es"/>
 *     <enumeration value="PreventativeTreatmentWebsite_En"/>
 *     <enumeration value="PreventativeTreatmentWebsite_Es"/>
 *     <enumeration value="PrescriptionContraceptionWebsite_En"/>
 *     <enumeration value="PrescriptionContraceptionWebsite_Es"/>
 *     <enumeration value="PrescriptionVaccineWebsite_En"/>
 *     <enumeration value="PrescriptionVaccineWebsite_Es"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VanityPharmaWebsiteDescription")
@XmlEnum
public enum VanityPharmaWebsiteDescription {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("PrescriptionTreatmentWebsite_En")
    PRESCRIPTION_TREATMENT_WEBSITE_EN("PrescriptionTreatmentWebsite_En"),
    @XmlEnumValue("PrescriptionTreatmentWebsite_Es")
    PRESCRIPTION_TREATMENT_WEBSITE_ES("PrescriptionTreatmentWebsite_Es"),
    @XmlEnumValue("PrescriptionDeviceWebsite_En")
    PRESCRIPTION_DEVICE_WEBSITE_EN("PrescriptionDeviceWebsite_En"),
    @XmlEnumValue("PrescriptionDeviceWebsite_Es")
    PRESCRIPTION_DEVICE_WEBSITE_ES("PrescriptionDeviceWebsite_Es"),
    @XmlEnumValue("MedicalDeviceWebsite_En")
    MEDICAL_DEVICE_WEBSITE_EN("MedicalDeviceWebsite_En"),
    @XmlEnumValue("MedicalDeviceWebsite_Es")
    MEDICAL_DEVICE_WEBSITE_ES("MedicalDeviceWebsite_Es"),
    @XmlEnumValue("PreventativeTreatmentWebsite_En")
    PREVENTATIVE_TREATMENT_WEBSITE_EN("PreventativeTreatmentWebsite_En"),
    @XmlEnumValue("PreventativeTreatmentWebsite_Es")
    PREVENTATIVE_TREATMENT_WEBSITE_ES("PreventativeTreatmentWebsite_Es"),
    @XmlEnumValue("PrescriptionContraceptionWebsite_En")
    PRESCRIPTION_CONTRACEPTION_WEBSITE_EN("PrescriptionContraceptionWebsite_En"),
    @XmlEnumValue("PrescriptionContraceptionWebsite_Es")
    PRESCRIPTION_CONTRACEPTION_WEBSITE_ES("PrescriptionContraceptionWebsite_Es"),
    @XmlEnumValue("PrescriptionVaccineWebsite_En")
    PRESCRIPTION_VACCINE_WEBSITE_EN("PrescriptionVaccineWebsite_En"),
    @XmlEnumValue("PrescriptionVaccineWebsite_Es")
    PRESCRIPTION_VACCINE_WEBSITE_ES("PrescriptionVaccineWebsite_Es");
    private final String value;

    VanityPharmaWebsiteDescription(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VanityPharmaWebsiteDescription fromValue(String v) {
        for (VanityPharmaWebsiteDescription c: VanityPharmaWebsiteDescription.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
