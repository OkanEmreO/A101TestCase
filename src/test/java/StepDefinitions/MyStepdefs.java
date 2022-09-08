package StepDefinitions;

import Pages.A101Website;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class MyStepdefs extends GWD {
    A101Website market = new A101Website();

    Robot rbt = new Robot();


    public MyStepdefs() throws AWTException {
    }

    @Given("Go to Website")
    public void goToWebsite() {


        GWD.getDriver().get("https://www.a101.com.tr/");

        GWD.getDriver().manage().window().maximize();

        GWD.getDriver().manage().deleteAllCookies();

//        GWD.getDriver().switchTo().alert().accept(); alert no such element

        market.findAndClick("kabulet");
    }

    @When("Search Giyim Click the Giyim tab")
    public void moveToTheGiyimAksesuarTabAndClickTheDizÇorapTab() {


        market.findAndSend("searchArea", "giyim");

        market.findAndClick("giyimclick");
        Bekle(2000);
        market.findAndClick("kadinicgiyim");
        Bekle(2000);
        market.findAndClick("dizaltiCorap");
        Bekle(2000);

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
    public void enterTheUserData(){
        market.findAndClick("yeniAdres");

        market.findAndSend("adresBasligi", "Ev Adresi");
        market.findAndSend("firstName", "Mehmet");
        market.findAndSend("lastName", "Uyumlu");
        market.findAndSend("phoneNumber", "5555555555");
        Bekle(2000);
        market.findAndClick("il");
        Bekle(2000);
        market.findAndClick("ilce");
        Bekle(2000);
        market.findAndClick("mahalle");
        Bekle(2000);
        market.findAndSend("adres", "555 Sokak, Yaz Apartmanı, NO:36 Daire:38");
        market.findAndSend("postaKodu", "36300");
        market.findAndClick("kaydet");
        Bekle(2000);

        market.findAndClick("kaydetveDevam");

        market.findAndSend("adSoyad", "Yağmur Dereli");
        Bekle(2000);
        market.findAndSend("kartNo", "5555444433332222");
        Bekle(2000);
        market.findAndClick("monthDateCard");
        Bekle(2000);
        market.findAndClick("yearDateCard");
        Bekle(2000);
        market.findAndSend("cvvCard", "555");
        Bekle(2000);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_SPACE);
        rbt.keyRelease(KeyEvent.VK_SPACE);
        market.findAndClick("siparisOnay");
        Bekle(2000);
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
