package step_definitions.wiki_StepDefs;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LogTest {
    public static void main(String[] args) {
        ExtentHtmlReporter configs = new ExtentHtmlReporter("./extentReport/report.html");
        configs.config().setTheme(Theme.STANDARD);
        ExtentReports reports = new ExtentReports();
        reports.attachReporter(configs);
        System.out.println("Test started");
        ExtentTest extentTest = reports.createTest("Google Search");
        extentTest.pass("Passed!");
        extentTest.fail("Failed!");
        reports.flush();
        System.out.println("Completed!");
    }
}
