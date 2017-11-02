
package com.microsoft.bingads.v11.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AdvertiserCampaignManager"/>
 *     &lt;enumeration value="SuperAdmin"/>
 *     &lt;enumeration value="ClientViewer"/>
 *     &lt;enumeration value="ClientManager"/>
 *     &lt;enumeration value="PublisherAdmin"/>
 *     &lt;enumeration value="PublisherAccountManager"/>
 *     &lt;enumeration value="PublisherReportUser"/>
 *     &lt;enumeration value="PublisherListManager"/>
 *     &lt;enumeration value="PublisherAdViewer"/>
 *     &lt;enumeration value="ClientAdmin"/>
 *     &lt;enumeration value="StandardUser"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserRole", namespace = "https://bingads.microsoft.com/Customer/v11/Entities")
@XmlEnum
public enum UserRole {

    @XmlEnumValue("AdvertiserCampaignManager")
    ADVERTISER_CAMPAIGN_MANAGER("AdvertiserCampaignManager"),
    @XmlEnumValue("SuperAdmin")
    SUPER_ADMIN("SuperAdmin"),
    @XmlEnumValue("ClientViewer")
    CLIENT_VIEWER("ClientViewer"),
    @XmlEnumValue("ClientManager")
    CLIENT_MANAGER("ClientManager"),
    @XmlEnumValue("PublisherAdmin")
    PUBLISHER_ADMIN("PublisherAdmin"),
    @XmlEnumValue("PublisherAccountManager")
    PUBLISHER_ACCOUNT_MANAGER("PublisherAccountManager"),
    @XmlEnumValue("PublisherReportUser")
    PUBLISHER_REPORT_USER("PublisherReportUser"),
    @XmlEnumValue("PublisherListManager")
    PUBLISHER_LIST_MANAGER("PublisherListManager"),
    @XmlEnumValue("PublisherAdViewer")
    PUBLISHER_AD_VIEWER("PublisherAdViewer"),
    @XmlEnumValue("ClientAdmin")
    CLIENT_ADMIN("ClientAdmin"),
    @XmlEnumValue("StandardUser")
    STANDARD_USER("StandardUser");
    private final String value;

    UserRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserRole fromValue(String v) {
        for (UserRole c: UserRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
