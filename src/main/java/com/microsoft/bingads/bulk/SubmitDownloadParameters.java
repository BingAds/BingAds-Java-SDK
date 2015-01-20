package com.microsoft.bingads.bulk;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.microsoft.bingads.bulk.DownloadFileType;
import com.microsoft.bingads.bulk.PerformanceStatsDateRange;
import java.util.Calendar;

/**
 * Describes the service request parameters such as the type of entities and
 * data scope that you want to download.
 */
public class SubmitDownloadParameters {

    /**
     * The scope or types of data to download. For possible values, see
     * DataScope Value Set at
     * {@link "http://go.microsoft.com/fwlink/?LinkId=511670"}.
     */
    private List<DataScope> dataScope;
    /**
     * The type of entities to download. For possible values, see
     * BulkDownloadEntity Value Set at
     * {@link "http://go.microsoft.com/fwlink/?LinkId=511671"}.
     */
    private List<BulkDownloadEntity> entities;
    /**
     * The extension type of the downloaded file. For possible values, see
     * DownloadFileType Value Set at
     * {@link "http://go.microsoft.com/fwlink/?LinkId=511672"}.
     */
    private DownloadFileType fileType;
    /**
     * The campaigns to download. You can specify a maximum of 1,000 campaigns.
     * The campaigns that you specify must belong to the same account.
     */
    private List<Long> campaignIds;
    /**
     * The last time that you requested a download. The date and time is
     * expressed in Coordinated Universal Time (UTC). Typically, you request a
     * full download the first time you call the operation by setting this
     * element to null. On all subsequent calls you set the last sync time to
     * the time stamp of the previous download. The download file contains the
     * time stamp of the download in the SyncTime column of the Account record.
     * Use the time stamp to set LastSyncTimeInUTC the next time that you
     * request a download. If you specify the last sync time, only those
     * entities that have changed (been updated or deleted) since the specified
     * date and time will be downloaded. However, if the campaign data has not
     * been previously downloaded, the operation performs a full download.
     */
    private Calendar lastSyncTimeInUTC;
    /**
     * The date range values for the requested performance data in a bulk
     * download. For possible values, see PerformanceStatsDateRange Data Object
     * at {@link http://go.microsoft.com/fwlink/?LinkId=511673"}.
     */
    private PerformanceStatsDateRange performanceStatsDateRange;
    /**
     * Location target version
     */
    private String locationTargetVersion;// { get; set; }

    public List<DataScope> getDataScope() {
        return dataScope;
    }
    
    public void setDataScope(List<DataScope> value) {
        dataScope = value;
    }

    public List<BulkDownloadEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<BulkDownloadEntity> value) {
        entities = value;
    }

    public List<Long> getCampaignIds() {
        return this.campaignIds;
    }

    public void setCampaignIds(List<Long> campaignIds) {
        this.campaignIds = campaignIds;
    }

    public DownloadFileType getFileType() {
        return fileType;
    }

    public void setFileType(DownloadFileType fileType) {
        this.fileType = fileType;
    }

    public Calendar getLastSyncTimeInUTC() {
        return lastSyncTimeInUTC;
    }

    public void setLastSyncTimeInUTC(Calendar lastSyncTimeInUTC) {
        this.lastSyncTimeInUTC = lastSyncTimeInUTC;
    }

    public PerformanceStatsDateRange getPerformanceStatsDateRange() {
        return performanceStatsDateRange;
    }

    public void setPerformanceStatsDateRange(
            PerformanceStatsDateRange performanceStatsDateRange) {
        this.performanceStatsDateRange = performanceStatsDateRange;
    }

    public String getLocationTargetVersion() {
        return locationTargetVersion;
    }

    public void setLocationTargetVersion(String locationTargetVersion) {
        this.locationTargetVersion = locationTargetVersion;
    }
}
