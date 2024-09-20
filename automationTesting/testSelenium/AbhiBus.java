import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver ();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		driver.findElement(By.xpath("//div[@id='search-button']")).click();
	   WebElement element = driver.findElement(By.xpath("(//h5[@class='title'])[1]"));
	   String busName=element.getText();
	   System.out.println(busName);
	   driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
	   WebElement element2 = driver.findElement(By.xpath("//div[@class='text-grey'][1]"));
	   String seatCount=element2.getText();
	   System.out.println(seatCount);
	   driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//span[text()='4UB']")).click();
	   driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//div[@id='place-container']//input")).click();
	   WebElement element3 = driver.findElement(By.xpath("//div[@class='seat-fare col auto']"));
	   String amount=element3.getText();
	   System.out.println(amount);
	   WebElement element4 = driver.findElement(By.xpath("//div[@class='selected-seat col auto']//div[1]/div[1]"));
	   String selectedSeat=element4.getText();
	   System.out.println(selectedSeat);
	   driver.close();
	   
	}

}

