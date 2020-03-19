package API_Student_Model;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Students {
    private int studentId;
    private String firstName;
    private String lastName;
    private int batch;
    Contact contact = new Contact();
    Company company = new Company();
}
