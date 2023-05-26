package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PremiumApplicationFormPage {
    private final By FIO = By.xpath("//textarea[@name='fullName']");
    private final By DATE_OF_BIRTH = By.xpath("//input[@name='bday']");
    private final By CITY = By.xpath("//div[@label='Город']");
    private final By CHOSEN_CITY = By.xpath("//li[@role='option']");
    private final By PHONE = By.xpath("//input[@name='phone']");
    private final By DELIVERY = By.xpath("//div[text()='В офисе банка']");

    // промокод должен состоять из 4 букв на латинице + 4 цифры + 3 буквы на латинице
    // но строка также принимает формат номера телефона, если начать ввод с цифр 7, 8, 9
    private final By CODE = By.xpath("//input[@name='promo']");
    private final By CITY_NOTIFICATION = By.xpath("//div[@data-testid='text' and @color='#EB4A13']");
    private final By SUBMIT_BUTTON = By.xpath("//div[@data-testid='text' and text()='Отправить заявку']");



    public PremiumApplicationFormPage fillFIO() {
        $(FIO).sendKeys("Иванов Иван Иванович");
        return this;
    }

    public PremiumApplicationFormPage fillBday() {
        $(DATE_OF_BIRTH).sendKeys("14112002");
        return this;
    }
    public PremiumApplicationFormPage fillCity() {
        $(CITY).click();
        $(CITY).shouldBe(Condition.interactable).sendKeys("Москва");
        //$(CHOSEN_CITY).shouldBe(Condition.interactable).click();
        return this;
    }
    public PremiumApplicationFormPage fillPhone() {
        $(PHONE).sendKeys("9000000000");
        return this;
    }
    public PremiumApplicationFormPage chooseDelivery() {
        $(DELIVERY).click();
        return this;
    }
    public PremiumApplicationFormPage fillCode(){
        $(CODE).sendKeys("KKKK6789HGF");
        return this;
    }
    public PremiumApplicationFormPage submit() {
        $(SUBMIT_BUTTON).click();
        return this;
    }

    public PremiumApplicationFormPage cityNotification() {
        $(CITY_NOTIFICATION).shouldHave(Condition.text("Это поле обязательно для заполнения"));
        return this;
    }



}
