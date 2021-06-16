package tasks;

import interactions.EnterToSavedPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class EnterToListSaved implements Task {

    public static Performable user() {
        return Tasks.instrumented(EnterToListSaved.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterToSavedPage.forSearch());
    }

}
