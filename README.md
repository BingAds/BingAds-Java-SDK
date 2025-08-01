
# Bing Ads Java SDK

> [!NOTE]
> For optimal compatibility and performance, please ensure you're using Java version 8 or higher. Verify your current version using `java -version`.  
> Use examples/pom_for_java1.8.xml for Java 8 and examples/pom.xml for Java 11 or higher

You can develop Bing Ads applications with any programming language that supports web services. The Bing Ads Java Software Development Kit (SDK) enhances the experience of developing Bing Ads applications with Java. The SDK includes a proxy to all Bing Ads API web services and abstracts low level details of authentication with OAuth. You can use the high level BulkServiceManager and ReportingServiceManager interfaces to abstract and execute operations in the low level Bulk and Reporting services. For example instead of calling SubmitGenerateReport and PollGenerateReport to download a report, you download a report using one method with the ReportingServiceManager class. For more information, see [Bing Ads Client Libraries](https://docs.microsoft.com/en-us/bingads/guides/client-libraries).

# Getting Started
To get started developing Bing Ads applications with Java, install the SDK and either start with the [examples](https://github.com/bing-ads-sdk/BingAds-Java-SDK/tree/master/examples/) or follow one of the application walkthroughs. For more information, see [Getting Started Using Java with Bing Ads Services](https://docs.microsoft.com/en-us/bingads/guides/get-started-java). 

# Maven Artifact
The Bing Ads Java SDK includes and depends on the microsoft.bingads Maven artifact. You must include the following dependency to your Maven project. 
```Xml
<dependency>
  <groupId>com.microsoft.bingads</groupId>
  <artifactId>microsoft.bingads</artifactId>
  <version>13.0.25.1</version>
</dependency>
```
If you are not using a Maven project, you must include the correct version of each dependency. You can review the complete list of Bing Ads Java SDK dependencies at the [Maven Repository](http://mvnrepository.com/artifact/com.microsoft.bingads/microsoft.bingads/).

# Shadow Jar
You can package a shadow jar using pom_for_shadow_jar.xml which contains all dependencies to avoid conflicts, but its size will be larger.