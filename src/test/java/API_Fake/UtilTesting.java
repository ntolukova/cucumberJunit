package API_Fake;

import org.junit.Test;
import utilities.APIUtil;

public class UtilTesting {
    @Test
    public void teacherTesting(){
        String resource = "/teacher/2646";
        APIUtil.hitGET(resource);
        System.out.println(APIUtil.getResponseBody().getTeachers().get(0).getFirstName());
    }
}
