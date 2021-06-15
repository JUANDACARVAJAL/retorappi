package tasks;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static userinterface.CruiseOptionPage.CRUISE_OPTIONS;
import static userinterface.CruiseOptionPage.SAVE_BUTTON;
import static utils.FunctionGeneric.stopWeb;
import static utils.GenericContants.WAIT_TIME;

public class SelectThePreferredOption implements Task {

    public static Performable value() {
        return Tasks.instrumented(SelectThePreferredOption.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        selectSailToOption(CRUISE_OPTIONS);
        Scroll.to(SAVE_BUTTON).andAlignToBottom().performAs(actor);
        actor.attemptsTo(WaitUntil.the(SAVE_BUTTON, isClickable()).forNoMoreThan(WAIT_TIME*100).seconds(),Click.on(SAVE_BUTTON));
    }

    private void selectSailToOption(String locatorByClass) {
        stopWeb();
        WebDriver webdriver = getDriver();
        WebElement countryUL = webdriver.findElement(By.tagName(locatorByClass));
        List<WebElement> countriesList=countryUL.findElements(By.tagName("article"));
        for (WebElement li : countriesList) {
            if (li.isDisplayed()) {
                li.click();
                break;
            }
        }
    }
}
