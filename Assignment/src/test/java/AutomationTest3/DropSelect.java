package AutomationTest3;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class DropSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		WebElement elements = driver.findElement(By.id("country"));
		Select dropDown = new Select(elements);
		dropDown.selectByVisibleText("Australia");
		dropDown.selectByValue("japan");
		if(dropDown.isMultiple()) {
			System.out.println("This is Multiple Select option");
		}
		else {
			System.out.println("Multiple Selection is not possible");
		}
		List <WebElement> appdropdown = dropDown.getOptions();
		for(WebElement e : appdropdown) {
			System.out.println("Options are:"+e.getText());
		}
		System.out.println(appdropdown.size());
		
	}
	

}
