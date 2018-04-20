
package com.microsoft.bingads.v12.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientLinkStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientLinkStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LinkPending"/>
 *     &lt;enumeration value="LinkCanceled"/>
 *     &lt;enumeration value="LinkExpired"/>
 *     &lt;enumeration value="LinkAccepted"/>
 *     &lt;enumeration value="LinkDeclined"/>
 *     &lt;enumeration value="LinkInProgress"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="LinkFailed"/>
 *     &lt;enumeration value="UnlinkRequested"/>
 *     &lt;enumeration value="UnlinkPending"/>
 *     &lt;enumeration value="UnlinkCanceled"/>
 *     &lt;enumeration value="UnlinkInProgress"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="UnlinkFailed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClientLinkStatus", namespace = "https://bingads.microsoft.com/Customer/v12/Entities")
@XmlEnum
public enum ClientLinkStatus {

    @XmlEnumValue("LinkPending")
    LINK_PENDING("LinkPending"),
    @XmlEnumValue("LinkCanceled")
    LINK_CANCELED("LinkCanceled"),
    @XmlEnumValue("LinkExpired")
    LINK_EXPIRED("LinkExpired"),
    @XmlEnumValue("LinkAccepted")
    LINK_ACCEPTED("LinkAccepted"),
    @XmlEnumValue("LinkDeclined")
    LINK_DECLINED("LinkDeclined"),
    @XmlEnumValue("LinkInProgress")
    LINK_IN_PROGRESS("LinkInProgress"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("LinkFailed")
    LINK_FAILED("LinkFailed"),
    @XmlEnumValue("UnlinkRequested")
    UNLINK_REQUESTED("UnlinkRequested"),
    @XmlEnumValue("UnlinkPending")
    UNLINK_PENDING("UnlinkPending"),
    @XmlEnumValue("UnlinkCanceled")
    UNLINK_CANCELED("UnlinkCanceled"),
    @XmlEnumValue("UnlinkInProgress")
    UNLINK_IN_PROGRESS("UnlinkInProgress"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("UnlinkFailed")
    UNLINK_FAILED("UnlinkFailed");
    private final String value;

    ClientLinkStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientLinkStatus fromValue(String v) {
        for (ClientLinkStatus c: ClientLinkStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
