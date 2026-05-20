package hi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Billing {

	@Test
	public void billingFlow() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testapp.digibility.ai/login");

		driver.manage().window().maximize();

		new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.id("email")).sendKeys("gadgevaishnavichhatrapati@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Vaish20@2001");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/form/button")).click();

		Thread.sleep(5000);

		WebElement ignoreBtn = driver.findElement(By.xpath("//button[contains(text(),'Ignore')]"));
		ignoreBtn.click();
		Thread.sleep(3000);

		System.out.println("Popup handled successfully");

		new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement clickOnProfile = driver.findElement(By.xpath("//*[@id=\"radix-:r8:\"]/span/span"));
		clickOnProfile.click();

		WebElement billingAndPlans = driver.findElement(By.xpath("//*[@id=\"radix-:r9:\"]/a[2]"));
		billingAndPlans.click();

		WebElement enrollNow1 = driver.findElement(By.xpath("//*[@id=\"pricing-plans\"]/div/div[2]/div[2]/button"));
		enrollNow1.click();

		driver.quit();
	}
}
