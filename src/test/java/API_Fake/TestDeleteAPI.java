package API_Fake;

import org.junit.Test;
import utilities.APIUtil;

public class TestDeleteAPI {
    @Test
    public void deleteAPI() {
        String resourceForDelete = "/teacher/delete/1338";
        APIUtil.hitDELETE(resourceForDelete);

        String resourceForGet = ("/teacher/1338");
        APIUtil.hitGET(resourceForGet);
        String message = APIUtil.getResponseBody().getMessage();
        System.out.println(message);

    }


}
