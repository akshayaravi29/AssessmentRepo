package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserLaunch {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Akshaya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7598025744");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("akshayavasugi@gmail.com");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("TVM");
		driver.findElement(By.className("smallSubmit")).click();
		
		if(title.contains("View Lead")) {
			System.out.println("Verified");
		}
		else {
			System.out.println("Not verified");
		}
		
		
		
		

	}

}

