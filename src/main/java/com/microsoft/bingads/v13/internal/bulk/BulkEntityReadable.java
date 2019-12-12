package com.microsoft.bingads.v13.internal.bulk;

import java.io.UnsupportedEncodingException;

import com.microsoft.bingads.v13.bulk.BulkEntityIterable;

public interface BulkEntityReadable {
	public BulkEntityIterable getEntities() throws UnsupportedEncodingException;
}
