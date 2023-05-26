package tests.web;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import pages.MainPage;
import pages.PremiumApplicationFormPage;
import pages.PremiumCardsCataloguePage;

public class PremiumServiceCheckTest extends BaseTest {
    MainPage mainPage = new MainPage();
    PremiumCardsCataloguePage premiumCardsCataloguePage = new PremiumCardsCataloguePage();
    PremiumApplicationFormPage premiumApplicationFormPage = new PremiumApplicationFormPage();

    @Test
    public void checkPremiumService(){
        mainPage.openMainPage().choosePremium().choosePremiumCards();
        premiumCardsCataloguePage.applyForPremium();
        premiumApplicationFormPage.fillFIO()
                .fillBday()
                .fillPhone()
                .chooseDelivery()
                .fillCode()
                .submit()
                .cityNotification();
        //Configuration.holdBrowserOpen = true;

    }
}
