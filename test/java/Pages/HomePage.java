package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {

@FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li/a")
               
List<WebElement> menu;
@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")
WebElement verifMenu;

public HomePage() {
	PageFactory.initElements(Config.driver, this);
	
}

public void clikOnMenuByName(String MenuName) throws Exception {
    try {
    	Thread.sleep(3000);
    	for(WebElement menu:menu) {
    	if(menu.getText().contains(MenuName)) {
    	menu.click();
    	}	
    	}
     }catch (Exception e) {
			// TODO: handle exception
		}
    
    }	
	public String verifTitle() throws InterruptedException {
		Thread.sleep(3000);
		String actuelText= verifMenu.getText();
		return actuelText;
		}
}


