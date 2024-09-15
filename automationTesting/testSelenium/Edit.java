package testSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

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
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		WebElement date = driver.findElement(By.xpath("//input[@name='CloseDate']"));
		date.clear();
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("14/09/2024");
		driver.findElement(By.xpath("//button[@data-value='Needs Analysis']")).click();
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Perception Analysis']")).click();
        WebElement progress = driver.findElement(By.xpath("//button[@aria-label='Delivery/Installation Status']"));
        driver.executeScript("arguments[0].click()", progress);
        driver.findElement(By.xpath("//span[text()='In progress']")).click();
        driver.findElement(By.xpath("//textarea[@part='textarea']")).sendKeys("SalesForce");
        driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
        WebElement title = driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Perception Analysis']"));
		String stage=title.getText();
		if(stage.equals("Perception Analysis")) {
			System.out.println("verified");
		}
		else {
			System.out.println("not verified");
		}
		
				
	}

}
