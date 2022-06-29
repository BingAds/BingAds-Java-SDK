package com.microsoft.bingads.v13.bulk.entities;

import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;

/**
 * Represents a Keyword Ad Customizer Attribute that can be read or written in a bulk file.
 * <p/>
 * <p>
 * For more information, see Keyword Ad Customizer Attribute at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkKeywordAdCustomizerAttribute extends BulkAdCustomizerAttributeEntityBase {

	public long getKeywordId() {
		return parentId;
	}
	
	public void setKeywordId(long keywordId) {
		this.parentId = keywordId;
	}

}
