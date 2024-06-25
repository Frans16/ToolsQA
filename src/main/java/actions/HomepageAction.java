package actions;

import org.openqa.selenium.support.PageFactory;

import locators.Homepage;
import utils.CustomKeywords;
import utils.HelperClass;

public class HomepageAction extends CustomKeywords{
	Homepage homepage = new Homepage();
	
	public HomepageAction() {
		this.homepage = new Homepage();
		PageFactory.initElements(HelperClass.getDriver(), homepage);
	}
	
	public void chooseCard(String cardType) {
		switch (cardType) {
        case "Elements":
            if (isElementPresent(homepage.allCard.get(0))) {
                customClick(homepage.allCard.get(0));
            }
            break;
        case "Forms":
            if (isElementPresent(homepage.allCard.get(1))) {
                customClick(homepage.allCard.get(1));
            }
            break;
        case "Alerts":
            if (isElementPresent(homepage.allCard.get(2))) {
                customClick(homepage.allCard.get(2));
            }
            break;
        case "Widgets":
            if (isElementPresent(homepage.allCard.get(3))) {
                customClick(homepage.allCard.get(3));
            }
            break;
        case "Interactions":
            if (isElementPresent(homepage.allCard.get(4))) {
                customClick(homepage.allCard.get(4));
            }
            break;
        case "Book Store":
            if (isElementPresent(homepage.allCard.get(5))) {
            	customClick(homepage.allCard.get(5));
            }
            break;
        default:
            throw new IllegalArgumentException("Invalid card type: " + cardType);
		}
	}
	
	public void chooseMenu(String menu) {
		switch (menu) {
		case "Text Box":
			homepage.allMenu.get(0).click();
			break;
		case "Check Box":
			homepage.allMenu.get(1).click();
			break;
		case "Radio Button":
			homepage.allMenu.get(2).click();
			break;
		case "Web Tables":
			homepage.allMenu.get(3).click();
			break;
		}
	}
	
}
