package Resource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	static ExtentReporterNG extent;
	
	public static ExtentReporterNG getReportObject()
	{
		
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("5 March Framework Results");
		reporter.config().setDocumentTitle("Automation Execution Results");
		
		extent = new ExtentReporterNG();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA Automation Engineer", "Ranjeet Kendre");
		return extent;
		
	}
}
