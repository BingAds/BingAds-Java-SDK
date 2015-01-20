package com.microsoft.bingads.bulk;

import java.util.List;

import java.io.File;
import java.util.Calendar;

public class DownloadParameters {

    private SubmitDownloadParameters submitDownloadParameters;

    SubmitDownloadParameters getSubmitDownloadParameters() {
        return submitDownloadParameters;
    }

    public void setSubmitDownloadParameters(SubmitDownloadParameters submitParams) {
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
     * The extension type of the downloaded file. For possible values, see
     * DownloadFileType Value Set at
     * {@link "http://go.microsoft.com/fwlink/?LinkId=511672"}.
     */
    public DownloadFileType getFileType() {
        return this.submitDownloadParameters.getFileType();
    }

    public void setFileType(DownloadFileType fileType) {
        this.submitDownloadParameters.setFileType(fileType);
    }

    /**
     * The scope or types of data to download. For possible values, see
     * DataScope Value Set at
     * {@link "http://go.microsoft.com/fwlink/?LinkId=511670"}.
     */
    public List<DataScope> getDataScope() {
        return this.submitDownloadParameters.getDataScope();
    }
    
    public void setDataScope(List<DataScope> value) {
        this.submitDownloadParameters.setDataScope(value);
    }

    /**
     * The type of entities to download. For possible values, see
     * BulkDownloadEntity Value Set at
     * {@link "http://go.microsoft.com/fwlink/?LinkId=511671"}.
     */
    public List<BulkDownloadEntity> getEntities() {
        return this.submitDownloadParameters.getEntities();
    }

    public void setEntities(List<BulkDownloadEntity> entities) {
        submitDownloadParameters.setEntities(entities);
    }

    /**
     * The campaigns to download. You can specify a maximum of 1,000 campaigns.
     * The campaigns that you specify must belong to the same account.
     */
    public List<Long> getCampaignIds() {
        return this.submitDownloadParameters.getCampaignIds();
    }

    public void setCampaignIds(List<Long> campaignIds) {
        this.submitDownloadParameters.setCampaignIds(campaignIds);
    }

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
    public Calendar getLastSyncTimeInUTC() {
        return this.submitDownloadParameters.getLastSyncTimeInUTC();
    }

    public void setLastSyncTimeInUTC(Calendar lastSyncTimeInUTC) {
        this.submitDownloadParameters.setLastSyncTimeInUTC(lastSyncTimeInUTC);
    }

    /**
     * The date range values for the requested performance data in a bulk
     * download. For possible values, see PerformanceStatsDateRange Data Object
     * at {@link http://go.microsoft.com/fwlink/?LinkId=511673"}.
     */
    public PerformanceStatsDateRange getPerformanceStatsDateRange() {
        return this.submitDownloadParameters.getPerformanceStatsDateRange();
    }

    public void setPerformanceStatsDateRange(
            PerformanceStatsDateRange performanceStatsDateRange) {
        this.submitDownloadParameters.setPerformanceStatsDateRange(performanceStatsDateRange);
    }

    /**
     * Location target version
     */
    public String getLocationTargetVersion() {
        return this.submitDownloadParameters.getLocationTargetVersion();
    }

    public void setLocationTargetVersion(String value) {
        this.submitDownloadParameters.setLocationTargetVersion(value);
    }

    public File getResultFileDirectory() {
        return resultFileDirectory;
    }

    public void setResultFileDirectory(File resultFileDirectory) {
        this.resultFileDirectory = resultFileDirectory;
    }

    public String getResultFileName() {
        return resultFileName;
    }

    public void setResultFileName(String resultFileName) {
        this.resultFileName = resultFileName;
    }

    public boolean getOverwriteResultFile() {
        return overwriteResultFile;
    }

    public void setOverwriteResultFile(boolean overwriteResultFile) {
        this.overwriteResultFile = overwriteResultFile;
    }
}
