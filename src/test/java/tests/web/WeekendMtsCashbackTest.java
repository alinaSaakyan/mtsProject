package tests.web;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import pages.CardsCataloguePage;
import pages.DebetCardMIRWeekendPage;
import pages.DebetCardsCataloguePage;
import pages.MainPage;

public class WeekendMtsCashbackTest extends BaseTest {
    MainPage mainPage = new MainPage();
    CardsCataloguePage cardsCataloguePage = new CardsCataloguePage();
    DebetCardsCataloguePage debetCardsCataloguePage = new DebetCardsCataloguePage();
    DebetCardMIRWeekendPage debetCardMIRWeekendPage = new DebetCardMIRWeekendPage();
    @Test
    public void checkMtsWeekend(){
        mainPage.openMainPage().chooseCards();
        cardsCataloguePage.chooseDebetCards();
        debetCardsCataloguePage.issueCard();
        debetCardMIRWeekendPage.fillSpecPurchases().fillOtherPurchases().fillPeriod();
        //Configuration.holdBrowserOpen = true;

    }
}
