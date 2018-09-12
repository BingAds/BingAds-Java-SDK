package com.microsoft.bingads.v12.report;

import java.io.IOException;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

import com.microsoft.bingads.v12.reporting.InvalidColumnException;
import com.microsoft.bingads.v12.reporting.Report;
import com.microsoft.bingads.v12.reporting.ReportFileReader;
import com.microsoft.bingads.v12.reporting.ReportFormat;
import com.microsoft.bingads.v12.reporting.ReportRecord;


public class TsvReportReader {

    @Test
    public void testReadReportFile() {
        String file = "D:\\data\\reportfiles\\30000002118911116.tsv";
        try {
            Report report = new ReportFileReader(file, ReportFormat.TSV).getReport();
            Assert.assertEquals("", "AccountPerformanceReportRequest_1297bcb99b6749a284d40ab8db0b7d3d", report.getReportName());
            Assert.assertEquals(32, report.getReportRecordCount());
            Assert.assertNotNull(report.getReportColumns());
            for (String s : report.getReportColumns()) {
                System.out.println(s);
            }
            Iterator<ReportRecord> it = report.getReportRecords().iterator();
            int line = 0;
            while (it.hasNext()) {
                line ++;
                ReportRecord reportRecord = it.next();
                System.out.println("" + line + ": " + reportRecord.getStringValue("AccountName") + "\t" + + reportRecord.getIntegerValue("Impressions") + "\t" + reportRecord.getDoubleValue("Ctr") + "\t" + reportRecord.getDoubleValue("AverageCpc"));  
                Assert.assertNotNull(reportRecord.getDoubleValue("AverageCpc"));
            }
            for (String s : report.getReportColumns()) {
                System.out.println(s);
            }
            Assert.assertEquals(line, report.getReportRecordCount());
            report.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvalidColumnException e) {
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }
}
