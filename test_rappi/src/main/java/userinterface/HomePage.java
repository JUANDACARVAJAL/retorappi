package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

public static final Target CREATE_ACCOUNT = Target.the("Create account link").located(By.linkText("Create Account"));
public static final Target CLOSE_POP_UP = Target.the("Frame temporal").located(By.className("vifp-sweeps-modal-close"));

}
