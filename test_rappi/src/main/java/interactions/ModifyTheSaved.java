package interactions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static userinterface.SavedPage.*;
import static utils.GenericContants.WAIT_TIME;

public class ModifyTheSaved implements Interaction {
    public static Performable page() {
        return new ModifyTheSaved();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(SAVED_BUTTON).performAs(actor);

        actor.attemptsTo(WaitUntil.the(LIST_SAVED, isPresent()).forNoMoreThan(WAIT_TIME*100).seconds());
        selectItemSaved("sape-wrapper");

        Scroll.to(REVIEW_SAVED).andAlignToBottom().performAs(actor);
        Click.on(REVIEW_SAVED).performAs(actor);

        Scroll.to(CHANGE_ITINERARY).andAlignToBottom().performAs(actor);
        Click.on(CHANGE_ITINERARY).performAs(actor);
        Click.on(CONTINUE_BUTTON).performAs(actor);

        Click.on(ADD_GUEST).performAs(actor);
        Click.on(ADD_GUEST).performAs(actor);
        Scroll.to(CONTINUE_BUTTON).andAlignToBottom().performAs(actor);
        Click.on(CONTINUE_BUTTON).performAs(actor);

        SelectFromOptions.byValue("MX").from(COUNTRY_SELECT).performAs(actor);
        Scroll.to(CONTINUE_BUTTON).andAlignToBottom().performAs(actor);
        Click.on(CONTINUE_BUTTON).performAs(actor);

    }

    private void selectItemSaved(String locatorByClass) {
        WebDriver webdriver = getDriver();
        WebElement countryUL = webdriver.findElement(By.className(locatorByClass));
        List<WebElement> countriesList=countryUL.findElements(By.tagName("div"));
        for (WebElement li : countriesList) {
            if (li.isDisplayed()) {
                li.click();
                break;
            }
        }
    }
}
