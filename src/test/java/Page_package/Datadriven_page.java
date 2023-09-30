package Page_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Datadriven_page {
	WebDriver driver;
	By uusername=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	By upassword=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By ulogin=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	public Datadriven_page(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String username,String password)
	{
		driver.findElement(uusername).clear();
		driver.findElement(uusername).sendKeys(username);
		driver.findElement(upassword).clear();
		driver.findElement(upassword).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(ulogin).click();
	}


}
