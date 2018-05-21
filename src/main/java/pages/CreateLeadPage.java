package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	
	public CreateLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement companyname;
	 @And("enter the company name as (.*)")
	public  CreateLeadPage enterCompanyname(String data) {
	type(companyname,data);
		return this;		
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement firstnamefield;
	@And("enter the firstname as (.*)")
	public CreateLeadPage enterFirstName(String data) {
	type(firstnamefield,data);
		return this;		
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement lastnamefield;
	@And("enter the lastname as (.*)")
	public CreateLeadPage enterLastName(String data) {
		type(lastnamefield,data);
		return this;		
	}
	@FindBy(how=How.XPATH,using="//input[@name='submitButton']")
	private WebElement submitCreateLead;
	@And("click lead link")
	public ViewLeadPage clickLeadLink() {
	click(submitCreateLead);
		return new ViewLeadPage();		
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement emailfield;
	@And("enter the email as (.*)")
	public CreateLeadPage enterEmail(String data) {
		type(emailfield,data);
		return this;		
	}
	
	
	
	
	

}
