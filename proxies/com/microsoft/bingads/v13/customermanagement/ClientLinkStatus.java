
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientLinkStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ClientLinkStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LinkPending"/>
 *     <enumeration value="LinkCanceled"/>
 *     <enumeration value="LinkExpired"/>
 *     <enumeration value="LinkAccepted"/>
 *     <enumeration value="LinkDeclined"/>
 *     <enumeration value="LinkInProgress"/>
 *     <enumeration value="Active"/>
 *     <enumeration value="LinkFailed"/>
 *     <enumeration value="UnlinkRequested"/>
 *     <enumeration value="UnlinkPending"/>
 *     <enumeration value="UnlinkCanceled"/>
 *     <enumeration value="UnlinkInProgress"/>
 *     <enumeration value="Inactive"/>
 *     <enumeration value="UnlinkFailed"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClientLinkStatus", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
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
