package ContractFunctionalities;

import javax.swing.plaf.basic.BasicTreeUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class ContractEdit {
	
	
	private static MouseHandler Mouse = null;
	private static WebElement Number = null;
	private static WebElement Edit_Button= null;
	//private static WebElement  ErrorMessage= null;
	private static WebElement  Edit_BeginDateclick= null;
	private static WebElement  BeginDate= null;
	private static WebElement ExpirationDate= null;
	private static WebElement Perpetual_Checkbox= null;
	private static WebElement Priceineffect_Checkbox= null;
	private static WebElement Product_DetailsTab= null;
	private static WebElement ProductName_Checkbox= null;
	private static WebElement Update_Button= null;
	private static WebElement Update_Message= null;
	
	
	 public static WebElement Edit_Button(WebDriver driver) throws Exception{
		 
		 
		 
		 Edit_Button = driver.findElement(By.xpath(".//*[@id='ContractGrid']/div[2]/table/tbody/tr[1]/td[4]/a"));
		 ExcelUtils.setCellData("Pass", 37, 7);
		 return Edit_Button;
		 
		 
	 
	 } 

/*
	 public static void BeginDate(WebDriver driver) throws Exception{
		
		 ExcelUtils.setCellData("Pass", 37, 7);
		 
		 WebElement	BeginDate = driver.findElement(By.xpath(".//*[@id='tabContractDetails']/div/div/fieldset[1]/div[2]/div/span[1]/span/span/span"));
		 BeginDate.click();
		 
			
			int ok_size1=driver.findElements(By.xpath(".//a[@class='k-link'][@title ='Thursday, July 27, 2017']")).size();
		System.out.println("working");	
			Thread.sleep(7000);
			driver.findElements(By.xpath(".//a[@class='k-link'][@title ='Thursday, July 27, 2017']")).get(ok_size1-1).click();
	 
		 
		 
	 }
	 
	 public static void ExpirationDate(WebDriver driver) throws Exception{
			
			
	
			 ExcelUtils.setCellData("Pass", 38, 7);
			
		 
			

			 WebElement	 ExpirationDate= driver.findElement(By.xpath(".//*[@id='tabContractDetails']/div/div/fieldset[1]/div[3]/div/span[1]/span/span/span"));
				ExpirationDate.click();
				 Thread.sleep(7000);
				 int ok_size2=driver.findElements(By.xpath(".//a[@class='k-link'][@title ='Thursday, July 27, 2017']")).size();
					
				 Thread.sleep(7000);
					driver.findElements(By.xpath(".//a[@class='k-link'][@title ='Thursday, July 27, 2017']")).get(ok_size2-1).click();
			  
				 
		 }
	 
*/


	
	

	public static WebElement Perpetual_Checkbox(WebDriver driver) throws Exception{
		 
		Perpetual_Checkbox = driver.findElement(By.xpath(".//*[@id='BaseContract_Perpetual']"));
		ExcelUtils.setCellData("Pass", 39, 7);
		 return Perpetual_Checkbox;
		 
		 
		 
		 
	 }
	 

	public static WebElement Priceineffect_Checkbox(WebDriver driver) throws Exception{
		 
		Priceineffect_Checkbox = driver.findElement(By.xpath(".//*[@id='BaseContract_UseBolEndTime']"));
		ExcelUtils.setCellData("Pass", 40, 7);
		 return Priceineffect_Checkbox;
		 	 
	 }
	public static WebElement Product_DetailsTab(WebDriver driver) throws Exception{
		 
		Product_DetailsTab = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
		ExcelUtils.setCellData("Pass", 41, 7);
		 return Product_DetailsTab;
		 	 
	 } 
	 
	public static WebElement ProductName_Checkbox(WebDriver driver) throws Exception{
		 
		ProductName_Checkbox = driver.findElement(By.xpath("//*[@id='ContractDetailsGrid']/div[2]/table/tbody/tr/td[1]/input"));
		ExcelUtils.setCellData("Pass", 42, 7);
		 return ProductName_Checkbox;
		 	 
	 } 
	 
	
	public static WebElement Update_Button(WebDriver driver) throws Exception{
		 
		Update_Button = driver.findElement(By.xpath(".//*[@id='btnCreate']"));
		ExcelUtils.setCellData("Pass", 43, 7);
		 return Update_Button;
		 	 
	 }  
	 

	public static WebElement Update_Message(WebDriver driver) throws Exception{
		 
		Update_Message = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		
		if(Update_Message.isDisplayed())
		{
			ExcelUtils.setCellData("Pass", 44, 7);
			System.out.println("sucessfully updated message displayed");
			ExcelUtils.setCellData(Update_Message.getText(), 44, 6);
			
		}
		
		 
		 return Update_Message;
		 	 
	 }  
	


}
