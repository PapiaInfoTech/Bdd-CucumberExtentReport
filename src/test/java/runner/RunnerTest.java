package runner;

import java.io.*;

import com.cucumber.listener.Reporter;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/Paru/Desktop/BDD/CitiProject/features/login.feature",
        glue= {"Steps"},
        //format = {"pretty","json:reporting/cucumber.json","html:reporting/cucumber-pretty","junit:reporting/junit_xml/cucumber.xml"},
        // plugin = { "com.cucumber.listener.ExtentCucumberFormatter:/Users/Paru/Desktop/BDD/CitiProject/Cucumber Reports/Cucumber-Extent-Report/report.html"},

         plugin = {"pretty","json:reporting/cucumber.json","html:reporting/cucumber-pretty","junit:reporting/junit_xml/cucumber.xml", "com.cucumber.listener.ExtentCucumberFormatter:/Users/Paru/Desktop/BDD/CitiProject/Cucumber Reports/Cucumber-Extent-Report/report.html"},
        monochrome = false
)


public class RunnerTest {

    @AfterClass
    public static void reportSetup()
    {
        Reporter.loadXMLConfig(new File("/Users/Paru/Desktop/BDD/CitiProject/src/test/java/config/extent-config.xml"));
	        /*Properties p = System.getProperties();
	        p.list(System.out);*/

       // Reporter.setSystemInfo("User Name",System.getProperty("user.name"));
       // Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        //Reporter.setSystemInfo("64 Bit", 	"Windows 10");
       // Reporter.setSystemInfo("2.53.0", "Selenium");
        //Reporter.setSystemInfo("3.3.9", "Maven");
        //Reporter.setSystemInfo("1.8.0_66", "Java Version");
        //Reporter.setTestRunnerOutput("Cucumber JUnit Test Runner");
    }

}
