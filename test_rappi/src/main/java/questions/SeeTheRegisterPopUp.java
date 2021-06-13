package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static userinterface.RegisterSuccessPage.POPUP_PAGE;

public class SeeTheRegisterPopUp implements Question<Boolean> {


    public static SeeTheRegisterPopUp expected() {
        return new SeeTheRegisterPopUp();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        assertThat(POPUP_PAGE.getName(), POPUP_PAGE.resolveFor(actor).isPresent(), equalTo(true));
       return true;
    }

}
