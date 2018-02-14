package MainScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Constant;
import Utility.ExcelUtils;
import Driver_SubClasses.Driver;
public class Driver_Main {


		// TODO Auto-generated method stub

	
	
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			
			
			

			System.setProperty("webdriver.chrome.driver", "F://New folder//chromedriver.exe");	
		//   System.setProperty("webdriver.gecko.driver", "C://Users//kode18//workspace//MyProduct//Driver//geckodriver.exe");

			 WebDriver driver = new ChromeDriver();


		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.get(Constant.Url);
		
	    Thread.sleep(2000);
	    ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Driver");
	    Thread.sleep(2000);
	   Driver.Execute(driver);

	  



//	   driver.quit();
	   
		
		}
		
		
			
		}


