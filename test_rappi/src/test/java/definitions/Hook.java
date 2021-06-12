package definitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Hook {

    @Managed(driver = "chrome")
    public WebDriver hisBrowser;

    @Before
    public void beforeAll() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Web's user").can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.get("https://www.carnival.com/");
    }

}
