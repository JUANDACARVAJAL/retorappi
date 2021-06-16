package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SavedPage {

    public static final Target SAVED_BUTTON = Target.the("Saved button").located(By.className("cgh-header__main-menu-ribbon"));
    public static final Target LIST_SAVED = Target.the("list saved").located(By.className("sape-wrapper"));
    public static final Target REVIEW_SAVED = Target.the("Review and Change").located(By.xpath("//*[contains(text(),'Review Trip')]"));
    public static final Target CHANGE_ITINERARY = Target.the("Itinerary's' Change").located(By.xpath("//*[@id=\"MainBody\"]//button[@class='be-btn-plain be-rcs_total-rooms-and-guests-link']"));
    public static final Target CONTINUE_BUTTON = Target.the("Continue change").located(By.xpath("//*[@id='shell-wrapper']//button[text(),'Continue']"));
    public static final Target ADD_GUEST = Target.the("Add Ghest").located(By.xpath("//*[@id='shell-wrapper']//button[2]"));
    public static final Target COUNTRY_SELECT = Target.the("Select of country").located(By.id("country-of-residency.0"));

}

