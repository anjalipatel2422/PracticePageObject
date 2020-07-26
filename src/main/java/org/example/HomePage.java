package org.example;

import org.openqa.selenium.By;

public class HomePage extends Util {
    private By _yourstore= By.xpath("//a[text()=\"Your Store\"]");//path of your store
    private By _PhonesandPDAs=By.xpath("//a[text()=\"Phones & PDAs\"]");//path of phone
    private By _Camaras=By.xpath("//a[text()=\"Cameras\"]");//path of cameras
    private By _GiftCertificate= By.linkText("Gift Certificates");
    public void VerifyUserIsOnHomePage(){
        clickonElement(_yourstore);
    }
    public void VerifyuserClickonPhoneAndPDAs(){
        clickonElement(_PhonesandPDAs);
    }
    public void VerifyUserClickOnCamara(){
        clickonElement(_Camaras);

    }public void VerifyUserClickOnGiftCertificate(){
        clickonElement(_GiftCertificate);
    }
}
