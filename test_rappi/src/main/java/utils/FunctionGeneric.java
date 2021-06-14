package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class FunctionGeneric {


    public static void stopWeb(){
        WebDriver webchrome = getDriver();
        webchrome.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) webchrome;
        js.executeScript("window.stop()");
    }
}
