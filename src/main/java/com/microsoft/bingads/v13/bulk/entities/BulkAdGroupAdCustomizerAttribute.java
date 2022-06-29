package com.microsoft.bingads.v13.bulk.entities;

import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;

/**
 * Represents an Ad Group Ad Customizer Attribute that can be read or written in a bulk file.
 * <p/>
 * <p>
 * For more information, see Ad Group Ad Customizer Attribute at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupAdCustomizerAttribute extends BulkAdCustomizerAttributeEntityBase {

	public Long getAdGroupId() {
		return parentId;
	}
	
	public void setAdGroupId(long adGroupId) {
		this.parentId = adGroupId;
	}

}
