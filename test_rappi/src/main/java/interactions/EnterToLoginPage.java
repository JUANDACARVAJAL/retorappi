package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.HomePage.*;
import static utils.FunctionGeneric.stopWeb;

public class EnterToLoginPage implements Interaction {

    public static Performable user() {
        return new EnterToLoginPage();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        stopWeb();
        Click.on(CLOSE_COOKIES).performAs(actor);
        Click.on(CLOSE_POP_UP).performAs(actor);
        Click.on(LOGIN_ACCOUNT).performAs(actor);
    }
}
