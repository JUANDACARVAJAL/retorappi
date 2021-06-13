package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterSuccessPage {

    public static final Target POPUP_PAGE = Target.the("Pop-up for register account").located(By.id("lrh-heading"));

    public static final Target YES_BUTTON = Target.the("Yes button").located(By.className("ns-have-a-booking"));
    public static final Target NOT_BUTTON = Target.the("Not yet button").located(By.className("ns-no-booking-yet"));

}
