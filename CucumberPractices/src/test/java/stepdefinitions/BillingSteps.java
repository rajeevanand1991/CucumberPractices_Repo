package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

//cucumberversion 6.9.0 ===> has the issue while performing data driven approach for int and double values.
//This issue reproducing in billing.feature file, if below these values not given in the "" double quotes String format 
//1. billingamount 
//2. taxamount 
//3. finalamount  
//Example: io.cucumber.core.runner.AmbiguousStepDefinitionsException: "user enters tax amount 10" matches more than one step definition
//- cucumber version 6.9.0 version got confused on different types of values, but cucumber version 4.8.1 was working good, even for int and double values.

public class BillingSteps {
	
	double billingAmount;
	double taxAmount;
	double finalAmount;
	
	@Given("user is on billing page")
	public void user_is_on_billing_page() {
	    
	}

	//@When("user enters billing amount {int}")
	@When("user enters billing amount {string}")
	public void user_enters_billing_amount(String billingAmount) {
	    this.billingAmount = Double.parseDouble(billingAmount);
	}

	//@When("user enters tax amount {int}")
	@When("user enters tax amount {string}")
	public void user_enters_tax_amount(String taxAmount) {
		this.taxAmount = Double.parseDouble(taxAmount);
	}
	
//	@When("user enters tax amount {double}")
//	public void user_enters_tax_amount(Double taxAmount) {
//		  this.taxAmount = taxAmount;	    
//	}

	@When("user clicks on calculate button")
	public void user_clicks_on_calculate_button() {
	    
	}

	//@Then("it gives the final amount {int}")
	@Then("it gives the final amount {string}")
	public void it_gives_the_final_amount(String expectedFinalAmount) {
		this.finalAmount = this.billingAmount + this.taxAmount;
		System.out.println("expected final amount: "+ Double.parseDouble(expectedFinalAmount));
		System.out.println("actual final amount: "+ this.finalAmount);
		Assert.assertTrue(this.finalAmount == Double.parseDouble(expectedFinalAmount));
	}


//	@Then("it gives the final amount {double}")
//	public void it_gives_the_final_amount(Double finalAmount) {
//		this.finalAmount = this.billingAmount + this.taxAmount;
//		Assert.assertTrue(this.finalAmount == finalAmount);
//	}
}