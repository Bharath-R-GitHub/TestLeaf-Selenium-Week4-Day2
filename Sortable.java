package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// 1. Launch https://jqueryui.com/sortable/
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 2. Handle frame
		driver.switchTo().frame(0);

		// 3. Handle Elements
		WebElement item1 = driver.findElement(By.xpath("//ul[@id='sortable']/li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//ul[@id='sortable']/li[text()='Item 2']"));
		WebElement item3 = driver.findElement(By.xpath("//ul[@id='sortable']/li[text()='Item 3']"));
		WebElement item4 = driver.findElement(By.xpath("//ul[@id='sortable']/li[text()='Item 4']"));
		WebElement item5 = driver.findElement(By.xpath("//ul[@id='sortable']/li[text()='Item 5']"));
		WebElement item6 = driver.findElement(By.xpath("//ul[@id='sortable']/li[text()='Item 6']"));
		WebElement item7 = driver.findElement(By.xpath("//ul[@id='sortable']/li[text()='Item 7']"));

		// 4. Sorting Elements using Mouse
		Actions builder = new Actions(driver);
		builder.dragAndDrop(item7, item1).pause(1000).dragAndDrop(item6, item1).pause(1000).dragAndDrop(item5, item1)
				.pause(1000).dragAndDrop(item4, item1).pause(1000).dragAndDrop(item3, item1).pause(1000)
				.dragAndDrop(item2, item1).pause(1000).dragAndDrop(item1, item1).pause(1000).perform();
	}
}
