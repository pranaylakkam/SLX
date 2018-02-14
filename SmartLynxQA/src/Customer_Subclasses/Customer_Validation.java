package Customer_Subclasses;






import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.ExcelUtils;

public class Customer_Validation {

	
	private static WebElement Search=null;
	private static WebElement Create_Newbutton=null;
	private static WebElement MasterAcct=null;
	private static WebElement StateDropdown=null;
	private static WebElement StateInput=null;
	private static WebElement PhoneNumber=null;
	private static WebElement Fax=null;
	private static WebElement FaxToName=null;
	private static WebElement VendorCustomerCross_Reference=null;
	private static WebElement ContactPhoneNumber=null;
	private static WebElement ContactExtn=null;
	private static WebElement OrderHold=null;
	private static WebElement OrderHoldSelect=null;
	private static WebElement OrderType=null;
	private static WebElement OrderTypeSelect=null;
	private static WebElement TicketCopies =null;
	private static WebElement EmailTicketWhen=null;
	private static WebElement SetNewvehiclesToTransient =null;
	private static WebElement StickReadingRequired=null;
	private static WebElement PrintPriceOnTicket=null;
	private static WebElement Inactive=null;
	private static WebElement NoteType =null;
	private static WebElement NoteTypeSelect =null;
    private static WebElement Receivinghourstab = null;
	private static WebElement receivinghoursAddButton = null;
	private static WebElement DayStartclick =null; 
	private static WebElement DayStartSelect = null;
	private static WebElement StartTimeclick=null;
	private static WebElement StartTimeInput=null;
	private static WebElement DayEndclick =null; 
	private static WebElement DayEndSelect = null;
	private static WebElement Deletebutton = null;
    private static WebElement TaxFeeProfileMapping = null;
    private static WebElement TaxfeetabselectClick = null;
    private static WebElement TaxfeetabSelect = null;
    private static WebElement	UnAssignButton = null;
    private static WebElement PriceClassMapping = null;
    private static WebElement priceclass = null;
    private static WebElement priceclassSelect = null;
    private static WebElement	varinaceclick = null;
    private static WebElement	varinaceinput = null;
    private static WebElement	varinacepercentileinput = null;
    private static WebElement priceclassmappingUnAssign = null;
    private static WebElement PurchaseOrder = null;
    private static WebElement PurchaseOrderNumberInput = null;
    private static WebElement Delete = null;
    private static WebElement Save = null;
    private static WebElement EmailTicketWhenSelect = null;
    private static WebElement TargetTypeCustomer = null;
    private static WebElement TargetTypeDispatch = null;
    private static WebElement Note = null;
    private static WebElement SaveMessage = null;
    
