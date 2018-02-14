package MainScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Customer_Subclasses.Customer;
import Utility.Constant;
import Utility.ExcelUtils;

public class Customer_Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://New folder//chromedriver.exe");	
		//   System.setProperty("webdriver.gecko.driver", "C://Users//kode18//workspace//MyProduct//Driver//geckodriver.exe");

			 WebDriver driver = new ChromeDriver();


		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.get(Constant.Url);
		
        Thread.sleep(2000);
        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Customer");
        Thread.sleep(2000);
       Customer.Execute(driver);

	}

}
