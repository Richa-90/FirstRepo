package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApplyCouponCodeTo50RupeesOff  {
	
	
	WebDriver driver;


	@Given("^Browser path is configured$")
	public void set_the_browser_path() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		driver= Base.getdriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@When("^Browser is triggering$")
	public void check_if_browser_is_triggered() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String status =driver.getTitle();
		System.out.println(status);
	}

	@Given("^User is on home pages$")
	public void user_is_on_home_pages() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean status=driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).isDisplayed();

	}


	
    @When("^User clicked on shop button$")
    public void user_should_clicks_on_the_shop() throws Throwable {
    	driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
    }

    @Then("^User clicked on home button$")
    public void user_should_clicks_on_home_button() throws Throwable {
    	driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
       
    }

    @And("^User added item to basket$")
    public void user_should_add_to_basket() throws Throwable {
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,1000)");
       
       driver.findElement(By.xpath("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']")).click();
    }

    @And("^User clicked on view basket$")
    public void user_should_click_on_view_basket() throws Throwable {
        driver.findElement(By.xpath("//a[@title='View Basket']")).click();
    }

    @And("^User clicked on proceed to checkout page$")
    public void user_should_click_on_proceed_to_checkout() throws Throwable {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
        
      //  js.executeScript("window.scrollBy(0,1000)");
        
        
    }
    @And("^User clicked on enter coupon code$")
    public void user_clicked_on_coupon_code()throws Throwable{
        List<WebElement> ele =driver.findElements(By.xpath("//span[@class='woocommerce-Price-amount amount']"));
        String str=  ele.get(0).getText();    
        driver.findElement(By.xpath("//a[@class='showcoupon']")).click();
        System.out.println(str);
        
    }
    @And("^User enters coupon code$")
    public void user_entered_on_coupon_code()throws Throwable{
    
        driver.findElement(By.id("coupon_code")).sendKeys("krishnasakinala");
    }
        @And("^User clicked on apply coupon code$")
        public void user_clicked_on_apply_code()throws Throwable{
        
        driver.findElement(By.xpath("//input[@name='apply_coupon']")).click();
        Thread.sleep(5000);
        
        
        }
        @And("^User checks the rupees reduced to 50 ruppess$")
        public void user_checks_the_rupees_reduced_50_rupees()throws Throwable{
      
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2500)");
        Thread.sleep(3000);
        List<WebElement> ele =driver.findElements(By.xpath("//span[@class='woocommerce-Price-amount amount']"));
        String str1 = ele.get(1).getText();
        
        System.out.println(str1);
        driver.close();
        
        
        
     
    }


}
