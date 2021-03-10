import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert; 

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREE\\Desktop\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http:spicejet.com");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
	
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	
		System.out.println("driver.findElement(By.id(\"Div1\")).getAttribute(\"style\")");
		//Calander part
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
{
	System.out.println("it's enabled"); 
    Assert.assertTrue(true);
}
		else 
		{
			Assert.assertFalse(false);
			
		}
			
		
		/*count the number of checkboxes (passanger area)
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
		
		for(int i=1; i<9; i++)
		{
			driver.findElement(By.id("divpaxinfo")).click();
			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		}*/
		
		
	} 	

}
