package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.commands.ShouldBe;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DebetCardsCataloguePage {
    private final By ISSUE_BUTTON = By.xpath("//a[@href='/chastnim-licam/karti/debet-card-weekend-delivery-free/?scroll=cardForm']");

    public DebetCardsCataloguePage issueCard() {

        $(ISSUE_BUTTON).click();
        return this;
    }
    public DebetCardsCataloguePage issueCardMob() {

        Selenide.open("https://www.mtsbank.ru/chastnim-licam/karti/debet-card-weekend-delivery-free/?scroll=cardForm");
        return this;
    }
}
