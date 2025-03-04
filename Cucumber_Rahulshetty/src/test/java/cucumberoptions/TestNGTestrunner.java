package cucumberoptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//html,xml,json,junit,extent

@CucumberOptions(features="src/test/resources/feature",
glue="stepdefinitions",monochrome=true,tags="@PlaceOrder or @Offerpage"
,plugin= {"html:target/cucumber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"})

public class TestNGTestrunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)
	public Object[][]scenarios(){
		return super.scenarios();
	}

}
//,tags="@PlaceOrder"