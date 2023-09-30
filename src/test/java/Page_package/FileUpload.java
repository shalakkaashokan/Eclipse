package Page_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUpload {
	WebDriver driver;

	By myinfo=By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]");
	By add=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--text']");
	By browse=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/div[1]");

	
	public FileUpload(WebDriver driver)
	{
		this.driver=driver;
	}
	public void file() throws InterruptedException
	{
	Thread.sleep(3000);
		
		
		driver.findElement(myinfo).click();
		Thread.sleep(3000);
		driver.findElement(add).click();
		driver.findElement(browse).click();
	
	}
	public void fileUpload(String f)throws AWTException{
		StringSelection strSelection=new StringSelection(f);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	
}
