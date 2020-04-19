package stepDefinition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.generic.GenericFunctions;
import com.selenium.onlineshopingpage.OnlineShoppingPage;
import com.selenium.startup.BaseClass;


//Test Case 1 and Test Case 2
public class MyStepDefinitions {
	

	public WebDriver driver;
	
	
        
    
	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
    	
    	
    	OnlineShoppingPage onlinePage = PageFactory.initElements(driver,OnlineShoppingPage.class);
		onlinePage.shop.isDisplayed();
	}

	@When("^User clicks on Shop button$")
	public void user_clicks_on_shop_button() throws Throwable {
		OnlineShoppingPage onlinePage = PageFactory.initElements(driver,OnlineShoppingPage.class);
		//driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
		onlinePage.shop.click();

	}

	@Then("^User clicks on Home button$")
	public void user_clicks_on_home_button() throws Throwable {
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Home')]")));
		element.click();*/
		OnlineShoppingPage onlinePage = PageFactory.initElements(driver,OnlineShoppingPage.class);
		
		//generic.waitForElement();
		onlinePage.home.click();


	}

	@And("^Verify that home page is having 3 slides only$")
	public void verify_that_home_page_is_having_3_slides_only() throws Throwable {
		List<WebElement> element=	driver.findElements(By.xpath("//img[@alt='Arrow']"));
		element.get(1).click();




	}

	@And("^Verify home page must contain 3 slides$")
	public void verify_home_page_must_contain_3_slides() throws Throwable {
		List<WebElement> element=	driver.findElements(By.xpath("//img[@alt='Arrow']"));

		boolean status= driver.findElement(By.xpath("//img[@alt='Shop Selenium Books']")).isDisplayed();

		if(status==true)
		{
			System.out.println("First slide is Present");
		}

		element.get(1).click();
		boolean status1= driver.findElement(By.xpath("//img[@alt='HTML']")).isDisplayed();

		if(status==true)
		{
			System.out.println("Second  slide is Present");
		}
		element.get(1).click();
		boolean status2= driver.findElement(By.xpath("//img[@alt='JavaScript']")).isDisplayed();

		if(status==true)
		{
			System.out.println("Third slide is Present");
		}

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");

		Thread.sleep(2000);

		List<WebElement> ele = driver.findElements(By.xpath("//img[@width='300']"));
		int size=ele.size();
		if(size==3)
		{
			System.out.println("Three slides are available");
		}



	}

	@And("^User clicks on image on the arrivals$")
	public void user_clicks_on_image_on_the_arrivals() throws Throwable {

		driver.findElements(By.xpath("//img[@width='300']")).get(0).click();
		Thread.sleep(2000);

	}

	@And("^User navigated to add to basket page$")
	public void user_navigated_to_add_to_basket_page() throws Throwable {

		String addToBasket = "ADD TO BASKET";
		Thread.sleep(2000);
		String eaddToBasket = driver.findElement(By.xpath("//button[@type='submit']")).getText();
		Assert.assertEquals(addToBasket, eaddToBasket);  

	}

	@And("^User clicks on add to basket$")
	public void user_clicks_on_add_to_basket() throws Throwable {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@And("^User should see the description of the product$")
	public void user_should_see_the_description_of_the_product() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");


		boolean status = driver.findElement(By.xpath("//a[contains(text(),'Description')]")).isDisplayed();
		if(status==true)
		{
			System.out.println("Description is displayed");
		}
		boolean status1 = driver.findElement(By.xpath("//h2[contains(text(),'Product Description')]")).isDisplayed();
		if(status1==true)
		{
			System.out.println("Product Description is displayed");
		}

	}
	@And("^User clicks on review button$")
	public void user_clicks_on_review_button() throws Throwable {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-250)");
		
		driver.findElement(By.xpath("//a[contains(text(),'Reviews (0)')]")).click();
		
		String status4 = driver.findElement(By.id("reply-title")).getText();
		String areview = "Be the first to review “Selenium Ruby”";
		Assert.assertEquals(areview, status4);
	}

	@And("^User should see the review regarding the book user clicked on$")
	public void user_should_see_the_review_regarding_the_book_user_clicked_on() throws Throwable {
		
		String status4 = driver.findElement(By.id("reply-title")).getText();
		String areview = "Be the first to review “Selenium Ruby”";
		Assert.assertEquals(areview, status4);
		
		String notes = driver.findElement(By.id("email-notes")).getText();
		String reviewnotes = "Your email address will not be published.";
		Assert.assertEquals(reviewnotes, notes);
				

	}
}
