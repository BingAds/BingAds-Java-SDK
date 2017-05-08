package com.microsoft.bingads.v11.api.test.operations;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.junit.Test;

import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.PasswordAuthentication;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.internal.utilities.ZipExtractor;
import com.microsoft.bingads.v11.bulk.ArrayOfDownloadEntity;
import com.microsoft.bingads.v11.bulk.ArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v11.bulk.BulkDownloadOperation;
import com.microsoft.bingads.v11.bulk.BulkEntityIterable;
import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.bulk.CampaignScope;
import com.microsoft.bingads.v11.bulk.DataScope;
import com.microsoft.bingads.v11.bulk.DownloadCampaignsByAccountIdsRequest;
import com.microsoft.bingads.v11.bulk.DownloadCampaignsByAccountIdsResponse;
import com.microsoft.bingads.v11.bulk.DownloadCampaignsByCampaignIdsRequest;
import com.microsoft.bingads.v11.bulk.DownloadCampaignsByCampaignIdsResponse;
import com.microsoft.bingads.v11.bulk.DownloadEntity;
import com.microsoft.bingads.v11.bulk.DownloadFileType;
import com.microsoft.bingads.v11.bulk.DownloadParameters;
import com.microsoft.bingads.v11.bulk.GetBulkDownloadStatusRequest;
import com.microsoft.bingads.v11.bulk.GetBulkDownloadStatusResponse;
import com.microsoft.bingads.v11.bulk.PerformanceStatsDateRange;
import com.microsoft.bingads.v11.bulk.ResultFileType;
import com.microsoft.bingads.v11.bulk.SubmitDownloadParameters;
import com.microsoft.bingads.v11.bulk.entities.BulkEntity;
import com.microsoft.bingads.v11.internal.bulk.BulkFileReaderFactory;

//import com.microsoft.bingads.v11.bulk.GetDetailedBulkDownloadStatusRequest;
//import com.microsoft.bingads.v11.bulk.GetDetailedBulkDownloadStatusResponse;

public class BulkServiceTest extends FakeApiTest {
    
    @Test
    public void BulkService_SubmitDownload_AccountLevel_CallsApiAndReturnsCorrectOperation() throws InterruptedException, ExecutionException {
        final DownloadCampaignsByAccountIdsResponse apiResponse = new DownloadCampaignsByAccountIdsResponse();
        apiResponse.setDownloadRequestId("req456");        
        
        FakeBulkService.setGetDownloadCampaignsByAccountIdsResponse(new Supplier<DownloadCampaignsByAccountIdsResponse>() {            
            @Override
            public DownloadCampaignsByAccountIdsResponse get() {
                return apiResponse;
            }
        });
        
        FakeBulkService.setInboundHeadersSupplier(createTrackingIdHeaderSupplier());
        
        final AuthorizationData authorizationData = createUserData();
        
        final SubmitDownloadParameters parameters = new SubmitDownloadParameters();
        
        parameters.setDataScope(new ArrayList<DataScope>());
        parameters.getDataScope().add(DataScope.ENTITY_DATA);
        parameters.getDataScope().add(DataScope.ENTITY_PERFORMANCE_DATA);                  

        parameters.setDownloadEntities(new ArrayOfDownloadEntity());
        ArrayOfDownloadEntity entities = parameters.getDownloadEntities();
        entities.getDownloadEntities().add(DownloadEntity.CAMPAIGNS);
        entities.getDownloadEntities().add(DownloadEntity.KEYWORDS);
 
        parameters.setPerformanceStatsDateRange(new PerformanceStatsDateRange());
        parameters.setLastSyncTimeInUTC(new GregorianCalendar(2014, 1, 2));

        FakeBulkService.setOnDownloadCampaignsByAccountIdsRequest(new Consumer<DownloadCampaignsByAccountIdsRequest>() {

            @Override
            public void accept(DownloadCampaignsByAccountIdsRequest request) {
                assertEquals((Long)authorizationData.getAccountId(), request.getAccountIds().getLongs().get(0));
                assertEquals(parameters.getDataScope(), request.getDataScope());
                assertEquals(parameters.getDownloadEntities(), request.getDownloadEntities());
                assertEquals(parameters.getPerformanceStatsDateRange(), request.getPerformanceStatsDateRange());
                assertEquals(parameters.getLastSyncTimeInUTC(), request.getLastSyncTimeInUTC());
            }
        });
        
        BulkServiceManager bulkServiceManager = new BulkServiceManager(authorizationData);


        BulkDownloadOperation operation = bulkServiceManager.submitDownloadAsync(parameters, null).get();                        
        
        assertEquals("track123", operation.getTrackingId());
        assertEquals("req456", operation.getRequestId());       
    }

