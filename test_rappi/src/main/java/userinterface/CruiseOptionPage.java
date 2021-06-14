package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CruiseOptionPage {

    public static final String CRUISE_OPTIONS = "ccl-view-result-container";
    public static final Target SAVE_BUTTON = Target.the("Save button").located(By.id("save-button-accessible-desc"));
}
