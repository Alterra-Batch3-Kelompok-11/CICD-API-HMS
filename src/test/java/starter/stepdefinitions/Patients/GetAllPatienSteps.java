package starter.stepdefinitions.Patients;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Patients.GetAllPatients;

public class GetAllPatienSteps {
    @Steps
    GetAllPatients getAllPatients;

    @Given("I set url for get all patients")
    public void iSetUrlForGetAllPatients() {
        getAllPatients.setUrlGetAllPatients();
    }

    @When("I request list patients")
    public void iRequestListPatients() {
        getAllPatients.requestPatients();
    }

    @Then("I will get status code is 200")
    public void iWillGetStatusCodeIs() {
        getAllPatients.verifyStatusCode200();
    }
}
