package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationElements {
    public SelenideElement
            autorisation=$(".welcome-text-desktop"),
            registration=$(".registration_link"),
            emailInput= $(byId("Email")),
            passInput=$(byId("register-password")),
            passrepeteInput=$(byId("ConfirmPassword")),
            rulesAgreementBtn=$(".registration_checkmark"),
            registrationBtn=$(byId("register-button"));

}
