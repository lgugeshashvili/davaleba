import PageObject.RegistrationElements;
import StepObject.RegistrationSteps;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ChromeRunner;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class zoommer1 extends ChromeRunner {
    @Test
    public static void zoommerpage1() {

        RegistrationSteps registrationSteps=new RegistrationSteps();
registrationSteps.GotoProfile()
        .GotoRegistration()
        .InputEmail("lelaag@gmail.com")
        .InputPassword("Qwerty123")
        .InputPassword2("Qwerty123")
        .rules()
        .register();
        RegistrationElements registrationElements=new RegistrationElements();
        Assert.assertTrue(registrationElements.welcome.is(Condition.visible));
    }
}
