package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement viewFirstName;
	@And("enter the verify firstname as (.*)")
	public  ViewLeadPage verifyFirstName(String data) {
	verifyExactText(viewFirstName, data);
		return this;		
		
	}
	@FindBy(how=How.XPATH,using="//a[@class='subMenuButton'and text()='Duplicate Lead']")
	private WebElement DuplicateLead;
	@And("Click Duplicate lead")
	public  ViewLeadPage duplicateLeadbutton(String data) {
	verifyExactText(DuplicateLead, data);
		return this;		
		
	}
	@FindBy(how=How.XPATH,using="//a[@class='subMenuButton'and text()='Qualify Lead']")
	private WebElement QualifyLead;
	@And("Click qualify lead")
	public  ViewLeadPage qualifyLeadbutton() {
	click(QualifyLead);
	return this;		
		
	}
	@FindBy(how=How.XPATH,using="//a[@class='subMenuButton'and text()='Edit']")
	private WebElement EditLead;
	@And("Click Edit Lead")
	public  EditLeadPage EditLeadbutton() {
	click(EditLead);;
	return new EditLeadPage();		
		
	}
	@FindBy(how=How.XPATH,using="//a[@class='subMenuButtonDangerous'and text()='Delete']")
	private WebElement DeleteLead;
	@And("Click delete lead")
	public  ViewLeadPage deleteLeadbutton() {
	click(DeleteLead);
	return this;		
		
	}
}
	

