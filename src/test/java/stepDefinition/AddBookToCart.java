package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//Test Case number 6
public class AddBookToCart {
	WebDriver driver;

	  @Given("^User landed on home page$")
	    public void user_landed_on_home_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\36896\\workspace\\Automation\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	  @When("^User click the shop button$")
	    public void user_click_the_shop_button() throws Throwable {
	        

		driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();

	}

	  @Then("^User click the home button$")
	    public void user_click_the_home_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Home')]")));
		element.click();


	}

	  @And("^Verify  has contains 3 slides$")
	    public void verify_has_contains_3_slides() throws Throwable {
		List<WebElement> element=	driver.findElements(By.xpath("//img[@alt='Arrow']"));
		element.get(1).click();




	}
	  @And("^User click on arrival image$")
	    public void user_click_on_arrival_image() throws Throwable {
		driver.findElements(By.xpath("//img[@width='300']")).get(0).click();
		Thread.sleep(2000);

	}
	  @And("^User click on add to basket$")
	    public void user_click_on_add_to_basket() throws Throwable {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	 
	@And("^User can view that Book in the Menu item with price")
	    public void user_can_view_that_book_in_the_menu_item_with_price() throws Throwable {
		 
		String item= driver.findElement(By.xpath("//span[@class='cartcontents']")).getText();
        Assert.assertEquals(item, "1 Item");
        
        driver.close();
		
        
		
		 
	        
	    }

}
