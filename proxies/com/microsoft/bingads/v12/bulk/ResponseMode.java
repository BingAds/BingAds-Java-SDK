
package com.microsoft.bingads.v12.bulk;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ErrorsOnly"/>
 *     &lt;enumeration value="ErrorsAndResults"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
