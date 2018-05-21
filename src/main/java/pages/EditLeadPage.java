package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	
	public EditLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement updatecompanyname;
	public  EditLeadPage editCompanyname(String data) {
	type(updatecompanyname,data);
		return this;		
	}
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement editfirstnamefield;
	public EditLeadPage editFirstName(String data) {
	type(editfirstnamefield,data);
		return this;		
	}
	@FindBy(how=How.ID,using="updateLeadForm_lastName")
	private WebElement editlastnamefield;
	public EditLeadPage editLastName(String data) {
		type(editlastnamefield,data);
		return this;		
	}
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit' and @value='Update']")
	private WebElement submitupdateLead;
	public ViewLeadPage updateLeadLink() {
	click(submitupdateLead);
		return new ViewLeadPage();		
	}
	
	
	
	
	

}
