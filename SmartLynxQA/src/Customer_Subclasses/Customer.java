package Customer_Subclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class Customer {
	
	
	public static void Execute(WebDriver driver) throws Exception{
		
		
		
		Login_page.txtbx_Username(driver).sendKeys(ExcelUtils.getCellData(3,4));
		//Customer_ScreenShots.CaptureScreenshot(driver);
		
		 Thread.sleep(1000); 
		
		Login_page.txtbx_Password(driver).sendKeys(ExcelUtils.getCellData(4,4));
	//	Customer_ScreenShots.CaptureScreenshot(driver);
		
		
		 driver.findElement(By.name("login")).click();
		
		 Thread.sleep(3000);
		
          Customer_Validation.mouse(driver);
          Thread.sleep(3000);

          driver.findElement(By.xpath(".//*[@id='btncreate']")).click();
		  Thread.sleep(3000);
		  Customer_Validation.Save(driver).click();
		  Thread.sleep(1000);
		  Customer_Validation.ErrorMessage(driver);
		  Thread.sleep(3000);
	 
		  
		  Customer_Validation.MasterAcct(driver).sendKeys(ExcelUtils.getCellData(20,4));
		  Thread.sleep(2000);
		  Customer_Validation.Name(driver);
		  Thread.sleep(1000);
		  Customer_Validation.Name2(driver);
		  Thread.sleep(1000);
		  Customer_Validation.Address1(driver);
		  Thread.sleep(1000);
		  Customer_Validation.Address2(driver);
		  Thread.sleep(1000);
		  Customer_Validation.City(driver);
		  Thread.sleep(1000);
		  Customer_Validation.StateDropdown(driver).click();
		  Thread.sleep(1000);
		  Customer_Validation.StateInput(driver).click();
		  Thread.sleep(3000);


		  Customer_Validation.StateInput(driver).sendKeys(ExcelUtils.getCellData(31, 4));
		  Thread.sleep(5000);
		  Customer_Validation.StateInput(driver).sendKeys(Keys.ENTER);
		  Thread.sleep(5000);
		  Customer_Validation.Zip(driver);
		  Thread.sleep(1000);
		  Customer_Validation.PhoneNumber(driver).clear();
		  Thread.sleep(1000);
		
		  Customer_Validation.PhoneNumber(driver).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(2,4)));
		  Thread.sleep(1000);
		  Customer_Validation.Fax(driver).clear();
		  Thread.sleep(3000);
		 
		  Customer_Validation.Fax(driver).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(40, 4 )));
		  Thread.sleep(3000);
		  Customer_Validation.FaxToName(driver).clear();
		  Thread.sleep(1000);
		
		  Customer_Validation.FaxToName(driver).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(41, 4)));
		  Thread.sleep(1000);
		 // int VendorCustomerCross_Reference = (int)sheet.getRow(1).getCell(8).getNumericCellValue();
		   Customer_Validation.VendorCustomerCross_Reference(driver).sendKeys(String.valueOf(ExcelUtils.getCellData(42, 4)));
		  Thread.sleep(1000);
		  Customer_Validation.ContactName(driver);
		  Thread.sleep(1000);
		  //int ContactPhoneNumber = (int)sheet.getRow(1).getCell(9).getNumericCellValue();
		  Customer_Validation.ContactPhoneNumber(driver).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(35, 4)));
		  Thread.sleep(1000);
		//  int ContactExtn = (int)sheet.getRow(1).getCell(10).getNumericCellValue();
		  Customer_Validation.ContactExtn(driver).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(45, 4)));
		  Thread.sleep(1000);
		  Customer_Validation.ContactEmail(driver);
		  Thread.sleep(3000);
		  Customer_Validation.OrderHold(driver).click();
		  Thread.sleep(2000);
		  Customer_Validation.OrderHoldSelect(driver).click();
		  Thread.sleep(5000);
		  
		  Customer_Validation.OrderHoldSelect(driver).sendKeys(ExcelUtils.getCellData(54,4));
		  Thread.sleep(5000);
		  Customer_Validation.OrderHoldSelect(driver).sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  Customer_Validation.OrderType(driver).click();
		  Thread.sleep(6000);
		  Customer_Validation.OrderTypeSelect(driver).click();
		  Thread.sleep(3000);
		 
		  Customer_Validation.TicketCopies(driver);
		  Thread.sleep(1000);
		  Customer_Validation.EmailTicketWhen(driver).click();
		  Thread.sleep(1000);
		  Customer_Validation.EmailTicketWhenSelect(driver).click();
		  Thread.sleep(1000);
		  Customer_Validation.User_Defined1(driver);
		  Thread.sleep(1000);
		  Customer_Validation.User_Defined2(driver);
		  Thread.sleep(1000);
		  Customer_Validation.User_Defined3(driver);
		  Thread.sleep(1000);
		  Customer_Validation.User_Defined4(driver);
		  Thread.sleep(1000);
		  Customer_Validation.PrintPriceOnTicket(driver).click();
		  Thread.sleep(1000);
		  Customer_Validation.SetNewvehiclesToTransient(driver).click();
		  Thread.sleep(1000);
		  Customer_Validation.StickReadingRequired(driver).click();
		  Thread.sleep(1000);
		  Customer_Validation.Inactive(driver).click();
		  Thread.sleep(1000);
		  Customer_Validation.NoteType(driver).click();
		  Thread.sleep(2000);
		  Customer_Validation.NoteTypeSelect(driver).click();
		  
		  Thread.sleep(2000);
		  Customer_Validation.TargetTypeCustomer(driver).click();
		  Customer_Validation.Note(driver).click();
		  Thread.sleep(2000);
		 
		  Customer_Validation.Note(driver).sendKeys(ExcelUtils.getCellData(55, 4));
		  Thread.sleep(3000);
		  Customer_Validation.TargetTypeDispatch(driver).click();
		  Customer_Validation.Note(driver).click();
		  Thread.sleep(2000);
		
		  Customer_Validation.Note(driver).sendKeys(ExcelUtils.getCellData(55, 4));
		  
		  
		 
		  
		  Thread.sleep(4000);
		  
		  Customer_Validation.Receivinghourstab(driver).click();
		  Thread.sleep(3000);
		  Customer_Validation.receivinghours(driver);
		  Thread.sleep(4000);
		  
		  
		/*  
		  Customer_Validation.DayStartclick(driver).click();
		  Thread.sleep(4000);
		 Customer_Validation.DayStartSelect(driver).click();
		  Thread.sleep(3000);
		  
		  Customer_Validation.StartTimeclick(driver).click();
		  Thread.sleep(3000);
		  Customer_Validation.StartTimeclick(driver).click();
		  Thread.sleep(3000);
		  
		  Customer_Validation.StartTimeInput(driver).click();
		  Thread.sleep(3000);
		  Customer_Validation.StartTimeInput(driver).clear();
		  Thread.sleep(3000);
		 
		  Customer_Validation.StartTimeInput(driver).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(56, 4)));
		  Thread.sleep(3000);
		  Customer_Validation.StartTimeInput(driver).sendKeys(Keys.TAB);
		  
		  
		  Thread.sleep(3000);
		  
		  Customer_Validation.DayEndclick(driver).click();
		  Thread.sleep(3000);
		  Customer_Validation.DayEndSelect(driver).click();
		  Thread.sleep(3000);
		  Customer_Validation.EndTimeclick(driver).click();
		  Thread.sleep(3000);
		  Customer_Validation.EndTimeclick(driver).click();
		  Thread.sleep(3000);
		  Customer_Validation.EndTimeInput(driver).click();
		  Thread.sleep(3000);
		  Customer_Validation.EndTimeInput(driver).clear();
		  Thread.sleep(3000);
		
		  Customer_Validation.EndTimeInput(driver).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(57,4)));
		  
		  */
		  Thread.sleep(3000);
		  Customer_Validation.TaxFeeProfileMapping(driver).click();
		  Thread.sleep(3000);
		 // Customer_Validation.Taxfeetab(driver).click();
		
		 // Customer_Validation.Taxfeetab(driver).click();
		  
		// Customer_Validation.TaxfeetabSelect(driver).click();
		
		   WebElement tmpElement= driver.findElement(By.xpath("//div[@id='CustomerProductTaxFeesGrid']/div[2]/table/tbody/tr/td[3]"));
		  
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  
		  js.executeScript("arguments[0].click();",tmpElement );
		  
		  Thread.sleep(3000);
		  js.executeScript("arguments[0].click();",tmpElement ); 
		  Customer_Validation.TaxfeetabselectClick(driver).click();
		  Thread.sleep(3000);
		    
		 Customer_Validation.TaxfeetabSelect(driver).click();
		  
		  Thread.sleep(3000);
		  
		  
			// Customer_Validation.UnAssignButton(driver).click();
			 
			 
			 
		  Customer_Validation.PriceClassMapping(driver).click();
		  Thread.sleep(3000);
  WebElement tmpElement1= driver.findElement(By.xpath("//div[@id='CustomerProductPricesGrid']/div[2]/table/tbody/tr/td[3]"));
		  
		  JavascriptExecutor js1=(JavascriptExecutor)driver;
		  Thread.sleep(3000);
		  js1.executeScript("arguments[0].click();",tmpElement1 );
		  
		  Thread.sleep(3000);
		  js1.executeScript("arguments[0].click();",tmpElement1 );
		  
		  Thread.sleep(3000);
		  
		  Customer_Validation.priceclass(driver).click();
		  Thread.sleep(2000);
		  Customer_Validation.priceclassSelect(driver).click();
		  Thread.sleep(2000);
		  
		  Customer_Validation.varinaceclick(driver).click();
		  Thread.sleep(2000);
		  Customer_Validation.varinaceclick(driver).click();
		  
		  Customer_Validation.varinaceinput(driver).click();
		
			  
		  
		  Customer_Validation.varinaceinput(driver).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(58, 4)));
	
		  Customer_Validation.varinaceinput(driver).sendKeys(Keys.TAB);
		 
			 
		  Customer_Validation.varinacepercentileinput(driver).sendKeys(String.valueOf(ExcelUtils.getCellDataNum(58, 4)));
		  Thread.sleep(3000);
		//  Customer_Validation.priceclassmappingUnAssign(driver).click();
		  
		  Thread.sleep(2000);
		
		  
		  Customer_Validation.PurchaseOrder(driver).click();
		  Thread.sleep(2000);
		
		

		  Customer_Validation.PurchaseOrderNumberclick(driver);
		  Thread.sleep(1000);
		 // Customer_Validation.PurchaseOrderNumberInput(driver).sendKeys(Keys.TAB);
		  Thread.sleep(2000);
		
		//  Customer_Validation.Delete(driver).click();
	
	Customer_Validation.Save(driver).click();
	
	/*
	
//Edit the Values
	
	
	Thread.sleep(6000);
	Customer_Validation.SaveMessage(driver);
	
	Customer_EditValues.Search(driver);
	Thread.sleep(3000);
Customer_EditValues.Edit_button(driver).click();
Thread.sleep(3000);
Customer_EditValues.Edit_Name(driver).clear();
   
Thread.sleep(2000);
String Edit_Name = sheet.getRow(1).getCell(27).getStringCellValue();
Customer_EditValues.Edit_Name(driver).sendKeys(Edit_Name);
Customer_EditValues.Edit_Name2(driver).clear();
String Edit_Name2 = sheet.getRow(1).getCell(28).getStringCellValue();
Customer_EditValues.Edit_Name2(driver).sendKeys(Edit_Name2);

Thread.sleep(2000);
Customer_EditValues.Edit_Address1(driver).clear();
Thread.sleep(2000);
String Edit_Address1 = sheet.getRow(1).getCell(29).getStringCellValue();
Customer_EditValues.Edit_Address1(driver).sendKeys(Edit_Address1);
Thread.sleep(2000);
String Edit_Address2 = sheet.getRow(1).getCell(30).getStringCellValue();
Customer_EditValues.Edit_Address2(driver).clear();
Thread.sleep(2000);
Customer_EditValues.Edit_Address1(driver).sendKeys(Edit_Address2);
Thread.sleep(2000);
Customer_EditValues.Edit_City(driver).clear();	
Thread.sleep(2000);
String Edit_City = sheet.getRow(1).getCell(31).getStringCellValue();
Customer_EditValues.Edit_City(driver).sendKeys(Edit_City);
Thread.sleep(2000);
//Customer_EditValues.Edit_StateDropdown(driver).click();
//Thread.sleep(9000);
//Thread.sleep(7000);
//Customer_EditValues.Edit_StateInput(driver).click();
//Thread.sleep(2000);
//String Edit_StateInput = sheet.getRow(1).getCell(32).getStringCellValue();
//Customer_EditValues.Edit_StateInput(driver).sendKeys(Edit_StateInput);;
Thread.sleep(2000);
//Customer_EditValues.Edit_StateInput(driver).sendKeys(Keys.ENTER);
Customer_EditValues.Edit_Zip(driver).clear();
Thread.sleep(2000);
int Edit_Zip = (int)sheet.getRow(1).getCell(33).getNumericCellValue();
Customer_EditValues.Edit_Zip(driver).sendKeys(String.valueOf(Edit_Zip));
Thread.sleep(2000);
Customer_EditValues.Edit_PhoneNumber(driver).clear();
Thread.sleep(2000);
int Edit_PhoneNumber = (int)sheet.getRow(1).getCell(34).getNumericCellValue();
Customer_EditValues.Edit_PhoneNumber(driver).sendKeys(String.valueOf(Edit_PhoneNumber));
Thread.sleep(2000);
Customer_EditValues.Edit_Fax(driver).clear();
Thread.sleep(2000);
int Edit_Fax = (int)sheet.getRow(1).getCell(35).getNumericCellValue();
Customer_EditValues.Edit_Fax(driver).sendKeys(String.valueOf(Edit_Fax));	
Thread.sleep(2000);
Customer_EditValues.Edit_FaxToName(driver).clear();
Thread.sleep(2000);
int Edit_FaxToName = (int)sheet.getRow(1).getCell(36).getNumericCellValue();
Customer_EditValues.Edit_FaxToName(driver).sendKeys(String.valueOf(Edit_FaxToName));
Thread.sleep(2000);
Customer_EditValues.Edit_VendorCustomerCross_Reference(driver).clear();
Thread.sleep(2000);
int Edit_VendorCustomerCross_Reference = (int)sheet.getRow(1).getCell(37).getNumericCellValue();
Customer_EditValues.Edit_VendorCustomerCross_Reference(driver).sendKeys(String.valueOf(Edit_VendorCustomerCross_Reference));
Thread.sleep(2000);
Customer_EditValues.Edit_contactname(driver).clear();
Thread.sleep(2000);
String Edit_contactname = sheet.getRow(1).getCell(38).getStringCellValue();
Customer_EditValues.Edit_contactname(driver).sendKeys(Edit_contactname);
Thread.sleep(2000);
Customer_EditValues.Edit_ContactPhoneNumber(driver).clear();
Thread.sleep(2000);
int Edit_ContactPhoneNumber = (int)sheet.getRow(1).getCell(39).getNumericCellValue();
Customer_EditValues.Edit_ContactPhoneNumber(driver).sendKeys(String.valueOf(Edit_ContactPhoneNumber));
Thread.sleep(2000);
Customer_EditValues.Edit_ContactExtn(driver).clear();
Thread.sleep(2000);
int Edit_ContactExtn = (int)sheet.getRow(1).getCell(40).getNumericCellValue();
Customer_EditValues.Edit_ContactExtn(driver).sendKeys(String.valueOf(Edit_ContactExtn));
Thread.sleep(2000);
Customer_EditValues.Edit_ContactEmail(driver).clear();
Thread.sleep(2000);
String Edit_ContactEmail = sheet.getRow(1).getCell(41).getStringCellValue();
Customer_EditValues.Edit_ContactEmail(driver).sendKeys(Edit_ContactEmail);
Thread.sleep(2000);
Customer_EditValues.Edit_OrderHold(driver).click();
Thread.sleep(2000);
//Customer_EditValues.Edit_OrderHoldSelect(driver).click();
Thread.sleep(2000);
Customer_EditValues.Edit_OrderType(driver).click();
Thread.sleep(2000);
//Customer_EditValues.Edit_OrderTypeSelect(driver).click();
Thread.sleep(2000);
Customer_EditValues.Edit_TicketCopies(driver).clear();
Thread.sleep(2000);
int Edit_TicketCopies = (int)sheet.getRow(1).getCell(43).getNumericCellValue();
Customer_EditValues.Edit_TicketCopies(driver).sendKeys(String.valueOf((Edit_TicketCopies)));
Thread.sleep(2000);
Customer_EditValues.Edit_EmailTicketWhen(driver).click();
Thread.sleep(2000);
Customer_EditValues.Edit_User_Defined1(driver).clear();
Thread.sleep(2000);
Thread.sleep(2000);
String Edit_User_Defined1 = sheet.getRow(1).getCell(44).getStringCellValue();
Customer_EditValues.Edit_User_Defined1(driver).sendKeys(Edit_User_Defined1);	
Thread.sleep(2000);
Customer_EditValues.Edit_User_Defined2(driver).clear();
Thread.sleep(2000);
String Edit_User_Defined2 = sheet.getRow(1).getCell(45).getStringCellValue();
Customer_EditValues.Edit_User_Defined2(driver).sendKeys(Edit_User_Defined2);
Thread.sleep(2000);

Customer_EditValues.Edit_User_Defined3(driver).clear();
Thread.sleep(2000);
String Edit_User_Defined3 = sheet.getRow(1).getCell(46).getStringCellValue();
Customer_EditValues.Edit_User_Defined3(driver).sendKeys(Edit_User_Defined3);
Thread.sleep(2000);
Customer_EditValues.Edit_User_Defined4(driver).clear();
Thread.sleep(2000);
String Edit_User_Defined4 = sheet.getRow(1).getCell(47).getStringCellValue();
Customer_EditValues.Edit_User_Defined4(driver).sendKeys(Edit_User_Defined4);
Thread.sleep(2000);
Customer_EditValues.Edit_PrintPriceOnTicket(driver).click();
Thread.sleep(2000);
Customer_EditValues.Edit_SetNewvehiclesToTransient(driver).click();
Thread.sleep(2000);
Customer_EditValues.Edit_StickReadingRequired(driver).click();
Thread.sleep(2000);
Customer_EditValues.Edit_Inactive(driver).click();
Thread.sleep(2000);
Thread.sleep(1000);
	
Customer_EditValues.Edit_Receivinghourstab(driver).click();
Thread.sleep(3000);
Customer_EditValues.Edit_receivinghoursAddButton(driver).click();
Thread.sleep(3000);


Customer_EditValues.Edit_DayStartclick(driver).click();
Thread.sleep(3000);
Customer_EditValues.Edit_DayStartSelect(driver).click();
Thread.sleep(3000);

Customer_EditValues.Edit_StartTimeclick(driver).click();
Thread.sleep(3000);
Customer_EditValues.Edit_StartTimeclick(driver).click();
Thread.sleep(3000);

Customer_EditValues.Edit_StartTimeInput(driver).click();
Thread.sleep(3000);
Customer_EditValues.Edit_StartTimeInput(driver).clear();
Thread.sleep(3000);
int Edit_StartTimeInput = (int) sheet.getRow(1).getCell(49).getNumericCellValue();
Customer_EditValues.Edit_StartTimeInput(driver).sendKeys(String.valueOf(Edit_StartTimeInput));
Thread.sleep(3000);
Customer_EditValues.Edit_StartTimeInput(driver).sendKeys(Keys.TAB);


Thread.sleep(4000);

Customer_EditValues.Edit_DayEndclick(driver).click();
Thread.sleep(4000);
Customer_EditValues.Edit_DayEndSelect(driver).click();
Thread.sleep(3000);
Customer_EditValues.Edit_EndTimeclick(driver).click();
Thread.sleep(3000);
Customer_EditValues.Edit_EndTimeclick(driver).click();
Thread.sleep(3000);
Customer_EditValues.Edit_EndTimeInput(driver).click();
Thread.sleep(3000);
Customer_EditValues.Edit_EndTimeInput(driver).clear();
Thread.sleep(3000);
int Edit_EndTimeInput = (int)sheet.getRow(1).getCell(50).getNumericCellValue();
Customer_EditValues.Edit_EndTimeInput(driver).sendKeys(String.valueOf(Edit_EndTimeInput));


Thread.sleep(6000);
Customer_EditValues.Edit_TaxFeeProfileMapping(driver).click();
Thread.sleep(6000);
// Customer_Validation.Taxfeetab(driver).click();

// Customer_Validation.Taxfeetab(driver).click();

// Customer_Validation.TaxfeetabSelect(driver).click();



WebElement tmpElement4= driver.findElement(By.xpath("//div[@id='CustomerProductTaxFeesGrid']/div[2]/table/tbody/tr/td[3]"));

JavascriptExecutor js4=(JavascriptExecutor)driver;

js4.executeScript("arguments[0].click();",tmpElement4 );

Thread.sleep(3000);
js4.executeScript("arguments[0].click();",tmpElement4 ); 
Customer_EditValues.Edit_TaxfeetabselectClick(driver).click();
Thread.sleep(3000);
  
Customer_EditValues.Edit_TaxfeetabSelect(driver).click();

Thread.sleep(6000);


	// Customer_Validation.UnAssignButton(driver).click();
	 
	 
	 
Customer_EditValues.Edit_PriceClassMapping(driver).click();
Thread.sleep(6000);
WebElement tmpElement3= driver.findElement(By.xpath("//div[@id='CustomerProductPricesGrid']/div[2]/table/tbody/tr/td[3]"));

JavascriptExecutor js3=(JavascriptExecutor)driver;
Thread.sleep(6000);
js3.executeScript("arguments[0].click();",tmpElement3 );

Thread.sleep(3000);
js3.executeScript("arguments[0].click();",tmpElement3 );

Thread.sleep(3000);

Customer_EditValues.Edit_priceclass(driver).click();
Thread.sleep(3000);
Customer_EditValues.Edit_priceclassSelect(driver).click();
Thread.sleep(3000);

Customer_EditValues.Edit_varinaceclick(driver).click();
Thread.sleep(3000);
Customer_EditValues.Edit_varinaceclick(driver).click();

Customer_EditValues.Edit_varinaceinput(driver).click();
int Edit_varinaceinput =(int)sheet.getRow(1).getCell(50).getNumericCellValue();
Customer_EditValues.Edit_varinaceinput(driver).sendKeys(String.valueOf(Edit_varinaceinput));

Customer_EditValues.Edit_varinaceinput(driver).sendKeys(Keys.TAB);

int Edit_varinacepercentileinput = (int)sheet.getRow(1).getCell(51).getNumericCellValue();
Customer_EditValues.Edit_varinacepercentileinput(driver).sendKeys(String.valueOf(Edit_varinacepercentileinput));
Thread.sleep(3000);
//  Customer_Validation.priceclassmappingUnAssign(driver).click();

Thread.sleep(3000);


Customer_EditValues.Edit_PurchaseOrder(driver).click();
Thread.sleep(3000);
Customer_EditValues.Edit_PurchaseOrderAdd(driver).click();
Thread.sleep(3000);
int Edit_PurchaseOrderNumberInput = (int)sheet.getRow(1).getCell(52).getNumericCellValue();
Customer_EditValues.Edit_PurchaseOrderNumberInput(driver).sendKeys(String.valueOf(Edit_PurchaseOrderNumberInput));
Thread.sleep(3000);
Customer_EditValues.Edit_PurchaseOrderNumberInput(driver).sendKeys(Keys.TAB);
Thread.sleep(3000);
Customer_EditValues.Edit_DateFromInput(driver).clear();
Thread.sleep(3000);
String  Edit_DateFromInput = sheet.getRow(1).getCell(54).getStringCellValue();
Customer_EditValues.Edit_DateFromInput(driver).sendKeys((Edit_DateFromInput)); 
Thread.sleep(3000);
Customer_EditValues.Edit_DateFromInput(driver).sendKeys(Keys.TAB);
Thread.sleep(3000);
Customer_EditValues.Edit_DateToINput(driver).clear();
Thread.sleep(3000);
String Edit_DateToINput = sheet.getRow(1).getCell(55).getStringCellValue();
Customer_EditValues.Edit_DateToINput(driver).sendKeys((Edit_DateToINput));
Thread.sleep(6000);	
	
Customer_EditValues.Update(driver).click();
Thread.sleep(6000);	
//Customer_EditValues.UpdateMessage(driver);
	
	
	
	
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	}

