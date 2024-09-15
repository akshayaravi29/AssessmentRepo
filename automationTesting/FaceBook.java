package testSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y _3-90 lfloat _ohe']//input")).sendKeys("Akshaya");
		driver.findElement(By.name("lastname")).sendKeys("Ravi");
		driver.findElement(By.xpath("(//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input)[1]")).sendKeys("akshayavasugi@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("akshaya@2002");
		WebElement element = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select obj=new Select(element);
		obj.selectByValue("30");
		WebElement element2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select obj1=new Select(element2);
		obj1.selectByVisibleText("Apr");
		WebElement element3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select obj2=new Select(element3);
		obj2.selectByValue("2002");
		driver.findElement(By.xpath("//span[@data-name=\"gender_wrapper\"]//input")).click();
		
	}

}
