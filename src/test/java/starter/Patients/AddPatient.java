package starter.Patients;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class AddPatient {
    private String url, token;

    private JSONObject body =new JSONObject();

    public void setUrlCreatePatient(){
        url = "http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients";

        token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2NzE0MTAzMTYsInJvbGVJZCI6MSwidXNlcklkIjoxLCJ1c2VybmFtZSI6ImFkbWluIn0.WpB_Ns1bHOKL1TBS_YaHfgBxpGHyiGq79IuJfnLFOCU";

    }

    public void setBodyAddPatient(){
        body.put("nik", "3124586790");
        body.put("name", "Yare yare");
        body.put("gender", 1);
        body.put("address", "Tangerang");
        body.put("phone", "080885760798");
        body.put("marital_status", false);
        body.put("birth_date", "01-01-2002");
        body.put("religion_id", 1);
    }

    public void requestBodyAddPatient(){
        given().header("Authorization", token)
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .when().post(url);
    }
}
