package interactions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.TestData;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static userinterface.HeadUIPage.*;
import static userinterface.HomePage.HEAD_PLAN_BUTTON;
import static utils.FunctionGeneric.stopWeb;
import static utils.GenericContants.WAIT_TIME;

public class SearchSailTo implements Interaction {

    public static Performable cruise() {
        return new SearchSailTo();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        stopWeb();
        actor.attemptsTo(WaitUntil.the(HEAD_PLAN_BUTTON, isClickable()).forNoMoreThan(WAIT_TIME*100).seconds(),Click.on(HEAD_PLAN_BUTTON));
        actor.attemptsTo(WaitUntil.the(SAIL_TO_BUTTON, isClickable()).forNoMoreThan(WAIT_TIME*100).seconds(),Click.on(SAIL_TO_BUTTON));
        selectSailToOption(IDENTIFICATOR_ID,TestData.getTestdata().get(0).get("sailto"));
        actor.attemptsTo(WaitUntil.the(DURATIONS_BUTTON, isClickable()).forNoMoreThan(WAIT_TIME*100).seconds(),Click.on(DURATIONS_BUTTON));
        selectSailToOption(IDENTIFICATOR_ID,TestData.getTestdata().get(0).get("duration"));
    }

    private void selectSailToOption(String locatorByClass,String valueSelected) {
        WebDriver webdriver = getDriver();
        WebElement countryUL = webdriver.findElement(By.className(locatorByClass));
        List<WebElement> countriesList=countryUL.findElements(By.tagName("li"));
        for (WebElement li : countriesList) {
            if (li.getText().equals(valueSelected)) {
                li.click();
            }
        }
    }
}
