package tests.mob;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.ProjectConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.junit.After;
import org.junit.Before;

public abstract class MobBaseTest {
    public static final ProjectConfig config = ConfigFactory.create(ProjectConfig.class);
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 5000;
        System.setProperty("chromeoptions.mobileEmulation", "deviceName=Nexus 5");

    }
    @After
    public void turnDown(){
        Selenide.closeWebDriver();
    }
}
