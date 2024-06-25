package locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTable {
	
	@FindBy(xpath = "//button[@id='addNewRecordButton']")
	public WebElement buttonAdd;
	
	@FindBy(xpath = "//input[@id='firstName']")
	public WebElement inputFirstName;
	
	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement inputLastName;
	
	@FindBy(xpath = "//input[@id='userEmail']")
	public WebElement inputEmail;
	
	@FindBy(xpath = "//input[@id='age']")
	public WebElement inputAge;
	
	@FindBy(xpath = "//input[@id='salary']")
	public WebElement inputSalary;
	
	@FindBy(xpath = "//input[@id='department']")
	public WebElement inputDepartment;
	
	@FindBy(xpath = "//button[@id='submit']")
	public WebElement buttonSubmit;
	
	@FindBy(xpath = "//div[@class='rt-tr-group']")
    public List<WebElement> allRow;
}
