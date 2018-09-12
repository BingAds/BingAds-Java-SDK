package com.microsoft.bingads.v12.report;

import java.io.IOException;
import java.util.Iterator;
import java.util.stream.StreamSupport;

import org.junit.Assert;
import org.junit.Test;

import com.microsoft.bingads.v12.reporting.InvalidColumnException;
import com.microsoft.bingads.v12.reporting.Report;
import com.microsoft.bingads.v12.reporting.ReportFileReader;
import com.microsoft.bingads.v12.reporting.ReportFormat;
import com.microsoft.bingads.v12.reporting.ReportRecord;

public class CsvReportReader {

    //@Test
    public void testReadReportFile() {
        String file = "D:\\data\\reportfiles\\30000002118950720.csv";
        try {
            Report report = new ReportFileReader(file, ReportFormat.CSV).getReport();
            Assert.assertEquals("", "AccountPerformanceReportRequest_1297bcb99b6749a284d40ab8db0b7d3d",
                    report.getReportName());
            Assert.assertEquals(32, report.getReportRecordCount());
            Assert.assertNotNull(report.getReportColumns());

            Iterator<ReportRecord> it = report.getReportRecords().iterator();
            int line = 0;
            while (it.hasNext()) {
                line++;
                ReportRecord reportRecord = it.next();
                Assert.assertNotNull(reportRecord.getDoubleValue("AverageCpc"));
                Assert.assertNotNull(reportRecord.getDoubleValue("Ctr"));
                System.out.println("" + line + ": " + reportRecord.getStringValue("AccountName") + "\t"
                        + +reportRecord.getIntegerValue("Impressions") + "\t" + reportRecord.getDoubleValue("Ctr")
                        + "\t" + reportRecord.getDoubleValue("AverageCpc"));
                System.out.println("" + line + ": " + reportRecord.getStringValue("AccountName") + "\t"
                        + +reportRecord.getLongValue("Impressions") + "\t" + reportRecord.getDoubleValue("Ctr")
                        + "\t" + reportRecord.getDoubleValue("AverageCpc"));
            }
            Assert.assertEquals(line, report.getReportRecordCount());
            report.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    

    //@Test
    public void testReadReportFile_Filter() {
        String file = "D:\\data\\reportfiles\\30000002118964619.csv";
        try {
            Report report = new ReportFileReader(file, ReportFormat.CSV).getReport();
            Assert.assertEquals("", "KeywordPerformanceReportRequest_6efdba2a225045dbb2020b675a5a6f8d",
                    report.getReportName());
            Assert.assertEquals(224724, report.getReportRecordCount());
            Assert.assertNotNull(report.getReportColumns());

            StreamSupport.stream(report.getReportRecords().spliterator(), false).filter(rr -> {
                try {
                    return rr.getIntegerValue("Impressions") > 10;
                } catch (NumberFormatException | InvalidColumnException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    return false;
                }
            }).forEach(r -> {
                try {
                    System.out.println(r.getStringValue("AccountName") + "\t" + r.getStringValue("CampaignName") + "\t"
                            + r.getStringValue("AdGroupName") + "\t" + r.getStringValue("Keyword") + "\t"
                            + r.getIntegerValue("Impressions") + "\t" + r.getDoubleValue("AverageCpc"));
                } catch (NumberFormatException | InvalidColumnException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });
            report.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void testReadReportFile_Imp() {
        String file = "D:\\data\\reportfiles\\30000002118964619.csv";
        try {
            Report report = new ReportFileReader(file, ReportFormat.CSV).getReport();
            Assert.assertEquals("", "KeywordPerformanceReportRequest_6efdba2a225045dbb2020b675a5a6f8d",
                    report.getReportName());
            Assert.assertEquals(224724, report.getReportRecordCount());
            Assert.assertNotNull(report.getReportColumns());
            int i = 0; 
            Iterator<ReportRecord> it = report.getReportRecords().iterator();
            int line = 0;
            int imp = 0;
            while (it.hasNext()) {
                line++;
                ReportRecord record = it.next();
                try {
                    imp = record.getIntegerValue("Impressions");
                } catch (NumberFormatException | InvalidColumnException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }
            report.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //@Test
    public void testReadReportFile_FilterAndAvg() {
        String file = "D:\\data\\reportfiles\\30000002118964619.csv";
        try {
            Report report = new ReportFileReader(file, ReportFormat.CSV).getReport();
            Assert.assertEquals("", "KeywordPerformanceReportRequest_6efdba2a225045dbb2020b675a5a6f8d",
                    report.getReportName());
            Assert.assertEquals(224724, report.getReportRecordCount());
            Assert.assertNotNull(report.getReportColumns());

            double average = StreamSupport.stream(report.getReportRecords().spliterator(), false).filter(rr -> {
                try {
                    return rr.getIntegerValue("Impressions") > 10;
                } catch (NumberFormatException | InvalidColumnException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    return false;
                }
            }).mapToInt(r -> {
                try {
                    return r.getIntegerValue("Impressions");
                } catch (NumberFormatException | InvalidColumnException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    return 0;
                }
            }).average().getAsDouble();
            System.out.println("Average impressions for those greater than 10 is " + average);
            report.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
