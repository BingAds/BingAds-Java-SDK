package com.microsoft.bingads.v11.api.test.entities.ad_extension.structuredSnippet;

import com.microsoft.bingads.v11.api.test.entities.ad_extension.structuredSnippet.read.BulkStructuredSnippetAdExtensionReadTests;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.structuredSnippet.write.BulkStructuredSnippetAdExtensionWriteTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        BulkStructuredSnippetAdExtensionReadTests.class,
        BulkStructuredSnippetAdExtensionWriteTests.class
})
public class BulkStructuredSnippetAdExtensionTests {

}
