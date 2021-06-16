package tasks;

import interactions.ModifyTheSaved;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class GoToSavedPage implements Task {

    public static Performable request() {
        return Tasks.instrumented(GoToSavedPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ModifyTheSaved.page());
    }

}
