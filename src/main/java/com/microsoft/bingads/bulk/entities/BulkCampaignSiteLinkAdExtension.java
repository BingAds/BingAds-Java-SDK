package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;
import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.internal.bulk.entities.adextensions.BulkCampaignAdExtension;

/**
 * Represents a campaign level call ad extension. This class exposes properties
 * that can be read and written as fields of the Campaign Site Link Ad Extension
 * record in a bulk file.
 *
 * For more information, see Campaign SiteLink Ad Extension at
 * {@link http://go.microsoft.com/fwlink/?LinkID=511536}.
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignSiteLinkAdExtension extends BulkCampaignAdExtension {
}
