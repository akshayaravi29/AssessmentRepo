package week4.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiBank {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://uibank.uipath.com/welcome");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register For Account")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("akshayavasu@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("akshaya@2002");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Akshaya");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("R");
		driver.findElement(By.xpath("//select[@id='sex']")).sendKeys("Female");
		driver.findElement(By.xpath("//select[@id='title']")).sendKeys("Ms");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("04/30/2002");
		driver.findElement(By.xpath("//select[@id='employmentStatus']")).sendKeys("Unemployed");
		driver.findElement(By.xpath("//select[@id='maritalStatus']")).sendKeys("Single");
		driver.findElement(By.xpath("//input[@id='numberOfDependents']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Akshaya_Ravi");
		String title = driver.getTitle();
		if(title.contains("UiBank")) {
			System.out.println("Title verified");
		}
		else {
			System.out.println("Title is not verified");
		}
		driver.close();
		

	}

}
