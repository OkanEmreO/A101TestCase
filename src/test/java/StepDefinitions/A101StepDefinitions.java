package StepDefinitions;

import Pages.A101Website;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class A101StepDefinitions extends GWD {
    A101Website market = new A101Website();

    Actions actions = new Actions(getDriver());
    Robot rbt = new Robot();


    public A101StepDefinitions() throws AWTException {
    }

    @Given("Go to Website")
    public void goToWebsite() {


        GWD.getDriver().get("https://www.a101.com.tr/");

        GWD.getDriver().manage().window().maximize();

        GWD.getDriver().manage().deleteAllCookies();

        market.findAndClick("kabulet");


    }

    @When("Search Giyim Click the Giyim tab")
    public void moveToTheGiyimAksesuarTabAndClickTheDizÇorapTab() throws InterruptedException {


        market.findAndSend("searchArea", "giyim");

        market.findAndClick("giyimclick");
        Bekleme(1);
        market.findAndClick("kadinicgiyim");
        Bekleme(1);
        market.findAndClick("dizaltiCorap");
        Bekleme(1);

    }

    @And("Click Black socks")
    public void clickBlackSocks() {

        market.findAndClick("siyahcorap");

        market.findAndContainsText("siyarRenk", "Penti Kadın 50 Denye Pantolon Çorabı Siyah");
    }

    @And("Click Sepete Ekle and Sepeti Gor")
    public void clickSepeteEkle() {
        market.findAndClick("sepeteEkle");

        market.findAndClick("sepetiGoruntele");

        market.findAndClick("sepetiOnayla");

        market.findAndClick("uyeOlmadan");

        market.findAndSend("email", "okan@gmail.com");

        market.findAndClick("devamEt");

    }

    @Then("Enter the User Data and go to payment page")
    public void enterTheUserData() throws InterruptedException {
        market.findAndClick("yeniAdres");

        market.findAndSend("adresBasligi", "Ev Adresi");
        market.findAndSend("firstName", "sdgsdg");
        market.findAndSend("lastName", "dsgdg");
        market.findAndSend("phoneNumber", "5555555555");
        Bekleme(1);
        market.findAndClick("il");
        Bekleme(1);
        market.findAndClick("ilce");
        Bekleme(1);
        market.findAndClick("mahalle");
        Bekleme(1);
        market.findAndSend("adres", "555 Sokak, Yaz Apartmanı, NO:36 Daire:38");
        market.findAndSend("postaKodu", "36300");
        market.findAndClick("kaydet");
        Bekleme(2);

        market.findAndClick("kaydetveDevam");

        market.findAndSend("adSoyad", "Yağmur Dereli");
        Bekleme(1);
        market.findAndSend("kartNo", "5555444433332222");
        Bekleme(1);
        market.findAndClick("monthDateCard");
        Bekleme(1);
        market.findAndClick("yearDateCard");
        Bekleme(1);
        market.findAndSend("cvvCard", "555");
        Bekleme(1);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_SPACE);
        rbt.keyRelease(KeyEvent.VK_SPACE);
        market.findAndClick("siparisOnay");
        Bekleme(1);
    }

    @And("User should be display succes or not")
    public void userShouldBeDisplaySuccesOrNot() {

        market.findAndContainsText("kartHatasi", "Kart bilgilerinizi kontrol ediniz.");
    }

    @And("Close the website")
    public void closeTheWebsite() {
        quitDriver();
    }
}
