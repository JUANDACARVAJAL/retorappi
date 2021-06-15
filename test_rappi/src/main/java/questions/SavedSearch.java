package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static userinterface.CruiseOptionPage.SAVE_BUTTON;

public class SavedSearch implements Question<Boolean> {


    public static Question<Boolean> expected() {
        return new SavedSearch();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        assertThat(SAVE_BUTTON.getName(), SAVE_BUTTON.resolveFor(actor).getText(), equalTo("SAVE BOOKING"));

        return true;
    }
}