   public static void mouse (WebDriver driver){
		 driver.findElement(By.cssSelector("#main > div.page-header.navbar.navbar-fixed-top.slHeadFoot > div > div.page-logo > a > img")).click();

		Customer_ScreenShots.CaptureScreenshot(driver);
		 
		 WebElement element = driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/div[2]/div/div/ul/li[1]/a"));
		 Customer_ScreenShots.CaptureScreenshot(driver);
		 Actions action = new Actions(driver);

		 action.moveToElement(element).moveToElement(driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/div[2]/div/div/ul/li[1]/ul/li[3]/a"))).click().build().perform();
		 Customer_ScreenShots.CaptureScreenshot(driver);
		 driver.manage().window().maximize();
		
	  
	 }
	
	 public static WebElement Search(WebDriver driver){

	   	 Search = driver.findElement(By.xpath(".//*[@id='txtSearchCustomerGrid']"));
	   	 
	   	 return Search;
	   	 
	   	 }
	 
		
	 public static WebElement Create_Newbutton(WebDriver driver){

		 Create_Newbutton = driver.findElement(By.xpath(".//*[@id='btncreate']"));
		 
		 return Create_Newbutton;
		 
		 }
	 
	 
	 public static void ErrorMessage(WebDriver driver) throws Exception{

			// ErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseDriver_UserCode']"));
			 
			 String ExpectedMaterAcctErrorMessage = ExcelUtils.getCellData(11, 5);
			 String ActualMaterAcctErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_CustomerId-error']")).getText();
				
				if(ExpectedMaterAcctErrorMessage.equals(ActualMaterAcctErrorMessage))
				{
					System.out.println("Master Acct # is required");
					ExcelUtils.setCellData("Pass",11 , 7);
					ExcelUtils.setCellData(ActualMaterAcctErrorMessage,11 , 6);
					
				}
				else
				{
					ExcelUtils.setCellData("Fail",11 , 7);
					ExcelUtils.setCellData(ActualMaterAcctErrorMessage,11 , 6);
				}
			 
				String ExpectedNameErrorMessage = ExcelUtils.getCellData(12, 5);
				String ActualNameErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Name-error']")).getText();
				
				if(ExpectedNameErrorMessage.equals(ActualNameErrorMessage))
				{
					System.out.println("Name is required");
					ExcelUtils.setCellData("Pass",12 , 7);
					ExcelUtils.setCellData(ActualNameErrorMessage,12 , 6);
				}
				else
				{
					ExcelUtils.setCellData("Fail",12 , 7);
					ExcelUtils.setCellData(ActualNameErrorMessage,12 , 6);
				}
			 
				String ExpectedAddress1ErrorMessage = ExcelUtils.getCellData(13, 5);
				String ActualAddress1ErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Address1-error']")).getText();
				
				if(ExpectedAddress1ErrorMessage.equals(ActualAddress1ErrorMessage))
				{
					System.out.println("Address 1 is required");
					ExcelUtils.setCellData("Pass",13 , 7);
					ExcelUtils.setCellData(ActualAddress1ErrorMessage,13 , 6);
				}else
					ExcelUtils.setCellData("Fail",13 , 7);
				ExcelUtils.setCellData(ActualAddress1ErrorMessage,13 , 6);
			 
				String ExpectedCityErrorMessage = ExcelUtils.getCellData(14, 5);
				String ActualCityErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_City-error']")).getText();
				
				if(ExpectedCityErrorMessage.equals(ActualCityErrorMessage))
				{
					System.out.println("City is required");
					ExcelUtils.setCellData("Pass",14 , 7);
					ExcelUtils.setCellData(ActualCityErrorMessage,14 , 6);
				}else
				{ExcelUtils.setCellData("Fail",14, 7);
				ExcelUtils.setCellData(ActualCityErrorMessage,14 , 6);
					
				}
			 
				String ExpectedStateErrorMessage = ExcelUtils.getCellData(15, 5);
				String ActualStateErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_State-error']")).getText();
				
				if(ExpectedStateErrorMessage.equals(ActualStateErrorMessage))
				{
					System.out.println("State is required");
					ExcelUtils.setCellData("Pass",15, 7);
					ExcelUtils.setCellData(ActualStateErrorMessage,15 , 6);
				}else
				{
					ExcelUtils.setCellData("Fail",15, 7);
					ExcelUtils.setCellData(ActualStateErrorMessage,15 , 6);
				}
			  
				String ExpectedZipErrorMessage = ExcelUtils.getCellData(16, 5);
				String ActualZipErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Zip-error']")).getText();
				
				if(ExpectedZipErrorMessage.equals(ActualZipErrorMessage))
				{
					System.out.println("Zip is required");
					ExcelUtils.setCellData("Pass",16, 7);
					ExcelUtils.setCellData(ActualZipErrorMessage,16 , 6);
				}else
				{
					ExcelUtils.setCellData("Fail",16, 7);
					ExcelUtils.setCellData(ActualZipErrorMessage,16 , 6);
				}
			  
				String ExpectedPhoneErrorMessage = ExcelUtils.getCellData(17, 5);
				String ActualPhoneErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Phone-error']")).getText();
				
				if(ExpectedPhoneErrorMessage.equals(ActualPhoneErrorMessage))
				{
					System.out.println("Phone is required");
					ExcelUtils.setCellData("Pass",17, 7);
					ExcelUtils.setCellData(ActualPhoneErrorMessage,17 , 6);
				}else
				{
					ExcelUtils.setCellData("Fail",17, 7);
					ExcelUtils.setCellData(ActualPhoneErrorMessage,17 , 6);
				}
				String ExpectedEmailErrorMessage = ExcelUtils.getCellData(18, 5);
				String ActualEmailErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_ContactEmail-error']")).getText();
				
				if(ExpectedEmailErrorMessage.equals(ActualEmailErrorMessage))
				{
					System.out.println("Contact Email is required");
					ExcelUtils.setCellData("Pass",18, 7);
					ExcelUtils.setCellData(ActualEmailErrorMessage,18 , 6);
				}else
				{
					ExcelUtils.setCellData("Fail",18, 7);
					ExcelUtils.setCellData(ActualEmailErrorMessage,18 , 6);
				}
				
				String ExpectedTicketCopiesErrorMessage = ExcelUtils.getCellData(19, 5);
				String ActualTicketCopiesErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_CustomerTicketCopies-error']")).getText();
				
				if(ExpectedTicketCopiesErrorMessage.equals(ActualTicketCopiesErrorMessage))
				{
					System.out.println("Ticket Copies is required");
					ExcelUtils.setCellData("Pass",19, 7);
					ExcelUtils.setCellData(ActualTicketCopiesErrorMessage,19 , 6);
				}else
				{
					ExcelUtils.setCellData("Fail",19, 7);
					ExcelUtils.setCellData(ActualTicketCopiesErrorMessage,19 , 6);
				}
			/*	String ExpectedAllNotesErrorMessage = "All Notes is required";
				String ActualAllNotesErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseNote_Data-error']")).getText();
				
				if(ExpectedAllNotesErrorMessage.equals(ActualAllNotesErrorMessage))
				{
					System.out.println("All Notes is required");
				}
				
			 */	
				
				
			 } 

	 public static WebElement MasterAcct (WebDriver driver){
		 
		 MasterAcct = driver.findElement(By.xpath(".//*[@id='BaseCustomer_CustomerId']"));
		 return MasterAcct;
		 
	 
	 }

 public static void Name(WebDriver driver) throws Exception{
		 
		WebElement Name = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Name']"));
		Name.sendKeys(ExcelUtils.getCellData(21, 4));
		Name.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
		
		String ExpectedNameErrorMessage = ExcelUtils.getCellData(21, 5);
		
		String Name_ErrorMessage1 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Name-error']")).getText();
	
		
		if(ExpectedNameErrorMessage.equals(Name_ErrorMessage1))
		{
			ExcelUtils.setCellData("pass", 21, 7);
			ExcelUtils.setCellData(Name_ErrorMessage1, 21, 6);
			System.out.println(Name_ErrorMessage1);
			
		}else
		{
			ExcelUtils.setCellData("Fail", 21, 7);
			ExcelUtils.setCellData(Name_ErrorMessage1, 21, 6);	
		}
		
		WebElement Name_ErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Name-error']"));
	//System.out.println(Name_ErrorMessage);
	
	if(Name_ErrorMessage.isDisplayed())
	{ 
		Name.clear();
		Thread.sleep(5000);
		Name.sendKeys(ExcelUtils.getCellData(22, 4));
		
	}
 
 }
	public static void Name2(WebDriver driver) throws Exception{
		 
		WebElement Name2 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_CustomerName2']"));
		Name2.sendKeys(ExcelUtils.getCellData(23, 4));
		Name2.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		String ExpectedNameErrorMessage = ExcelUtils.getCellData(23, 5);
		String Name2_ErrorMessage1 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_CustomerName2-error']")).getText();
	
		//System.out.println(Name2_ErrorMessage1);
		if(ExpectedNameErrorMessage.equals(Name2_ErrorMessage1))
		{
			System.out.println(Name2_ErrorMessage1);
			ExcelUtils.setCellData("pass", 23, 7);
			ExcelUtils.setCellData(Name2_ErrorMessage1, 23, 6);
			
		
			
		}
		
		else{
			ExcelUtils.setCellData("Fail", 23, 7);
			ExcelUtils.setCellData(Name2_ErrorMessage1, 23, 6);
		}
		
		
	WebElement Name2_ErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_CustomerName2-error']"));
	if(Name2_ErrorMessage.isDisplayed())
	{ Name2.clear();
		Thread.sleep(5000);
		Name2.sendKeys(ExcelUtils.getCellData(24, 4));
		
	}		 
	
	 
	 } 
 
	public static void Address1(WebDriver driver) throws Exception{
		WebElement Address1 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Address1']"));
		Address1.sendKeys(ExcelUtils.getCellData(25, 4));
		Address1.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
		String ExpectedAddressErrorMessage = ExcelUtils.getCellData(24, 5);
		String Address_ErrorMessage1 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Address1-error']")).getText();
	
		
		if(ExpectedAddressErrorMessage.equals(Address_ErrorMessage1))
		{
			System.out.println(Address_ErrorMessage1);
			ExcelUtils.setCellData("Pass", 25, 7);
			ExcelUtils.setCellData(Address_ErrorMessage1, 25, 6);
		}
		
		else{
			ExcelUtils.setCellData("Pass", 25, 7);
			ExcelUtils.setCellData(Address_ErrorMessage1, 25, 6);
		}
		WebElement Address1_Error = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Address1-error']"));
		
		if(Address1_Error.isDisplayed())
		{Address1.clear();
			Thread.sleep(4000);
			Address1.sendKeys( ExcelUtils.getCellData(26, 4));
			ExcelUtils.setCellData("Pass", 26, 7);
			
		}
		
		
	}
	 
	public static void Address2(WebDriver driver) throws Exception{
		WebElement Address2 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Address2']"));
		Address2.sendKeys(ExcelUtils.getCellData(27, 4));
		Address2.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		String ExpectedAddressErrorMessage = ExcelUtils.getCellData(27, 4);
		String Address_ErrorMessage2 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Address2-error']")).getText();
	
		
		if(ExpectedAddressErrorMessage.equals(Address_ErrorMessage2))
		{
			ExcelUtils.setCellData("Pass", 27, 7);
			ExcelUtils.setCellData(Address_ErrorMessage2, 27, 6);
			System.out.println(Address_ErrorMessage2);
		}
		
		else{
			ExcelUtils.setCellData("Fail", 27, 7);
			ExcelUtils.setCellData(Address_ErrorMessage2, 27, 6);
		}
		WebElement Address2_Error = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Address2-error']"));
		
		if(Address2_Error.isDisplayed())
		{ Address2.clear();
			Thread.sleep(2000);
			Address2.sendKeys( ExcelUtils.getCellData(28, 4));
			ExcelUtils.setCellData("Pass",28, 4);
		}}
		
	public static void City(WebDriver driver) throws Exception{
		WebElement City = driver.findElement(By.xpath(".//*[@id='BaseCustomer_City']"));
		City.sendKeys(ExcelUtils.getCellData(29, 4));
		City.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		String ExpectedCityErrorMessage = ExcelUtils.getCellData(29, 5);
		String City_ErrorMessage2 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_City-error']")).getText();
	
		
		if(ExpectedCityErrorMessage.equals(City_ErrorMessage2))
		{
			System.out.println(City_ErrorMessage2);
			ExcelUtils.setCellData("Pass", 29, 7);
			ExcelUtils.setCellData(City_ErrorMessage2, 29, 6);
		}else
		{
			ExcelUtils.setCellData("Fail", 29, 7);
			ExcelUtils.setCellData(City_ErrorMessage2, 29, 6);
		}
		
		
		WebElement City_Error = driver.findElement(By.xpath(".//*[@id='BaseCustomer_City-error']"));
		
		if(City_Error.isDisplayed())
		{
			City.clear();
			
			Thread.sleep(2000);
			City.sendKeys( ExcelUtils.getCellData(30, 4));
			ExcelUtils.setCellData("Pass", 30, 7);
			
		}}
		 
	public static WebElement StateDropdown(WebDriver driver){
		 
		StateDropdown = driver.findElement(By.xpath(".//*[@id='tabCustomer']/div/div/fieldset[1]/div[7]/div/span[1]/span/span[2]/span"));
		 return StateDropdown;
		 
	 
	 }
	public static WebElement StateInput(WebDriver driver){
		 
		StateInput = driver.findElement(By.xpath(".//span[@class='k-list-filter']/input"));
		 return StateInput;
		 
	 
	 }
	public static void Zip(WebDriver driver) throws Exception{
		WebElement Zip = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Zip']"));
		Zip.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(32, 4)));
		Zip.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		String ExpectedZipErrorMessage = ExcelUtils.getCellData(32, 5);
		String Zip_ErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Zip-error']")).getText();
	
		
		if(ExpectedZipErrorMessage.equals(Zip_ErrorMessage))
		{
			System.out.println(Zip_ErrorMessage);
			ExcelUtils.setCellData("Pass", 32, 7);
			ExcelUtils.setCellData(Zip_ErrorMessage, 32, 6);
			
		}
		else
		{	ExcelUtils.setCellData("Fail", 32, 7);
		ExcelUtils.setCellData(Zip_ErrorMessage, 32, 6);
			
		}
		
		
		
