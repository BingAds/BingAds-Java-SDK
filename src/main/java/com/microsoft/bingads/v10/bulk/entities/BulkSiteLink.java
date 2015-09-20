package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v10.campaignmanagement.SiteLink;
import com.microsoft.bingads.v10.campaignmanagement.SiteLinksAdExtension;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkOperation;
import com.microsoft.bingads.v10.internal.bulk.StringExtensions;
import com.microsoft.bingads.v10.internal.bulk.StringTable;
import com.microsoft.bingads.v10.internal.bulk.BulkMapping;
import com.microsoft.bingads.v10.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v10.internal.bulk.RowValues;
import com.microsoft.bingads.v10.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v10.internal.bulk.entities.MultiRecordBulkEntity;
import com.microsoft.bingads.v10.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.v10.internal.bulk.entities.SiteLinkAdExtensionIdentifier;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a sitelink.
 *
 * This class exposes the {@link #setSiteLink} and {@link #getSiteLink} methods that can be used to
 * read and write fields of the Sitelink Ad Extension record in a bulk file.
 *
 * <p>
 *     For more information, see Sitelink Ad Extension at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=620236">http://go.microsoft.com/fwlink/?LinkID=620236</a>
 * </p>
 *
 * <p>
 *      The Sitelink Ad Extension record includes the distinct properties of the {@link BulkSiteLink} class,
 *      combined with the commmon properties of the {@link BulkSiteLinkAdExtension} class,
 *      for example {@link BulkSiteLinkAdExtension#getAccountId} and
 *      {@link BulkSiteLinkAdExtension#getSiteLinksAdExtension}.
 * </p>
 *
 * <p>
 *     One {@link BulkSiteLinkAdExtension} has one or more {@link BulkSiteLink}.
 *     Each {@link BulkSiteLink} instance corresponds to one Sitelink Ad Extension record in the bulk file.
 *     If you upload a {@link BulkSiteLinkAdExtension},
 *     then you are effectively replacing any existing site links for the sitelink ad extension.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
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
     * Gets the identifier of the ad extension.
     *
     * <p>
     *     Corresponds to the 'Id' field in the bulk file.
     * </p>
     */
    public Long getAdExtensionId() {
        return this.identifier.getAdExtensionId();
    }

    /**
     * Sets the identifier of the ad extension.
     *
     * <p>
     *     Corresponds to the 'Id' field in the bulk file.
     * </p>
     */
    public void setAdExtensionId(Long adExtensionId) {
        this.identifier.setAdExtensionId(adExtensionId);
    }

    /**
     * Gets the ad extension's parent account identifier.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getAccountId() {
        return this.identifier.getAccountId();
    }

    /**
     * Sets the ad extension's parent account identifier.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setAccountId(Long accountId) {
        this.identifier.setAccountId(accountId);
    }

    /**
     * Gets the status of the ad extension.
     *
     * <p>
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public AdExtensionStatus getStatus() {
        return this.identifier.getStatus();
    }

    /**
     * Sets the status of the ad extension.
     *
     * <p>
     *     Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public void setStatus(AdExtensionStatus status) {
        this.identifier.setStatus(status);
    }

    /**
     * Gets the version of the ad extension.
     *
     * <p>
     *     Corresponds to the 'Version' field in the bulk file.
     * </p>
     */
    public Integer getVersion() {
        return this.identifier.getVersion();
    }

    /**
     * Sets the version of the ad extension.
     *
     * <p>
     *     Corresponds to the 'Version' field in the bulk file.
     * </p>
     */
    public void setVersion(Integer version) {
        this.identifier.setVersion(version);
    }

    private int order;

    private SiteLink siteLink;

    /**
     * Gets the order of the sitelink displayed to a search user in the ad.
     *
     * <p>
     *     Corresponds to the 'Sitelink Extension Order' field in the bulk file.
     * </p>
     */
    public int getOrder() {
        return order;
    }

    /**
     * Gets the order of the sitelink displayed to a search user in the ad.
     *
     * <p>
     *     Corresponds to the 'Sitelink Extension Order' field in the bulk file.
     * </p>
     */
    public void setOrder(int order) {
        this.order = order;
    }

    /**
     * Gets the sitelink.
     */
    public SiteLink getSiteLink() {
        return siteLink;
    }

    /**
     * Sets the sitelink.
     */
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
                        return StringExtensions.toOptionalBulkString(c.getSiteLink().getDestinationUrl());
                    }
                },
                new BiConsumer<String, BulkSiteLink>() {
                    @Override
                    public void accept(String v, BulkSiteLink c) {
                        c.getSiteLink().setDestinationUrl(StringExtensions.getValueOrEmptyString(v));
                    }
                },
                true
                
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

        m.add(new SimpleBulkMapping<BulkSiteLink, String>(StringTable.FinalUrl,
                new Function<BulkSiteLink, String>() {
                    @Override
                    public String apply(BulkSiteLink c) {
                        return StringExtensions.writeUrls("; ", c.getSiteLink().getFinalUrls());
                    }
                },
                new BiConsumer<String, BulkSiteLink>() {
                    @Override
                    public void accept(String v, BulkSiteLink c) {
                    	ArrayOfstring urls = new ArrayOfstring();
                    	List<String> urlArray = StringExtensions.parseUrls(v);
                    	if(urlArray == null) {
                    		urls = null;
                    	} else {
                    		urls.getStrings().addAll(urlArray);
                    	}
                    	
                        c.getSiteLink().setFinalUrls(urls);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSiteLink, String>(StringTable.FinalMobileUrl,
                new Function<BulkSiteLink, String>() {
                    @Override
                    public String apply(BulkSiteLink c) {
                        return StringExtensions.writeUrls("; ", c.getSiteLink().getFinalMobileUrls());
                    }
                },
                new BiConsumer<String, BulkSiteLink>() {
                    @Override
                    public void accept(String v, BulkSiteLink c) {
                    	ArrayOfstring urls = new ArrayOfstring();
                    	List<String> urlArray = StringExtensions.parseUrls(v);
                    	if(urlArray == null) {
                    		urls = null;
                    	} else {
                    		urls.getStrings().addAll(urlArray);
                    	}
                    	
						c.getSiteLink().setFinalMobileUrls(urls);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSiteLink, String>(StringTable.TrackingTemplate,
                new Function<BulkSiteLink, String>() {
                    @Override
                    public String apply(BulkSiteLink c) {
                        return StringExtensions.toOptionalBulkString(c.getSiteLink().getTrackingUrlTemplate());
                    }
                },
                new BiConsumer<String, BulkSiteLink>() {
                    @Override
                    public void accept(String v, BulkSiteLink c) {
                        c.getSiteLink().setTrackingUrlTemplate(StringExtensions.getValueOrEmptyString(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkSiteLink, String>(StringTable.CustomParameter,
                new Function<BulkSiteLink, String>() {
                    @Override
                    public String apply(BulkSiteLink c) {
                        return StringExtensions.toCustomParaBulkString(c.getSiteLink().getUrlCustomParameters());
                    }
                },
                new BiConsumer<String, BulkSiteLink>() {
                    @Override
                    public void accept(String v, BulkSiteLink c) {
                        try {
							c.getSiteLink().setUrlCustomParameters(StringExtensions.parseCustomParameters(v));
						} catch (Exception e) {
							e.printStackTrace();
						}
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
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        this.validatePropertyNotNull(this.siteLink, StringTable.SiteLink);
        this.identifier.writeToRowValues(values, excludeReadonlyData);
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
