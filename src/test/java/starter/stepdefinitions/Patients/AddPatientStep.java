package starter.stepdefinitions.Patients;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Patients.AddPatient;

public class AddPatientStep {

    @Steps
    AddPatient addPatient;

    @Given("I set url for get add patient")
    public void iSetUrlForGetAddPatient() {
        addPatient.setUrlCreatePatient();
    }

    @And("I set body patient data")
    public void iSetBodyPatientData() {
        addPatient.setBodyAddPatient();
    }

    @When("I request body patients")
    public void iRequestBodyPatients() {
        addPatient.requestBodyAddPatient();
    }
}
