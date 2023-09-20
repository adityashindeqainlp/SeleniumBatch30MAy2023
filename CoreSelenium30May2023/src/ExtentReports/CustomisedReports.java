package ExtentReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * @Author -- Aditya Shinde Java + Selenium 18-Sep-2023 4:26:02 pm
 **/
public class CustomisedReports {

	public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub

		
		ExtentReports extentReports = new ExtentReports();
		
		ExtentSparkReporter sparkReports = new ExtentSparkReporter("extentReport.html");
		
		extentReports.attachReporter(sparkReports);
		
		sparkReports.config().setTheme(Theme.DARK);
		
		sparkReports.config().setDocumentTitle("Customized Report");
		
		sparkReports.config().setTimeStampFormat("dd:MM:yyyy,HH:MM:SS");
		
		
		extentReports.setSystemInfo("Org", "LP");
		extentReports.setSystemInfo("OS", "Windows");
		extentReports.setSystemInfo("Browser", "Chrome");
		
		
		
		ExtentTest test = extentReports.createTest("Test 1");
		test.pass("Test case 1 Pass..");
		
		ExtentTest test2 = extentReports.createTest("Test 2");
		test2.fail("Test case 2 fail..");
		
		ExtentTest test3 = extentReports.createTest("Test 3");
		test3.skip("Test case 3 skip..");
		
		extentReports.flush();
		
		Desktop.getDesktop().browse(new File("extentReport.html").toURI());
		
		
	}

}
