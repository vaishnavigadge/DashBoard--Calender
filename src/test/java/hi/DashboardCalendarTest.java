package hi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DashboardCalendarTest {

	@Test
	public void dashboardCalendarFlow() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testapp.digibility.ai/login");

		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("gadgevaishnavichhatrapati@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Vaish20@2001");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(5000);
		driver.get("https://testapp.digibility.ai/dashboard");

		WebElement ignoreBtn = driver.findElement(By.xpath("//button[contains(text(),'Ignore')]"));
		ignoreBtn.click();
		Thread.sleep(3000);

		System.out.println("Popup handled successfully");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement calendar = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Calendar')]")));
		calendar.click();
		System.out.println("Content Calendar Clicked Successfully");

		WebElement post = driver.findElement(By.xpath(
				"//*[@id="root"]/div/div[1]/div/div[2]/main/div/div/div[2]/div/div/div/div[1]/div[32]/div/div/div[2]/button[2]/div/div[2]/div/span[1]"));
		post.click();

		driver.quit();
	}
}
