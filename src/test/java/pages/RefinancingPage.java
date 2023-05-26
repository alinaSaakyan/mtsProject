package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.Wait;

public class RefinancingPage {
    private final By REF_SUM = By.xpath("//div[@label='Сумма']//child::input");
    private final By REF_TERM = By.xpath("//div[@label='Срок']//child::input");
    private final By FORM = By.xpath("//div[@class='styled__FormBodyContainer-sc-luz4on-1 cAvfxc']");
    private final By FIO = By.xpath("//input[@name='clientFio']");
    private final By PHONE = By.xpath("//input[@name='phoneNumber']");
    private final By EMAIL = By.xpath("//input[@name='email']");
    private final By EMAIL_NOTIF = By.xpath("//div[@color='#EB4A13']");
    private final By NEXT_BUTTON = By.xpath("//div[text()='Далее']//parent::div");





    private final By REF_BUTTON = By.xpath("//*[@id='__next']/div[3]/div[1]/div/div/div[2]/div/div/div[2]/button/div");


    public RefinancingPage seeForm(){
        $(REF_BUTTON).click();
        $(FORM).shouldBe(Condition.exist);
        return this;
    }
    public RefinancingPage fillSum(){
        $(REF_SUM).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(REF_SUM).sendKeys("800000");
        return this;
    }
    public RefinancingPage fillTerm(){
        $(REF_TERM).sendKeys(Keys.SHIFT, Keys.HOME, Keys.DELETE);
        $(REF_TERM).sendKeys("24");
        return this;
    }
    public RefinancingPage fillFIO(){
        $(FIO).sendKeys("Иван Иванович Иванов");
        return this;
    }
    public RefinancingPage fillPhone(){
        $(PHONE).sendKeys("9000000000");
        return this;
    }
    public RefinancingPage fillEmail(){
        $(EMAIL).sendKeys("123");
        return this;
    }
    public RefinancingPage clickNext(){
        $(NEXT_BUTTON).click();
        return this;
    }
    public RefinancingPage catchEmailNotif(){
        $(EMAIL_NOTIF).shouldHave(Condition.text("Введите верный электронный адрес"));
        return this;
    }

}
