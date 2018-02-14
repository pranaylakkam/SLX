package MainScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ProductCategory_SubClasses.ProductCategory;
import Utility.Constant;
import Utility.ExcelUtils;

public class ProductCategory_Main {

	public static void main(String[] args) throws Exception {
	
		
	
		 
	
			
			
			
			System.setProperty("webdriver.chrome.driver", "F://New folder//chromedriver.exe");	
		//   System.setProperty("webdriver.gecko.driver", "C://Users//kode18//workspace//MyProduct//Driver//geckodriver.exe");

			 WebDriver driver = new ChromeDriver();



		driver.get(Constant.Url);
		
        Thread.sleep(2000);
        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"ProductCategory");
        Thread.sleep(2000);
        ProductCategory.Execute(driver);
 
  
 

 
      ///  driver.quit();
 
      
 

 
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


