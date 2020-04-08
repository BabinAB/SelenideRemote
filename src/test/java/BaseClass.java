import org.junit.Before;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;

public class BaseClass {
    LoginSteps loginSteps = new LoginSteps();

    @Before
    public void setUp() {
        timeout=10000;
        remote="http://localhost:4444/wd/hub";
        browserSize="375x800";
        System.setProperty("chromeoptions.mobileEmulation", "deviceName=Nexus 5");
        browserCapabilities.setCapability("enableVNC", true);


    }
}
