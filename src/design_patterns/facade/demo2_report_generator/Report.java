package design_patterns.facade.demo2_report_generator;

public class Report {
    private ReportHeader reportHeader;
    private ReportData reportData;
    private ReportFooter reportFooter;

    public ReportHeader getReportHeader() {
        return reportHeader;
    }

    public void setReportHeader(ReportHeader reportHeader) {
        System.out.println("Setting report header");
        this.reportHeader = reportHeader;
    }

    public ReportData getReportData() {
        return reportData;
    }

    public void setReportData(ReportData reportData) {
        System.out.println("Setting report data");
        this.reportData = reportData;
    }

    public ReportFooter getReportFooter() {
        return reportFooter;
    }

    public void setReportFooter(ReportFooter reportFooter) {
        System.out.println("Setting report footer");
        this.reportFooter = reportFooter;
    }
}