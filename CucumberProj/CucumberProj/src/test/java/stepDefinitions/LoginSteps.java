package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	
	@Given("User navigates to the given site")
	public void userNavigates()
	{
	System.out.println("Hello World!");	
	}
	
	 @When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enter_something_and_something(String strArg1, String strArg2) throws Throwable {
	        System.out.println(strArg1);
	        System.out.println(strArg2);
	    }
	  
	  @When("^User signs in using following details$")
	    public void user_signs_in_using_following_details(DataTable data) throws Throwable {
	      List<List<String>> ls= data.asLists();
	      
	      System.out.println(ls.get(0).get(0));
	      System.out.println(ls.get(0).get(1));
	      System.out.println(ls.get(0).get(2));
	      System.out.println(ls.get(0).get(3));
	    }
	  
	  @When("^User enter their (.+) and (.+)$")
	    public void user_enter_their_and(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }

    @Then("^Login is Successful$")
    public void login_is_successful() {
        System.out.println("Then");
    }

    @And("^Clicks Login button$")
    public void clicks_login_button() {
        System.out.println("And");
    }
    
    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
     System.out.println("Validate browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Browser is triggered");
    }

    @Then("^Check if browser is launched$")
    public void check_if_browser_is_launched() throws Throwable {
    	System.out.println("Check if browser is launched");
    }

}
