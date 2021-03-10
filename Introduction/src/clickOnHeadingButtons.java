import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickOnHeadingButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\Desktop\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
	    driver.findElement(By.id("Covid19info")).click();
	    //driver.close();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector(".text-label.text-active")).click();
	    
		
	}

}
