package tasks;

import interactions.SearchSailTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.HomePage.HEAD_PLAN_BUTTON;
import static utils.GenericContants.WAIT_TIME;

public class SearchCruise implements Task {

    public static Performable onPage() {
        return Tasks.instrumented(SearchCruise.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(HEAD_PLAN_BUTTON, isVisible()).forNoMoreThan(WAIT_TIME*100).seconds());
        actor.attemptsTo(SearchSailTo.cruise());
        actor.attemptsTo(SelectThePreferredOption.value());
    }
}
