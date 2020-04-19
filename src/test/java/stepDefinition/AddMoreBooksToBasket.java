package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddMoreBooksToBasket {
	WebDriver driver;
	@Given("^User navigated to home page$")
    public void user_navigated_to_home_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\36896\\workspace\\Automation\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

       
    

    @When("^User clicked on Shop button$")
    public void user_clicked_on_shop_button() throws Throwable {
    	
    	driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
      
    }

    @Then("^User clicked on Home button$")
    public void user_clicked_on_home_button() throws Throwable {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Home')]")));
		element.click();

       
    }

    @And("^User clicks arrival image$")
    public void user_clicks_arrival_image() throws Throwable {
    	
    	
    		driver.findElements(By.xpath("//img[@width='300']")).get(0).click();
    		Thread.sleep(2000);

        
    }

    @And("^User is on add to basket page$")
    public void user_is_on_add_to_basket_page() throws Throwable {
    	
    driver.findElement(By.xpath("//button[@type='submit']")).click();
        
    }

    @And("^User enter the (.+)$")
    public void user_enter_the(String amount) throws Throwable {
    	driver.findElement(By.xpath("//input[@type='number']")).sendKeys(amount);
    	
    	
        
    }

    @And("^User clicks on Add to basket$")
    public void user_clicks_on_add_to_basket() throws Throwable {
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
     
    }

    @And("^User should get value must be less than or equal to 973$")
    public void user_should_get_value_must_be_less_than_or_equal_to_973() throws Throwable {
    	System.out.println("Prnted");
    	
       
    }

}


