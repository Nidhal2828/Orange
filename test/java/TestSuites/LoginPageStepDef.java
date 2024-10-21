package TestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.PageLoginOrange;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {

    @Given("admin is in login page")
    public void admin_is_in_login_page() {
        Config.confchrome();
        Config.driver = new ChromeDriver();
        Config.maximiseWindow();
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        Config.driver.get(url);
    }

    @When("admin enter correct username {string} and correct password {string}")
    public void admin_enter_correct_username_and_correct_password(String nom, String pwd) throws Exception {
        PageLoginOrange page = new PageLoginOrange();
        page.connect(nom, pwd);
    }

    @Then("admin is directed to the home page")
    public void admin_is_directed_to_the_home_page() {
    	Config.driver.quit();
    }

    @When("admin enter incorrect username {string} and incorrect password {string}")
    public void admin_enter_incorrect_username_and_incorrect_password(String nom, String pwd) throws InterruptedException {
        PageLoginOrange page = new PageLoginOrange();
        page.connect(nom, pwd); 
    }

    @Then("an error message {string} is displayed")
    public void an_error_message_is_displayed(String excpectedText) throws InterruptedException{
    	PageLoginOrange text = new PageLoginOrange();
    	Assert.assertEquals(excpectedText, text.verifcnx());
        
    	Config.driver.quit();
    	  
    }
}