    @Test
    public void BulkService_SubmitDownload_CampaignLevel_CallsApiAndReturnsCorrectOperation() throws InterruptedException, ExecutionException {
        final DownloadCampaignsByCampaignIdsResponse apiResponse = new DownloadCampaignsByCampaignIdsResponse();
        apiResponse.setDownloadRequestId("req456");        
        
        FakeBulkService.setGetDownloadCampaignsByCampaignIdsResponse(new Supplier<DownloadCampaignsByCampaignIdsResponse>() {            
            @Override
            public DownloadCampaignsByCampaignIdsResponse get() {
                return apiResponse;
            }
        });
        
        FakeBulkService.setInboundHeadersSupplier(createTrackingIdHeaderSupplier());      
        
        final AuthorizationData authorizationData = createUserData();
        
        final SubmitDownloadParameters parameters = new SubmitDownloadParameters();
                
        List<Long> campaignIds = new ArrayList<Long>();
        campaignIds.add(1L);
        campaignIds.add(10L);
        campaignIds.add(20L);
        parameters.setCampaignIds(campaignIds);

        parameters.setDataScope(new ArrayList<DataScope>());
        parameters.getDataScope().add(DataScope.ENTITY_DATA);
        parameters.getDataScope().add(DataScope.ENTITY_PERFORMANCE_DATA);   

        parameters.setDownloadEntities(new ArrayOfDownloadEntity());
        ArrayOfDownloadEntity entities = parameters.getDownloadEntities();
        entities.getDownloadEntities().add(DownloadEntity.CAMPAIGNS);
        entities.getDownloadEntities().add(DownloadEntity.KEYWORDS);

        GregorianCalendar calendar = new GregorianCalendar(2014, 1, 2);        

        parameters.setPerformanceStatsDateRange(new PerformanceStatsDateRange());
        parameters.setLastSyncTimeInUTC(calendar);

        FakeBulkService.setOnDownloadCampaignsByCampaignIdsRequest(new Consumer<DownloadCampaignsByCampaignIdsRequest>() {

            @Override
            public void accept(DownloadCampaignsByCampaignIdsRequest request) {
                for (Integer i = 0; i < request.getCampaigns().getCampaignScopes().size(); i++) {
                    Long expectedId = parameters.getCampaignIds().get(i);
                    
                    CampaignScope campaignScope = request.getCampaigns().getCampaignScopes().get(i);
                    
                    assertEquals((Long)123L, campaignScope.getParentAccountId());
                    assertEquals(expectedId, campaignScope.getCampaignId());
                }
                                
                assertEquals(parameters.getDataScope(), request.getDataScope());
                assertEquals(parameters.getDownloadEntities(), request.getDownloadEntities());
                assertEquals(parameters.getPerformanceStatsDateRange(), request.getPerformanceStatsDateRange());
                assertEquals(parameters.getLastSyncTimeInUTC(), request.getLastSyncTimeInUTC());
            }
        });
        
        BulkServiceManager bulkServiceManager = new BulkServiceManager(authorizationData);

        BulkDownloadOperation operation = bulkServiceManager.submitDownloadAsync(parameters, null).get();                        
        
        assertEquals("track123", operation.getTrackingId());
        assertEquals("req456", operation.getRequestId());  
    }