		WebElement ZipErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Zip-error']"));
		
		if(ZipErrorMessage.isDisplayed())
		{Zip.clear();
			Zip.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(33, 4)));
			Thread.sleep(3000);
		
			
			
			String ExpectedZipErrorMessage1 = ExcelUtils.getCellData(33, 5);
			String Zip_ErrorMessage1 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Zip-error']")).getText();
		
			
			if(ExpectedZipErrorMessage1.equals(Zip_ErrorMessage1))
			{
				ExcelUtils.setCellData("Pass", 33, 7);
				ExcelUtils.setCellData(Zip_ErrorMessage1, 33, 6);
				System.out.println(Zip_ErrorMessage1);
			}
			
			else{
				ExcelUtils.setCellData("Pass", 33, 7);
				ExcelUtils.setCellData(Zip_ErrorMessage1, 33, 6);
			}
			WebElement ZipErrorMessage1 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Zip-error']"));
			
			if(ZipErrorMessage1.isDisplayed()){
				
				Zip.clear();
				Zip.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(34, 4)));
			}
			
		}
	}
	
	public static WebElement PhoneNumber(WebDriver driver){
		 
		PhoneNumber = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Phone']"));
		 return PhoneNumber;
		 
	 
	 }
	

	public static WebElement Fax(WebDriver driver){
		 
		Fax = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Fax']"));
		 return Fax;
		 
	 
	 }
		
	public static WebElement FaxToName(WebDriver driver){
		 
		FaxToName = driver.findElement(By.xpath(".//*[@id='BaseCustomer_FaxToName']"));
		 return FaxToName;
		 
	 
	 }
		
	public static WebElement VendorCustomerCross_Reference(WebDriver driver){
		 
		VendorCustomerCross_Reference = driver.findElement(By.xpath(".//*[@id='BaseCustomer_MansfieldXRef']"));
		 return VendorCustomerCross_Reference;
		 
	 
	 }	
	
	 public static void ContactName(WebDriver driver) throws Exception{
		 
			WebElement ContactName = driver.findElement(By.xpath(".//*[@id='BaseCustomer_ContactName']"));
			ContactName.sendKeys(ExcelUtils.getCellData(43, 4));
			ContactName.sendKeys(Keys.TAB);
			Thread.sleep(3000);
			String ExpectedContactNameErrorMessage = ExcelUtils.getCellData(43, 5);
			String ContactName_ErrorMessage1 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_ContactName-error']")).getText();
		
			
			if(ExpectedContactNameErrorMessage.equals(ContactName_ErrorMessage1))
			{
				System.out.println(ContactName_ErrorMessage1);
				ExcelUtils.setCellData(ContactName_ErrorMessage1, 43, 6);;
				ExcelUtils.setCellData("Pass",43, 7);
			}	
			else{
				ExcelUtils.setCellData(ContactName_ErrorMessage1, 43, 6);;
				ExcelUtils.setCellData("Fail",43, 7);
				
			}
			
			
		WebElement ContactName_ErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_ContactName-error']"));
		if(ContactName_ErrorMessage.isDisplayed())
		{
			ContactName.clear();
			Thread.sleep(5000);
			ContactName.sendKeys(ExcelUtils.getCellData(44, 4));
			ExcelUtils.setCellData("Pass", 44, 7);
		}
	
	 }
	 public static WebElement ContactPhoneNumber(WebDriver driver){
		 
		 ContactPhoneNumber = driver.findElement(By.xpath(".//*[@id='BaseCustomer_ContactPhone']"));
			 return ContactPhoneNumber;
			 
		 
		 }
	 
