package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.assertj.core.api.SoftAssertions;

import static userinterface.RegisterSuccessPage.*;

public class SeeTheRegisterPopUp implements Question<Boolean> {

    private static SoftAssertions validateContinuos = new SoftAssertions();

    public static SeeTheRegisterPopUp expected() {
        return new SeeTheRegisterPopUp();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        validateContinuos.assertThat(POPUP_PAGE.resolveFor(actor).isPresent()).as("Pop-up success").isTrue();
        validateContinuos.assertThat(YES_BUTTON.resolveFor(actor).isPresent()).as("Yes Button present").isTrue();
        validateContinuos.assertThat(NOT_BUTTON.resolveFor(actor).isPresent()).as("Not yet Button present").isTrue();
        validateContinuos.assertAll();
        return true;
    }

}
