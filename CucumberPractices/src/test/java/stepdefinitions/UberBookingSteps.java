package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

	@Given("User wants to select a car type {string} from uber application") // {string} ===> These are called cucumber
																				// regular expression
	public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
		System.out.println("step 1 : " + carType);
	}

	@When("User selects car {string} and pick up point {string} and drop location {string}")
	public void user_selects_car_and_pick_up_point_and_drop_location(String carType, String pickUpLocation,
			String dropLocation) {
		System.out.println("step 2 : " + carType + " " + pickUpLocation + " " + dropLocation);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("step 3");
	}

	@And("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("step 4");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {
		System.out.println("step 5 : " + price);
	}

	@Then("User checks the trip details")
	public void user_checks_the_trip_details() {
		System.out.println("step 6: user is checking their trip details");
	}
}