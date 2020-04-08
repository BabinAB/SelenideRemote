import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement mobileLoginBtn = $("#loin-button.btn"); // speccially changed selector to incorrect one

    public void checkPage(){
        mobileLoginBtn.shouldBe(Condition.visible);
    }
}
