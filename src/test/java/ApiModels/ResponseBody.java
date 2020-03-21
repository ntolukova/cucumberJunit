package ApiModels;

import API_Student_Model.Students;
import API_Teacher_Module.Teacher;
import lombok.Data;

import java.util.List;
@Data
public class ResponseBody {
    List <Students> students;
    List <Teacher> teachers;


}
