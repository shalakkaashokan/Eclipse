package Test_package;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base_package.Base_class;
import Page_package.Datadriven_page;
import Page_package.FileUpload;
import Page_package.Mousehoverclass;
import Utilities.Excel_utility;

public class Datadriven_Test extends Base_class {
	@Test
	public void verifyLoginWithValidCred() throws AWTException, InterruptedException,IOException
	{
		Datadriven_page p1=new Datadriven_page(driver);
		String xl="C:\\Users\\hp\\Desktop\\selenium\\Book5.xlsx";
		String sheet="Sheet1";
		int rowcount= Excel_utility.getRowCount(xl,sheet);
		for(int i=1;i<=rowcount;i++)
		{
			String username= Excel_utility.getCellValue(xl, sheet,i,0);
			System.out.println("username:"+username);
			String password= Excel_utility.getCellValue(xl, sheet,i,1);
			System.out.println("password:"+password);
			p1.setvalues(username, password);
			p1.login();
			
		}
				
	
	FileUpload fu=new FileUpload(driver);
	fu.file();
	driver.navigate().refresh();
	fu.fileUpload("C:\\Users\\hp\\Desktop\\selenium\\test.pdf");
	Thread.sleep(5000);
	
	
	Thread.sleep(3000);
	Mousehoverclass mh=new Mousehoverclass(driver);
	mh.clickcomp();
	Thread.sleep(3000);
	WebElement org=mh.hover();
	Actions act=new Actions(driver);
	act.moveToElement(org);
	act.perform();
	Thread.sleep(3000);
	act.perform();
	Thread.sleep(3000);
	
	}

}
