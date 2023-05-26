package tests.web;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import pages.FamilyMortgagePage;
import pages.MainPage;

public class FamilyMortgageCheckTest extends BaseTest {
    MainPage mainPage = new MainPage();
    FamilyMortgagePage familyMortgagePage = new FamilyMortgagePage();
    @Test
    public void checkFamilyMortgage(){
        mainPage.openMainPage().hoverMortgage().chooseFamilyMortgage();
        familyMortgagePage.goToApplication()
                .fillPropertySum()
                .chooseMaterinityCap()
                .fillMaterinityCap()
                .fillPersonalFunds()
                .fillMortgageTerm();
        //familyMortgagePage.seeSchedule();


        //Configuration.holdBrowserOpen = true;

    }
}
