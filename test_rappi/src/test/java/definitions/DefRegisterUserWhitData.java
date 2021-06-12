package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import questions.SeeTheRegisterPopUp;
import tasks.CompleteTheCreationAccount;
import tasks.EnterTheRegistrationPage;
import tasks.LoadTheTestData;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DefRegisterUserWhitData {


    @Given("^that the user tries to register on the page$")
    public void that_the_user_tries_to_register_on_the_page(List<Map<String,String>> arg1) {
        theActorInTheSpotlight().attemptsTo(LoadTheTestData.values(arg1));
        theActorInTheSpotlight().attemptsTo(EnterTheRegistrationPage.value());
    }


    @When("^the user enters all the data$")
    public void the_user_enters_all_the_data() {
        theActorInTheSpotlight().attemptsTo(CompleteTheCreationAccount.withValues());

    }

    @Then("^the user is registered$")
    public void the_user_is_registered() {
        theActorInTheSpotlight().should(seeThat(SeeTheRegisterPopUp.expected()));
    }

}
