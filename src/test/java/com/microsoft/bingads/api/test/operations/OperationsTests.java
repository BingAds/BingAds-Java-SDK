package com.microsoft.bingads.api.test.operations;

import com.microsoft.bingads.api.test.operations.bulk_download_operation.BulkDownloadOperationsTests;
import com.microsoft.bingads.api.test.operations.bulk_upload_operation.BulkUploadOperationsTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkServiceTest.class, BulkDownloadOperationsTests.class, BulkUploadOperationsTests.class})
public class OperationsTests {

}