    @Test
    public void BulkService_DownloadFile_CallsApiDownloadsAndExtractsFile() throws IOException, URISyntaxException, InterruptedException, ExecutionException {
        final DownloadCampaignsByAccountIdsResponse apiResponse = new DownloadCampaignsByAccountIdsResponse();
        apiResponse.setDownloadRequestId("req456");        
        
        FakeBulkService.setGetDownloadCampaignsByAccountIdsResponse(new Supplier<DownloadCampaignsByAccountIdsResponse>() {            
            @Override
            public DownloadCampaignsByAccountIdsResponse get() {
                return apiResponse;
            }
        });        
                
        FakeBulkService.setOnGetBulkDownloadStatus(new Consumer<GetBulkDownloadStatusRequest>() {
            @Override
            public void accept(GetBulkDownloadStatusRequest t) {
                assertEquals("req456", t.getRequestId());
            }
        });
        
        FakeBulkService.setGetBulkDownloadStatusResponse(new Supplier<GetBulkDownloadStatusResponse>() {
            @Override
            public GetBulkDownloadStatusResponse get() {
                GetBulkDownloadStatusResponse statusResponse = new GetBulkDownloadStatusResponse();
                statusResponse.setPercentComplete(100);
                statusResponse.setRequestStatus("Completed");
                statusResponse.setResultFileUrl("http://download.com/123");
                statusResponse.setForwardCompatibilityMap(new ArrayOfKeyValuePairOfstringstring());
                
                return statusResponse;
            }
        });   
        
        FakeBulkService.setInboundHeadersSupplier(createTrackingIdHeaderSupplier());
        
        final AuthorizationData authorizationData = createUserData();
        
        final DownloadParameters parameters = new DownloadParameters();        
        
        parameters.setDataScope(new ArrayList<DataScope>());
        parameters.getDataScope().add(DataScope.ENTITY_DATA);
        parameters.getDataScope().add(DataScope.ENTITY_PERFORMANCE_DATA);                  

        parameters.setDownloadEntities(new ArrayOfDownloadEntity());
        ArrayOfDownloadEntity entities = parameters.getDownloadEntities();
        entities.getDownloadEntities().add(DownloadEntity.CAMPAIGNS);
        entities.getDownloadEntities().add(DownloadEntity.KEYWORDS);
 
        parameters.setPerformanceStatsDateRange(new PerformanceStatsDateRange());
        parameters.setLastSyncTimeInUTC(new GregorianCalendar(2014, 1, 2));

        FakeBulkService.setOnDownloadCampaignsByAccountIdsRequest(new Consumer<DownloadCampaignsByAccountIdsRequest>() {
            @Override
            public void accept(DownloadCampaignsByAccountIdsRequest request) {
                assertEquals((Long)authorizationData.getAccountId(), request.getAccountIds().getLongs().get(0));
                assertEquals(parameters.getDataScope(), request.getDataScope());
                assertEquals(parameters.getDownloadEntities(), request.getDownloadEntities());
                assertEquals(parameters.getPerformanceStatsDateRange(), request.getPerformanceStatsDateRange());
                assertEquals(parameters.getLastSyncTimeInUTC(), request.getLastSyncTimeInUTC());
            }
        });                   
        
        FakeHttpFileService httpFileService = new FakeHttpFileService();

        httpFileService.setOnDownloadFile(new BiConsumer<String, File>() {
            @Override
            public void accept(String url, File file) {
                assertEquals("http://download.com/123", url);
            }
        });
        
        ZipExtractor zipExtractor = createMock(ZipExtractor.class);
          
        File expectedZipFile = new File(new File(System.getProperty("java.io.tmpdir"), "BingAdsSDK"), "req456.zip");
        
        File expectedResultFile = new File(new File(System.getProperty("java.io.tmpdir"), "BingAdsSDK"), "req456");
        
        expect(zipExtractor.extractFirstEntryToFile(expectedZipFile, expectedResultFile, true, false)).andReturn(new File("file path"));
        
        replay(zipExtractor);

        BulkServiceManager bulkServiceManager = new BulkServiceManager(authorizationData);
        
        bulkServiceManager.setHttpFileService(httpFileService);
        bulkServiceManager.setZipExtractor(zipExtractor);

        File file = bulkServiceManager.downloadFileAsync(parameters, null).get();                
        
        verify(zipExtractor);
        
        assertEquals(new File("file path"), file);
        assertTrue(httpFileService.getDownloadWasCalled());
    }   

