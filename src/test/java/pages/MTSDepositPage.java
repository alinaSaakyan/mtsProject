package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class MTSDepositPage {
    private final By DEP_SUM = By.xpath("//div[@label='Сумма вклада']/child::input");
    private final By DEP_TERM = By.xpath("//div[@label='Срок вклада']/child::input");
    private final By DEP_SUM2 = By.xpath("//div[text()='Сумма в конце срока']//following::div//following::h2");
    private final By DEP_SUM3 = By.xpath("//div[text()='Доход по вкладу']//following::div//following::h3");




    private final By FINAL_SUM = By.xpath("//div[@data-testid='spacer']//following-sibling::h2[@data-testid='heading']");

    public MTSDepositPage fillDepSum() {
        $(DEP_SUM).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(DEP_SUM).sendKeys("4000000");
        return this;
    }
    public MTSDepositPage fillDepTerm() {
        $(DEP_TERM).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(DEP_TERM).sendKeys("36");
        return this;
    }

    public MTSDepositPage checkSum() {
        String sum = $(DEP_SUM2).getText();
        //Integer endSum = Integer.parseInt($(DEP_SUM2).getText());
        //Integer income = Integer.parseInt($(DEP_SUM3).getText());
        //Integer begSum = endSum - income;
        Assert.assertTrue(sum.contains("5 201 095 ₽"));
        return this;
    }


}
