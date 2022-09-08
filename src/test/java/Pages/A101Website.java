package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A101Website extends Parent{

    public A101Website() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@name='search_text'])[1]")
    private WebElement searchArea;

    @FindBy(xpath = "//button[text()='Kabul Et']")
    private WebElement kabulet;

    @FindBy(xpath = "//a[@href='/giyim-aksesuar/kadin-ic-giyim/?recommended_by=instant_search&recommended_code=giyim']")
    private WebElement kadinicgiyim;

    @FindBy(xpath = "//a[@href='/giyim-aksesuar/dizalti-corap/?recommended_by=instant_search&recommended_code=giyim']")
    private WebElement dizaltiCorap;

    @FindBy(xpath = "(//h3[@class='name'])[1]")
    private WebElement siyahcorap;

    @FindBy(xpath = "//h1[text()='Penti Kadın 50 Denye Pantolon Çorabı Siyah']")
    private WebElement siyarRenk;

    @FindBy(xpath = "//button[@data-pk='18864']")
    private WebElement sepeteEkle;

    @FindBy(xpath = "(//a[text()='Sepeti Görüntüle'])[2]")
    private WebElement sepetiGoruntele;

    @FindBy(xpath = "(//a[@title='Sepeti Onayla'])[2]")
    private WebElement sepetiOnayla;

    @FindBy(xpath = "//a[@title='ÜYE OLMADAN DEVAM ET']")
    private WebElement uyeOlmadan;

    @FindBy(xpath = "//div/input[@name='user_email']")
    private WebElement email;

    @FindBy(xpath = "//button[@class='button block green']")
    private WebElement devamEt;

    @FindBy(xpath = "(//a[@title='Yeni adres oluştur'])[1]")
    private WebElement yeniAdres;

    @FindBy(xpath = "//input[@name='title']")
    private WebElement adresBasligi;

    @FindBy(name = "first_name")
    private WebElement firstName;

    @FindBy(name = "last_name")
    private WebElement lastName;

    @FindBy(name = "phone_number")
    private WebElement phoneNumber;

    @FindBy(css = "option[value='40']")
    private WebElement il;

    @FindBy(css = "option[value='468']")
    private WebElement ilce;

    @FindBy(css = "option[value='35891']")
    private WebElement mahalle;

    @FindBy(css = "textarea[name='line']")
    private WebElement adres;

    @FindBy(css = "input[name='postcode']")
    private WebElement postaKodu;


    @FindBy(xpath = "(//button[@type='button'])[6]")
    private WebElement kaydet;

    @FindBy(xpath = "//button[@class='button block green js-proceed-button']")
    private WebElement kaydetveDevam;

    @FindBy(xpath = "(//input[@name='name'])[2]")
    private WebElement adSoyad;

    @FindBy(xpath = "(//label/input[@type='tel'])[3]")
    private WebElement kartNo;

    @FindBy(xpath = "(//select[@name='card_month']/option[@value='12'])[2]")
    private WebElement monthDateCard;

    @FindBy(xpath = "(//select[@name='card_year']/option[@value='2026'])[2]")
    private WebElement yearDateCard;

    @FindBy(xpath = "(//label/input[@type='tel' or  @name='card_cvv'])[4]")
    private WebElement cvvCard;


//    @FindBy(xpath = "(//div[@class='checkbox']/label)[2]")
//    private WebElement onKosulOnay;

    @FindBy(xpath = "(//button[@type='submit']/span)[4]")
    private WebElement siparisOnay;

    @FindBy(xpath = "//div[text()='Kart bilgilerinizi kontrol ediniz.']")
    private WebElement kartHatasi;


    WebElement myElement;


    public void findAndClick(String strElement){

        switch (strElement){
            case "kabulet" : myElement=kabulet;break;
            case "kadinicgiyim": myElement=kadinicgiyim; break;
            case "dizaltiCorap": myElement=dizaltiCorap; break;
            case "sepeteEkle" : myElement=sepeteEkle;break;
            case "sepetiGoruntele": myElement=sepetiGoruntele;break;
            case "sepetiOnayla": myElement=sepetiOnayla;break;
            case "uyeOlmadan": myElement=uyeOlmadan;break;
            case "yeniAdres": myElement=yeniAdres;break;
            case "il": myElement=il;break;
            case "ilce": myElement=ilce;break;
            case "mahalle": myElement=mahalle;break;
            case "kaydet": myElement=kaydet;break;
            case "siyahcorap": myElement=siyahcorap;break;
            case "devamEt": myElement=devamEt;break;
            case "kaydetveDevam": myElement=kaydetveDevam;break;
            case "monthDateCard": myElement=monthDateCard;break;
            case "yearDateCard": myElement=yearDateCard;break;
//            case "onKosulOnay": myElement=onKosulOnay;break;
            case "siparisOnay": myElement=siparisOnay;break;

        }
        clickFunction(myElement);

    }

    public void findAndSend(String strElement,String value){
        switch (strElement){
            case "searchArea": myElement=searchArea; break;
            case "email": myElement=email;break;
            case "adresBasligi": myElement=adresBasligi;break;
            case "firstName": myElement=firstName;break;
            case "lastName": myElement=lastName;break;
            case "phoneNumber": myElement=phoneNumber;break;
            case "adres": myElement=adres;break;
            case "postaKodu": myElement=postaKodu;break;
            case "adSoyad": myElement=adSoyad;break;
            case "kartNo": myElement=kartNo;break;
            case "cvvCard": myElement=cvvCard;break;

        }
        sendKeysFunction(myElement,value);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "siyarRenk" : myElement =siyarRenk; break;
            case "kartHatasi": myElement=kartHatasi;break;
        }

        verifyContainsText(myElement,text);
    }




}
