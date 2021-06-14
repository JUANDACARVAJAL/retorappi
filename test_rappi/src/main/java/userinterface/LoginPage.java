package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target LOGIN_USER_TEXTBOX = Target.the("register email").located(By.id("username"));
    public static final Target LOGIN_PASS_TEXTBOX = Target.the("register password").located(By.id("password"));
    public static final Target LOGIN_SIGN_UP_BUTTON = Target.the("tetminos").located(By.xpath("//*[@id=\"MainBody\"]//*[contains(text(),'LOG IN')]"));
}
