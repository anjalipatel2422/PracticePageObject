package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestSuit extends BaseTest{
    HomePage homePage=new HomePage();
    CategoryPhones categoryPhones=new CategoryPhones();
    CartSuccessMessage cartSuccessMessage=new CartSuccessMessage();
    CategoryCamara categoryCamara=new CategoryCamara();
    PurchaseAccountDetails purchaseAccountDetails=new PurchaseAccountDetails();
    PurchaseAmountSuccess purchaseAmountSuccess=new PurchaseAmountSuccess();

    @Test
    public void UseShouldBeAbleToAddProducToBasketSuccessfully() {
        // to verify user is on Home page
        homePage.VerifyUserIsOnHomePage();
        //to verify user click on Phone&PDAs
        homePage.VerifyuserClickonPhoneAndPDAs();
        // to verify user add Both (HTC & iphone product to be add) product in to cart
        categoryPhones.VerifyUserAddBothHTCiphoneProductToBeAddProductInToCart();
        // to verify user can able to click on shopping cart button
        categoryPhones.VerifyUserCanAbleToClickOnShoppingCartButton();
        // to verify that user can see two product in shopping cart
        cartSuccessMessage.VerifyUserSeeTwoProductInShoppingCart();
    }

    @Test
  public void verifyeachproducthavename(){//in class practice
        List<WebElement> productlist = driver.findElements(By.xpath("//div[contains(@class,\"product\")]/div[2]/div/div/div[2]/h2/a"));
      System.out.println(productlist.size());
      //get each product name
       for (WebElement product:productlist
      ) {
           System.out.println(product.getText());
       }}}


