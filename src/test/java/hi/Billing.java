package hi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class Billing {
	@Test
	 public void bill() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testapp.digibility.ai/login");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.id("email")).sendKeys("gadgevaishnavichhatrapati@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Vaish20@2001");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/form/button")).click();
		
		//Asign Browser URL
		driver.get("https://testapp.digibility.ai/onboarding");
		
		// Click Ignore Button
		WebElement ignoreBtn = driver.findElement(By.cssSelector("#radix-\\:r29\\: > div.flex.flex-col-reverse.sm\\:flex-row.sm\\:justify-end.sm\\:space-x-2.gap-2.sm\\:gap-0 > button.inline-flex.items-center.justify-center.gap-2.whitespace-nowrap.rounded-md.text-sm.ring-offset-background.transition-colors.focus-visible\\:outline-none.focus-visible\\:ring-2.focus-visible\\:ring-ring.focus-visible\\:ring-offset-2.disabled\\:pointer-events-none.disabled\\:opacity-50.\\[\\&_svg\\]\\:pointer-events-none.\\[\\&_svg\\]\\:size-4.\\[\\&_svg\\]\\:shrink-0.hover\\:bg-accent.hover\\:text-accent-foreground.h-10.px-4.py-2.font-medium"));
		//WebElement ignoreBTN = driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[1]"));

		ignoreBtn.click();
		Thread.sleep(3000);

		System.out.println("Popup handled successfully");
		
		// Explicit Wait
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0,500).perform();
		
		//Click on Profile Icon 
		WebElement Icon = driver.findElement(By.xpath("//*[@id=\"radix-:r8:\"]/span/span"));
		Icon.click();
		
		//Click on Billing And Plans
		WebElement BillandPlan = driver.findElement(By.xpath("//*[@id=\"radix-:r9:\"]/a[2]"));
		BillandPlan.click();
		
		//Click on Enrollment Button
		WebElement EnrollBtn = driver.findElement(By.xpath("//*[@id=\"pricing-plans\"]/div/div[1]/div[2]/button"));
		EnrollBtn.click();
		
	}
}

	