public static WebElement ContactExtn(WebDriver driver){
		 
		 ContactExtn = driver.findElement(By.xpath(".//*[@id='BaseCustomer_ContactExt']"));
			 return ContactExtn;
			 
		 
		 }
	 
public static void ContactEmail(WebDriver driver) throws Exception{
	 
	WebElement ContactEmail = driver.findElement(By.xpath(".//*[@id='BaseCustomer_ContactEmail']"));
	ContactEmail.sendKeys(ExcelUtils.getCellData(36, 4));
	ContactEmail.sendKeys(Keys.TAB);
	Thread.sleep(3000);
	String ExpectedContactEmailErrorMessage = ExcelUtils.getCellData(36, 5);
	String ContactEmail_ErrorMessage1 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_ContactEmail-error']")).getText();

	
	if(ExpectedContactEmailErrorMessage.equals(ContactEmail_ErrorMessage1))
	{
	ExcelUtils.setCellData("Pass", 36, 7);
		System.out.println(ContactEmail_ErrorMessage1);
	ExcelUtils.setCellData(ContactEmail_ErrorMessage1, 36, 6);
	}	
	else{
		ExcelUtils.setCellData(ContactEmail_ErrorMessage1, 36, 6);
		ExcelUtils.setCellData("Fail", 36, 7);
		
	}
WebElement ContactEmail_ErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_ContactEmail-error']"));
if(ContactEmail_ErrorMessage.isDisplayed())
{
	
	ContactEmail.clear();
	Thread.sleep(5000);
	ContactEmail.sendKeys(ExcelUtils.getCellData(37, 4));
	ExcelUtils.setCellData("Pass", 37, 7);
	
}

} 
public static WebElement OrderHold(WebDriver driver){
	 
	OrderHold = driver.findElement(By.xpath(".//*[@id='tabCustomer']/div/div/fieldset[3]/div[1]/div/span[1]/span/span[2]/span"));
		 return OrderHold;
		 
	 
	 }

public static WebElement OrderHoldSelect(WebDriver driver){
	 
	OrderHoldSelect = driver.findElement(By.xpath(".//*[@id='BaseCustomer_OrderHold-list']/span/input"));
		 return OrderHoldSelect;
		 
	 
	 }
public static WebElement OrderType(WebDriver driver){
	 
	OrderType = driver.findElement(By.xpath(".//*[@id='tabCustomer']/div/div/fieldset[3]/div[2]/div/span[1]/span/span[2]/span"));
		 return OrderType;
		 
	 
	 }


public static WebElement OrderTypeSelect(WebDriver driver){
	 
	OrderTypeSelect = driver.findElement(By.xpath("//*[@id='BaseCustomer_DefaultOrderTypeId_listbox']/li[2]"));
		 return OrderTypeSelect;
		 
	 
	 }

public static void TicketCopies(WebDriver driver) throws Exception{
	 
	TicketCopies = driver.findElement(By.xpath(".//*[@id='BaseCustomer_CustomerTicketCopies']"));
	TicketCopies.sendKeys(ExcelUtils.getCellData(38, 4));
	
	String ExpectedTicletCopiesErrorMessage = ExcelUtils.getCellData(38, 5);
	String TicletCopies_ErrorMessage1 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_CustomerTicketCopies-error']")).getText();

	
	if(ExpectedTicletCopiesErrorMessage.equals(TicletCopies_ErrorMessage1))
	{
		ExcelUtils.setCellData("Pass", 38, 7);
		System.out.println(TicletCopies_ErrorMessage1);
	ExcelUtils.setCellData(TicletCopies_ErrorMessage1, 38, 6);
	}	
	else
	{
		ExcelUtils.setCellData(TicletCopies_ErrorMessage1, 38, 6);
		ExcelUtils.setCellData("Fail", 38, 7);
	}
	
	if(driver.findElement(By.xpath(".//*[@id='BaseCustomer_CustomerTicketCopies-error']")).isDisplayed()){
		
		TicketCopies.clear();
		Thread.sleep(2000);
		TicketCopies.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(39, 4)));
		ExcelUtils.setCellData("Pass", 39, 7);
	}
		
		 
	 
	 }

