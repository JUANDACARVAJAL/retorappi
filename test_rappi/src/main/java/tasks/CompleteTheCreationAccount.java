package tasks;

import interactions.CompleteYourProfile;
import interactions.CreateAccountWithUsrAndPass;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class CompleteTheCreationAccount implements Task {
    public static Performable withValues() {
        return Tasks.instrumented(CompleteTheCreationAccount.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CreateAccountWithUsrAndPass.forUser());
        actor.attemptsTo(CompleteYourProfile.withData());
    }
}
