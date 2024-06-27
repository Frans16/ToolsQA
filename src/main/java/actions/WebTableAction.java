package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import locators.WebTable;
import utils.CustomKeywords;
import utils.HelperClass;

public class WebTableAction extends CustomKeywords{
	WebTable webTable = new WebTable();
	
	public WebTableAction() {
		this.webTable = new WebTable();
		PageFactory.initElements(HelperClass.getDriver(), webTable);
	}
	
	public void clickAddNew() {
		customClick(webTable.buttonAdd);
	}
	
	public void inputFirstName(String firstname) {
		webTable.inputFirstName.sendKeys(firstname);
	}
	
	public void inputLastName(String lastName) {
		webTable.inputLastName.sendKeys(lastName);
	}
	
	public void inputEmail(String email) {
		webTable.inputEmail.sendKeys(email);
	}
	
	public void inputAge(String age) {
		webTable.inputAge.sendKeys(age);
	}
	
	public void inputSalary(String salary) {
		webTable.inputSalary.sendKeys(salary);
	}
	
	public void inputDepartment(String department) {
		webTable.inputDepartment.sendKeys(department);
	}
	
	public void clickSubmit() {
		customClick(webTable.buttonSubmit);
	}
	
	public void deleteRowByName(String name) throws InterruptedException {
        for (WebElement row : webTable.allRow) {
            List<WebElement> cells = row.findElements(By.className("rt-td"));
            String rowName = cells.get(0).getText();  // Assuming the first cell contains the name
            if (rowName.equals(name)) {
                // Click the delete button for this row
            	Thread.sleep(2000);
                WebElement deleteButton = row.findElement(By.xpath("//span[@title='Delete']"));
                moveToElement(deleteButton);
                customClick(deleteButton);
                break;  // Exit the loop after deleting the row
            }
        }
    }
}