public static WebElement EmailTicketWhen (WebDriver driver){
	 
	EmailTicketWhen = driver.findElement(By.xpath(".//*[@id='tabCustomer']/div/div/fieldset[3]/div[4]/div/span[1]/span/span[2]/span"));
		 return EmailTicketWhen;
		 
	 
	 }

public static WebElement EmailTicketWhenSelect (WebDriver driver){
	 
	EmailTicketWhenSelect = driver.findElement(By.xpath(".//*[@id='BaseCustomer_EmailTicketWhen_listbox']/li[2]"));
		 return EmailTicketWhenSelect;
		 
	 
	 }




public static void User_Defined1(WebDriver driver) throws Exception{
	 
	WebElement User_Defined1 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_User1']"));
	User_Defined1.sendKeys(ExcelUtils.getCellData(46, 4));
	User_Defined1.sendKeys(Keys.TAB);
	Thread.sleep(3000);
	String User_Defined1_Message = ExcelUtils.getCellData(46, 5);
String User_Defined1_ErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_User1-error']")).getText();
if(User_Defined1_ErrorMessage.equals(User_Defined1_Message))
{
	User_Defined1.clear();
	Thread.sleep(5000);
	User_Defined1.sendKeys(ExcelUtils.getCellData(47,4));
	ExcelUtils.setCellData("Pass", 47, 7);
	ExcelUtils.setCellData(User_Defined1_ErrorMessage, 46, 6);
	
}else
{
	User_Defined1.clear();
	Thread.sleep(5000);
	User_Defined1.sendKeys(ExcelUtils.getCellData(47,4));
	ExcelUtils.setCellData("Fail", 47, 7);
	ExcelUtils.setCellData(User_Defined1_ErrorMessage, 46, 6);
}
}

public static void User_Defined2(WebDriver driver) throws Exception{
	 
	WebElement User_Defined2 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_User2']"));
	User_Defined2.sendKeys(ExcelUtils.getCellData(48, 4));
	User_Defined2.sendKeys(Keys.TAB);
	Thread.sleep(3000);
	String User_Defined2_Message = ExcelUtils.getCellData(48, 5);
	String User_Defined2_ErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_User2-error']")).getText();
	if(User_Defined2_ErrorMessage.equals(User_Defined2_Message))
	{
		User_Defined2.clear();
		Thread.sleep(5000);
		ExcelUtils.setCellData(User_Defined2_ErrorMessage, 48, 6);
		User_Defined2.sendKeys(ExcelUtils.getCellData(49,4));
		ExcelUtils.setCellData("Pass", 48, 7);
		
	}
	else
	{
		User_Defined2.clear();
		Thread.sleep(5000);
		User_Defined2.sendKeys(ExcelUtils.getCellData(49,4));
		ExcelUtils.setCellData(User_Defined2_ErrorMessage, 48, 6);
		ExcelUtils.setCellData("Fail", 48, 7);
	}
	}


public static void User_Defined3(WebDriver driver) throws Exception{
	 
	WebElement User_Defined3 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_User3']"));
	User_Defined3.sendKeys(ExcelUtils.getCellData(50, 4));
	User_Defined3.sendKeys(Keys.TAB);
	Thread.sleep(3000);
	String User_Defined3_Message = ExcelUtils.getCellData(50, 5);
	String User_Defined3_ErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_User3-error']")).getText();
	if(User_Defined3_ErrorMessage.equals(User_Defined3_Message))
	{
		User_Defined3.clear();
		Thread.sleep(5000);
		User_Defined3.sendKeys(ExcelUtils.getCellData(51,4));
		ExcelUtils.setCellData("Pass", 50, 7);
		ExcelUtils.setCellData(User_Defined3_ErrorMessage, 50, 6);
				
		
	}	
	else
	{
		User_Defined3.clear();
		Thread.sleep(5000);
		User_Defined3.sendKeys(ExcelUtils.getCellData(51,4));
		ExcelUtils.setCellData("Fail", 50, 7);
		ExcelUtils.setCellData(User_Defined3_ErrorMessage, 50, 6);
	}
}

public static void User_Defined4(WebDriver driver) throws Exception{
	 
	WebElement User_Defined4 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_User4']"));
	User_Defined4.sendKeys(ExcelUtils.getCellData(52, 4));
	User_Defined4.sendKeys(Keys.TAB);
	Thread.sleep(3000);
	String User_Defined4_Message = ExcelUtils.getCellData(52, 5);
	String User_Defined4_ErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseCustomer_User4-error']")).getText();
	if(User_Defined4_ErrorMessage.equals(User_Defined4_Message))
	{
		User_Defined4.clear();
		Thread.sleep(5000);
		User_Defined4.sendKeys(ExcelUtils.getCellData(53,4));
		ExcelUtils.setCellData("Pass", 53, 7);
		ExcelUtils.setCellData(User_Defined4_ErrorMessage, 52, 6);
		
		
	}else
	{
		User_Defined4.clear();
		Thread.sleep(5000);
		User_Defined4.sendKeys(ExcelUtils.getCellData(53,4));
		ExcelUtils.setCellData("Fail", 53, 7);
		ExcelUtils.setCellData(User_Defined4_ErrorMessage, 52, 6);
	}
	}

public static WebElement PrintPriceOnTicket (WebDriver driver){
	 
	PrintPriceOnTicket = driver.findElement(By.xpath(".//*[@id='BaseCustomer_CustomerPrintPriceOnTicket']"));
		 return PrintPriceOnTicket;
		 
	 
	 }

