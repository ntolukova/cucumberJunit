package pages.google_pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MappingData {
    /***
     * |first_name |last_name | job_id|
     * |John       |Wick     | Fighter|
     * |Alisa      |Smith    | teacher|
     * |Ayn        |Rand     |writer |
     */
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("First_name", "John");
        map1.put("Last_name", "Wick");
        map1.put("Job_id", "fighter");

        Map<String, String> map2 = new HashMap<>();
        map2.put("First_name", "Alisa");
        map2.put("Last_name", "Smith");
        map2.put("Job_id", "teacher");

        Map<String, String> map3 = new HashMap<>();
        map3.put("First_name", "Ayn");
        map3.put("Last_name", "Rand");
        map3.put("Job_id", "writer");

        System.out.println(map1.get("Job_id"));

        List<Map<String, String>> listOfmap = new ArrayList<>();
        listOfmap.add(map1);
        listOfmap.add(map2);
        listOfmap.add(map3);
    }
}
