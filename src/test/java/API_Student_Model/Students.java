package API_Student_Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Students {
    private int studentId;
    private String firstName;
    private String lastName;
    private int batch;
    private Contact contact;
    private Company company;

}
