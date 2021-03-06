package interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import utils.TestData;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static userinterface.CompleteProfilePage.*;

public class CompleteYourProfile implements Interaction {

    public static Performable withData() {
        return new CompleteYourProfile();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Enter.keyValues(TestData.getTestdata().get(0).get("firstName")).into(FIRST_NAME_TEXTBOX).performAs(actor);
        Enter.keyValues(TestData.getTestdata().get(0).get("lastName")).into(LAST_NAME_TEXTBOX).performAs(actor);

        Scroll.to(MONTH_BD_SELECTOR).performAs(actor);
        Click.on(MONTH_BD_SELECTOR).performAs(actor);
        SelectFromOptions.byVisibleText(TestData.getTestdata().get(0).get("month")).from(MONTH_BD_SELECTOR).performAs(actor);
        Enter.keyValues(TestData.getTestdata().get(0).get("day")).into(DAY_BD_SELECTOR).performAs(actor);
        Enter.keyValues(TestData.getTestdata().get(0).get("year")).into(YEAR_BD_SELECTOR).performAs(actor);

        Click.on(GENDER_SELECTOR).performAs(actor);
        SelectFromOptions.byVisibleText(TestData.getTestdata().get(0).get("gender")).from(GENDER_SELECTOR).performAs(actor);

        Click.on(COUNTRY_SELECTOR).performAs(actor);
        SelectFromOptions.byVisibleText(TestData.getTestdata().get(0).get("country")).from(COUNTRY_SELECTOR).performAs(actor);
        Scroll.to(COUNTRY_SELECTOR).performAs(actor);


        Enter.keyValues(TestData.getTestdata().get(0).get("area")).into(PHONE_AREA_TEXTBOX).performAs(actor);
        Enter.keyValues(TestData.getTestdata().get(0).get("phone")).into(PHONE_NUMBER_TEXTBOX).performAs(actor);

        Click.on(WORK_WITH_AGENT_CHECKBOX).performAs(actor);
        Click.on(ACCEPTS_OFFERS_CHECKBOX).performAs(actor);

        selectTermsAndConditions(actor);

        Scroll.to(SUBMIT_BUTTON).performAs(actor);
        Click.on(SUBMIT_BUTTON).performAs(actor);
    }

    private void selectTermsAndConditions(Actor actor){
        Coordinates positionXY = ACCEPTS_TERMS_CHECKBOX.resolveFor(actor).getCoordinates();
        Actions action = new Actions(getDriver());
        action.moveByOffset(positionXY.onPage().x+50,positionXY.onPage().y+5).click().perform();
    }

}