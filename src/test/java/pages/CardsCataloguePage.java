package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CardsCataloguePage {
    private final By DEBET_CARDS = By.xpath("//a[@href='/chastnim-licam/karti/all/debet/']");
    public CardsCataloguePage chooseDebetCards() {
        $(DEBET_CARDS).click();
        return this;
    }
}
