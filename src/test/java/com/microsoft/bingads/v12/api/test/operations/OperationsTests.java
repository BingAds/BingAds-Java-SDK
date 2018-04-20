package com.microsoft.bingads.v12.api.test.operations;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.operations.bulk_download_operation.BulkDownloadOperationsTests;
import com.microsoft.bingads.v12.api.test.operations.bulk_upload_operation.BulkUploadOperationsTests;

@RunWith(Suite.class)
@SuiteClasses({BulkServiceTest.class, BulkDownloadOperationsTests.class, BulkUploadOperationsTests.class})
public class OperationsTests {

}
