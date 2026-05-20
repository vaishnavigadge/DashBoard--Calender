package hi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {

	@Test
	public void loginData() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testapp.digibility.ai/login");

		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("gadgevaishnavichhatrapati@gmail.com");

		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("Vaish20@2001");

		WebElement btnSignin = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/form/button"));
		btnSignin.click();

		driver.quit();
	}

	@Test
	public void post() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testapp.digibility.ai/admin/AdminContentCalendar");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement post = driver.findElement(By.cssSelector(
				"#root > div > div.min-h-screen.md\\:h-screen.bg-background.flex.flex-col > div > div.flex-1.flex.flex-col.min-h-0.overflow-y-auto.overflow-x-hidden > main > div > div > div.rounded-lg.bg-card.text-card-foreground.shadow-sm.border-0 > div > div > div > div.hidden.w-full.items-stretch.gap-3.p-3.lg\\:grid.\\[grid-template-columns\\:repeat\\(7\\,minmax\\(0\\,1fr\\)\\)\\].bg-\\[\\#f9fafb\\] > div.flex.h-full.w-full.flex-col.rounded-lg.bg-white.p-2.min-h-\\[140px\\].md\\:min-h-\\[125px\\].lg\\:min-h-\\[125px\\].border-\\[2px\\].border-black > div > div > div.mt-2.flex.flex-1.flex-col.gap-2.overflow-hidden > button > div > div.min-w-0.flex-1 > div > span.inline-flex.rounded-md.border.px-1\\.5.py-0\\.5.text-\\[10px\\].font-medium.text-red-500"));
		post.click();

		driver.quit();
	}
}
