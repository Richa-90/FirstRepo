package com.selenium.startup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;





public class BaseClass {
	WebDriver driver;
	
	@Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\36896\\workspace\\Automation\\Drivers\\chromedriver.exe");
		
        
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	driver = new ChromeDriver();
    	driver.get("http://practice.automationtesting.in/");
        
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	
    	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
        
    }
}