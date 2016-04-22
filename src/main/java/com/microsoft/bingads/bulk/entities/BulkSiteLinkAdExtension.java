package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.campaignmanagement.ArrayOfSiteLink;
import com.microsoft.bingads.campaignmanagement.SiteLink;
import com.microsoft.bingads.campaignmanagement.SiteLinksAdExtension;
import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkOperation;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkObjectWriter;
import com.microsoft.bingads.internal.bulk.BulkStreamReader;
import com.microsoft.bingads.internal.bulk.TryResult;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import com.microsoft.bingads.internal.bulk.entities.SiteLinkAdExtensionIdentifier;
import com.microsoft.bingads.internal.functionalinterfaces.Predicate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Represents a sitelink ad extension that is derived from {@link BulkEntity}
 * and can be read or written in a bulk file. Properties of this class and of
 * classes that it is derived from, correspond to fields of the Sitelink Ad
 * Extension record in a bulk file.
 *
 * <p>
 * For more information, see Sitelink Ad Extension at
 * <a href="http://go.microsoft.com/fwlink/?LinkID=511517">http://go.microsoft.com/fwlink/?LinkID=511517</a>.
 * </p>
 *
 * <p>
 *     The Sitelink Ad Extension record includes the distinct properties of the {@link BulkSiteLink} class,
 *     combined with the commmon properties of the {@link BulkSiteLinkAdExtension} class, for example
 *     {@link #getAccountId} and {@link #getSiteLinksAdExtension}.
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
public class BulkSiteLinkAdExtension extends MultiRecordBulkEntity {

    private Long accountId;

    private SiteLinksAdExtension siteLinksAdExtension;

    private final List<BulkSiteLink> bulkSiteLinkResults = new ArrayList<BulkSiteLink>();

    /**
    * Get The list of {@link BulkSiteLink} are represented by multiple Sitelink Ad Extension records in the file.
     * <p>
    * Each item in the list corresponds to a separate Sitelink Ad Extension record that includes the distinct properties of
     * the {@link BulkSiteLink} class, combined with
    * the commmon properties of the {@link BulkSiteLinkAdExtension} class,
     * for example {@link #getAccountId} and {@link #getSiteLinksAdExtension}.
     * </p>
    */
    public List<BulkSiteLink> getSiteLinks() {
        return Collections.unmodifiableList(this.bulkSiteLinkResults);
    }

    @Override
    public List<? extends BulkEntity> getChildEntities() {
        return Collections.unmodifiableList(this.bulkSiteLinkResults);
    }

    private SiteLinkAdExtensionIdentifier identifier;

    private boolean hasDeleteAllRow;

    /**
     * Initializes a new instance of the BulkSiteLinkAdExtension class.
     */
    public BulkSiteLinkAdExtension() {

    }

    public BulkSiteLinkAdExtension(SiteLinkAdExtensionIdentifier identifier) {
        this();

        this.identifier = identifier;

        this.hasDeleteAllRow = AdExtensionStatus.DELETED.equals(identifier.getStatus());

        this.siteLinksAdExtension = new SiteLinksAdExtension();
        
        this.siteLinksAdExtension.setType(StringTable.SITE_LINKS_AD_EXTENSION);
        this.siteLinksAdExtension.setId(identifier.getAdExtensionId());
        this.siteLinksAdExtension.setStatus(identifier.getStatus());
        this.siteLinksAdExtension.setVersion(identifier.getVersion());

        this.accountId = identifier.getAccountId();
    }

    BulkSiteLinkAdExtension(BulkSiteLink firstSiteLink) {
        this(firstSiteLink.getIdentifier());
        bulkSiteLinkResults.add(firstSiteLink);
    }

    @Override
    public void writeToStream(BulkObjectWriter rowWriter, boolean excludeReadonlyData) throws IOException {
        validatePropertyNotNull(siteLinksAdExtension, StringTable.SITE_LINKS_AD_EXTENSION);

        validatePropertyNotNull(siteLinksAdExtension.getId(), StringTable.SITE_LINKS_AD_EXTENSION + ".getId()");

        if (!AdExtensionStatus.DELETED.equals(siteLinksAdExtension.getStatus())) {
            validateListNotNullOrEmpty(
                    siteLinksAdExtension.getSiteLinks(),
                    siteLinksAdExtension.getSiteLinks().getSiteLinks(),
                    StringTable.SITE_LINKS_AD_EXTENSION_SITE_LINKS
            );
        }

        SiteLinkAdExtensionIdentifier identifier = new SiteLinkAdExtensionIdentifier();
        identifier.setStatus(AdExtensionStatus.DELETED);
        identifier.setAccountId(accountId);
        identifier.setAdExtensionId(this.siteLinksAdExtension.getId());

        rowWriter.writeObjectRow(identifier, excludeReadonlyData);

        if (AdExtensionStatus.DELETED.equals(siteLinksAdExtension.getStatus())) {
            return;
        }

        for (BulkSiteLink bulkSiteLink : convertV9ToBulkSiteLinks()) {
            bulkSiteLink.writeToStream(rowWriter, excludeReadonlyData);
        }
    }

    private List<BulkSiteLink> convertV9ToBulkSiteLinks() {
        int order = 1;

        List<SiteLink> siteLinks = siteLinksAdExtension.getSiteLinks().getSiteLinks();

        List<BulkSiteLink> bulkSiteLinks = new ArrayList<BulkSiteLink>();

        for (SiteLink siteLink : siteLinks) {
            BulkSiteLink bulkSiteLink = new BulkSiteLink();

            bulkSiteLink.setSiteLink(siteLink);
            bulkSiteLink.setAccountId(accountId);
            bulkSiteLink.setAdExtensionId(siteLinksAdExtension.getId());            
            bulkSiteLink.setOrder(order++);

            bulkSiteLinks.add(bulkSiteLink);
        }

        return bulkSiteLinks;
    }

    @Override
    public void readRelatedDataFromStream(BulkStreamReader reader) {
        boolean hasMoreRows = true;

        while (hasMoreRows) {

            TryResult<BulkSiteLink> nextSiteLinkResult = reader.tryRead(new Predicate<BulkSiteLink>() {
                @Override
                public boolean test(BulkSiteLink x) {
                    return x.getIdentifier().equals(identifier);
                }
            }, BulkSiteLink.class);

            if (nextSiteLinkResult.isSuccessful()) {
                bulkSiteLinkResults.add(nextSiteLinkResult.getResult());
                continue;
            }

            TryResult<SiteLinkAdExtensionIdentifier> identifierResult = reader.tryRead(new Predicate<SiteLinkAdExtensionIdentifier>() {
                @Override
                public boolean test(SiteLinkAdExtensionIdentifier x) {
                    return x.equals(identifier);
                }
            }, SiteLinkAdExtensionIdentifier.class);
            if (identifierResult.isSuccessful()) {
                if (AdExtensionStatus.DELETED.equals(identifierResult.getResult().getStatus())) {
                    this.hasDeleteAllRow = true;
                }
            } else {
                hasMoreRows = false;
            }
        }

        if (!bulkSiteLinkResults.isEmpty()) {        
            siteLinksAdExtension.setSiteLinks(this.getSortedSiteLinks());
            siteLinksAdExtension.setStatus(AdExtensionStatus.ACTIVE);
        } else {
            siteLinksAdExtension.setStatus(AdExtensionStatus.DELETED);
        }
    }

    private ArrayOfSiteLink getSortedSiteLinks() {
        List<BulkSiteLink> sortedBulkSiteLinks = new ArrayList<BulkSiteLink>(bulkSiteLinkResults);
        Collections.sort(sortedBulkSiteLinks, ORDER_BY_ORDER);

        ArrayOfSiteLink apiSiteLinks = new ArrayOfSiteLink();

        for (BulkSiteLink bulkSiteLink : sortedBulkSiteLinks) {
            apiSiteLinks.getSiteLinks().add(bulkSiteLink.getSiteLink());
        }

        return apiSiteLinks;
    }

    static final Comparator<BulkSiteLink> ORDER_BY_ORDER = new Comparator<BulkSiteLink>() {
        @Override
        public int compare(BulkSiteLink o1, BulkSiteLink o2) {
            return ((Integer)o1.getOrder()).compareTo(o2.getOrder());
        }
    };

    @Override
    public boolean allChildrenPresent() {
        return hasDeleteAllRow;
    }

    /**
     * Gets the ad extension's parent account identifier.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the ad extension's parent account identifier.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets the SiteLinksAdExtension Data Object of the Campaign Management Service.
     *
     * <p>
     *     A subset of SiteLinksAdExtension properties are available
     *     in the Sitelink Ad Extension record. For more information, see Sitelink Ad Extension at
     *     <a href="http://go.microsoft.com/fwlink/?LinkID=511517">http://go.microsoft.com/fwlink/?LinkID=511517</a>.
     * </p>
     */
    public SiteLinksAdExtension getSiteLinksAdExtension() {
        return siteLinksAdExtension;
    }

    /**
     * Sets the SiteLinksAdExtension Data Object of the Campaign Management Service.
     *
     * <p>
     *     A subset of SiteLinksAdExtension properties are available
     *     in the Sitelink Ad Extension record. For more information, see Sitelink Ad Extension at
     *     <a href="http://go.microsoft.com/fwlink/?LinkID=511517">http://go.microsoft.com/fwlink/?LinkID=511517</a>.
     * </p>
     */
    public void setSiteLinksAdExtension(SiteLinksAdExtension siteLinksAdExtension) {
        this.siteLinksAdExtension = siteLinksAdExtension;
    }

}
