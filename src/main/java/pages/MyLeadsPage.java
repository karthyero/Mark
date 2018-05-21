package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//a[text()='Create Lead']")
	private WebElement ClickCreateLEad;
	@And("Click create lead link")
	public CreateLeadPage clickCreateLEad() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(ClickCreateLEad);
		return new CreateLeadPage();		
	
	}
	@FindBy(how=How.XPATH,using="//a[text()='Find Leads']")
	private WebElement clickFindLEad;
	@And("Click FindLeads link")
	public FindLeadsPage clickFindLEad() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(clickFindLEad);
		return new FindLeadsPage();		
	}
	
	
	}
	
	
	
