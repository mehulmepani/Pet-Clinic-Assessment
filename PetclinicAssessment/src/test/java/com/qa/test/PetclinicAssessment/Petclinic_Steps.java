package com.qa.test.PetclinicAssessment;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertEquals;

import java.security.acl.Owner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




import org.openqa.selenium.support.PageFactory;

public class Petclinic_Steps {
	
    WebElement element;
    WebDriver driver;
    ExtentTest test;
    ExtentReports report;
    
    
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
        driver = new ChromeDriver();
        report = new ExtentReports("C:\\Users\\Admin\\Desktop\\mehul\\PetclinicAssessment reports\\Petclinic_Report.html", true);
        test = report.startTest("Testing");
        driver.manage().window().maximize();
    }
    
    @After
    public void teardown() {
        report.endTest(test);
        report.flush();
        driver.quit();
    }
	
	
	
	@Given("^The correct website$")
	public void the_correct_website() {
		driver.get(Constant.websiteURL);
        test = report.startTest("PetClinic Testing");
        test.log(LogStatus.INFO, "Browser started");
        assertEquals("http://10.0.10.10:4200/petclinic/", Constant.websiteURL);
        test.log(LogStatus.PASS, "On the Home page Successfully");
	}

	@When("^I navigate to the 'owners' tab$")
	public void i_navigate_to_the_owners_tab() {
		Petclinic_Homepage clickOwner = PageFactory.initElements(driver, Petclinic_Homepage.class);
		clickOwner.clickOwnersTab();
        test.log(LogStatus.PASS, "Successfully clicked the owners tab");
	}

	@When("^then the 'all' Tab$")
	public void then_the_all_Tab() {
		Petclinic_Homepage clickAllOwner = PageFactory.initElements(driver, Petclinic_Homepage.class);
		clickAllOwner.ClickAllOwners();
        test.log(LogStatus.PASS, "Successfully clicked the all Owners button");
	}

	
	@Then("^I can click on 'George Franklin' to update his information$")
	public void i_can_click_on_George_Franklin_to_update_his_information() {
		Petclinic_OwnersPage ClickOnOwner = PageFactory.initElements(driver, Petclinic_OwnersPage.class);
		ClickOnOwner.clickOwner();
        test.log(LogStatus.PASS, "Successfully clicked the owner'George Franklin'");
	}

	@Then("^then click edit owner$")
	public void then_click_edit_owner() {
		Petclinic_OwnerInfoPage clickEditOwner = PageFactory.initElements(driver, Petclinic_OwnerInfoPage.class);
		clickEditOwner.clickGeorge();
		test.log(LogStatus.PASS, "Successfully clicked the edit owner button");
	}

	@Then("^I update the owners phonenumber$")
	public void i_update_the_owners_phonenumber() {
		Petclinic_EditOwnerPage changePhoneNumber = PageFactory.initElements(driver,Petclinic_EditOwnerPage.class);
		changePhoneNumber.updateNumber("1234567890");
		test.log(LogStatus.PASS, "Successfully entered new phone number");
	}

	@Then("^click update owner$")
	public void click_update_owner() {
		Petclinic_EditOwnerPage clickUpdateOwner = PageFactory.initElements(driver,Petclinic_EditOwnerPage.class);
		clickUpdateOwner.clickUpdateOwnerButton();
		test.log(LogStatus.PASS, "Successfully clicked the update owner button");
	}

	@Then("^check that the owners information is updated$")
	public void check_that_the_owners_information_is_updated() {
		Petclinic_OwnerInfoPage checkNumber = PageFactory.initElements(driver, Petclinic_OwnerInfoPage.class);
        assertEquals("1234567890",checkNumber.checknumber());
        test.log(LogStatus.PASS, "Phone number has successfully been changed");
	}

}
