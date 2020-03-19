package fakeAPI;

import API_Models.Subject;
import API_Models.Teacher;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class Jackson {
    @Test
    public void jackson() throws JsonProcessingException {

        Teacher teacher = new Teacher();
        teacher.setFirstName("Jenifer");
        teacher.setEmailAddress("jen@gmail.com");
        teacher.setLastName("Smith");
        teacher.setJoinDate("02/20/2020");
        teacher.setSalary(5000);

        Subject subject = new Subject();
        subject.setBatch(14);
        subject.setName("Selenium");
        subject.setYear(2020);
        teacher.setSubject(subject);

        ObjectMapper objectMapper = new ObjectMapper();
        String teacherJson = objectMapper.writeValueAsString(teacher);
        System.out.println(teacherJson);
    }
}
