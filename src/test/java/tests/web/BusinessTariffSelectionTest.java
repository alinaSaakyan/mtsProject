package tests.web;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import pages.MainPage;
import pages.TariffsCalculatorPage;

public class BusinessTariffSelectionTest extends BaseTest {
    MainPage mainPage = new MainPage();
    TariffsCalculatorPage tariffsCalculatorPage = new TariffsCalculatorPage();
    @Test
    public void checkBusinessTariffSelection(){
        mainPage.openMainPage()
                .chooseSmallBusinessIE()
                .chooseCheckingAccount()
                .chooseSelectTariff();
        tariffsCalculatorPage.fillTransfersQuant()
                .fillTransfersSum()
                .fillCashCrediting()
                .fillCashWithdrawal()
                .fillCashEnrollment()
                .openAccount()
                .compareTariffNames();
        //Configuration.holdBrowserOpen = true;

    }
}
