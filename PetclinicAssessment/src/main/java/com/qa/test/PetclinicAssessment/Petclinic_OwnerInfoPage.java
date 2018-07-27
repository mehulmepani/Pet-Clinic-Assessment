package com.qa.test.PetclinicAssessment;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Petclinic_OwnerInfoPage {
    @FindBy(xpath = "/html/body/app-root/app-owner-detail/div/div/button[2]")
    private WebElement EditOwner;
    @FindBy(xpath = "/html/body/app-root/app-owner-detail/div/div/table[1]/tbody/tr[4]/td")
    private WebElement ownerPhoneNumber;
    
    
    public void clickGeorge() {
    	EditOwner.click();
    }
    public String checknumber() {
    	return ownerPhoneNumber.getText();
    }
    

    
}
