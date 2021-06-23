package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import utils.TestData;

import java.util.List;
import java.util.Map;

public class LoadTheTestData implements Task {

    private static List<Map<String, String>> arg1;

    public static Performable values(List<Map<String, String>> arg1) {
        LoadTheTestData.arg1 = arg1;
        return Tasks.instrumented(LoadTheTestData.class,arg1);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        TestData testData = new TestData();
        testData.setTestdata(arg1);
    }
}
