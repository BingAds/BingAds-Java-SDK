
package com.microsoft.bingads.v13.bulk;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResponseMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ErrorsOnly"/>
 *     <enumeration value="ErrorsAndResults"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResponseMode")
@XmlEnum
public enum ResponseMode {

    @XmlEnumValue("ErrorsOnly")
    ERRORS_ONLY("ErrorsOnly"),
    @XmlEnumValue("ErrorsAndResults")
    ERRORS_AND_RESULTS("ErrorsAndResults");
    private final String value;

    ResponseMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseMode fromValue(String v) {
        for (ResponseMode c: ResponseMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
