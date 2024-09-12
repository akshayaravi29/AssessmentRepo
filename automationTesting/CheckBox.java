package automationTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.findElement(By.xpath("//a/i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//a/span[text()='Check Box']")).click();
		driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']/div)[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']/div)[4]")).click();
		driver.findElement(By.xpath("(//div[@class='col-12'])[3]//div[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[2]/div[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[4]/div[2]")).click();
		driver.findElement(By.xpath("(//div[@class='grid formgrid'])[4]//div[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-toggleswitch ui-widget'])/div[2]")).click();
		driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']")).click();
		WebElement element = driver.findElement(By.xpath("//input[@aria-label='Filter Input']"));
	        element.sendKeys("Istanbul");
	        driver.findElement(By.xpath("//li[@data-item-value='Istanbul']/div")).click();
	        driver.findElement(By.xpath("//a[@aria-label='Close']/span")).click();
	      
		
	}

}
