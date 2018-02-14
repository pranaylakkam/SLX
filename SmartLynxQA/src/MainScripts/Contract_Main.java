package MainScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import ContractFunctionalities.Contract;
import Customer_Subclasses.Customer;
import Utility.Constant;
import Utility.ExcelUtils;

public class Contract_Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://New folder//chromedriver.exe");	
		//   System.setProperty("webdriver.gecko.driver", "C://Users//kode18//workspace//MyProduct//Driver//geckodriver.exe");

		//	 WebDriver driver = new ChromeDriver();
			 
				ChromeOptions options = new ChromeOptions();
				 
				 options.addArguments("--start-maximized");
				 options.addArguments("--disable-web-security");
				 options.addArguments("--no-proxy-server");
				 Map<String, Object> prefs = new HashMap<String, Object>();
				 prefs.put("profile.default_content_setting_values.notifications", 2);
				 prefs.put("credentials_enable_service", false);
				 prefs.put("profile.password_manager_enabled", false);
				 options.setExperimentalOption("prefs", prefs);
				 options.addArguments("disable-infobars");

				 Thread.sleep(3000);
				 
				 WebDriver driver = new ChromeDriver(options);



		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.get(Constant.Url);
		
        Thread.sleep(2000);
        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
        Thread.sleep(2000);
       Contract.Execute(driver);

	}

}
