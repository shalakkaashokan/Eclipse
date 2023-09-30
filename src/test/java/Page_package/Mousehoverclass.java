package Page_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mousehoverclass {
	WebDriver driver;
	By admin=By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])");
	By org=By.xpath("(//li[@class='oxd-topbar-body-nav-tab --parent'])[2]");
	By loc=By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[2]");
	public Mousehoverclass(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void clickcomp() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(admin).click();
		Thread.sleep(3000);
		driver.findElement(org).click();
		Thread.sleep(3000);
		driver.findElement(loc).click();
	}
	
	public WebElement hover()
	{
		return driver.findElement(org);
	}

}
