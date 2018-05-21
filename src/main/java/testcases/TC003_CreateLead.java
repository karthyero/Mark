package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Submitting the lead application";
		testNodes="Leads";
		category="Smoke";
		authors="karthik";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void createlead(String uName,String pwd,String cpyName,String fname,String lname,String email) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickcrmsfa()
		.clickLeads()
		.clickCreateLEad()
		.enterCompanyname(cpyName)
		.enterFirstName(fname)
		.enterLastName(lname)
		.enterEmail(email)
		.clickLeadLink()
		.verifyFirstName(fname)	;		
	}

}
