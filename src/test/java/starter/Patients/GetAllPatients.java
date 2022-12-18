package starter.Patients;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class GetAllPatients {

    private String url;

    public void setUrlGetAllPatients() {
        url = "http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients";
    }

    public void requestPatients(){
        given().when().get(url);
    }

    public void verifyStatusCode200(){
        then().statusCode(200);
    }
}