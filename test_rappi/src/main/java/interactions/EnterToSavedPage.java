package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static utils.FunctionGeneric.stopWeb;

public class EnterToSavedPage implements Interaction {

    public static Performable forSearch() {
        return new EnterToSavedPage();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        stopWeb();
        actor.attemptsTo(Open.url("https://www.carnival.com/"));

    }
}
