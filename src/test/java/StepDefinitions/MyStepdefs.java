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

public class MyStepdefs {
    A101Website market = new A101Website();
    Actions actions = new Actions(GWD.getDriver());
    Robot rbt = new Robot();




    public MyStepdefs() throws AWTException {
    }

    @Given("Go to Website")
    public void goToWebsite()  {


        GWD.getDriver().get("https://www.a101.com.tr/");

        GWD.getDriver().manage().window().maximize();

        GWD.getDriver().manage().deleteAllCookies();

        System.out.println(GWD.getDriver().switchTo().alert().getText());

        market.findAndClick("kabulet");
    }

    @When("Search Giyim Click the Giyim tab")
    public void moveToTheGiyimAksesuarTabAndClickTheDizÇorapTab() throws InterruptedException {



        market.findAndSend("searchArea","giyim");
        market.findAndClick("giyimclick");
        TimeUnit.SECONDS.sleep(2);
        market.findAndClick("kadinicgiyim");
        TimeUnit.SECONDS.sleep(2);
        market.findAndClick("dizaltiCorap");
        TimeUnit.SECONDS.sleep(2);


//       Action aksiyonlar= actions.moveToElement(market.giyim).build();
//
//       aksiyonlar.perform();
//
//       TimeUnit.SECONDS.sleep(3);
//
//       actions.moveToElement(market.dizalticorap).build().perform();
//
//       TimeUnit.SECONDS.sleep(3);
//
//       Action aksiyonlar2=actions.moveToElement(market.dizalticorap).click().build();
//
//       aksiyonlar2.perform();

    }

    @And("Click Black socks")
    public void clickBlackSocks() {

        market.findAndClick("siyahcorap");

        market.findAndContainsText("siyarRenk","Penti Kadın 50 Denye Pantolon Çorabı Siyah");
    }

    @And("Click Sepete Ekle and Sepeti Gor")
    public void clickSepeteEkle() {
        market.findAndClick("sepeteEkle");
        market.findAndClick("sepetiGoruntele");
        market.findAndClick("sepetiOnayla");
        market.findAndClick("uyeOlmadan");

        market.findAndSend("email","okan@gmail.com");

        market.findAndClick("devamEt");


    }

    @Then("Enter the User Data and go to payment page")
    public void enterTheUserData() throws InterruptedException {
        market.findAndClick("yeniAdres");

        market.findAndSend("adresBasligi","Ev Adresi");
        market.findAndSend("firstName","Ozan");
        market.findAndSend("lastName","Karabıyık");
        market.findAndSend("phoneNumber","5554445544");
        TimeUnit.SECONDS.sleep(2);
        market.findAndClick("il");
        TimeUnit.SECONDS.sleep(2);
        market.findAndClick("ilce");
        TimeUnit.SECONDS.sleep(2);
        market.findAndClick("mahalle");
        TimeUnit.SECONDS.sleep(2);
        market.findAndSend("adres","536 Sokak, Yaz Apartmanı, NO:34 Daire:38");
        market.findAndSend("postaKodu","36200");
        market.findAndClick("kaydet");
        TimeUnit.SECONDS.sleep(2);

        market.findAndClick("kaydetveDevam");

        market.findAndSend("adSoyad","Yağmur Dereli");
        TimeUnit.SECONDS.sleep(2);
        market.findAndSend("kartNo","5555444433332222");
        TimeUnit.SECONDS.sleep(2);
        market.findAndClick("monthDateCard");
        TimeUnit.SECONDS.sleep(2);
        market.findAndClick("yearDateCard");
        TimeUnit.SECONDS.sleep(2);
        market.findAndSend("cvvCard","555");
        TimeUnit.SECONDS.sleep(2);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_SPACE);
        rbt.keyRelease(KeyEvent.VK_SPACE);
        market.findAndClick("siparisOnay");
        TimeUnit.SECONDS.sleep(2);

    }

    @And("User should be display succes or not")
    public void userShouldBeDisplaySuccesOrNot() {

        market.findAndContainsText("kartHatasi","Kart bilgilerinizi kontrol ediniz.");
    }
}
