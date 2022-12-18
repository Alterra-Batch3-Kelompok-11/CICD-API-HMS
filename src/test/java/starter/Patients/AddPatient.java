package starter.Patients;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class AddPatient {
    private String url, token;

    private JSONObject body =new JSONObject();

    public void setUrlCreatePatient(){
        url = "http://ec2-18-142-246-127.ap-southeast-1.compute.amazonaws.com/v1/patients";

        token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2NzE0MDk3NjgsInJvbGVJZCI6MSwidXNlcklkIjoxLCJ1c2VybmFtZSI6ImFkbWluIn0.0FjJGfK70nQpaBQlik5JIPDtTadtSexB9n77u9D8BqQ";

    }

    public void setBodyAddPatient(){
        body.put("nik", "1287654312");
        body.put("name", "yosh lah");
        body.put("gender", 1);
        body.put("address", "Tangerang");
        body.put("phone", "088834215489");
        body.put("marital_status", false);
        body.put("birth_date", "02-01-2005");
        body.put("religion_id", 1);
    }

    public void requestBodyAddPatient(){
        given().header("Authorization", token)
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .when().post(url);
    }
}
