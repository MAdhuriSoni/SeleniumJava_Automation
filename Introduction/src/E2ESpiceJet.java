import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class E2ESpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\Desktop\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		// Select Origin
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000); //to avoid any synchronization
	   // Select Destination
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']")).click();
	    driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
	    Thread.sleep(2000);
	    //To Select the date of Journey
     //  driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	
	//Grab the comman attribute out it in the list and iterate
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
	while(!driver.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText().contains("April 2021"))
	{
	  // driver.findElement(By.xpath("//a[@data-handler='next']")).click();
	driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']/span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	System.out.println(driver.findElement(By.cssSelector("div[class='ui-datepicker-title'] [class='ui-datepicker-month']")).getText());
	
	}
	List<WebElement> dates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
	int count= dates.size();
	for(int i=0; i<count; i++)
	{
	String txt = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td")).get(i).getText();
	if(txt.equalsIgnoreCase("16"))
	{
	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td")).get(i).click();
	System.out.println(txt);
	break;
	}
	}
	
	// To click on round trip
      
     //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).click();

	Thread.sleep(2000);
	// To select passanger
			driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
			Thread.sleep(2000);
			
			// Selection of Adults
		    WebElement Adults = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
		    Select adultsdrp = new Select(Adults);
		    adultsdrp.selectByValue("2");
		   
		    // Selection of Childs
		    WebElement childs = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
		    Select childsdrp = new Select(childs);
		    childsdrp.selectByValue("2");
		    driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();
		    System.out.println(driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).getText());
			
			//To select currency 
			WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			Select dropdown =new Select(staticDropdown);
					dropdown.selectByIndex(4);
		           System.out.println( dropdown.getFirstSelectedOption().getText());
		           Thread.sleep(2000);    
		           driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();	       	
	}
}