package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CartSuccessMessage extends Util{
    private By _HTCSuccessText=By.xpath("//div[@class=\"table-responsive\"]/table/tbody/tr[1]/td[2]/a");
    private  By _iPhoneSuccessText=By.xpath("//div[@class=\"table-responsive\"]/table/tbody/tr[2]/td[2]/a");
    String _ExpextedSuccessText="\tHTC Touch HD";//write success message
    String _ExpectedSuccessText1="\tiPhone";
    public void VerifyUserSeeTwoProductInShoppingCart(){
        Assert.assertEquals(getText1(_HTCSuccessText),_ExpextedSuccessText);
        Assert.assertEquals(getText1(_iPhoneSuccessText),_ExpectedSuccessText1);
    }

}
