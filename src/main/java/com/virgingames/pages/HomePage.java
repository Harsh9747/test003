package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Accept')]")
    WebElement cookies;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[6]/a[1]")
    WebElement freeGamesLink;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='Virgin Games Daily Free Games']")
    WebElement dailyFreeGameText;

    public void clickOnCookies(){
        clickOnElement(cookies);
        log.info("Clicking on cookies "+ cookies.toString());
    }

    public void clickOnFreeGamesLink(){
        clickOnElement(freeGamesLink);
        log.info("Clicking on Free Games Link "+ freeGamesLink.toString());
    }
    public String getDailyFreeGameText(){
        log.info("Getting Daily Free Game Text "+dailyFreeGameText.toString());
        return getTextFromElement(dailyFreeGameText);
    }
}
