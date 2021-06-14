package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import utils.TestData;

import static userinterface.LoginPage.*;

public class LoginOnPage implements Interaction {

    public static Performable request() {
        return new LoginOnPage();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Enter.theValue(TestData.getTestdata().get(0).get("email")).into(LOGIN_USER_TEXTBOX).performAs(actor);
        Enter.theValue(TestData.getTestdata().get(0).get("clave")).into(LOGIN_PASS_TEXTBOX).performAs(actor);

        Scroll.to(LOGIN_SIGN_UP_BUTTON).performAs(actor);
        Click.on(LOGIN_SIGN_UP_BUTTON).performAs(actor);
    }
}
