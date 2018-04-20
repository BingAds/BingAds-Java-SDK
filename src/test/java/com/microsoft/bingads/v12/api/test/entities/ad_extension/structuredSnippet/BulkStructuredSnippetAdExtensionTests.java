package com.microsoft.bingads.v12.api.test.entities.ad_extension.structuredSnippet;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.ad_extension.structuredSnippet.read.BulkStructuredSnippetAdExtensionReadTests;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.structuredSnippet.write.BulkStructuredSnippetAdExtensionWriteTests;

@RunWith(Suite.class)
@SuiteClasses({
        BulkStructuredSnippetAdExtensionReadTests.class,
        BulkStructuredSnippetAdExtensionWriteTests.class
})
public class BulkStructuredSnippetAdExtensionTests {

}
