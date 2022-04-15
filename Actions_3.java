package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// 1. Get Link
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 2. Get Element
		WebElement dragElement = driver.findElement(By.id("draggable"));
		WebElement dropElemet = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		
		// 3. Drag And Drop
		Actions builder = new Actions(driver);
		builder.dragAndDrop(dragElement, dropElemet).perform();

		// 4. Validation
		String text = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();

		if (text.contains("Dropped")) {
			System.out.println("The Element moved to Target. Hence VALIDATION SUCCESS");
		} else {
			System.out.println("The Element does not moved to Target. Hence VALIDATION FAILED");

		}
	}
}
