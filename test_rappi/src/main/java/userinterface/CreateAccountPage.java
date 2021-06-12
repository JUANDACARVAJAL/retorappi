package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateAccountPage {

    public static final Target EMAIL_TEXTBOX = Target.the("register email").located(By.id("username"));
    public static final Target PASSWORD_TEXTBOX = Target.the("register password").located(By.id("password"));
    public static final Target SIGN_UP_BUTTON = Target.the("tetminos").located(By.xpath("//*[@id=\"MainBody\"]//*[contains(text(),'SIGN UP')]"));
    public static final Target FOOT_PAGE = Target.the("tetminos").located(By.className("lsu-footer"));

}
