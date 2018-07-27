package com.qa.test.PetclinicAssessment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Petclinic_Homepage {
	
    @FindBy(xpath = "/html/body/app-root/div[1]/nav/div/ul/li[2]/a")
    private WebElement ownersTab;

    @FindBy(xpath = "/html/body/app-root/div[1]/nav/div/ul/li[2]/ul/li[1]/a")
    private WebElement allOwners;

    
    public void clickOwnersTab() {
    	ownersTab.click();
    }

    public void ClickAllOwners() {
    	allOwners.click();
    }

}
