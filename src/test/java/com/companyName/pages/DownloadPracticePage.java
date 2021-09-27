package com.companyName.pages;

import com.companyName.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPracticePage {

    public DownloadPracticePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[2]/div/div[1]/p[1]/button")
    public WebElement downloadLink;

    @FindBy(xpath = "//a[@class='btn btn-green']")
    public WebElement approveDownload;
}
