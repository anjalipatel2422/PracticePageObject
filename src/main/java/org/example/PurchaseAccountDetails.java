package org.example;

import org.openqa.selenium.By;

public class PurchaseAccountDetails extends Util{
    private By _ReceiptName=By.xpath("//div[@id=\"content\"]//form[1]/div[1]/div/input[1]");
    private By _ReceiptEmail=By.xpath("//div[@id=\"content\"]//form[1]/div[2]/div/input[1]");
    private By _YourName=By.xpath("//div[@id=\"content\"]//form[1]/div[3]/div/input[1]\t");
    private By _YourEmail=By.xpath("//div[@id=\"content\"]//form[1]/div[4]/div/input[1]");
    private By _BirthdayThem=By.xpath("//div[@class=\"col-sm-10\"]/div[1]/label/input");
    private By _Message=By.xpath("//textarea[@id=\"input-message\"]");
    private By _Amount=By.xpath("//input[@id=\"input-amount\"]");
    private By _CheckBox=By.xpath("//input[@type=\"checkbox\"]");
    private By _ContinueButton=By.xpath("//input[@class=\"btn btn-primary\"]");
    public void VerifyUserEnterPurchaseAGiftDetailAndclickOnContinueButton(){
        typeText(_ReceiptName,"Anil");
        typeText(_ReceiptEmail,"test+"+timestamp()+"@gmail.com");
        typeText(_YourName,"Anilpatel");
        typeText(_YourEmail,"test1+"+timestamp()+"@gmail.com");
        clickonElement(_BirthdayThem);
        typeText(_Message,"hjgghjgh");
        typeText(_Amount,"2000");
        clickonElement(_CheckBox);
        clickonElement(_ContinueButton);
    }
}
