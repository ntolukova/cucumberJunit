package API_Fake;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class myAPI {
    @Test
    public void getTeachersList(){
        // hit the
        // HTTP method, endpoint, body, header
        Response response = RestAssured.get("http://api.cybertektraining.com/teacher/all");
        Assert.assertEquals("API server is down", 200, response.statusCode());
        System.out.println(response.asString());
        JsonPath jp = response.jsonPath();
        int size  = jp.getList("teachers").size();
        for(int i = 0; i < size; i++) {
            String pathName = "teachers[" + i + "].firstName";
            String pathEmail = "teachers[" + i + "].emailAddress";
            String name = jp.get(pathName);
            String email = jp.get(pathEmail);
            Assert.assertTrue(i + "Failed",name != null);
            Assert.assertNotNull(name);
            Assert.assertNotNull(email);
        }
    }
    @Test
    public void getDepartmentIt(){
        Response response = RestAssured.get("http://api.cybertektraining.com/teacher/department/IT");
        //hits API
        Assert.assertEquals("API server is down!",200, response.statusCode());
        System.out.println(response.asString());
        JsonPath jp = response.jsonPath();
        int size = jp.getList("teachers").size();
        for(int i = 0; i < size; i++) {
            String pathDepartment = "teachers[" + i + "].department";
            String department = jp.get(pathDepartment);
            System.out.println(department);
            Assert.assertEquals("Department failed at: " + i, "IT", department);
        }
    }
}
