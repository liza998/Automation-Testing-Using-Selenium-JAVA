package AutomationTest3;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class Assignment {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("btn_action")).click();
	    driver.findElement(By.xpath("//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']")).click();
	    driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
	    driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();
	    driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
	    driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Liza");
	    driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Mostafa");
	    driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("768");
		driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
		driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();
		driver.close();
	}

}
