package AutomationTest3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		SoftAssert soft = new SoftAssert();
		String actual_title = driver.getTitle();
		String expected_title = "GUI Elements";
		//Assert.assertEquals(actual_title, expected_title, "Verified:::");
		soft.assertEquals(actual_title, expected_title, "Verified:::");
		System.out.println(actual_title);
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		//Assert.assertTrue(icon.isDisplayed());
		soft.assertTrue(icon.isDisplayed());
		System.out.println("Got the icon");
		WebElement search = driver.findElement(By.className("wikipedia-search-input"));
		//Assert.assertTrue(search.isDisplayed());
		soft.assertTrue(search.isDisplayed());
		System.out.println("Got the Serch Bar");
		soft.assertAll();
		driver.close();

	}

}
