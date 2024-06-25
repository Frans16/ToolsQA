package locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage{
	@FindBy(xpath = "//div[@class='card-body']/h5")
	public List<WebElement>allCard;
	
	@FindBy(xpath = "//ul[@class='menu-list']/li[contains(@id,'item')]")
	public List<WebElement>allMenu;
}
