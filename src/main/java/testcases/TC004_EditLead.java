package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit the lead application";
		testNodes="Leads";
		category="Smoke";
		authors="karthik";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void EditLead(String uName,String pwd,String email,String fname) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickcrmsfa()
		.clickLeads()
		.clickFindLEad()
		.clickEmailTab()
		.searchEmailAddress(email)
		.findLeadButton()
		.clickSearchListOne()
		.EditLeadbutton()
		.editFirstName(fname)
		.updateLeadLink();
		
			
	}

}
