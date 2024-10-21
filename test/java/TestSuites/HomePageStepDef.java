package TestSuites;

import org.junit.Assert;

import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {
	

	@When("utilisateur clique sur le {string}")
	public void utilisateur_clique_sur_le(String menuName) throws Exception {
		HomePage menu = new HomePage();
		menu.clikOnMenuByName(menuName);
		
	    
	}

	@Then("la page du menu est affiche qui contient le nom du {string}")
	public void la_page_du_menu_est_affiche_qui_contient_le_nom_du(String expectedText) throws InterruptedException {
		HomePage page = new HomePage();
		Assert.assertEquals(expectedText, page.verifTitle());
          Config.driver.quit();
	    
	}

}
