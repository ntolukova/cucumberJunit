package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.Log;
import utilities.TempStorage;

public class Hooks {
    @Before
    public void setUp(Scenario scenario){
        //Anything that we want to run before scenario
        TempStorage.clear(); //for data storage
        Log.start(scenario.getName());// for the log4j
        ExtentReport.startTest(scenario.getName());

    }
    @After
    public void tearDown(Scenario scenario){
        //Anything that we want to run after scenario
        System.out.println(scenario.getName());
        System.out.println(scenario.getStatus());
        if(scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
            ExtentReport.fail();

        }
        else{
            ExtentReport.pass();
        }
        Driver.quitDriver();
    }
}
