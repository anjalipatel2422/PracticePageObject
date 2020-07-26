package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.example.BasePage.driver;

public class BrowserManager extends Util{
    public void setupBrowser(){
    //setting up chromedriver path
        System.setProperty("webdriver.chrome.driver", "src\\test\\BrowserDriver\\chromedriver.exe");

    //creating chromdriver object to open google chrome browser
        driver = new ChromeDriver();
    //maximising screen
        driver.manage().window().maximize();
    //applying implicity wait of 30 sec to the driver instance
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    //open url
        driver.get("http://tutorialsninja.com/demo/");
}

    public  void closeBrowser() {
        driver.close();
    } //reusable method to close browser

}



