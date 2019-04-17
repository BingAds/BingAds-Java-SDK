package com.microsoft.bingads.v13.report;

import java.io.IOException;
import java.util.Iterator;
import java.util.stream.StreamSupport;

import javax.xml.stream.XMLStreamException;

import org.junit.Assert;
import org.junit.Test;

import com.microsoft.bingads.v13.reporting.InvalidColumnException;
import com.microsoft.bingads.v13.reporting.Report;
import com.microsoft.bingads.v13.reporting.ReportFileReader;
import com.microsoft.bingads.v13.reporting.ReportFormat;
import com.microsoft.bingads.v13.reporting.ReportRecord;


public class XmlReportReader {

    @Test
    public void testReadReportFile() {
        String file = "D:\\data\\reportfiles\\30000002119011342.xml";
        try {
            ReportFileReader reportFileReader = new ReportFileReader(file, ReportFormat.XML);
            Report report = reportFileReader.getReport();
            Assert.assertEquals("", "KeywordPerformanceReportRequest_6efdba2a225045dbb2020b675a5a6f8d", report.getReportName());
            Assert.assertNotNull(report.getReportColumns());
            Assert.assertEquals(file, reportFileReader.getReportFilePath());
            for (String s : report.getReportColumns()) {
                System.out.println(s);
            }
            Iterator<ReportRecord> it = report.getReportRecords().iterator();
//            int line = 0;
//            while (it.hasNext()) {
//                line ++;
//                BingadsReportRecord reportRecord = it.next();
//                System.out.println("" + line + ": " + reportRecord.getStringValue("AccountName") + "\t" + reportRecord.getStringValue("CampaignName") + "\t" + reportRecord.getStringValue("AdGroupName") + "\t" + reportRecord.getStringValue("Keyword") + "\t" + reportRecord.getIntegerValue("Impressions") + "\t" + reportRecord.getDoubleValue("AverageCpc"));  
//                Assert.assertNotNull(reportRecord.getStringValue("AdGroupName"));
//                Assert.assertNotNull(reportRecord.getDoubleValue("AverageCpc"));
//            }

            int total = StreamSupport.stream(report.getReportRecords().spliterator(), false).mapToInt(rr -> {
                try {
                    return rr.getIntegerValue("Impressions");
                } catch (NumberFormatException | InvalidColumnException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    return 0;
                }
            }).sum();
            System.out.println("total: " + total);
            reportFileReader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
