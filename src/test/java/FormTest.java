import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.FormPage;

public class FormTest extends TestBase {
    Logger log = LoggerFactory.getLogger("FormTest.class");

    @Test
    public void fillForm() {
        driver.get("https://seleniumui.moderntester.pl/form.php");
        log.info("***** Webside is opened *****");

        FormPage formPage = new FormPage(driver);
        formPage.setName("Ania");
        log.info("***** Name is correctly set *****");
        formPage.setSecondName("Kaczmarek");
        log.info("***** Second name is correctly set *****");
        formPage.setMail("ania@gmail.com");
        log.info("***** Mail is correctly set *****");
        formPage.selectSexOption();
        log.info("***** Sex option is correctly selected *****");
        formPage.setAge(33);
        log.info("***** Age is correctly set *****");
        formPage.setYearOfExperience();
        log.info("***** Year of experience is correctly selected *****");
        formPage.setAutomationTesterProfession();
        log.info("***** Profession is correctly selected *****");
        formPage.selectContinent("europe");
        log.info("***** Continent is correctly selected *****");
        formPage.selectSeleniumCommand();
        log.info("***** Selenium commands are correctly selected *****");
        formPage.selectFile();
        log.info("***** File is correctly selected *****");
        formPage.selectSignInButton();
        log.info("***** 'Sign in' button is correctly selected *****");
        formPage.varifyValidationMessage();
        log.info("***** Correct validation message is displayed *****");
    }
}
