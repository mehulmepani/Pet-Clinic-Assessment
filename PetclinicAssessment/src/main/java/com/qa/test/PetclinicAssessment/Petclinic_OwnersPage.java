package com.qa.test.PetclinicAssessment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Petclinic_OwnersPage {
    @FindBy(xpath = "/html/body/app-root/app-owner-list/div/div/div/table/tbody/tr[1]/td[1]/a")
    private WebElement Owner_George;
	

    public void clickOwner() {
    	Owner_George.click();
    }

}
