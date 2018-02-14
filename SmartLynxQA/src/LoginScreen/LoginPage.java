package LoginScreen;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utility.Constant;




public class LoginPage {

	public static void Login (WebDriver driver) throws Exception{
		
	
	driver.findElement(By.xpath(".//*[@id='Username']")).sendKeys(Constant.UserName);
	driver.findElement(By.xpath(".//*[@id='Password']")).sendKeys(Constant.PassWord);
	
	driver.findElement(By.xpath(".//*[@id='divLogin']/form/div/div[4]/div/button")).click();
	
	
}
}