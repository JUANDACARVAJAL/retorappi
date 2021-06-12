package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateAccountPage {

    public static final Target EMAIL_TEXTBOX = Target.the("register email").located(By.id("username"));
    public static final Target PASSWORD_TEXTBOX = Target.the("register password").located(By.id("password"));
    public static final Target SIGN_UP_BUTTON = Target.the("Sign up button").located(By.className("lrc-submit-button cclr-button-secondary cclr-button-small"));

    public static final Target TERMS_CONDITION = Target.the("tetminos").located(By.xpath("//input[@class='ff-label ffr-label ff-label-block' and @aria-owns='acceptsTermsAndConditions-pm']"));
            //   "//*[contains(text(),'I accept')]"));
}
