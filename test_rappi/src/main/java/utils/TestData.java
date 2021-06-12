package utils;

import java.util.List;
import java.util.Map;

public class TestData {

    private static List<Map<String,String>> testdata;


    public static List<Map<String, String>> getTestdata() {
        return testdata;
    }

    public void setTestdata(List<Map<String, String>> testdata) {
        this.testdata = testdata;
    }

}
