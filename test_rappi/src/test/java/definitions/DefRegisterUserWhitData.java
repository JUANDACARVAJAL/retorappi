package definitions;

import cucumber.api.java.en.Given;
import tasks.LoadTheTestData;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DefRegisterUserWhitData {


    @Given("^Upload test data values$")
    public void uploadTestDataValues(List<Map<String,String>> arg1) {
        theActorInTheSpotlight().attemptsTo(LoadTheTestData.values(arg1));
    }

}
