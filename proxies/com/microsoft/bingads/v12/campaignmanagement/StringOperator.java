
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StringOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StringOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Equals"/>
 *     &lt;enumeration value="Contains"/>
 *     &lt;enumeration value="BeginsWith"/>
 *     &lt;enumeration value="EndsWith"/>
 *     &lt;enumeration value="NotEquals"/>
 *     &lt;enumeration value="DoesNotContain"/>
 *     &lt;enumeration value="DoesNotBeginWith"/>
 *     &lt;enumeration value="DoesNotEndWith"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StringOperator")
@XmlEnum
public enum StringOperator {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Equals")
    EQUALS("Equals"),
    @XmlEnumValue("Contains")
    CONTAINS("Contains"),
    @XmlEnumValue("BeginsWith")
    BEGINS_WITH("BeginsWith"),
    @XmlEnumValue("EndsWith")
    ENDS_WITH("EndsWith"),
    @XmlEnumValue("NotEquals")
    NOT_EQUALS("NotEquals"),
    @XmlEnumValue("DoesNotContain")
    DOES_NOT_CONTAIN("DoesNotContain"),
    @XmlEnumValue("DoesNotBeginWith")
    DOES_NOT_BEGIN_WITH("DoesNotBeginWith"),
    @XmlEnumValue("DoesNotEndWith")
    DOES_NOT_END_WITH("DoesNotEndWith");
    private final String value;

    StringOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StringOperator fromValue(String v) {
        for (StringOperator c: StringOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
