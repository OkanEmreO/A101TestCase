package WithSelenium;

import Pages.A101Selenium;
import Utilities.GWD;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.Test;



import java.awt.*;
import java.awt.event.KeyEvent;


public class A101Test extends GWD {


    @Test
    public void test() throws AWTException, InterruptedException {

        A101Selenium a101 = new A101Selenium();
        Robot rbt = new Robot();

        GWD.getDriver().get("https://www.a101.com.tr/");

        GWD.getDriver().manage().window().maximize();

        GWD.getDriver().manage().deleteAllCookies();

        Bekleme(1);
        System.out.println("Çerezler Kabul edildi");
        a101.findAndClick("kabulet");

        System.out.println("Arama kısmına gidildi ve giyim aratıldı");
        a101.findAndSend("searchArea", "giyim");

        System.out.println("Çıkan alt sekmelerden giyim menüsü secildi");
        a101.findAndClick("giyimclick");
        Bekleme(1);
        System.out.println("Kadın Giyim secildi");
        a101.findAndClick("kadinicgiyim");
        Bekleme(1);
        System.out.println("Diz altı corap secildi");
        a101.findAndClick("dizaltiCorap");
        Bekleme(2);

        System.out.println("Siyah corap Secildi");
        a101.findAndClick("siyahcorap");

        System.out.println("Siyah renk diz altı corap olduğu doğrulandı");
        a101.findAndContainsText("siyarRenk", "Penti Kadın 50 Denye Pantolon Çorabı Siyah");

        System.out.println("Sepete eklendi");
        a101.findAndClick("sepeteEkle");

        System.out.println("Sepet görüntülendi");
        a101.findAndClick("sepetiGoruntele");
        System.out.println("Sepet onaylandı");
        a101.findAndClick("sepetiOnayla");
        System.out.println("Üye olmadan Devam edildi");
        a101.findAndClick("uyeOlmadan");
        System.out.println("Mail adresi girildi");
        a101.findAndSend("email", "okan@gmail.com");
        System.out.println("Devam et butonunan tıklatıldı");
        a101.findAndClick("devamEt");
        System.out.println("Yeni address butonuna tıklatılarak adress ekleme kısmı açıldı");
        a101.findAndClick("yeniAdres");
        System.out.println("Address Kısmı girildi");
        a101.findAndSend("adresBasligi", "Ev Adresi");
        System.out.println("İsim girildi");
        a101.findAndSend("firstName", "Aren");
        System.out.println("Soyad girildi");
        a101.findAndSend("lastName", "Yıldız");
        System.out.println("Telefon girildi");
        a101.findAndSend("phoneNumber", "5555555555");
        Bekleme(1);
        System.out.println("Yaşadığı il seçildi");
        a101.findAndClick("il");
        Bekleme(1);
        System.out.println("Yaşadığı ilce seçildi");
        a101.findAndClick("ilce");
        Bekleme(1);
        System.out.println("Yaşadığı mahallet seçildi");
        a101.findAndClick("mahalle");
        Bekleme(1);
        System.out.println("Address detaylı olarak yazıldı");
        a101.findAndSend("adres", "566 Sokak, Yaz Apartmanı, NO:56 Daire:98");
//        market.findAndSend("postaKodu", "36300"); // Siteden kaldırılan alan
        System.out.println("Kaydedildi");
        a101.findAndClick("kaydet");
        Bekleme(2);
        System.out.println("Kayıtlı addres seçilerek devam edildi");
        a101.findAndClick("kaydetveDevam");
        System.out.println("Kart Sahibinin adı ve Soyadı girildi");
        a101.findAndSend("adSoyad", "Yağmur Dereli");
        Bekleme(1);
        System.out.println("16 haneli kart numarası girildi");
        a101.findAndSend("kartNo", "5555444433332222");
        Bekleme(1);
        System.out.println("Kart'ın son kullanım ayı girildi");
        a101.findAndClick("monthDateCard");
        Bekleme(1);
        System.out.println("Kart'ın son kullanım yılı girildi");
        a101.findAndClick("yearDateCard");
        Bekleme(1);
        System.out.println("Arka tarafında bulunan CVV numarası girildi");
        a101.findAndSend("cvvCard", "555");
        Bekleme(1);
        System.out.println("Robot Class kullarak işaretlenecek tik işareti bulundu ve işaretlendi");
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_SPACE);
        rbt.keyRelease(KeyEvent.VK_SPACE);
        System.out.println("Sipariş onaylandı");
        a101.findAndClick("siparisOnay");
        Bekleme(1);
        System.out.println("Geçersiz kart bilgileri kullandığımız için işlem reddedildi");
        a101.findAndContainsText("kartHatasi", "Kart bilgilerinizi kontrol ediniz.");

        GWD.quitDriver();

    }
}
