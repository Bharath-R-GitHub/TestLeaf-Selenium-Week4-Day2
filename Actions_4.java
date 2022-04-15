package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_4 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// 1. Get Link
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 2. Get Elements
		WebElement item3 = driver.findElement(By.xpath("//ol[@id='selectable']/li[3]"));
		WebElement item4 = driver.findElement(By.xpath("//ol[@id='selectable']/li[4]"));
		WebElement item5 = driver.findElement(By.xpath("//ol[@id='selectable']/li[5]"));

		// 3. Select Action
		Actions builder = new Actions(driver);
		builder.clickAndHold(item3).pause(1000).moveToElement(item4).pause(1000).moveToElement(item5).release()
				.perform();

	}
}