public static WebElement SetNewvehiclesToTransient(WebDriver driver){
	 
	SetNewvehiclesToTransient = driver.findElement(By.xpath(".//*[@id='BaseCustomer_SetNewVehiclesToTransient']"));
		 return SetNewvehiclesToTransient;
		 
	 
	 }


public static WebElement StickReadingRequired(WebDriver driver){
	 
	StickReadingRequired = driver.findElement(By.xpath(".//*[@id='BaseCustomer_CustomerRequireStickReadings']"));
		 return StickReadingRequired;
		 
	 
	 }

public static WebElement Inactive(WebDriver driver){
	 
	Inactive = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Status']"));
		 return Inactive;
		 
	 
	 }

public static WebElement 	NoteType(WebDriver driver){
	 
	NoteType = driver.findElement(By.xpath(".//*[@id='tabCustomer']/div/div/fieldset[4]/div/div[1]/div[1]/div/span/span/span[2]/span"));
		 return NoteType;
		 
	 
	 }

public static WebElement 	NoteTypeSelect(WebDriver driver){
	 
	NoteTypeSelect = driver.findElement(By.xpath(".//*[@id='NoteTypeDDL_listbox']/li[4]"));
		 return NoteTypeSelect;
		 
	 
	 }


public static WebElement 	TargetTypeCustomer(WebDriver driver){
	 
	TargetTypeCustomer = driver.findElement(By.xpath(".//*[@id='TargetTypeGrid']/div[2]/table/tbody/tr[1]/td/span"));
		 return TargetTypeCustomer;
		 
	 
	 }





public static WebElement 	Note(WebDriver driver){
	 
	Note = driver.findElement(By.xpath(".//*[@id='txtNote']"));
		 return Note;
		 
	 
	 }
public static WebElement 	TargetTypeDispatch(WebDriver driver){
	 
	TargetTypeDispatch = driver.findElement(By.xpath(".//*[@id='TargetTypeGrid']/div[2]/table/tbody/tr[2]/td/span"));
		 return TargetTypeDispatch;
		 
	 
	 }








public static WebElement 	Receivinghourstab(WebDriver driver){
	 
	Receivinghourstab = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
	
		 return Receivinghourstab;
		 
	 
	 }


public static  void  	receivinghours(WebDriver driver) throws Exception{
for(int i =1; i<3 ;i++){	 
	receivinghoursAddButton = driver.findElement(By.xpath(".//*[@id='CustomerRecievingHoursGrid']/div[1]/a"));
	receivinghoursAddButton.click();
	Thread.sleep(2000);
	
WebElement DayStart=	driver.findElement(By.xpath(".//span[@class='k-input'][contains(text(),'---Select---')]"));

Thread.sleep(2000);
DayStart.click();
Thread.sleep(2000);

Actions actions = new Actions(driver);
actions.moveToElement(driver.findElement(By.xpath(".//span[@class='k-input'][contains(text(),'---Select---')]")));
Thread.sleep(2000);
actions.sendKeys(Keys.TAB);
actions.build().perform();



Thread.sleep(2000);



Thread.sleep(2000);



 Thread.sleep(2000);
	String ActualDayStartMessage = ExcelUtils.getCellData(56, 5);
	String ExcpectedDayStartMessage = driver.findElement(By.xpath(".//*[@id='DayIDFrom_validationMessage']")).getText();
	
	if(ActualDayStartMessage.equals(ExcpectedDayStartMessage)){
		
		System.out.println(ExcpectedDayStartMessage);
		
		ExcelUtils.setCellData(ExcpectedDayStartMessage,56, 6);
		Thread.sleep(2000);
		ExcelUtils.setCellData("Pass",56, 7);
		
		DayStart.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='DayIDFrom_listbox']/li[3]")).click();
		Thread.sleep(2000);
		//DayStart.sendKeys(Keys.TAB);
		
	}else{
        System.out.println(ExcpectedDayStartMessage);
        Thread.sleep(2000);
		ExcelUtils.setCellData(ExcpectedDayStartMessage,56, 6);
		Thread.sleep(2000);
		ExcelUtils.setCellData("Fail",56, 7);
		Thread.sleep(2000);
		DayStart.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='DayIDFrom_listbox']/li[3]")).click();
		Thread.sleep(2000);
		DayStart.sendKeys(Keys.TAB);
	}
	
	Thread.sleep(2000);
	WebElement StartTimeclick = driver.findElement(By.xpath("//div[3]/table/tbody/tr/td[2]"));
	
	StartTimeclick.click();
	Thread.sleep(2000);
	StartTimeclick.click();
	Thread.sleep(2000);
	StartTimeclick.click();
	Thread.sleep(2000);
	
	WebElement StartTimeInput = driver.findElement(By.xpath("//*[@id='TimeFrom']"));
	StartTimeInput.sendKeys(Keys.TAB);
	
	
	String  ActualStartTimeErrorMessage = driver.findElement(By.xpath(".//*[@id='TimeFrom_validationMessage']")).getText();
	String  ExpectedStartTimeErrorMessage = ExcelUtils.getCellData(57, 5);
	
	Thread.sleep(2000);
	
	if(ActualStartTimeErrorMessage.equals(ExpectedStartTimeErrorMessage )){
		Thread.sleep(2000);
		System.out.print(ActualStartTimeErrorMessage);
		ExcelUtils.setCellData("Pass", 57, 7);
		Thread.sleep(2000);
		ExcelUtils.setCellData(ActualStartTimeErrorMessage, 57, 6);
		StartTimeInput.click();
		Thread.sleep(2000);
		StartTimeInput.clear();
		Thread.sleep(2000);
		StartTimeInput.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(57, 4)));
		Thread.sleep(2000);
		StartTimeInput.sendKeys(Keys.TAB);
		
	}else{
		
		System.out.print(ActualStartTimeErrorMessage);
		ExcelUtils.setCellData("Fail", 57, 7);
		Thread.sleep(2000);
		ExcelUtils.setCellData(ActualStartTimeErrorMessage, 57, 6);
		StartTimeInput.click();
		Thread.sleep(2000);
		StartTimeInput.clear();
		Thread.sleep(2000);
		StartTimeInput.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(57, 4)));
		StartTimeInput.sendKeys(Keys.TAB);
		
	}

	WebElement DayEnd = driver.findElement(By.xpath(".//*[@id='CustomerRecievingHoursGrid_active_cell']/span[1]/span/span[2]/span"));
	
	Actions actions1 = new Actions(driver);
	actions1.moveToElement(driver.findElement(By.xpath(".//*[@id='CustomerRecievingHoursGrid_active_cell']/span[1]/span/span[2]/span")));
	Thread.sleep(2000);
	actions1.sendKeys(Keys.TAB);
	actions1.build().perform();
	
	
	
	 
	Thread.sleep(2000);
	
	String ActualDayEndErrorMessage = driver.findElement(By.xpath(".//*[@id='DayIDTo_validationMessage']")).getText();
	String ExcpectedDayEndErrorMessage = ExcelUtils.getCellData(58, 5);
	Thread.sleep(2000);
	if(ActualDayEndErrorMessage.equals(ExcpectedDayEndErrorMessage))
	{
		Thread.sleep(2000);
		System.out.println(ActualDayEndErrorMessage);
		ExcelUtils.setCellData(ActualDayEndErrorMessage, 58,6);
		Thread.sleep(2000);
		ExcelUtils.setCellData("Pass", 58, 7);
		DayEnd.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='DayIDTo_listbox']/li[3]")).click();
		Thread.sleep(2000);
		//DayEnd.sendKeys(Keys.TAB);
		
	}
	else{
		System.out.println(ActualDayEndErrorMessage);
		ExcelUtils.setCellData(ActualDayEndErrorMessage, 58,6);
		Thread.sleep(2000);
		ExcelUtils.setCellData("Fail", 58, 7);
		
		Thread.sleep(2000);
		DayEnd.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='DayIDTo_listbox']/li[3]")).click();
		Thread.sleep(2000);
		//DayEnd.sendKeys(Keys.TAB);
	}
	
	
	
	WebElement EndTime =  driver.findElement(By.xpath("//div[@id='CustomerRecievingHoursGrid']/div[3]/table/tbody/tr/td[4]"));
	Thread.sleep(2000);
	EndTime.click();
	Thread.sleep(2000);
	EndTime.click();
	Thread.sleep(2000);
	
	
	WebElement DayEndSelect = driver.findElement(By.xpath(".//*[@id='TimeTo']"));
	DayEndSelect.sendKeys(Keys.TAB);
	
	String ActualEndTimeErrorMessage = driver.findElement(By.xpath(".//*[@id='TimeTo_validationMessage']")).getText();
	String ExpectedEndTimeErrorMessage =ExcelUtils.getCellData(59, 5);
	
	if(ActualEndTimeErrorMessage.equals(ExpectedEndTimeErrorMessage)){
		
	System.out.println(ActualEndTimeErrorMessage);
	ExcelUtils.setCellData("pass",59, 7);
	ExcelUtils.setCellData(ActualEndTimeErrorMessage,59, 6);
	Thread.sleep(2000);	
	DayEndSelect.click();
	Thread.sleep(2000);
	DayEndSelect.clear();
	Thread.sleep(2000);
	DayEndSelect.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(59, 4)));
	
		
		
	}
	else
	{
		System.out.println(ActualEndTimeErrorMessage);
		ExcelUtils.setCellData("Fail",59, 7);
		ExcelUtils.setCellData(ActualEndTimeErrorMessage,59, 6);
		Thread.sleep(2000);
		DayEndSelect.click();
		DayEndSelect.clear();
		Thread.sleep(2000);
		DayEndSelect.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(59, 4)));
		Thread.sleep(2000);
	}
	
	
	
}	
	
}
	

















		 
		 
	 
	 
