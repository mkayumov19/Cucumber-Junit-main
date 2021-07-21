package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPracticePage {

    public DownloadPracticePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath= "//div[@class='md:w-1/2 bg-white p-8']//button)[1]")
    public WebElement downloadLink;

    @FindBy(xpath = "//a[@class='btn btn-green']")
    public WebElement approveDownload;
}
