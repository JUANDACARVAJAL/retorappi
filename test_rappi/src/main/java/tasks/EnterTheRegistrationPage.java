package tasks;


import interactions.EnterToCreateAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class EnterTheRegistrationPage implements Task {


    public static Performable value() {
        return Tasks.instrumented(EnterTheRegistrationPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterToCreateAccountPage.user());
    }
}
