package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import utils.TestData;

import static userinterface.CreateAccountPage.*;

public class CreateAccountWithUsrAndPass implements Interaction {

    public static Performable forUser() {
        return new CreateAccountWithUsrAndPass();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Enter.keyValues(TestData.getTestdata().get(0).get("email")).into(EMAIL_TEXTBOX).performAs(actor);
        Enter.keyValues(TestData.getTestdata().get(0).get("clave")).into(PASSWORD_TEXTBOX).performAs(actor);

        Scroll.to(FOOT_PAGE).performAs(actor);
        Click.on(SIGN_UP_BUTTON).performAs(actor);
    }
}
