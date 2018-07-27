package com.qa.test.PetclinicAssessment_RESTAsssured;

import org.junit.Ignore;
import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Petclinic_RESTAssured {
	
	
	
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
    ExtentTest test;
    ExtentReports report;
    
    @Before
    public void setup() {
    report = new ExtentReports("C:\\Users\\Admin\\Desktop\\mehul\\PetclinicAssessment reports\\Petclinic_RESTAssure_Report.html", true);
    test = report.startTest("Testing");
    }
    
    @After
    public void teardown() {
        report.endTest(test);
        report.flush();
        }
    
	@Test

	public void deletePetClinic() {
        test = report.startTest("Petclinic Delete testing");
        test.log(LogStatus.INFO, "Testing the Delete function");
		request = given().contentType(ContentType.JSON);
		response = request.delete("http://10.0.10.10:9966/petclinic/api/owners/13");
        test.log(LogStatus.PASS, "The Delete function has successfully deleted a owner");
	}
    
	
	@Test
	public void PetClinic_getID() {
        test.log(LogStatus.INFO, "Testing the Delete function");
		request = given().contentType(ContentType.JSON);
		response = request.get("http://10.0.10.10:9966/petclinic/api/owners/2");
		test.log(LogStatus.INFO, "Testing the GET ID function");
		System.out.println("response: "+ response.prettyPrint());
        test.log(LogStatus.PASS, "The Get function using ID has successfully shown an owner");
	}
	
	


}
