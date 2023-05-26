package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class FamilyMortgagePage {
    private final By APPLY_BUTTON = By.xpath("//div[text()='Тарифы и документы']");
    private final By CALCULATE = By.xpath("//div[text()='Рассчитать']");
    private final By FAM_CREDIT_SUM = By.xpath("//div[@wrap]//child::div//child::div//following::h4");
    private final By FAM_CREDIT_SUM_FROM_SCHEDULE = By.xpath("//*[@id='modal']/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/h4");

    private final By SCHEDULE = By.xpath("//div[@class='sc-dIUeWJ dSPbEr']//child::button");

    private final By PROPERTY_SUM = By.xpath("//div[@label='Стоимость недвижимости']//child::input");
    private final By MATERINITY_CAP_SELECT = By.xpath("//label//child::input//following::div");
    private final By MATERINITY_CAP = By.xpath("//div[@label='Материнский капитал']//child::input");
    private final By PERSONAL_FUNDS = By.xpath("//div[@label='Личные средства']//child::input");
    private final By MORTGAGE_TERM = By.xpath("//div[@label='Срок кредита']//child::input");





    public String familyCreditSum;

    public FamilyMortgagePage goToApplication(){
        $(APPLY_BUTTON).click();
        $(CALCULATE).click();
        return this;
    }
    public FamilyMortgagePage seeSchedule(){
        $(SCHEDULE).click();
        return this;
    }

    public FamilyMortgagePage getFamCreditSum(){
        familyCreditSum = $(FAM_CREDIT_SUM).getText();
        return this;
    }

    public FamilyMortgagePage checkFamCreditSum(){
        $(FAM_CREDIT_SUM_FROM_SCHEDULE).shouldHave(Condition.text("2 000 000 ₽"));
        return this;
    }

    public FamilyMortgagePage fillPropertySum() {
        $(PROPERTY_SUM).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(PROPERTY_SUM).sendKeys("9500000");
        return this;
    }

    public FamilyMortgagePage chooseMaterinityCap() {
        $(MATERINITY_CAP_SELECT).click();
        return this;
    }
    public FamilyMortgagePage fillMaterinityCap() {
        $(MATERINITY_CAP).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(MATERINITY_CAP).sendKeys("500000");
        return this;
    }
    public FamilyMortgagePage fillPersonalFunds() {
        $(PERSONAL_FUNDS).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(PERSONAL_FUNDS).sendKeys("1000000");
        return this;
    }
    public FamilyMortgagePage fillMortgageTerm() {
        $(MORTGAGE_TERM).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(MORTGAGE_TERM).sendKeys("15");
        return this;
    }

}
