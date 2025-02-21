package RunnerFB;

import org.testng.annotations.AfterClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"FBfeatures"},
                 glue =     {"FbStepdefincation"},
                 plugin =    { "pretty","html:target/cucumber-reports",
    		     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                		  tags ="@errormessage",
                  monochrome = true )
public class FbRunner extends AbstractTestNGCucumberTests{
	
	}