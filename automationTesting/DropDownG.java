package automationTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownG {

	public static void main(String[] args)throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Dropdown']")).click();
		WebElement tool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select obj=new Select(tool);
		obj.selectByIndex(2);
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[@data-label='USA']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[text()='New York']")).click();
		driver.findElement(By.xpath("//input[@name='j_idt87:auto-complete_input']")).sendKeys("Sel");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-item-value='Selenium WebDriver']")).click();
		driver.findElement(By.xpath("//input[@name='j_idt87:auto-complete_input']")).sendKeys("React");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-item-value='ReactJs']")).click();
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[@data-label='English']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		driver.findElement(By.xpath("//li[@data-label='Two']")).click();
		
		

	}

}
