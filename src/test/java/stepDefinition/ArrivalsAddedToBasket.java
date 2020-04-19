package stepDefinition;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


//@RunWith(Cucumber.class)
public class ArrivalsAddedToBasket {
	WebDriver driver;


	@Given("^Set the browser path$")
	public void set_the_browser_path() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\36896\\workspace\\Automation\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@When("^Check if browser is triggered$")
	public void check_if_browser_is_triggered() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String status =driver.getTitle();
		System.out.println(status);
	}

	@Given("^User is landed on home pages$")
	public void user_is_on_home_pages() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean status=driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).isDisplayed();

	}


	
    @When("^User should clicks on the shop$")
    public void user_should_clicks_on_the_shop() throws Throwable {
    	driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
    }

    @Then("^User should clicks on Home button$")
    public void user_should_clicks_on_home_button() throws Throwable {
    	driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
       
    }

    @And("^User should add to basket$")
    public void user_should_add_to_basket() throws Throwable {
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,1000)");
       
       driver.findElement(By.xpath("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']")).click();
    }

    @And("^User should click on View basket$")
    public void user_should_click_on_view_basket() throws Throwable {
        driver.findElement(By.xpath("//a[@title='View Basket']")).click();
    }

    @And("^User should click on Proceed to checkout$")
    public void user_should_click_on_proceed_to_checkout() throws Throwable {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
        
        driver.close();
        
        
        
     
    }


}








