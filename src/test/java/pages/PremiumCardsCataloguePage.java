package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PremiumCardsCataloguePage {
    private final By APPLY_BUTTON = By.xpath("//a[@href='/factory/mir-advanced/#premium_form' and @data-testid='button']");

    public PremiumCardsCataloguePage applyForPremium(){
        $(APPLY_BUTTON).click();
        return this;
    }
}
