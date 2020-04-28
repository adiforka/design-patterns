package design_patterns.facade.demo2_report_generator;

class ReportDemo {
    public static void main(String[] args) {
        ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();
        reportGeneratorFacade.generateReport(ReportType.PDF, null, "UpperRegister");
        //reportGeneratorFacade.generateReport(ReportType.HTML, null, "LowerRegister");
    }
}
