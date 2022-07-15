package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeGamesPage extends Utility {

    private static final Logger log = LogManager.getLogger(FreeGamesPage.class.getName());

    public FreeGamesPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h2[text()='Virgin Games Daily Free Games']")
    WebElement dailyFreeGameText;


    public String getDailyFreeGameText(){
        log.info("Getting Daily Free Game Text "+dailyFreeGameText.toString());
        return getTextFromElement(dailyFreeGameText);
    }
}
