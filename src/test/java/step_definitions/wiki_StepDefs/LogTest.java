package step_definitions.wiki_StepDefs;

import utilities.Log;

public class LogTest {
    public static void main(String[] args) {
        System.out.println("Test started");
        Log.start("Header comparison");
        Log.info("start of the test");
        System.out.println("go to amazon");
        Log.info("User in on the main page");
        Log.info("login to amazon");

    }
}
