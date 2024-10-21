package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.PageLoginOrange;
import io.cucumber.java.en.Given;

public class CommunStepDef {
	@Given("utilisateur est connecte avec le bon username {string} et le bon password {string}")
	public void utilisateur_est_connecte_avec_le_bon_username_et_le_bon_password(String username, String pwd) throws InterruptedException {
		Config.confchrome();
        Config.driver = new ChromeDriver();
        Config.maximiseWindow();
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        Config.driver.get(url);
        PageLoginOrange page = new PageLoginOrange();
	    page.connect(username, pwd);

	    
	}
}
