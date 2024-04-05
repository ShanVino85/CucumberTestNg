package stepdefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Checkoutpage;
import pageobject.Landingpage;
import utils.Genericutils;
import utils.Testcontextsetup;

public class Checkoutsteps {
	public  WebDriver driver; 
	public String landingpageproductname;
	public String offerpageproductname;
	Testcontextsetup testcontextsetup;
	public Checkoutpage checkoutpage;
	
	public Checkoutsteps(Testcontextsetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		checkoutpage=testcontextsetup.PageObjectManager.getcheckoutpage();
	}
	
	

	@Then("^user proceeds to checkout and validate the (.+) items in checkoutpage$")
	public void user_proceeds_to_checkout_and_validate_the_items_in_checkoutpage(String name) throws InterruptedException {
		checkoutpage.Cartproduct();
		checkoutpage.Proceedtocheckout();
		//Thread.sleep(2000);
		//Assertion to extract name from screen and compare with name
		
	
	}

	@Then("verify user has ability to enter promocode and place the order")
	public void verify_user_has_ability_to_enter_promocode_and_place_the_order() {
	    
		
		Assert.assertTrue(checkoutpage.VerifyPromobtn());
		Assert.assertTrue(checkoutpage.VerifyPlaceorder());
	}

	
	
	/*@Given("user is on greenkart landing page")
	public void user_is_on_greenkart_landing_page() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanj\\Downloads\\chromedriver_win32");
		//Genericutils genericutils=new Genericutils(driver);
		//testcontextsetup.testbase.WebDriverManager();
		//Taking driver from PageobjectManager
	}

	@When("^user searched with shortname (.+) and extracted actual name of the product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_the_product(String shortname) throws InterruptedException {
		//Landingpage landingpage=new Landingpage(testcontextsetup.driver);
		
		Landingpage landingpage=testcontextsetup.PageObjectManager.getLandingpage();
		landingpage.searchitem(shortname);
		
		//testcontextsetup.driver.findElement(By.className("search-keyword")).sendKeys("Tom");
	    Thread.sleep(2000);
	    testcontextsetup.landingpageproductname=landingpage.getproductname().split("-")[0].trim();
	   System.out.println( testcontextsetup.landingpageproductname + "extracted from homepage");
		
	}*/

	

}
