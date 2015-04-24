
# Bing Ads Java SDK

The Bing Ads Java Software Development Kit (SDK) Version 9.3 enhances the experience of developing Bing Ads applications with Java. The SDK includes proxy classes for all Bing Ads API web services and abstracts the low level details of authentication with OAuth. You can also read and write bulk files with the SDK BulkFileReader and BulkFileWriter, and use the high level BulkServiceManager interface to abstract and execute operations in the low level Bulk API. For more information, see [Bing Ads Java SDK](https://msdn.microsoft.com/en-US/library/bing-ads-java-sdk.aspx) on MSDN.

#Getting Started
To get started developing Bing Ads applications with Java, install the SDK and either start with the [examples](https://github.com/bing-ads-sdk/BingAds-Java-SDK/tree/master/examples/) or follow one of the application walkthroughs on MSDN. For more information, see [Getting Started Using Java with Bing Ads Services](https://msdn.microsoft.com/en-US/library/bing-ads-overview-getting-started-java-with-web-services.aspx). 

# Maven Artifact
The Bing Ads Java SDK includes and depends on the microsoft.bingads Maven artifact. You must include the following dependency to your Maven project. 
```Xml
<dependency>
  <groupId>com.microsoft.bingads</groupId>
  <artifactId>microsoft.bingads</artifactId>
  <version>9.3.4</version>
</dependency>
```
If you are not using a Maven project, you must include the correct version of each dependency. You can review the complete list of Bing Ads Java SDK dependencies at the [Maven Repository](http://mvnrepository.com/artifact/com.microsoft.bingads/microsoft.bingads/).
