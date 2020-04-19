package stepDefinition;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
public class StepDefintions {
	@Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
		System.out.println("Validate the browser");
        
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Browser is triggered");
      
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("Check the browser is started");
        
    }


	@Given("^User is on Netbanking Landing Page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {

		System.out.println("User is on Netbanking Landing Page");
	}

	@When("^User login to application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_to_application_with_something_and_password_something(String strgArg1, String strgArg2) throws Throwable {

		System.out.println(strgArg1);
		System.out.println(strgArg2);
	}
	
	@When("^User login to application with following details$")
    public void user_login_to_application_with_following_details(DataTable data) throws Throwable {
      List<List<String>> obj = data.raw();
    System.out.println(obj.get(0).get(0));
    System.out.println(obj.get(0).get(1));
    System.out.println(obj.get(0).get(2));
    System.out.println(obj.get(0).get(3));
    System.out.println(obj.get(0).get(4));
      
    }

	
	 @When("^User login in to application with (.+) and password (.+)$")
	    public void user_login_to_application_with_and_password(String username, String password) throws Throwable {
	       System.out.println(username);
	       System.out.println(password);
	    }

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {


		System.out.println("Home page is populated");
	}

	@And("^Cards are  not displayed are \"([^\"]*)\"$")
	public void cards_are_not_displayed(String arg1) throws Throwable {
		
		System.out.println("Cards are not displayed");
	}
	
	@And("^Cards are displayed are \"([^\"]*)\"$")
	public void cards_are_displayed(String arg2) throws Throwable {
		
		System.out.println("Cards are displayed");
	}

	 
	

}




