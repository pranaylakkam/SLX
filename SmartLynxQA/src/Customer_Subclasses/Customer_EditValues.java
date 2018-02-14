package Customer_Subclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Customer_EditValues {
	

	private static WebElement Edit_button=null;
	private static WebElement Edit_Zip = null;
	private static WebElement Edit_StateDropdown=null;
	private static WebElement Edit_StateInput=null;
	private static WebElement Edit_PhoneNumber=null;
	private static WebElement Edit_Fax=null;
	private static WebElement Edit_FaxToName=null;
	private static WebElement Edit_VendorCustomerCross_Reference=null;
	private static WebElement Edit_ContactPhoneNumber=null;
	private static WebElement Edit_ContactExtn=null;
	private static WebElement Edit_OrderHold=null;
	private static WebElement Edit_OrderHoldSelect=null;
	private static WebElement Edit_OrderType=null;
	private static WebElement Edit_OrderTypeSelect=null;
	private static WebElement Edit_TicketCopies =null;
	private static WebElement Edit_EmailTicketWhen=null;
	private static WebElement Edit_SetNewvehiclesToTransient =null;
	private static WebElement Edit_StickReadingRequired=null;
	private static WebElement Edit_PrintPriceOnTicket=null;
	private static WebElement Edit_Inactive=null;
	private static WebElement Edit_NoteType =null;
	private static WebElement Edit_NoteTypeSelect =null;
	private static WebElement Edit_AllNote =null;
	private static WebElement Edit_Receivinghourstab = null;
	private static WebElement Edit_receivinghoursAddButton = null;
	private static WebElement Edit_DayStartclick =null; 
	private static WebElement Edit_DayStartSelect = null;
	private static WebElement Edit_StartTimeclick=null;
	private static WebElement Edit_StartTimeInput=null;
	private static WebElement Edit_DayEndclick =null; 
	private static WebElement Edit_DayEndSelect = null;
	
    private static WebElement Edit_Deletebutton = null;
    private static WebElement Edit_TaxFeeProfileMapping = null;
    private static WebElement Edit_TaxfeetabselectClick = null;
    private static WebElement Edit_TaxfeetabSelect = null;
    private static WebElement	Edit_UnAssignButton = null;
    private static WebElement Edit_PriceClassMapping = null;
    private static WebElement Edit_priceclass = null;
    private static WebElement Edit_priceclassSelect = null;
    private static WebElement	Edit_varinaceclick = null;
    private static WebElement	Edit_varinaceinput = null;
    private static WebElement	Edit_varinacepercentileinput = null;
    private static WebElement Edit_priceclassmappingUnAssign = null;
    private static WebElement Edit_PurchaseOrder = null;
    private static WebElement Edit_PurchaseOrderAdd = null;
    private static WebElement Edit_PurchaseOrderNumberclick = null;
    private static WebElement Edit_PurchaseOrderNumberInput = null;
    private static WebElement Edit_DateFromInput = null;
    private static WebElement Edit_DateToINput = null;
    private static WebElement Edit_Delete = null;
    private static WebElement Edit_EmailTicketWhenSelect = null;
    private static WebElement Edit_contactname = null;
    private static WebElement Edit_ContactEmail= null;
    private static WebElement Edit_User_Defined1= null;
    private static WebElement Edit_User_Defined2= null;
    private static WebElement Edit_User_Defined3= null;
    private static WebElement Edit_User_Defined4= null;
    private static WebElement Update=null;
    private static WebElement UpdateMessage=null;
    private static WebElement Search= null;

    public static WebElement Edit_button(WebDriver driver){

		 Edit_button = driver.findElement(By.xpath(".//*[@id='CustomerGrid']/div[2]/table/tbody/tr[1]/td[9]/a"));
		 
		 return Edit_button;
		 
		 }
    
    
    
    public static WebElement Search(WebDriver driver){

	   	 Search = driver.findElement(By.xpath(".//*[@id='txtSearchCustomerGrid']"));
	   	 
	   	 return Search;
	   	 
	   	 }



    public static WebElement Edit_Name(WebDriver driver) {
		 
		WebElement Edit_Name = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Name']"));
	
		Edit_Name.clear();
	
	return Edit_Name;
 
    
    
    }

    public static WebElement Edit_Name2(WebDriver driver) {
		 
		WebElement Edit_Name2 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_CustomerName2']"));
		Edit_Name2.clear();
		
	return Edit_Name2;
    }


    public static WebElement Edit_Address1(WebDriver driver) {
		 
		WebElement Edit_Address1 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Address1']"));
		Edit_Address1.clear();
	
	return Edit_Address1;
    }

    public static WebElement Edit_Address2(WebDriver driver) {
		 
		WebElement Edit_Address2 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Address2']"));
		Edit_Address2.clear();
		//Address2.sendKeys("71 Pilgrim Avenue Chevy Chase,");
	return Edit_Address2;
    
    }

    public static WebElement Edit_City(WebDriver driver) {
		 
		WebElement Edit_City = driver.findElement(By.xpath(".//*[@id='BaseCustomer_City']"));
		Edit_City.clear();
		//City.sendKeys("Chicago");
	return Edit_City;
    
    }
    public static WebElement Edit_StateDropdown(WebDriver driver){
		 
    	Edit_StateDropdown = driver.findElement(By.xpath(".//*[@id='tabCustomer']/div/div/fieldset[1]/div[7]/div/span[1]/span/span[2]/span"));
		 return Edit_StateDropdown;
		 
	 
	 }
    public static WebElement Edit_StateInput(WebDriver driver){
		 
    	Edit_StateInput = driver.findElement(By.xpath(".//input[@class='k-textbox'][@aria-owns='BaseCustomer_State_listbox']"));
		 return Edit_StateInput;
		 
	 
	 }
    
    public static WebElement Edit_Zip(WebDriver driver){
		 
    	Edit_Zip = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Zip']"));
		 return Edit_Zip;
		 
	 
	 }

	public static WebElement Edit_PhoneNumber(WebDriver driver){
		 
		Edit_PhoneNumber = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Phone']"));
		 return Edit_PhoneNumber;
		 
	 
	 }
	

	public static WebElement Edit_Fax(WebDriver driver){
		 
		Edit_Fax = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Fax']"));
		 return Edit_Fax;
		 
	 
	 }
		
	public static WebElement Edit_FaxToName(WebDriver driver){
		 
		Edit_FaxToName = driver.findElement(By.xpath(".//*[@id='BaseCustomer_FaxToName']"));
		 return Edit_FaxToName;
		 
	 
	 }
		
	public static WebElement Edit_VendorCustomerCross_Reference(WebDriver driver){
		 
		Edit_VendorCustomerCross_Reference = driver.findElement(By.xpath(".//*[@id='BaseCustomer_MansfieldXRef']"));
		 return Edit_VendorCustomerCross_Reference;
		 
	 
	 }	

	public static WebElement Edit_contactname(WebDriver driver){
		 
		Edit_contactname = driver.findElement(By.xpath(".//*[@id='BaseCustomer_ContactName']"));
		 return Edit_contactname;
		 
	 
	 }	
 public static WebElement Edit_ContactPhoneNumber(WebDriver driver){
		 
	 Edit_ContactPhoneNumber = driver.findElement(By.xpath(".//*[@id='BaseCustomer_ContactPhone']"));
			 return Edit_ContactPhoneNumber;
			 
		 
		 }
	 
public static WebElement Edit_ContactExtn(WebDriver driver){
		 
	Edit_ContactExtn = driver.findElement(By.xpath(".//*[@id='BaseCustomer_ContactExt']"));
			 return Edit_ContactExtn;
			 
		 
		 }

public static WebElement Edit_ContactEmail(WebDriver driver){
	 
	Edit_ContactEmail = driver.findElement(By.xpath(".//*[@id='BaseCustomer_ContactExt']"));
		 return Edit_ContactEmail;
		 
	 
	 }


public static WebElement Edit_OrderHold(WebDriver driver){
	 
	Edit_OrderHold = driver.findElement(By.xpath(".//*[@id='tabCustomer']/div/div/fieldset[3]/div[1]/div/span[1]/span/span[2]/span"));
		 return Edit_OrderHold;
		 
	 
	 }

public static WebElement Edit_OrderHoldSelect(WebDriver driver){
	 
	Edit_OrderHoldSelect = driver.findElement(By.xpath(".//*[@id='BaseCustomer_OrderHold-list']/span/input"));
		 return Edit_OrderHoldSelect;
		 
	 
	 }
public static WebElement Edit_OrderType(WebDriver driver){
	 
	Edit_OrderType = driver.findElement(By.xpath(".//*[@id='tabCustomer']/div/div/fieldset[3]/div[2]/div/span[1]/span/span[2]/span"));
		 return Edit_OrderType;
		 
	 
	 }


public static WebElement Edit_OrderTypeSelect(WebDriver driver){
	 
	Edit_OrderTypeSelect = driver.findElement(By.xpath(".//*[@id='BaseCustomer_DefaultOrderTypeId_listbox']/li[2]"));
		 return Edit_OrderTypeSelect;
		 
	 
	 }

public static WebElement Edit_TicketCopies(WebDriver driver){
	 
	Edit_TicketCopies = driver.findElement(By.xpath(".//*[@id='BaseCustomer_CustomerTicketCopies']"));
		 return Edit_TicketCopies;
		 
	 
	 }

public static WebElement Edit_EmailTicketWhen (WebDriver driver){
	 
	Edit_EmailTicketWhen = driver.findElement(By.xpath(".//*[@id='tabCustomer']/div/div/fieldset[3]/div[4]/div/span[1]/span/span[2]/span"));
		 return Edit_EmailTicketWhen;
		 
	 
	 }

public static WebElement Edit_EmailTicketWhenSelect (WebDriver driver){
	 
	Edit_EmailTicketWhenSelect = driver.findElement(By.xpath(".//*[@id='BaseCustomer_EmailTicketWhen_listbox']/li[2]"));
		 return Edit_EmailTicketWhenSelect;
		 
	 
	 }

public static WebElement Edit_User_Defined1(WebDriver driver){
	 
	Edit_User_Defined1 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_User1']"));
		 return Edit_User_Defined1;
		 
	 
	 }

public static WebElement Edit_User_Defined2(WebDriver driver){
	 
	Edit_User_Defined2 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_User2']"));
		 return Edit_User_Defined2;
		 
	 
	 }

public static WebElement Edit_User_Defined3(WebDriver driver){
	 
	Edit_User_Defined3 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_User3']"));
		 return Edit_User_Defined3;
		 
	 
	 }

public static WebElement Edit_User_Defined4(WebDriver driver){
	 
	Edit_User_Defined4 = driver.findElement(By.xpath(".//*[@id='BaseCustomer_User4']"));
		 return Edit_User_Defined4;
		 
	 
	 }

public static WebElement Edit_PrintPriceOnTicket (WebDriver driver){
	 
	Edit_PrintPriceOnTicket = driver.findElement(By.xpath(".//*[@id='BaseCustomer_CustomerPrintPriceOnTicket']"));
		 return Edit_PrintPriceOnTicket;
		 
	 
	 }

public static WebElement Edit_SetNewvehiclesToTransient(WebDriver driver){
	 
	Edit_SetNewvehiclesToTransient = driver.findElement(By.xpath(".//*[@id='BaseCustomer_SetNewVehiclesToTransient']"));
		 return Edit_SetNewvehiclesToTransient;
		 
	 
	 }


public static WebElement Edit_StickReadingRequired(WebDriver driver){
	 
	Edit_StickReadingRequired = driver.findElement(By.xpath(".//*[@id='BaseCustomer_CustomerRequireStickReadings']"));
		 return Edit_StickReadingRequired;
		 
	 
	 }

public static WebElement Edit_Inactive(WebDriver driver){
	 
	Edit_Inactive = driver.findElement(By.xpath(".//*[@id='BaseCustomer_Status']"));
		 return Edit_Inactive;
		 
	 
	 }
public static WebElement 	Edit_NoteType(WebDriver driver){
	 
	Edit_NoteType = driver.findElement(By.xpath(".//*[@id='tabCustomer']/div/div/fieldset[4]/div/div[1]/div[1]/div/span/span/span[2]/span"));
		 return Edit_NoteType;
		 
	 
	 }

public static WebElement 	Edit_NoteTypeSelect(WebDriver driver){
	 
	Edit_NoteTypeSelect = driver.findElement(By.xpath(".//*[@id='NoteTypeDDL_listbox']/li[4]"));
		 return Edit_NoteTypeSelect;
		 
	 
	 }


public static WebElement 	Edit_AllNote(WebDriver driver){
	 
	Edit_AllNote = driver.findElement(By.xpath(".//*[@id='BaseNote_Data']"));
		 return Edit_AllNote;
		 
	 
	 }


public static WebElement 	Edit_Receivinghourstab(WebDriver driver){
	 
	Edit_Receivinghourstab = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
	
		 return Edit_Receivinghourstab;
}


public static WebElement 	Edit_receivinghoursAddButton(WebDriver driver){
	 
	Edit_receivinghoursAddButton = driver.findElement(By.xpath(".//*[@id='CustomerRecievingHoursGrid']/div[1]/a"));
	
		 return Edit_receivinghoursAddButton;
		 
	 
	 }
public static WebElement 	 Edit_DayStartclick(WebDriver driver){
	 
	Edit_DayStartclick = driver.findElement(By.xpath("//span[@class='k-input'][contains(text(),'---Select---')]"));
	
		 return  Edit_DayStartclick; 
	 }

public static WebElement 	 Edit_DayStartSelect(WebDriver driver) {
	 
	Edit_DayStartSelect = driver.findElement(By.xpath(".//*[@id='DayIDFrom_listbox']/li[3]"));
	
		 return  Edit_DayStartSelect; 
	 }
public static WebElement 	 Edit_StartTimeclick(WebDriver driver){
	 
	Edit_StartTimeclick = driver.findElement(By.xpath("//div[3]/table/tbody/tr/td[2]"));
	
		 return  Edit_StartTimeclick; 
	 }

public static WebElement 	 Edit_StartTimeInput(WebDriver driver){
	 
	Edit_StartTimeInput = driver.findElement(By.xpath("//*[@id='TimeFrom']"));
	

		 return Edit_StartTimeInput; 
	 }

public static WebElement 	 Edit_DayEndclick(WebDriver driver){
	 
	Edit_DayEndclick = driver.findElement(By.xpath(".//*[@id='CustomerRecievingHoursGrid_active_cell']/span[1]/span/span[2]/span"));
	
		 return Edit_DayEndclick; 
	 }

public static WebElement 	 Edit_DayEndSelect(WebDriver driver){
	 
	Edit_DayEndclick = driver.findElement(By.xpath(".//*[@id='DayIDTo_listbox']/li[3]"));
	
		 return Edit_DayEndclick; 
	 }


public static WebElement 	 Edit_EndTimeclick(WebDriver driver){
	 
	Edit_DayEndSelect = driver.findElement(By.xpath("//div[@id='CustomerRecievingHoursGrid']/div[3]/table/tbody/tr/td[4]"));
	
		 return Edit_DayEndSelect; 
	 }
public static WebElement 	 Edit_EndTimeInput(WebDriver driver){
	 
	Edit_DayEndSelect = driver.findElement(By.xpath(".//*[@id='TimeTo']"));

	return Edit_DayEndSelect;
	
}

public static WebElement 	 Edit_Deletebutton(WebDriver driver){
	 
	Edit_Deletebutton = driver.findElement(By.xpath(".//*[@id='CustomerRecievingHoursGrid_active_cell']/a"));
	
		 return Edit_Deletebutton; 
	 }

public static WebElement 	 Edit_TaxFeeProfileMapping(WebDriver driver){
	 
	Edit_TaxFeeProfileMapping = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[3]/a"));
	
		 return Edit_TaxFeeProfileMapping; 
	 }
public static WebElement 	 Edit_TaxfeetabselectClick(WebDriver driver){
	 
	Edit_TaxfeetabselectClick = driver.findElement(By.xpath("//td[3]/span/span/span"));
	
		 return Edit_TaxfeetabselectClick; 
	 }

public static WebElement 	 Edit_TaxfeetabSelect(WebDriver driver){
	 
	Edit_TaxfeetabSelect = driver.findElement(By.xpath("//ul[@id='TaxFeeProfileId_listbox']/li[2]"));
	
		 return Edit_TaxfeetabSelect; 
	 }


public static WebElement 	 Edit_UnAssignButton(WebDriver driver){
	 
	Edit_UnAssignButton = driver.findElement(By.xpath("(//a[contains(@href, '#')])[11]"));
	
		 return Edit_UnAssignButton; 
	 }

public static WebElement 	 Edit_PriceClassMapping(WebDriver driver){
	 
	Edit_PriceClassMapping= driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[4]/a"));
	
		 return Edit_PriceClassMapping; 
}
public static WebElement 	 Edit_priceclass(WebDriver driver){
	 
	Edit_priceclass = driver.findElement(By.xpath("//td[3]/span/span/span"));
	
		 return Edit_priceclass; 
}
public static WebElement 	 Edit_priceclassSelect(WebDriver driver){
	 
	Edit_priceclassSelect = driver.findElement(By.xpath(".//*[@id='PriceClassId_listbox']/li[1]"));
	
		 return Edit_priceclassSelect; 
}
public static WebElement 	 Edit_varinaceclick(WebDriver driver){
	 
	Edit_varinaceclick = driver.findElement(By.xpath("//div[@id='CustomerProductPricesGrid']/div[2]/table/tbody/tr/td[4]"));
	
		 return Edit_varinaceclick; 
}
public static WebElement 	 Edit_varinaceinput(WebDriver driver){
	 
	Edit_varinaceinput = driver.findElement(By.xpath(".//*[@id='Variance']"));
	
		 return Edit_varinaceinput; 
}



public static WebElement 	 Edit_varinacepercentileinput(WebDriver driver){
	 
	Edit_varinacepercentileinput = driver.findElement(By.xpath(".//*[@id='VariancePercent']"));
	
		 return Edit_varinacepercentileinput; 
}
public static WebElement 	 Edit_priceclassmappingUnAssign(WebDriver driver){
	 
	Edit_priceclassmappingUnAssign = driver.findElement(By.xpath("(//a[contains(@href, '#')])[35]"));
	
		 return Edit_priceclassmappingUnAssign; 
}
public static WebElement 	 Edit_PurchaseOrder(WebDriver driver){
	 
	Edit_PurchaseOrder = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[5]/a"));
	
		 return Edit_PurchaseOrder; 
}


public static WebElement 	 Edit_PurchaseOrderAdd(WebDriver driver){
	 
	Edit_PurchaseOrderAdd = driver.findElement(By.xpath(".//*[@id='CustomerPurchaseOrdersGrid']/div[1]/a"));
	
		 return Edit_PurchaseOrderAdd; 
}

public static WebElement 	 Edit_PurchaseOrderNumberclick(WebDriver driver){
	 
	Edit_PurchaseOrderNumberclick = driver.findElement(By.xpath(".//*[@id='PONumber']"));
	
		 return Edit_PurchaseOrderNumberclick; 
}

public static WebElement 	 Edit_PurchaseOrderNumberInput(WebDriver driver){
	 
	Edit_PurchaseOrderNumberInput = driver.findElement(By.xpath(".//*[@id='PONumber']"));
	
		 return Edit_PurchaseOrderNumberInput; 
}

public static WebElement 	 Edit_DateFromInput(WebDriver driver){
	 
	Edit_DateFromInput = driver.findElement(By.xpath(".//*[@id='DateFrom']"));
	
		 return Edit_DateFromInput; 
}


public static WebElement 	Edit_DateToINput(WebDriver driver){
	 
	Edit_DateToINput = driver.findElement(By.xpath(".//*[@id='DateTo']"));
	
		 return Edit_DateToINput; 
}
public static WebElement 	 Edit_Delete(WebDriver driver){
	 
	Edit_Delete = driver.findElement(By.xpath(".//a[@class='btn btn-xs red']"));
	
		 return Edit_Delete; 
}
public static WebElement 	 Update(WebDriver driver){
	 
	Update = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
	
		 return Update; 
}

public static WebElement 	 UpdateMessage(WebDriver driver){
	 
	UpdateMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
	
	System.out.println(UpdateMessage.getText());
	
	
		 return UpdateMessage; 
}




}
