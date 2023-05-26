package tests.web;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import pages.MainPage;
import pages.RefinancingPage;

public class CreditRefinancingCheckTest extends BaseTest {
    MainPage mainPage = new MainPage();
    RefinancingPage refinancingPage = new RefinancingPage();
    @Test
    public void checkFamilyMortgage(){
        mainPage.openMainPage().chooseCredits().chooseRefinancing();
        refinancingPage.seeForm()
                .fillSum()
                .fillTerm()
                .fillFIO()
                .fillPhone()
                .fillEmail()
                .clickNext()
                .catchEmailNotif();
        Configuration.holdBrowserOpen = true;

    }

}
