package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;


public class PurchaseAmountSuccess extends Util
{
    private By _SuccessMessage=By.xpath("//div[@id=\"content\"]/p");
    String _ExpectedSuccessMessage="Thank you for purchasing a gift certificate! Once you have completed your order your gift certificate recipient will be sent an e-mail with details how to redeem their gift certificate.";

    public void VerifyUserSeeSuccessMessageSuccessfully(){
        Assert.assertEquals(getText1(_SuccessMessage),_ExpectedSuccessMessage);
    }
}
