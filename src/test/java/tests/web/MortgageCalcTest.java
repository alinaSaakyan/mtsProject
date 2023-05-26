package tests.web;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import pages.MainPage;
import pages.MortgageFormPage;

public class MortgageCalcTest extends BaseTest {
    MainPage mainPage = new MainPage();
    MortgageFormPage mortgageFormPage = new MortgageFormPage();
    private String region = "Москва";
    private String creditSum = "10000000";

    @Test
    public void checkMortgageCalc(){
        mainPage.openMainPage().chooseMortgage();
        mortgageFormPage.chooseLoanPurpose()
                .chooseProperty()
                .chooseRegion(region)
                .chooseSourceOfIncome()
                .choosePropertyCost()
                .chooseCreditSum()
                .chooseYears().hoverButton().openTimetable();
        String creditSum = mortgageFormPage.creditSum;
        mortgageFormPage.getCreditSum();
        Configuration.holdBrowserOpen = true;
    }
}
