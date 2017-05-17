package openurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWiki {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vineela\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org");
		WebElement link;
		link = driver.findElement(By.id("js-link-box-en"));
		link.click();
		Thread.sleep(5000);
		WebElement searchBox;
		searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Software");
		searchBox.submit();
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