public static WebElement 	 DayStartclick(WebDriver driver){
	 
	 DayStartclick = driver.findElement(By.xpath("//span[@class='k-input'][contains(text(),'---Select---')]"));
	
		 return  DayStartclick; 
	 }

public static WebElement 	 DayStartSelect(WebDriver driver) {
	 
	DayStartSelect = driver.findElement(By.xpath(".//*[@id='DayIDFrom_listbox']/li[3]"));
	
	
	

	
	
		 return  DayStartSelect; 
	 }
public static WebElement 	 StartTimeclick(WebDriver driver){
	 
	StartTimeclick = driver.findElement(By.xpath("//div[3]/table/tbody/tr/td[2]"));
	
		 return  StartTimeclick; 
	 }

public static WebElement 	 StartTimeInput(WebDriver driver){
	 
	StartTimeInput = driver.findElement(By.xpath("//*[@id='TimeFrom']"));
	

		 return StartTimeInput; 
	 }

public static WebElement 	 DayEndclick(WebDriver driver){
	 
	DayEndclick = driver.findElement(By.xpath(".//*[@id='CustomerRecievingHoursGrid_active_cell']/span[1]/span/span[2]/span"));
	
		 return DayEndclick; 
	 }

public static WebElement 	 DayEndSelect(WebDriver driver){
	 
	DayEndclick = driver.findElement(By.xpath(".//*[@id='DayIDTo_listbox']/li[3]"));
	
		 return DayEndclick; 
	 }


public static WebElement 	 EndTimeclick(WebDriver driver){
	 
	DayEndSelect = driver.findElement(By.xpath("//div[@id='CustomerRecievingHoursGrid']/div[3]/table/tbody/tr/td[4]"));
	
		 return DayEndSelect; 
	 }
public static WebElement 	 EndTimeInput(WebDriver driver){
	 
	 DayEndSelect = driver.findElement(By.xpath(".//*[@id='TimeTo']"));
	return DayEndSelect;
	 }

public static WebElement 	 Deletebutton(WebDriver driver){
	 
	Deletebutton = driver.findElement(By.xpath(".//*[@id='CustomerRecievingHoursGrid_active_cell']/a"));
	
		 return Deletebutton; 
	 }

public static WebElement 	 TaxFeeProfileMapping(WebDriver driver){
	 
	TaxFeeProfileMapping = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[3]/a"));
	
		 return TaxFeeProfileMapping; 
	 }
