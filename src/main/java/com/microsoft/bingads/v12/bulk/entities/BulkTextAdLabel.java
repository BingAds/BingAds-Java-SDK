package com.microsoft.bingads.v12.bulk.entities;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.Label;
import com.microsoft.bingads.v12.campaignmanagement.LabelAssociation;
import com.microsoft.bingads.v12.internal.bulk.*;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a label that is applied to a TextAd. Each label can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Label at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkTextAdLabel extends BulkLabelAssociation {
}
