package com.microsoft.bingads.v13.internal.bulk;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.microsoft.bingads.v13.bulk.ArrayOfstring;
import com.microsoft.bingads.v13.bulk.BulkEntityIterable;

public class BulkEntityReader implements BulkEntityReadable{

	private List<String> csvRows;
	public BulkEntityReader(List<String> csvRows) {
		this.csvRows = csvRows;
	}

	@Override
	public BulkEntityIterable getEntities() throws UnsupportedEncodingException {
        return new BulkEntityIterable(new SimpleBulkRecordReader(new SimpleBulkObjectReader(csvRows)), false);
	}

}
