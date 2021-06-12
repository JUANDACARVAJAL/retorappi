package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteProfilePage {

    public static final Target FIRST_NAME_TEXTBOX = Target.the("First name").located(By.id("firstName-pm"));
    public static final Target LAST_NAME_TEXTBOX = Target.the("Last name").located(By.id("lastName-pm"));

    public static final Target MONTH_BD_SELECTOR = Target.the("Month of birth day").located(By.id("dobMonth-pm"));
    public static final Target DAY_BD_SELECTOR = Target.the("Day of birth day").located(By.id("dobDay-pm"));
    public static final Target YEAR_BD_SELECTOR = Target.the("Year of birth day").located(By.id("dobYear-pm"));

    public static final Target GENDER_SELECTOR = Target.the("Gender").located(By.id("gender-pm"));
    public static final Target COUNTRY_SELECTOR = Target.the("Country").located(By.id("countryCode-pm"));
    public static final Target PHONE_NUMBER_SELECTOR = Target.the("Phone number").located(By.id("domesticPhoneNumber-pm"));

    public static final Target PHONE_AREA_TEXTBOX = Target.the("Phone area").located(By.id("phoneAreaCode-pm"));
    public static final Target PHONE_NUMBER_TEXTBOX = Target.the("Phone number").located(By.id("phoneNumber-pm"));


    public static final Target WORK_WITH_AGENT_CHECKBOX = Target.the("Work with an agent").located(By.xpath("//*[@id=\"MainBody\"]//label[@for='workingWithTravelAgent-pm']"));
    public static final Target ACCEPTS_OFFERS_CHECKBOX = Target.the("Accepts offers").located(By.xpath("//*[@id=\"MainBody\"]//label[@for='acceptsOffers-pm']"));
    public static final Target ACCEPTS_TERMS_CHECKBOX = Target.the("Accepts terms and conditions").located(By.xpath("//label[@for='acceptsTermsAndConditions-pm']/ancestor::before[@class='ff-label ffr-label ff-label-block']"));

    public static final Target SUBMIT_BUTTON = Target.the("Submit Button").located(By.id("submit-guest-pm"));




}
