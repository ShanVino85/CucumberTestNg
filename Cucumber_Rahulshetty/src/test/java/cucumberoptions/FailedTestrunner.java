package cucumberoptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//html,xml,json,junit,extent

@CucumberOptions(features="@target/failed_scenarios.txt",
glue="stepdefinitions",monochrome=true,
plugin= {"html:target/cucumber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class FailedTestrunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)
	public Object[][]scenarios(){
		return super.scenarios();
	}

}
//,tags="@PlaceOrder"