    @Test
    public void BulkService_DownloadEntities_CallsApiDownloadsAndExtractsFile_Async() throws IOException, InterruptedException, ExecutionException {
        final DownloadCampaignsByAccountIdsResponse apiResponse = new DownloadCampaignsByAccountIdsResponse();
        apiResponse.setDownloadRequestId("req456");        
        
        FakeBulkService.setGetDownloadCampaignsByAccountIdsResponse(new Supplier<DownloadCampaignsByAccountIdsResponse>() {            
            @Override
            public DownloadCampaignsByAccountIdsResponse get() {
                return apiResponse;
            }
        });        
                
        FakeBulkService.setOnGetBulkDownloadStatus(new Consumer<GetBulkDownloadStatusRequest>() {
            @Override
            public void accept(GetBulkDownloadStatusRequest t) {
                assertEquals("req456", t.getRequestId());
            }
        });
        
        FakeBulkService.setGetBulkDownloadStatusResponse(new Supplier<GetBulkDownloadStatusResponse>() {
            @Override
            public GetBulkDownloadStatusResponse get() {
                GetBulkDownloadStatusResponse statusResponse = new GetBulkDownloadStatusResponse();
                statusResponse.setPercentComplete(100);
                statusResponse.setRequestStatus("Completed");
                statusResponse.setResultFileUrl("http://download.com/123");
                statusResponse.setForwardCompatibilityMap(new ArrayOfKeyValuePairOfstringstring());
                
                return statusResponse;
            }
        });   
        
        FakeBulkService.setInboundHeadersSupplier(createTrackingIdHeaderSupplier());
        
        final AuthorizationData authorizationData = createUserData();
        
        final DownloadParameters parameters = new DownloadParameters();        
        
        parameters.setDataScope(new ArrayList<DataScope>());
        parameters.getDataScope().add(DataScope.ENTITY_DATA);
        parameters.getDataScope().add(DataScope.ENTITY_PERFORMANCE_DATA);        

        parameters.setDownloadEntities(new ArrayOfDownloadEntity());
        ArrayOfDownloadEntity entities = parameters.getDownloadEntities();
        entities.getDownloadEntities().add(DownloadEntity.CAMPAIGNS);
        entities.getDownloadEntities().add(DownloadEntity.KEYWORDS);
 
        parameters.setPerformanceStatsDateRange(new PerformanceStatsDateRange());
        parameters.setLastSyncTimeInUTC(new GregorianCalendar(2014, 1, 2));
        
        parameters.setFileType(DownloadFileType.TSV);

        FakeBulkService.setOnDownloadCampaignsByAccountIdsRequest(new Consumer<DownloadCampaignsByAccountIdsRequest>() {
            @Override
            public void accept(DownloadCampaignsByAccountIdsRequest request) {
                assertEquals((Long)authorizationData.getAccountId(), request.getAccountIds().getLongs().get(0));
                assertEquals(parameters.getDataScope(), request.getDataScope());
                assertEquals(parameters.getDownloadEntities(), request.getDownloadEntities());
                assertEquals(parameters.getPerformanceStatsDateRange(), request.getPerformanceStatsDateRange());
                assertEquals(parameters.getLastSyncTimeInUTC(), request.getLastSyncTimeInUTC());
            }
        });                   
        
        FakeHttpFileService httpFileService = new FakeHttpFileService();

        httpFileService.setOnDownloadFile(new BiConsumer<String, File>() {
            @Override
            public void accept(String url, File file) {
                assertEquals("http://download.com/123", url);
            }
        });
        
        ZipExtractor zipExtractor = createMock(ZipExtractor.class);
          
        File expectedZipFile = new File(new File(System.getProperty("java.io.tmpdir"), "BingAdsSDK"), "req456.zip");
        
        File expectedResultFile = new File(new File(System.getProperty("java.io.tmpdir"), "BingAdsSDK"), "req456");
        
        expect(zipExtractor.extractFirstEntryToFile(expectedZipFile, expectedResultFile, true, false)).andReturn(new File("file path"));
        
        BulkFileReaderFactory factory = createMock(BulkFileReaderFactory.class);
        
        BulkFileReader expectedReader = createMock(BulkFileReader.class);
        
        BulkEntityIterable bulkEntities = createMock(BulkEntityIterable.class);
        
        expect(expectedReader.getEntities()).andReturn(bulkEntities);
        
        expect(factory.createBulkFileReader(new File("file path"), ResultFileType.PARTIAL_DOWNLOAD, DownloadFileType.TSV)).andReturn(expectedReader);
        
        replay(zipExtractor, expectedReader, factory);

        BulkServiceManager bulkServiceManager = new BulkServiceManager(authorizationData);
        
        bulkServiceManager.setHttpFileService(httpFileService);
        bulkServiceManager.setZipExtractor(zipExtractor);
        bulkServiceManager.setBulkFileReaderFactory(factory);

        Iterable<BulkEntity> resultEntities = bulkServiceManager.downloadEntitiesAsync(parameters, null).get();                
        
        verify(zipExtractor);
        
        assertEquals(bulkEntities, resultEntities);
        assertTrue(httpFileService.getDownloadWasCalled());
    }
    
    private static AuthorizationData createUserData() {
        AuthorizationData authorizationData = new AuthorizationData();
        authorizationData.setAuthentication(new PasswordAuthentication("user", "pass"));
        authorizationData.setAccountId(123L);
        authorizationData.setCustomerId(456L);
        authorizationData.setDeveloperToken("dev");

        return authorizationData;
    }
}
