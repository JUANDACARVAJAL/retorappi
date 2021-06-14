package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HeadUIPage {

    public static final Target SAIL_TO_BUTTON = Target.the("Button for sailt To").located(By.id("cdc-destinations"));
    public static final String IDENTIFICATOR_ID =  "cdc-filter-cols-wrapper";
    public static final Target DURATIONS_BUTTON = Target.the("Button for durations").located(By.id("cdc-durations"));

}
