package pages;

import com.codeborne.selenide.Selenide;
import config.ProjectConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public static final ProjectConfig config = ConfigFactory.create(ProjectConfig.class);
    private final By PREMIUM = By.xpath("//div[@class='sc-jJEKmz ejANpH' and text()='Премиум']");
    private final By PREMIUM_CARDS = By.xpath("//a[@href='/factory/karti/premium/']");
    private final By MORTGAGE = By.xpath("//a[@href='/chastnim-licam/ipoteka/']");
    private final By FAMILY_MORTGAGE = By.xpath("//a[@href='/chastnim-licam/ipoteka/semeynaya-ipoteka/']");

    private final By DEPOSITS_ACCOUNTS = By.xpath("//a[@href='/chastnim-licam/vkladi/']");
    private final By CARDS = By.xpath("//a[@href='/chastnim-licam/karti/']");
    private final By CREDITS = By.xpath("//a[@href='/chastnim-licam/krediti/']");
    private final By REFINANCING = By.xpath("//a[@href='/chastnim-licam/krediti/refinans/']");
    private final By SMALL_BUSINESS_IE = By.xpath("//a[@href='/malomu-biznesu/']");
    private final By CHECKING_ACCOUNT = By.xpath("//a[@href='/malomu-biznesu/raschetny-schet/']");
    private final By SELECT_TARIFF = By.xpath("//a[@href='/malomu-biznesu/raschetny-schet/tariffs-calculator/']");
    private final By AGREE_REGION = By.xpath("//button[@data-testid='button']");





    public MainPage openMainPage(){
        Selenide.open(config.base_url());
        return this;
    }

    public MainPage choosePremium(){
        $(PREMIUM).hover();
        return this;
    }
    public MainPage choosePremiumCards(){
        $(PREMIUM_CARDS).click();
        return this;
    }
    public MainPage chooseMortgage(){
        $(MORTGAGE).click();
        return this;
    }
    public MainPage hoverMortgage(){
        $(MORTGAGE).hover();
        return this;
    }
    public MainPage chooseFamilyMortgage(){
        $(FAMILY_MORTGAGE).click();
        return this;
    }
    public MainPage chooseDepositsAndAccounts(){
        $(DEPOSITS_ACCOUNTS).click();
        return this;
    }

    public MainPage chooseCards(){
        $(CARDS).click();
        return this;
    }
    public MainPage chooseCredits(){
        $(CREDITS).hover();
        return this;
    }
    public MainPage chooseRefinancing(){
        $(REFINANCING).click();
        return this;
    }

    public MainPage chooseSmallBusinessIE(){
        $(SMALL_BUSINESS_IE).click();
        return this;
    }
    public MainPage chooseCheckingAccount(){
        $(CHECKING_ACCOUNT).hover();
        return this;
    }
    public MainPage chooseSelectTariff(){
        $(SELECT_TARIFF).click();
        return this;
    }
    public MainPage agreeOnRegion(){
        $(AGREE_REGION).click();
        return this;
    }
}
