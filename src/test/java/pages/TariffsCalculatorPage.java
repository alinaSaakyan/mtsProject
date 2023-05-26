package pages;

import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class TariffsCalculatorPage {
    private final By TRANSFERS_QUANT = By.xpath("//div[@label='Количество внешних переводов на счета ЮЛ и ИП']//child::input");
    private final By TRANSFERS_SUM = By.xpath("//div[@label='Сумма переводов на счета ФЛ в месяц']//child::input");
    private final By CASH_CRED = By.xpath("//div[@label='Внесение наличных в месяц']//child::input");
    private final By CASH_WITHDRAWAL = By.xpath("//div[@label='Снятие наличных в месяц']//child::input");
    private final By CASH_ENROLLMENT = By.xpath("//div[@label='Зачисление денег на свой счёт в месяц']//child::input");
    private final By APPLY_BUTT = By.xpath("//div[@label='Тариф']//child::input");
    private final By TARIFF_NAME1 = By.xpath("//div[@class='styled__SmartText-n9vm43-0 hQtTs']");
    private final By TARIFF_NAME2 = By.xpath("//div[@label='Тариф']//child::input");








    public TariffsCalculatorPage fillTransfersQuant(){
        $(TRANSFERS_QUANT).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(TRANSFERS_QUANT).sendKeys("750");
        return this;
    }

    public TariffsCalculatorPage fillTransfersSum(){
        $(TRANSFERS_SUM).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(TRANSFERS_SUM).sendKeys("2000000");
        return this;
    }
    public TariffsCalculatorPage fillCashCrediting(){
        $(CASH_CRED).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(CASH_CRED).sendKeys("1250000");
        return this;
    }
    public TariffsCalculatorPage fillCashWithdrawal(){
        $(CASH_WITHDRAWAL).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(CASH_WITHDRAWAL).sendKeys("3100000");
        return this;
    }
    public TariffsCalculatorPage fillCashEnrollment(){
        $(CASH_ENROLLMENT).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(CASH_ENROLLMENT).sendKeys("7000000");
        return this;
    }
    public TariffsCalculatorPage openAccount(){
        $(APPLY_BUTT).shouldBe(Condition.interactable).click();
        $(By.xpath("//div[@role='option']//child::div[text()='Точный']")).click();
        return this;
    }

    public TariffsCalculatorPage compareTariffNames(){
        $(APPLY_BUTT).getValue().equals($(TARIFF_NAME1).getText());
        return this;
    }

}
