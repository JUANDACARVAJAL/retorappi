package tasks;

import interactions.LoginOnPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LoginOnCarnivalPage implements Task {

    public static Performable request() {
        return Tasks.instrumented(LoginOnCarnivalPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(LoginOnPage.request());

    }
}
