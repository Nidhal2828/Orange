package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class PageLoginOrange {
@FindBy(name="username")
WebElement username;
@FindBy(name="password")
WebElement password;
@FindBy(xpath="/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
WebElement btnlogin;
@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
WebElement veriftext;

public PageLoginOrange() {
	PageFactory.initElements(Config.driver, this);

}
public void connect (String name, String pwd) throws InterruptedException {
	Thread.sleep(3000);
	username.sendKeys(name);
	password.sendKeys(pwd);
	btnlogin.click();
}
public String  verifcnx() throws InterruptedException {
	Thread.sleep(3000);
	String actuelTexte = veriftext.getText();
	return actuelTexte;
	
}

}
