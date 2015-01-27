package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.campaignmanagement.SiteLink;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import com.microsoft.bingads.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.bulk.entities.SiteLinkAdExtensionIdentifier;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a subset of the fields in a Sitelink Ad Extension record. The
 * Sitelink Ad Extension record includes the distinct properties of the
 * {@link BulkSiteLink} class, combined with the commmon properties of the
 * {@link BulkSiteLinkAdExtension} class, for example {@link BulkAccount} and
 * {@link SiteLinksAdExtension}"/>. For more information, see Sitelink Ad
 * Extension at {@link http://go.microsoft.com/fwlink/?LinkID=511517}.
 */
public class BulkSiteLink extends SingleRecordBulkEntity {

    private SiteLinkAdExtensionIdentifier identifier;

    SiteLinkAdExtensionIdentifier getIdentifier() {
        return identifier;
    }

    void setIdentifier(SiteLinkAdExtensionIdentifier identifier) {
        this.identifier = identifier;
    }

    /**
     * The identifier of the ad extension. Corresponds to the 'Id' field in the
     * bulk file.
     */
    public Long getAdExtensionId() {
        return this.identifier.getAdExtensionId();
    }

    public void setAdExtensionId(Long adExtensionId) {
        this.identifier.setAdExtensionId(adExtensionId);
    }

    /**
     * The ad extension's parent account identifier. Corresponds to the 'Parent
     * Id' field in the bulk file.
     */
    public Long getAccountId() {
        return this.identifier.getAccountId();
    }

    public void setAccountId(Long accountId) {
        this.identifier.setAccountId(accountId);
    }

    /**
     * The AdExtensionStatus Value Set of the Campaign Management Service. The
     * status of the ad extension. Corresponds to the 'Status' field in the bulk
     * file.
     */
    public AdExtensionStatus getStatus() {
        return this.identifier.getStatus();
    }

    public void setStatus(AdExtensionStatus status) {
        this.identifier.setStatus(status);
    }

    /**
     * The version of the ad extension. Corresponds to the 'Version' field in
     * the bulk file.
     */
    public Integer getVersion() {
        return this.identifier.getVersion();
    }

    /**
     * The order of the sitelink displayed to a search user in the ad.
     * Corresponds to the 'Sitelink Extension Order' field in the bulk file.
     */
    private int order;

    /**
     * The SiteLink Data Object of the Campaign Management Service. A subset of
     * SiteLink properties are available in the Sitelink Ad Extension record.
     * For more information, see Sitelink Ad Extension at
     * {@link http://go.microsoft.com/fwlink/?LinkID=511517}.
     */
    private SiteLink siteLink;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public SiteLink getSiteLink() {
        return siteLink;
    }

    public void setSiteLink(SiteLink siteLink) {
        this.siteLink = siteLink;
    }

    /**
     * Initializes a new instance of the BulkSiteLink class.
     */
    public BulkSiteLink() {
        this.identifier = new SiteLinkAdExtensionIdentifier();
    }

    private static final List<BulkMapping<BulkSiteLink>> MAPPINGS;

    static {
        List<BulkMapping<BulkSiteLink>> m = new ArrayList<BulkMapping<BulkSiteLink>>();

        m.add(new SimpleBulkMapping<BulkSiteLink, Integer>(StringTable.SiteLinkExtensionOrder,
                new Function<BulkSiteLink, Integer>() {
                    @Override
                    public Integer apply(BulkSiteLink c) {
                        return c.getOrder();
                    }
                },
                new BiConsumer<String, BulkSiteLink>() {
                    @Override
                    public void accept(String v, BulkSiteLink c) {
                        c.setOrder(StringExtensions.parseInt(v));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkSiteLink, String>(StringTable.SiteLinkDisplayText,
                new Function<BulkSiteLink, String>() {
                    @Override
                    public String apply(BulkSiteLink c) {
                        return c.getSiteLink().getDisplayText();
                    }
                },
                new BiConsumer<String, BulkSiteLink>() {
                    @Override
                    public void accept(String v, BulkSiteLink c) {
                        c.getSiteLink().setDisplayText(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkSiteLink, String>(StringTable.SiteLinkDestinationUrl,
                new Function<BulkSiteLink, String>() {
                    @Override
                    public String apply(BulkSiteLink c) {
                        return c.getSiteLink().getDestinationUrl();
                    }
                },
                new BiConsumer<String, BulkSiteLink>() {
                    @Override
                    public void accept(String v, BulkSiteLink c) {
                        c.getSiteLink().setDestinationUrl(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkSiteLink, String>(StringTable.SiteLinkDescription1,
                new Function<BulkSiteLink, String>() {
                    @Override
                    public String apply(BulkSiteLink c) {
                        return c.getSiteLink().getDescription1();
                    }
                },
                new BiConsumer<String, BulkSiteLink>() {
                    @Override
                    public void accept(String v, BulkSiteLink c) {
                        c.getSiteLink().setDescription1(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkSiteLink, String>(StringTable.SiteLinkDescription2,
                new Function<BulkSiteLink, String>() {
                    @Override
                    public String apply(BulkSiteLink c) {
                        return c.getSiteLink().getDescription2();
                    }
                },
                new BiConsumer<String, BulkSiteLink>() {
                    @Override
                    public void accept(String v, BulkSiteLink c) {
                        c.getSiteLink().setDescription2(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkSiteLink, String>(StringTable.DevicePreference,
                new Function<BulkSiteLink, String>() {
                    @Override
                    public String apply(BulkSiteLink c) {
                        return StringExtensions.toDevicePreferenceBulkString(c.getSiteLink().getDevicePreference());
                    }
                },
                new BiConsumer<String, BulkSiteLink>() {
                    @Override
                    public void accept(String v, BulkSiteLink c) {
                        c.getSiteLink().setDevicePreference(StringExtensions.parseDevicePreference(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.siteLink = new SiteLink();

        this.identifier.readFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values) {
        this.validatePropertyNotNull(this.siteLink, StringTable.SiteLink);
        this.identifier.writeToRowValues(values);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    @Override
    public boolean canEncloseInMultilineEntity() {
        return true;
    }

    @Override
    public MultiRecordBulkEntity encloseInMultilineEntity() {
        return new BulkSiteLinkAdExtension(this);
    }
}
