package API_Student_Model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

public class CreateStudent {
    @Test
    public void createStudent() throws JsonProcessingException {
        Students students = new Students();
        students.setFirstName("Pasha");
        students.setLastName("Smith");
        students.setBatch(10);

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(students);
        Response response = RestAssured.given().contentType(ContentType.JSON).body(s)
                .when().post("http://api.cybertektraining.com/student/create");
        System.out.println(response.statusCode());
        System.out.println(response.asString());
    }
}
