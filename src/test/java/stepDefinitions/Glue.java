package stepDefinitions;

import actions.HomepageAction;
import actions.WebTableAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.HelperClass;

public class Glue {
	
	String firstname = "Frans";
	String lastName = "Marbun";
	String email = "frans@test.com";
	String age = "26";
	String salary = "10";
	String department = "QA";
	
	HomepageAction homepageAction = new HomepageAction();
	WebTableAction webTableAction = new WebTableAction();
	
	@Given("User is on demo qa site {string}")
	public void user_is_on_demo_qa_site(String siteUrl) {
	    HelperClass.openPage(siteUrl);
	}
	@When("User chooses {string} card")
	public void user_chooses_card(String card) {
	    homepageAction.chooseCard(card);
	}

	@When("User enters {string} menu")
	public void user_enters_web_tables_menu(String menu) {
	    homepageAction.chooseMenu(menu);
	}
	@When("User adds new user")
	public void user_adds_new_user() {
	    webTableAction.clickAddNew();
	    webTableAction.inputFirstName(firstname);
	    webTableAction.inputLastName(lastName);
	    webTableAction.inputEmail(email);
	    webTableAction.inputAge(age);
	    webTableAction.inputSalary(salary);
	    webTableAction.inputDepartment(department);
	    webTableAction.clickSubmit();
	}
	@When("User deletes a newly added user")
	public void user_deletes_a_newly_added_user() throws InterruptedException {
	    webTableAction.deleteRowByName(firstname);
	}
	@Then("User successfully performs actions on the web table page")
	public void user_successfully_performs_actions_on_the_web_table_page() {
	    System.out.println("Success");
	}
}