public static WebElement 	 TaxfeetabselectClick(WebDriver driver){
	 
	TaxfeetabselectClick = driver.findElement(By.xpath("//td[3]/span/span/span"));
	
		 return TaxfeetabselectClick; 
	 }

public static WebElement 	 TaxfeetabSelect(WebDriver driver){
	 
	TaxfeetabSelect = driver.findElement(By.xpath("//ul[@id='TaxFeeProfileId_listbox']/li[2]"));
	
		 return TaxfeetabSelect; 
	 }


public static WebElement 	 UnAssignButton(WebDriver driver){
	 
	UnAssignButton = driver.findElement(By.xpath("(//a[contains(@href, '#')])[11]"));
	
		 return UnAssignButton; 
	 }

public static WebElement 	 PriceClassMapping(WebDriver driver){
	 
	PriceClassMapping= driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[4]/a"));
	
		 return PriceClassMapping; 
}
public static WebElement 	 priceclass(WebDriver driver){
	 
	priceclass = driver.findElement(By.xpath("//td[3]/span/span/span"));
	
		 return priceclass; 
}
public static WebElement 	 priceclassSelect(WebDriver driver){
	 
	priceclassSelect = driver.findElement(By.xpath(".//*[@id='PriceClassId_listbox']/li[1]"));
	
		 return priceclassSelect; 
}
public static WebElement 	 varinaceclick(WebDriver driver){
	 
	varinaceclick = driver.findElement(By.xpath("//div[@id='CustomerProductPricesGrid']/div[2]/table/tbody/tr/td[4]"));
	
		 return varinaceclick; 
}
public static WebElement 	 varinaceinput(WebDriver driver){
	 
	varinaceinput = driver.findElement(By.xpath(".//*[@id='Variance']"));
	
		 return varinaceinput; 
}



public static WebElement 	 varinacepercentileinput(WebDriver driver){
	 
	varinacepercentileinput = driver.findElement(By.xpath(".//*[@id='VariancePercent']"));
	
		 return varinacepercentileinput; 
}
public static WebElement 	 priceclassmappingUnAssign(WebDriver driver){
	 
	priceclassmappingUnAssign = driver.findElement(By.xpath("(//a[contains(@href, '#')])[35]"));
	
		 return priceclassmappingUnAssign; 
}
public static WebElement 	 PurchaseOrder(WebDriver driver){
	 
	PurchaseOrder = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[5]/a"));
	
		 return PurchaseOrder; 
}


public static void 	 PurchaseOrderNumberclick(WebDriver driver) throws Exception {
	 
	
	for(int i=1;i<3;i++){
		
		driver.findElement(By.xpath(".//*[@id='CustomerPurchaseOrdersGrid']/div[1]/a")).click();
		Thread.sleep(3000);
	
WebElement PurchaseOrderNumber = driver.findElement(By.xpath(".//*[@id='PONumber']"));
PurchaseOrderNumber.sendKeys(Keys.TAB);

String ActualPurchaseErrorMessage = driver.findElement(By.xpath(".//*[@id='PONumber_validationMessage']")).getText();
String ExpectedPurchaseErrorMessage = ExcelUtils.getCellData(62, 5);

if(ActualPurchaseErrorMessage.equals(ExpectedPurchaseErrorMessage)){
	
	System.out.println(ActualPurchaseErrorMessage);
	ExcelUtils.setCellData("Pass", 62, 7);
	ExcelUtils.setCellData(ActualPurchaseErrorMessage, 62, 6);	
	PurchaseOrderNumber.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(62, 4)));
	
}
else
{
	
	System.out.println(ActualPurchaseErrorMessage);
	ExcelUtils.setCellData("Pass", 62, 7);
	ExcelUtils.setCellData(ActualPurchaseErrorMessage, 62, 6);	
    PurchaseOrderNumber.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(62, 4)));
    
}

	}
Thread.sleep(2000);
WebElement PurchaseOrderNumber1 = driver.findElement(By.xpath(".//*[@id='PONumber']"));


PurchaseOrderNumber1.sendKeys(Keys.TAB);

Thread.sleep(2000);
if(driver.findElement(By.xpath(".//*[@id='dvAlertContent']")).isDisplayed()){
	
	String ExpectedPOErrorMessage = driver.findElement(By.xpath(".//*[@id='dvAlertContent']")).getText();
	String ActualPoMessage = ExcelUtils.getCellData(63, 5);
	
	if(ExpectedPOErrorMessage.equals(ActualPoMessage)){
	
	
ExcelUtils.setCellData(ExpectedPOErrorMessage, 63, 6);
	
	
driver.findElement(By.xpath(".//*[@id='btnAlertOK']")).click();
Thread.sleep(2000);

PurchaseOrderNumber1.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(63, 4)));

ExcelUtils.setCellData("pass",63, 7);

}
	else

{
		
		ExcelUtils.setCellData(ExpectedPOErrorMessage, 63, 6);
		
		
		driver.findElement(By.xpath(".//*[@id='btnAlertOK']")).click();
		Thread.sleep(2000);

		PurchaseOrderNumber1.sendKeys(String.valueOf(ExcelUtils.getCellDataNum(63, 4)));

		ExcelUtils.setCellData("pass",63, 7);

}

}
	
	
	


	

	
}

public static WebElement 	 PurchaseOrderNumberInput(WebDriver driver){
	 
	PurchaseOrderNumberInput = driver.findElement(By.xpath(".//*[@id='PONumber']"));
	
	
	
	
	
	
	
		 return PurchaseOrderNumberInput; 
}


public static WebElement 	 Delete(WebDriver driver){
	 
	Delete = driver.findElement(By.xpath(".//a[@class='btn btn-xs red']"));
	
		 return Delete; 
}
public static WebElement 	 Save(WebDriver driver){
	 
	Save = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
	
		 return Save; 
}

public static WebElement 	 SaveMessage(WebDriver driver){
	 
	SaveMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
	
	System.out.print(SaveMessage.getText());
	
			 return SaveMessage; 
			 
}

}
