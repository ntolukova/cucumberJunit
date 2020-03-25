package ApiModels;

import lombok.Data;

import java.util.List;
@Data
public class ResponseBody {
    List <Students> students;
    List <Teacher> teachers;
    String message;



}
