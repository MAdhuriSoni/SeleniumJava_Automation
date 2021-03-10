import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class selectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\Desktop\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://spicejet.com");
		
		// To select passanger
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		Select dropPassengerAdult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		dropPassengerAdult.selectByVisibleText("2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		//To select currency 
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown =new Select(staticDropdown);
				dropdown.selectByIndex(4);
	           System.out.println( dropdown.getFirstSelectedOption().getText());
	           
	           
	}

}
