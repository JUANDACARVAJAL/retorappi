package definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import questions.SeeTheRegisterPopUp;
import tasks.CompleteTheCreationAccount;
import tasks.EnterTheRegistrationPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DefLoadDataAndClosePopup {


    @When("^the user try to register account$")
    public void the_user_enters_all_the_data() {
        theActorInTheSpotlight().attemptsTo(EnterTheRegistrationPage.value());
        theActorInTheSpotlight().attemptsTo(CompleteTheCreationAccount.withValues());
    }

    @Then("^the user is registered$")
    public void the_user_is_registered() {
        theActorInTheSpotlight().should(seeThat(SeeTheRegisterPopUp.expected()));
    }


}
