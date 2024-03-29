package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//
import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
    public static final String BASE_URL = "https://m.vivarobet.am/";
    public SelenideElement popupCloseButton = $(".popup-closed-b");
    public SelenideElement popup2 = $(".popup-closed-b");

    @BeforeMethod
    public void beforeMethodSignIn() {
        //Configuration.headless = true;
        Configuration.browserSize = "375x812";
        // Configuration.timeout = 5000;
        // Configuration.pageLoadTimeout = 5000;
        Configuration.clickViaJs = true;
        // Configuration.assertionMode = AssertionMode.SOFT;
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
        open(BASE_URL);
        sleep(5000);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        closeWebDriver();
    }

}
