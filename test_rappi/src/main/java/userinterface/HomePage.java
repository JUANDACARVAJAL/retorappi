package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target CREATE_ACCOUNT = Target.the("Create account link").located(By.linkText("Create Account"));
    public static final Target CLOSE_POP_UP = Target.the("Frame temporal").located(By.className("vifp-sweeps-modal-close"));
    public static final Target LOGIN_ACCOUNT = Target.the("Login on page").located(By.linkText("Login"));
    public static final Target CLOSE_COOKIES = Target.the("Frame temporal").located(By.className("cp-banner__icon-close--com"));

    public static final Target HEAD_PLAN_BUTTON = Target.the("Create account link").located(By.xpath("//*[@id='cclr-global-header-root']//*[contains(text(),'Plan')]"));



}
