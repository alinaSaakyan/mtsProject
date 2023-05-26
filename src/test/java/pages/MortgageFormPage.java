package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class MortgageFormPage {
    private final By LOAN_PURPOSES = By.xpath("//input[@name='calcLoanPurpose']");
    private final By LOAN_PURPOSE = By.xpath("//div[@data-testid='text' and text()='Получение денег']");
    private final By TYPES_OF_PROPERTY = By.xpath("//input[@name='property']");
    private final By PROPERTY = By.xpath("//div[@data-testid='text' and text()='Квартира']");
    private final By REGION = By.xpath("//input[@id='regionInput']");
    private final By SELECTED_REGION = By.xpath("//li[@id='react-autowhatever-1--item-0']");
    private final By SOURCES_OF_INCOME = By.xpath("//input[@name='sourceOfIncome']");
    private final By SOURCE_OF_INCOME = By.xpath("//div[@data-testid='text' and text()='Являюсь собственником бизнеса/ИП/самозанятый']");
    private final By PROPERTY_COST = By.xpath("//div[@label='Стоимость объекта залога']/child::input");
    private final By CREDIT_SUM1 = By.xpath("//div[@label='Сумма кредита']/child::input");
    private final By YEARS = By.xpath("//div[@label='Срок кредита']/child::input");
    private final By TIMETABLE = By.xpath("//div[text()='Открыть график платежей']");
    private final By CREDIT_SUM2 = By.xpath("//div[@wrap]//child::div//child::div//following::h4");
    private final By CREDIT_SUM3 = By.xpath("//*[@id='modal']/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/h4");
    private final By APPLY_BUTTON = By.xpath("//button[@data-testid='button']");


    public String creditSum;

    public MortgageFormPage hoverButton() {
        $(APPLY_BUTTON).hover();
        return this;
    }
    public MortgageFormPage chooseLoanPurpose() {
        $(LOAN_PURPOSES).click();
        $(LOAN_PURPOSE).click();
        return this;
    }
    public MortgageFormPage chooseProperty() {
        $(TYPES_OF_PROPERTY).click();
        $(PROPERTY).click();
        return this;
    }
    public MortgageFormPage chooseRegion(String region) {
        $(REGION).sendKeys(region);
        $(SELECTED_REGION).click();
        return this;
    }
    public MortgageFormPage chooseSourceOfIncome() {
        $(SOURCES_OF_INCOME).click();
        $(SOURCE_OF_INCOME).click();
        return this;
    }
    public MortgageFormPage choosePropertyCost() {
        $(PROPERTY_COST).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(PROPERTY_COST).sendKeys("40000000");
        return this;
    }
    public MortgageFormPage chooseCreditSum() {
        $(CREDIT_SUM1).doubleClick().sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(CREDIT_SUM1).sendKeys("6000000");
        return this;
    }
    public MortgageFormPage chooseYears() {
        $(YEARS).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(YEARS).sendKeys("11");
        return this;
    }

    public MortgageFormPage getCreditSum(){
        creditSum = $(CREDIT_SUM2).getText();
        return this;
    }
    public MortgageFormPage checkCreditSum(String creditSum){
        $(CREDIT_SUM3).shouldHave(Condition.text(creditSum));
        return this;
    }

    public MortgageFormPage openTimetable() {
        $(TIMETABLE).click();
        return this;
    }
}
