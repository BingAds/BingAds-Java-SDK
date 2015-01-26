package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.campaignmanagement.ArrayOfSiteLink;
import com.microsoft.bingads.campaignmanagement.SiteLink;
import com.microsoft.bingads.campaignmanagement.SiteLinksAdExtension;
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
 * Extension record in a bulk file. For more information, see Sitelink Ad
 * Extension at {@link http://go.microsoft.com/fwlink/?LinkID=511517}.
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkSiteLinkAdExtension extends MultiRecordBulkEntity {

    /// <summary>
    /// The ad extension's parent account identifier. 
    /// Corresponds to the 'Parent Id' field in the bulk file. 
    /// </summary>
    private Long accountId;

    /// <summary>
    /// The SiteLinksAdExtension Data Object of the Campaign Management Service. A subset of SiteLinksAdExtension properties are available 
    /// in the Sitelink Ad Extension record. For more information, see Sitelink Ad Extension at http://go.microsoft.com/fwlink/?LinkID=511517.
    /// </summary>
    private SiteLinksAdExtension siteLinksAdExtension;

    private final List<BulkSiteLink> bulkSiteLinkResults = new ArrayList<BulkSiteLink>();

    /// <summary>
    /// The list of <see cref="BulkSiteLink"/> are represented by multiple Sitelink Ad Extension records in the file.
    /// Each item in the list corresponds to a separate Sitelink Ad Extension record that includes the distinct properties of the <see cref="BulkSiteLink"/> class, combined with 
    /// the commmon properties of the <see cref="BulkSiteLinkAdExtension"/> class, for example <see cref="AccountId"/> and <see cref="SiteLinksAdExtension"/>.
    /// </summary>
    public List<BulkSiteLink> getSiteLinks() {
        return Collections.unmodifiableList(this.bulkSiteLinkResults);
    }

    @Override
    public List<? extends BulkEntity> getChildEntities() {
        return Collections.unmodifiableList(this.bulkSiteLinkResults);
    }

    private SiteLinkAdExtensionIdentifier identifier;

    private boolean hasDeleteAllRow;

    /// <summary>
    /// Initializes a new instance of the BulkSiteLinkAdExtension class. 
    /// </summary>
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
    public void writeToStream(BulkObjectWriter rowWriter) throws IOException {
        validatePropertyNotNull(siteLinksAdExtension, StringTable.SITE_LINKS_AD_EXTENSION);

        validatePropertyNotNull(siteLinksAdExtension.getId(), StringTable.SITE_LINKS_AD_EXTENSION + ".getId()");

        validatePropertyNotNull(siteLinksAdExtension.getSiteLinks(), StringTable.SITE_LINKS_AD_EXTENSION_SITE_LINKS);

        SiteLinkAdExtensionIdentifier identifier = new SiteLinkAdExtensionIdentifier();
        identifier.setStatus(AdExtensionStatus.DELETED);
        identifier.setAccountId(accountId);
        identifier.setAdExtensionId(this.siteLinksAdExtension.getId());

        rowWriter.writeObjectRow(identifier);

        if (AdExtensionStatus.DELETED.equals(siteLinksAdExtension.getStatus())) {
            return;
        }

        for (BulkSiteLink bulkSiteLink : convertV9ToBulkSiteLinks()) {
            bulkSiteLink.writeToStream(rowWriter);
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
            bulkSiteLink.setVersion(siteLinksAdExtension.getVersion());
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

        if (bulkSiteLinkResults.size() > 0) {        
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
            if (o1 == null || o1.getOrder() == null) {
                if (o2 == null || o2.getOrder() == null) {
                    return 0;
                }

                return 1;
            }

            return o1.getOrder().compareTo(o2.getOrder());
        }
    };

    @Override
    public boolean allChildrenPresent() {
        return hasDeleteAllRow;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public SiteLinksAdExtension getSiteLinksAdExtension() {
        return siteLinksAdExtension;
    }

    public void setSiteLinksAdExtension(SiteLinksAdExtension siteLinksAdExtension) {
        this.siteLinksAdExtension = siteLinksAdExtension;
    }

}
