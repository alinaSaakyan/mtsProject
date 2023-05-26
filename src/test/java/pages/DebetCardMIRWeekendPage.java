package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class DebetCardMIRWeekendPage {
    private final By SPECIAL_PURCHASES = By.xpath("//div[@label='Покупки в спец категориях']//child::input");
    private final By OTHER_PURCHASES = By.xpath("//div[@label='Другие покупки по карте']//child::input");
    private final By PERIOD = By.xpath("//div[@label='Период']//child::input");
    private final By PHONE = By.xpath("//input[@name='phoneNumber']");
    private final By FIO = By.xpath("//input[@name='clientFio']");



    public DebetCardMIRWeekendPage fillSpecPurchases() {
        $(SPECIAL_PURCHASES).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(SPECIAL_PURCHASES).sendKeys("90000");
        return this;
    }

    public DebetCardMIRWeekendPage fillOtherPurchases() {
        $(OTHER_PURCHASES).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(OTHER_PURCHASES).sendKeys("200000");
        return this;
    }
    public DebetCardMIRWeekendPage fillPeriod() {
        $(PERIOD).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(PERIOD).sendKeys("12");
        return this;
    }
    public DebetCardMIRWeekendPage fillPhone() {
        $(PHONE).sendKeys("9000000000");
        return this;
    }
    public DebetCardMIRWeekendPage fillFIO() {
        $(FIO).sendKeys("Петров Иван");
        return this;
    }


}
