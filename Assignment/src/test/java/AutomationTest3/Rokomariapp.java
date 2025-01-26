package AutomationTest3;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class Rokomariapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://chaldal.com/?srsltid=AfmBOor1S3XEMDUvTRwpYckRwf3E54F6eMWFMVaene5yo2ahlbK3G1vP");
		driver.findElement(By.xpath("//input[@name='mainSearch']")).sendKeys("Potato");
		driver.findElement(By.xpath("//div[@data-reactid='.5j7yb1ikt2.d.2.0.0.0.0.2.6.1.0:$2230_Grocery.0.2.5']")).click();
		
		
		//driver.findElement(By.xpath("//button[@class='btn btn-left']")).click();
		//driver.findElement(By.xpath("//img[@alt='Hamlet Romeo and Juliet Antony and Cleopatra image']")).click();
	}

}
