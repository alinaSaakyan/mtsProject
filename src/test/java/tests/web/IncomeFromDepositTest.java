package tests.web;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import pages.DepositsPage;
import pages.MTSDepositPage;
import pages.MainPage;

public class IncomeFromDepositTest extends BaseTest {
    MainPage mainPage = new MainPage();
    DepositsPage depositsPage = new DepositsPage();
    MTSDepositPage mtsDepositPage = new MTSDepositPage();
    @Test
    public void checkIncomeFromDeposit(){
        mainPage.openMainPage().chooseDepositsAndAccounts();
        depositsPage.fillDepositSum().fillDepositTerm().openDeposit();
        mtsDepositPage.fillDepSum().fillDepTerm().checkSum();
        //Configuration.holdBrowserOpen = true;

    }
}
