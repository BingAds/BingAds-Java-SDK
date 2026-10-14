
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemAIDetectionSignal.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SystemAIDetectionSignal">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NotSupportedForGivenRevision"/>
 *     <enumeration value="MicrosoftAIGenerated"/>
 *     <enumeration value="AISignatureDetected"/>
 *     <enumeration value="NoSignalDetected"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "SystemAIDetectionSignal")
@XmlEnum
public enum SystemAIDetectionSignal {

    @XmlEnumValue("NotSupportedForGivenRevision")
    NOT_SUPPORTED_FOR_GIVEN_REVISION("NotSupportedForGivenRevision"),
    @XmlEnumValue("MicrosoftAIGenerated")
    MICROSOFT_AI_GENERATED("MicrosoftAIGenerated"),
    @XmlEnumValue("AISignatureDetected")
    AI_SIGNATURE_DETECTED("AISignatureDetected"),
    @XmlEnumValue("NoSignalDetected")
    NO_SIGNAL_DETECTED("NoSignalDetected");
    private final String value;

    SystemAIDetectionSignal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemAIDetectionSignal fromValue(String v) {
        for (SystemAIDetectionSignal c: SystemAIDetectionSignal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
