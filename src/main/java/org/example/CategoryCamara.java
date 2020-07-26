package org.example;

import org.openqa.selenium.By;

public class CategoryCamara extends Util{
    private By _NikonAddToCart=By.xpath("//div[@class=\"row\"]/div[2]/div/div[2]/div[2]/button[1]/span");
    private By _NikonWishList=By.xpath("div[@class=\"row\"]/div[2]/div/div[2]/div[2]/button[2]");
    private By _NikonCompare=By.xpath("div[@class=\"row\"]/div[2]/div/div[2]/div[2]/button[3]");
    public void VerifyUserclickonAllButtonsOfNikon300(){
        clickonElement(_NikonAddToCart);
        clickonElement(_NikonWishList);
        clickonElement(_NikonCompare);
    }
}
