package TestTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationFrameworkLevel2 {
	public WebDriver driver;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS); 
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com");
	}
  @Test
  public void Login() throws InterruptedException {
	  System.out.println(driver.getCurrentUrl());
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[1]/div/input")).sendKeys("aryasreesaji1525@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[2]/div/input")).sendKeys("Ary@1234");
	  driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[3]")).click();
	  Thread.sleep(2000);
	 }
  @Test
  public void Operations() throws InterruptedException { 
	  System.out.println("Login successfully"); 
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\'main-nav\']/a[3]/span")).click();
	  driver.findElement(By.xpath("//*[@id=\'dashboard-toolbar\']/div[2]/div/a/button")).click();
	  //add new contact
	  driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")).sendKeys("Maneesha");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/div/input")).sendKeys("Madhukumar");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input")).sendKeys("Ust Global");
	  driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/div[2]/div/span")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.name("channel_type")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[7]/div[1]/div/div/div/div[1]/div[2]/div[2]/span")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[7]/div[2]/div/div/input")).sendKeys("Kolkata");
	  driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[7]/div[2]/div/div/div[2]/div/span")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[7]/div[2]/div/div/div[1]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.name("address")).sendKeys("Maneesha villa");
	  Thread.sleep(1000);
	  driver.findElement(By.name("city")).sendKeys("Trivandrum");
	  Thread.sleep(1000);
	  driver.findElement(By.name("state")).sendKeys("Kerala");
	  Thread.sleep(1000);
	  driver.findElement(By.name("zip")).sendKeys("695562");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[9]/div/div/div/div[5]/div/input")).sendKeys("India");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[9]/div/div/div/div[5]/div/div[2]/div[2]/span")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[13]/div[2]/div/div/label")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.name("day")).sendKeys("21");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[15]/div[1]/div/div/div[2]/i")).click();
	  driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[15]/div[1]/div/div/div[2]/div[2]/div[13]/span")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.name("year")).sendKeys("1993");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\'dashboard-toolbar\']/div[2]/div/button[2]")).click();
	  Thread.sleep(2000);

	   }
   @AfterTest
  public void BrowserClose() throws InterruptedException {
	   driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/button[3]/i")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[2]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\'top-header-menu\']/div[3]/div[2]/div/i")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\'top-header-menu\']/div[3]/div[2]/div/div/a[5]/span")).click();
	   driver.close();
  }

}
