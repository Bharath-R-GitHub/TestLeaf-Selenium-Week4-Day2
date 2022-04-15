package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// 1. Get Link
		driver.get("http://www.leafground.com/pages/drag.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 2. Get Element
		WebElement dragElement = driver.findElement(By.id("draggable"));

		// 3. Get Location
		int x = dragElement.getLocation().getX();
		int y = dragElement.getLocation().getY();

		// 4. Drag Around
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(dragElement, x, y).perform();
	}
}
