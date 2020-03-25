package API_Fake;

import ApiModels.ResponseBody;
import ApiModels.Students;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.Data;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

@Data
@com.fasterxml.jackson.annotation.JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentsEmailAddress {
    @Test
    public void getStudentsEmailAddress() throws IOException {
        Response response = RestAssured.get("http://api.cybertektraining.com/student/all");
        Assert.assertEquals("API is down!",200, response.getStatusCode());
        System.out.println(response.asString());
        ObjectMapper objectMapper = new ObjectMapper();
        ResponseBody responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        int count = 0;
        for(Students students: responseBody.getStudents()){
            if(students.getContact().getEmailAddress().contains("@gmail.com")){
                count++;
                System.out.println(students.getFirstName());
            }
        }
        System.out.println(count);
    }

}
