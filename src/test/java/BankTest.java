import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class BankTest extends BaseClass {
    @Test
    public void mobileTest() {
        open("https://idemo.bspb.ru/");
        loginSteps.checkPage();
    }
}
