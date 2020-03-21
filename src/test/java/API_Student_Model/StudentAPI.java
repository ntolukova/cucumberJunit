package API_Student_Model;

import ApiModels.ResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class StudentAPI {
    @Test
    public void createStudent() throws Exception{
        Students students = new Students();
        students.setStudentId(1234);
        students.setFirstName("Lena");
        students.setLastName("Moskva");
        students.setBatch(14);

        Contact contact = new Contact();
        contact.setContactId(3456);
        contact.setEmailAddress("haha@gmail.com");
        contact.setPhone("2342342345");
        students.setContact(contact);

        Company company = new Company();
        company.setCompanyId(4565);
        company.setCompanyName("Chicago");
        students.setCompany(company);

        Address address = new Address();
        address.setAddressId(5676);
        address.setZipCode(34543);
        company.setAddress(address);

        ObjectMapper objectMapper = new ObjectMapper();
        String studentJson = objectMapper.writeValueAsString(students);
        System.out.println(studentJson);
    }

    @Test
    public void studentGet() throws IOException {
        Response response = RestAssured.get("http://api.cybertektraining.com/student/7430");
        Assert.assertEquals("API server is down", 200, response.getStatusCode());
        System.out.println(response.asString());
        ObjectMapper objectMapper = new ObjectMapper();
        ResponseBody rb = objectMapper.readValue(response.asString(), ResponseBody.class);
        String fName = rb.getStudents().get(0).getFirstName();
        System.out.println(fName);
    }
    @Test
    public void studentsHiredIn2020() throws IOException {
        Response response = RestAssured.get("http://api.cybertektraining.com/student/all");
        Assert.assertEquals("API server is down!",200, response.getStatusCode());
        System.out.println(response.asString());
        ObjectMapper objectMapper = new ObjectMapper();
        ResponseBody rb = objectMapper.readValue(response.asString(), ResponseBody.class);
        int count = 0;
        for(Students students: rb.getStudents()){
            if(students.getCompany().getStartDate().endsWith("2020")){
                System.out.println(students.getFirstName());
                count++;
            }
        }
        System.out.println(count);
    }
}
