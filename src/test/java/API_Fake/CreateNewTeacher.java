package API_Fake;

import ApiModels.RequestBody;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.junit.Test;
import utilities.APIUtil;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)

public class CreateNewTeacher {
    @Test
    public void creatingNewTeacher() {
        /**
         * {
         *   "batch": 0,
         *   "birthDate": "2020-03-21T16:50:41.925Z",
         *   "department": "string",
         *   "emailAddress": "string",
         *   "firstName": "string",
         *   "gender": "string",
         *   "joinDate": "2020-03-21T16:50:41.925Z",
         *   "lastName": "string",
         *   "password": "string",
         *   "phone": "string",
         *   "premanentAddress": "string",
         *   "salary": 0,
         *   "section": "string",
         *   "subject": "string",
         *   "teacherId": 0
         * }
         */
        RequestBody teacher = new RequestBody();
        teacher.setFirstName("Nur");
        teacher.setLastName("Pavel");
        teacher.setBirthDate("12/23/1995");
        teacher.setGender("female");
        teacher.setEmailAddress("nt@gmail.com");
        teacher.setBatch(23);
        teacher.setSalary(3000);
        teacher.setDepartment("Music");
        teacher.setJoinDate("01/31/2003");
        teacher.setPassword("123");
        teacher.setSection("hey");
        teacher.setSubject("Music");
        teacher.setPhone("435-3453-34534");
        teacher.setPermanentAddress("234 Hey street");



        APIUtil.hitPOST("/teacher/create",teacher);


    }
}

