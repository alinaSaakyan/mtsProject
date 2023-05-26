package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class DepositsPage {
    private final By DEPOSIT_SUM = By.xpath("//div[@label='Сумма вклада']/child::input");
    private final By DEPOSIT_TERM = By.xpath("//div[@label='Срок вклада']/child::input");
    private final By OPEN_DEP_BUTTON = By.xpath("//a[@href='https://www.mtsbank.ru/chastnim-licam/vkladi/mts-vklad/?scroll=cardFormBlockId']");

    public DepositsPage fillDepositSum() {
        $(DEPOSIT_SUM).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(DEPOSIT_SUM).sendKeys("4000000");
        return this;
    }

    public DepositsPage fillDepositTerm() {
        $(DEPOSIT_TERM).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(DEPOSIT_TERM).sendKeys("36");
        return this;
    }
    public DepositsPage openDeposit() {
        $(OPEN_DEP_BUTTON).click();
        return this;
    }




}
