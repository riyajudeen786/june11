package riyaz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	public static void main (String [] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Riyajudeen\\\\Software\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in//");
		WebElement from=driver.findElement(By.xpath("//input[@data-message='Please enter a source city']"));
		from.sendKeys("karur");
		WebElement to=driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']"));
		to.sendKeys("kodumudi");
		
		
	
}
}