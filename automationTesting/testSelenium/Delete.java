package testSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement element = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click()", element);
		driver.findElement(By.xpath("//div[@data-aura-class='forceVirtualAction']//a[@role='button']")).click();
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		WebElement element2 = driver.findElement(By.xpath("//a[@title='Salesforce Automation by Akshaya']"));
		String text = element2.getText();
		if(text.equals("Salesforce Automation by Akshaya")) {
			System.out.println("Not Deleted");
		}
		else {
			System.out.println("Deleted");
		}
		
	}

}
