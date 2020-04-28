package design_patterns.facade.demo2_report_generator;

public class ReportWriter {

    public void writePDFReport(Report report, String location) {
        System.out.println("Written PDF report");
    }

    public void writeHTMLReport(Report report, String location) {
        System.out.println("Written HTML report");
    }
}
