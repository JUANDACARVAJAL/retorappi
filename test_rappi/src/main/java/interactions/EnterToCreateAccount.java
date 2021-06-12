package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.HomePage.CLOSE_POP_UP;
import static userinterface.HomePage.CREATE_ACCOUNT;

public class EnterToCreateAccount implements Interaction {

    public static Performable user() {
        return new EnterToCreateAccount();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(CLOSE_POP_UP).performAs(actor);
        Click.on(CREATE_ACCOUNT).performAs(actor);
    }
}
