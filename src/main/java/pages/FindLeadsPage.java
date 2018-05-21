package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	
	public FindLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement SearchLeadId;
	public  FindLeadsPage SearchLeadId(String data) {
	type(SearchLeadId,data);
		return this;		
		
	}
	@FindBy(how=How.XPATH,using="//div[@class='x-form-item x-tab-item']//input[@name='firstName']")
	private WebElement SearchFirstName;
	public  FindLeadsPage SearchFirstName(String data) {
	type(SearchFirstName,data);
		return this;		
		
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-form-item x-tab-item']//input[@name='lastName']")
	private WebElement SearchLastName;
	public  FindLeadsPage Enterlastname(String data) {
	type(SearchLastName,data);
		return this;		
		
	}@FindBy(how=How.XPATH,using="//div[@class='x-form-item x-tab-item']//input[@name='companyName']")
	private WebElement SearchCompanyName;
	public  FindLeadsPage EnterCompanyName(String data) {
	type(SearchCompanyName,data);
		return this;		
		
	}
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement clickEmailTab;
	public  FindLeadsPage clickEmailTab() {
	click(clickEmailTab);
		return this;		
		
	}@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	private WebElement searchEmail;
	public  FindLeadsPage searchEmailAddress(String data) {
	type(searchEmail,data);
		return this;		
		
	}
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-body']//a")
	private WebElement searchlistone;
	public  ViewLeadPage clickSearchListOne() {
	click(clickEmailTab);
	return new ViewLeadPage();
			
	
	}
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-body']//a")
	private WebElement searchlistoneid;
	public  ViewLeadPage getFirstid() {
	//getText(searchlistoneid)
	return new ViewLeadPage();
			
	
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement findLeadbutton;
	public  FindLeadsPage findLeadButton() {
	click(findLeadbutton);
	return this;		
	
	}
	
	
	

}
