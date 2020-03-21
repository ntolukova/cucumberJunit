package API_Teacher_Module;

import ApiModels.ResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class TeacherDepartment {
@Test
public void getTeacherDepartment() throws Exception {
    Response response = RestAssured.get("http://api.cybertektraining.com/teacher/all");
    Assert.assertEquals("API is down!",200, response.getStatusCode());
    System.out.println(response.asString());
    ObjectMapper objectMapper = new ObjectMapper();
    ResponseBody responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
    for(Teacher teacher: responseBody.getTeachers()){
        System.out.println(teacher.getDepartment());
    }
}
}
