package com.qa.test.PetclinicAssessment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Petclinic_EditOwnerPage {
    @FindBy(xpath = "//*[@id=\"telephone\"]")
    private WebElement editphonenumber;
    @FindBy(xpath = "/html/body/app-root/app-owner-edit/div/div/form/div[7]/div/button[2]")
    private WebElement UpdateOwnerButton;
    
    
    public void updateNumber(String phonenumber) {
    	editphonenumber.sendKeys(phonenumber);
    	UpdateOwnerButton.click();
    }
    public void clickUpdateOwnerButton() {
    	UpdateOwnerButton.click();
    }
    
    
    
}
