package com.microsoft.bingads.v10.bulk;

import java.io.File;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

import com.microsoft.bingads.v10.bulk.DownloadFileType;


/**
 * Describes the available parameters when performing a download, such as the type of entities and data scope that you want to download. 
 */
public class DownloadParameters {

    private SubmitDownloadParameters submitDownloadParameters;

    SubmitDownloadParameters getSubmitDownloadParameters() {
        return submitDownloadParameters;
    }

    void setSubmitDownloadParameters(SubmitDownloadParameters submitParams) {
        this.submitDownloadParameters = submitParams;
    }

    private File resultFileDirectory;
    private String resultFileName;

    /**
     * Gets or sets a value indicating whether the local result file should be
     * overwritten if it already exists.
     */
    private boolean overwriteResultFile;

    public DownloadParameters() {
        this.submitDownloadParameters = new SubmitDownloadParameters();
    }

    /**
     * Gets the extension type of the downloaded file. For possible values, see
     * DownloadFileType Value Set at
     * <a href="http://go.microsoft.com/fwlink/?LinkId=620273">http://go.microsoft.com/fwlink/?LinkId=620273</a>.
     */
    public DownloadFileType getFileType() {
        return this.submitDownloadParameters.getFileType();
    }

    /**
     * Sets the extension type of the downloaded file. For possible values, see
     * DownloadFileType Value Set at
     * <a href="http://go.microsoft.com/fwlink/?LinkId=620273">http://go.microsoft.com/fwlink/?LinkId=620273</a>.
     */
    public void setFileType(DownloadFileType fileType) {
        this.submitDownloadParameters.setFileType(fileType);
    }

    /**
     * Gets the scope or types of data to download. For possible values, see
     * DataScope Value Set at
     * <a href="http://go.microsoft.com/fwlink/?LinkId=620271">http://go.microsoft.com/fwlink/?LinkId=620271</a>.
     */
    public Collection<DataScope> getDataScope() {
        return this.submitDownloadParameters.getDataScope();
    }
    
    /**
     * Sets the scope or types of data to download. For possible values, see
     * DataScope Value Set at
     * <a href="http://go.microsoft.com/fwlink/?LinkId=620271">http://go.microsoft.com/fwlink/?LinkId=620271</a>.
     */
    public void setDataScope(Collection<DataScope> value) {
        this.submitDownloadParameters.setDataScope(value);
    }

    /**
     * Gets the type of entities to download. For possible values, see
     * BulkDownloadEntity Value Set at
     * <a href="http://go.microsoft.com/fwlink/?LinkId=620272">http://go.microsoft.com/fwlink/?LinkId=620272</a>.
     */
    public Collection<BulkDownloadEntity> getEntities() {
        return this.submitDownloadParameters.getEntities();
    }

    /**
     * Sets the type of entities to download. For possible values, see
     * BulkDownloadEntity Value Set at
     * <a href="http://go.microsoft.com/fwlink/?LinkId=620272">http://go.microsoft.com/fwlink/?LinkId=620272</a>.
     */
    public void setEntities(Collection<BulkDownloadEntity> entities) {
        submitDownloadParameters.setEntities(entities);
    }

    /**
     * Gets the Ids of the campaigns to download. You can specify a maximum of 1,000 campaigns.
     * The campaigns that you specify must belong to the same account.
     */
    public List<Long> getCampaignIds() {
        return this.submitDownloadParameters.getCampaignIds();
    }

    /**
     * Sets the Ids of the campaigns to download. You can specify a maximum of 1,000 campaigns.
     * The campaigns that you specify must belong to the same account.
     */
    public void setCampaignIds(List<Long> campaignIds) {
        this.submitDownloadParameters.setCampaignIds(campaignIds);
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
     */
    public Calendar getLastSyncTimeInUTC() {
        return this.submitDownloadParameters.getLastSyncTimeInUTC();
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
     */
    public void setLastSyncTimeInUTC(Calendar lastSyncTimeInUTC) {
        this.submitDownloadParameters.setLastSyncTimeInUTC(lastSyncTimeInUTC);
    }

    /**
     * Gets the date range values for the requested performance data in a bulk
     * download. For possible values, see PerformanceStatsDateRange Data Object
     * at <a href="http://go.microsoft.com/fwlink/?LinkId=620274">http://go.microsoft.com/fwlink/?LinkId=620274</a>.
     */
    public PerformanceStatsDateRange getPerformanceStatsDateRange() {
        return this.submitDownloadParameters.getPerformanceStatsDateRange();
    }

    /**
     * Sets the date range values for the requested performance data in a bulk
     * download. For possible values, see PerformanceStatsDateRange Data Object
     * at <a href="http://go.microsoft.com/fwlink/?LinkId=620274">http://go.microsoft.com/fwlink/?LinkId=620274</a>.
     */
    public void setPerformanceStatsDateRange(
            PerformanceStatsDateRange performanceStatsDateRange) {
        this.submitDownloadParameters.setPerformanceStatsDateRange(performanceStatsDateRange);
    }

    /**
     * Gets the directory where the file will be downloaded.
     */
    public File getResultFileDirectory() {
        return resultFileDirectory;
    }

    /**
     * Sets the directory where the file will be downloaded.
     */
    public void setResultFileDirectory(File resultFileDirectory) {
        this.resultFileDirectory = resultFileDirectory;
    }

    /**
     * Gets the name of the local download result file.
     */
    public String getResultFileName() {
        return resultFileName;
    }

    /**
     * Sets the name of the local download result file.
     */
    public void setResultFileName(String resultFileName) {
        this.resultFileName = resultFileName;
    }

    /**
     * Gets whether the local result file should be overwritten if it already exists.
     */
    public boolean getOverwriteResultFile() {
        return overwriteResultFile;
    }

    /**
     * Sets whether the local result file should be overwritten if it already exists.
     */
    public void setOverwriteResultFile(boolean overwriteResultFile) {
        this.overwriteResultFile = overwriteResultFile;
    }
}
