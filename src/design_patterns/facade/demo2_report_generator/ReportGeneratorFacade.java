package design_patterns.facade.demo2_report_generator;

import javax.sql.DataSource;

public class ReportGeneratorFacade {

    public void generateReport(ReportType type, DataSource dataSource, String location) {
        /*if (type == null || dataSource == null) {
            throw new RuntimeException();
        }*/

        Report report = new Report();
        report.setReportHeader(new ReportHeader());
        report.setReportFooter(new ReportFooter());

        //get data from datasource and set to report data object
        //the GETTING part omitted
        report.setReportData(new ReportData());

        //write report
        ReportWriter reportWriter = new ReportWriter();
        switch (type) {
            case PDF:
                reportWriter.writePDFReport(report, location);
                break;
            case HTML:
                reportWriter.writeHTMLReport(report, location);
        }
    }
}
