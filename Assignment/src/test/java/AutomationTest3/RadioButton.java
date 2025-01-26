package AutomationTest3;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		WebElement radio = driver.findElement(By.cssSelector("input[id=male]"));
		radio.click();
		radio.isSelected();
		System.out.print(radio.isSelected());
		WebElement checkbox = driver.findElement(By.cssSelector("input[id=wednesday]"));
		checkbox.click();
		WebElement dropdown = driver.findElement(By.cssSelector("select[id=country]"));
		Select drop = new Select(dropdown);
		drop.selectByValue("china");
		//drop.selectByIndex(4);
		String expected_url = "https://testautomationpractice.blogspot.com/";
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url);
		System.out.println("Got the Expected Url");
		
	    List <WebElement> elements = drop.getOptions();
	    System.out.println(elements.size());
	    for(WebElement e : elements) {
	    	System.out.println("Options are" + e.getText());
	    	
	    }
	    WebElement image = driver.findElement(By.xpath(" //input[@id='singleFileInput']"));
        image.click();
		

	}

}
