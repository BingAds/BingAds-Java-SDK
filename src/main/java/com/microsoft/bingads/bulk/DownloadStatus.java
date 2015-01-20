package com.microsoft.bingads.bulk;

public enum DownloadStatus {

    COMPLETED("Completed"),
    IN_PROGRESS("InProgress"),
    FAILED("Failed"),
    FAILED_FULL_SYNC_REQUIRED("FailedFullSyncRequired");

    private final String value;

    DownloadStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DownloadStatus fromValue(String v) {
        for (DownloadStatus c : DownloadStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
