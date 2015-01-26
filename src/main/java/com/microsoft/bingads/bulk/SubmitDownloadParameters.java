package com.microsoft.bingads.bulk;

import java.util.Calendar;
import java.util.Collection;
import java.util.List;

/**
 * Describes the service request parameters such as the type of entities and data scope that you want to download.
 */
public class SubmitDownloadParameters {

    private Collection<DataScope> dataScope;

    private Collection<BulkDownloadEntity> entities;

    private DownloadFileType fileType;

    private List<Long> campaignIds;

    private Calendar lastSyncTimeInUTC;

    private PerformanceStatsDateRange performanceStatsDateRange;

    private String locationTargetVersion;

    /**
     * Gets the scope or types of data to download. For possible values, see
     * DataScope Value Set at
     * {@link "http://go.microsoft.com/fwlink/?LinkId=511670"}.
     * @return
     */
    public Collection<DataScope> getDataScope() {
        return dataScope;
    }
    
    public void setDataScope(Collection<DataScope> value) {
        dataScope = value;
    }

    /**
     * Gets the type of entities to download. For possible values, see
     * BulkDownloadEntity Value Set at
     * {@link "http://go.microsoft.com/fwlink/?LinkId=511671"}.
     * @return
     */
    public Collection<BulkDownloadEntity> getEntities() {
        return entities;
    }

    /**
     * Sets the type of entities to download. For possible values, see
     * BulkDownloadEntity Value Set at
     * {@link "http://go.microsoft.com/fwlink/?LinkId=511671"}.
     * @param value
     */
    public void setEntities(Collection<BulkDownloadEntity> value) {
        entities = value;
    }

    /**
     * Gets the campaigns to download. You can specify a maximum of 1,000 campaigns.
     * The campaigns that you specify must belong to the same account.
     * @return
     */
    public List<Long> getCampaignIds() {
        return this.campaignIds;
    }

    /**
     * Sets the campaigns to download. You can specify a maximum of 1,000 campaigns.
     * The campaigns that you specify must belong to the same account.
     * @param campaignIds
     */
    public void setCampaignIds(List<Long> campaignIds) {
        this.campaignIds = campaignIds;
    }

    /**
     * Gets the extension type of the downloaded file. For possible values, see
     * DownloadFileType Value Set at
     * {@link "http://go.microsoft.com/fwlink/?LinkId=511672"}.     
     * @return
     */
    public DownloadFileType getFileType() {
        return fileType;
    }

    /**
     * Sets the extension type of the downloaded file. For possible values, see
     * DownloadFileType Value Set at
     * {@link "http://go.microsoft.com/fwlink/?LinkId=511672"}.
     * @param fileType
     */
    public void setFileType(DownloadFileType fileType) {
        this.fileType = fileType;
    }

    /**
     * Gets the last time that you requested a download. The date and time is
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
     * @return
     */
    public Calendar getLastSyncTimeInUTC() {
        return lastSyncTimeInUTC;
    }

    /**
     * Sets the last time that you requested a download. The date and time is
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
     * @param lastSyncTimeInUTC
     */
    public void setLastSyncTimeInUTC(Calendar lastSyncTimeInUTC) {
        this.lastSyncTimeInUTC = lastSyncTimeInUTC;
    }

    /**
     * Gets the date range values for the requested performance data in a bulk
     * download. For possible values, see PerformanceStatsDateRange Data Object
     * at {@link http://go.microsoft.com/fwlink/?LinkId=511673"}.
     * @return
     */
    public PerformanceStatsDateRange getPerformanceStatsDateRange() {
        return performanceStatsDateRange;
    }

    /**
     * Sets the date range values for the requested performance data in a bulk
     * download. For possible values, see PerformanceStatsDateRange Data Object
     * at {@link http://go.microsoft.com/fwlink/?LinkId=511673"}.
     * @param performanceStatsDateRange
     */
    public void setPerformanceStatsDateRange(
            PerformanceStatsDateRange performanceStatsDateRange) {
        this.performanceStatsDateRange = performanceStatsDateRange;
    }

    /**
     * Gets the location target version.
     * @return
     */
    public String getLocationTargetVersion() {
        return locationTargetVersion;
    }

    /**
     * Sets the location target version.
     * @param locationTargetVersion
     */
    public void setLocationTargetVersion(String locationTargetVersion) {
        this.locationTargetVersion = locationTargetVersion;
    }
}
