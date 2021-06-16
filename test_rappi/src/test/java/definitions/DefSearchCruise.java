package definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import interactions.EnterToLoginPage;
import questions.SavedSearch;
import tasks.EnterToListSaved;
import tasks.GoToSavedPage;
import tasks.LoginOnCarnivalPage;
import tasks.SearchCruise;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DefSearchCruise {

    @When("the user try to search a \\$cruise$$")
    public void theUserTryToSearchA$cruise() {
        theActorInTheSpotlight().attemptsTo(EnterToLoginPage.user());
        theActorInTheSpotlight().attemptsTo(LoginOnCarnivalPage.request());
        theActorInTheSpotlight().attemptsTo(SearchCruise.onPage());
    }


    @Then("^the user can save the search$")
    public void the_user_can_save_the_search() {
        theActorInTheSpotlight().should(seeThat(SavedSearch.expected()));

    }


    @When("^the user try to change la busqueda$")
    public void theUserTryToChangeLaBusqueda() {
        theActorInTheSpotlight().attemptsTo(EnterToListSaved.user());
        theActorInTheSpotlight().attemptsTo(GoToSavedPage.request());
    }

    @Then("^the user can change$")
    public void theUserCanChange() {

    }
}