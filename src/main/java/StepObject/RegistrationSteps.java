package StepObject;

import PageObject.RegistrationElements;
import com.codeborne.selenide.Condition;
import org.testng.Assert;

public class RegistrationSteps extends RegistrationElements {
    public RegistrationSteps GotoProfile(){
        autorisation.shouldBe(Condition.enabled).click();
        return this;
    }
    public RegistrationSteps GotoRegistration(){
        registration.click();
        return this;
    }

    public RegistrationSteps InputEmail(String typeyouremail){
        emailInput.setValue(typeyouremail).shouldBe(Condition.visible);
        return this;
    }

    public RegistrationSteps InputPassword(String typeyourpassword){
        passInput.setValue(typeyourpassword);
        return this;
    }
    public RegistrationSteps InputPassword2(String repeteyourpassword){
        passrepeteInput.setValue(repeteyourpassword);
        return this;
    }
    public RegistrationSteps rules(){
        rulesAgreementBtn.click();
        return this;
    }
    public RegistrationSteps register(){
        Assert.assertTrue(registrationBtn.is(Condition.enabled));
        registrationBtn.click();
        return this;
        }
}
