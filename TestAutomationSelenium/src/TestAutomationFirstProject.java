import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestAutomationFirstProject {

	public static void main(String[] args) throws IOException, Exception{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS); 
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	//1.Test radio buttons
		 
		 WebElement rbt1=driver.findElement(By.cssSelector("input[value='radio1']"));
		 rbt1.click(); 
		 Thread.sleep(2000);
	 	 WebElement rbt2=driver.findElement(By.cssSelector("input[value='radio2']"));
		 rbt2.click();
		 Thread.sleep(2000);
		 WebElement rbt3=driver.findElement(By.cssSelector("input[value='radio3']"));
		 rbt3.click();
		 Thread.sleep(2000);
		 System.out.println("Radio button 1 is selected?"+rbt1.isSelected());
		 System.out.println("Radio button 2 is selected?"+rbt2.isSelected());
		 System.out.println("Radio button 3 is selected?"+rbt3.isSelected());
		 System.out.println(" ");
		 
    //2.suggession class test
		 
		 WebElement sugg=driver.findElement(By.id("autocomplete"));
		 sugg.sendKeys("Australia");
		 Thread.sleep(2000);
		 
	//3.Drop Down
			
			 WebElement Dd=driver.findElement(By.xpath("//*[@id=\'dropdown-class-example\']"));
			 Dd.click();
			 Thread.sleep(1000);
			 WebElement Dd1=driver.findElement(By.xpath("//*[@id=\'dropdown-class-example\']/option[2]"));
			 Dd1.click();
			 Thread.sleep(1000);
			 WebElement Dd2=driver.findElement(By.xpath("//*[@id=\'dropdown-class-example\']/option[3]"));
			 Dd2.click();
			 Thread.sleep(1000);;
			 WebElement Dd3=driver.findElement(By.xpath("//*[@id='dropdown-class-example']/option[4]"));
			 Dd3.click();
			 System.out.println("Drop Down Option 1 is selected?"+Dd1.isSelected());
			 System.out.println("Drop Down Option 2 is selected?"+Dd2.isSelected());
			 System.out.println("Drop Down Option 3 is selected?"+Dd3.isSelected());
			 Thread.sleep(2000);
			 System.out.println(" ");
			 
	//4.Test check box 
		 
		 	int i=0;
			while(i<=1)
			{
			
			 WebElement cb1=driver.findElement(By.id("checkBoxOption1"));
			 cb1.click();
			 Thread.sleep(2000);
			 WebElement cb2=driver.findElement(By.id("checkBoxOption2"));
			 cb2.click();
			 Thread.sleep(2000);
			 WebElement cb3=driver.findElement(By.id("checkBoxOption3"));
			 cb3.click();
			 
			 if(i==0)
			 {
				 System.out.println("CheckBox Status after selected the checkbox");
				 System.out.println("Checkbox 1 is selected?"+cb1.isSelected());
				 System.out.println("Checkbox 2 is selected?"+cb2.isSelected());
				 System.out.println("Checkbox 3 is selected?"+cb3.isSelected());
			 }
			 else
			 {
				 System.out.println("CheckBox Status when uncheck the CheckBox");
				 System.out.println("Checkbox 1 is selected?"+cb1.isSelected());
				 System.out.println("Checkbox 2 is selected?"+cb2.isSelected());
				 System.out.println("Checkbox 3 is selected?"+cb3.isSelected());
			 }
			 i++; 
			}
			System.out.println(" ");
			Thread.sleep(2000);	
		//5.Switch Window Example
			
			WebElement window=driver.findElement(By.xpath("//*[@id=\'openwindow\']"));
			Thread.sleep(1000);
			window.click();
			Thread.sleep(5000);
			Set<String>handleSet=driver.getWindowHandles();
			ArrayList<String>handleList=new ArrayList<String>(handleSet);
			driver.switchTo().window(handleList.get(1));
			driver.close();
			driver.switchTo().window(handleList.get(0));
			System.out.println("Open Window is enabled?"+window.isEnabled());
		 
		
		//6.Switch tab test
			
		 Thread.sleep(1000);
		 WebElement St1=driver.findElement(By.linkText("Open Tab"));
		 St1.click();
		 System.out.println("Open Tab is enabled?"+St1.isEnabled());
		 Thread.sleep(5000);
		 Set<String>handlesSet=driver.getWindowHandles();
		 ArrayList<String>handlesList=new ArrayList<String>(handlesSet);
		 driver.switchTo().window(handlesList.get(1));
		 driver.close();
		 driver.switchTo().window(handlesList.get(0));	
		 Thread.sleep(1000);
		 System.out.println(" "); 
		 
		//7.Switch to alert example
			 
			 WebElement SS=driver.findElement(By.id("name"));
			 SS.sendKeys("Arya");
			 Thread.sleep(2000);
			 WebElement Alrt=driver.findElement(By.id("alertbtn"));
			 Alrt.click();
			 Thread.sleep(2000);
			 Alert Al=driver.switchTo().alert();
			 Al.accept(); 
			 Thread.sleep(2000);
			 driver.findElement(By.id("name")).sendKeys("Arya");
			 Thread.sleep(2000);
			 WebElement Cfm=driver.findElement(By.id("confirmbtn"));
			 Cfm.click();
			 Thread.sleep(2000);
			 Al.dismiss();
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,700)");
			 
		 //8.Web table
			 
				System.out.println("Web Table");
				int rowcount=driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr")).size();
				System.out.println("Row count:"+rowcount);
				int columncount=driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr[2]/td")).size();
				System.out.println("Column count:"+columncount);
				System.out.println();
				System.out.println("The table contents are");
				System.out.println();

				for(int k=1;k<=rowcount;k++)
				{
					System.out.println();
					for(int m=1;m<=columncount;m++)
					{
						
						WebElement ele=driver.findElement(By.xpath("//*[@id=\'product\']/tbody/tr["+k+"]/*["+m+"]"));
						System.out.print(ele.getText()+" ");
				
					}
					
					System.out.println();
				}
				ArrayList<Integer>array=new ArrayList<Integer>();
				
				for(int p=2;p<=rowcount;p++)
				{
					for(int q=1;q<=columncount;q++)
					{
						
						if(q==3)
						{
							String y="//*[@id=\'product\']/tbody/tr["+p+"]/*["+q+"]";
							String price=driver.findElement(By.xpath(y)).getText();
							int n1=Integer.valueOf(price);
							array.add(n1);
						}
						
					}
					
					
				}
				Collections.sort(array);
				System.out.println();
				int b=array.size();
				System.out.println("largest price:"+array.get(b-1));
				System.out.println("Smallest price:"+array.get(0));
				System.out.println(" ");
				
			 
		//9.Element displayed example
				
			System.out.println("Element displayed Testing");
			WebElement dt=driver.findElement(By.id("displayed-text"));
			System.out.println("testbox displayed?"+dt.isDisplayed());
			Thread.sleep(1000);
			WebElement Hd=driver.findElement(By.id("hide-textbox"));
			Hd.click();
			System.out.println("testbox displayed after click on hide?"+dt.isDisplayed());
			Thread.sleep(2000);
			WebElement Sh=driver.findElement(By.id("show-textbox"));
			Sh.click();
			System.out.println("testbox displayed after click on show?"+Hd.isDisplayed());
			Thread.sleep(1000);
			System.out.println(" ");	
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,500)");
			
	  //10.Mouse hover
			
			System.out.println("Mouse Hover Testing");
			Thread.sleep(2000);
			int j=0;
			while(j<=1)
			{
			WebElement ms=driver.findElement(By.id("mousehover"));
			Actions action=new Actions(driver);
			action.moveToElement(ms).perform();
			Thread.sleep(2000);
			if(j==0)
			{
				WebElement Top=driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[1]"));
				Thread.sleep(2000);
				Top.click();
				System.out.println("Top is Enabled?"+Top.isEnabled());
			}
			else
			{
				WebElement Reload=driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]"));
				Thread.sleep(2000);
				Reload.click();
			}
			j++;
			Thread.sleep(2000);
			}
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,700)");
			
			System.out.println(" "); 	
		//11.Blink text 
			
			WebElement Blink=driver.findElement(By.linkText("Limited offer - FREE Core Java & QA Resume course"));
			System.out.println("Blink Text is enabled ?"+Blink.isEnabled());
			Blink.click();
			Thread.sleep(5000);
			driver.navigate().back();
			System.out.println(" ");
		//12..Home button
			
			WebElement Home=driver.findElement(By.xpath("/html/body/header/div/a/button"));
			System.out.println("Home button is selected ?"+Home.isEnabled());
			Home.click();
			Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(1000);
			System.out.println(" ");
		//13.Practice button
			
			WebElement Practice=driver.findElement(By.xpath("/html/body/header/div/button[1]"));
			System.out.println("Practice button is enabled ?"+Practice.isSelected());
			Practice.click();
			Thread.sleep(1000);
			System.out.println(" ");
		//14.Login Button
			WebElement Login=driver.findElement(By.xpath("/html/body/header/div/button[2]"));
			System.out.println("Login button is enabled ?"+Practice.isSelected());
			Login.click();
			Thread.sleep(1000);
			System.out.println(" ");
		//15.Signup button
			WebElement Signup=driver.findElement(By.xpath("/html/body/header/div/button[3]"));
			System.out.println("Signup button is enabled ?"+Signup.isSelected());
			Signup.click();
			System.out.println(" ");
			
		//16.iFrame
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollBy(0,1000)"); 
			WebElement IF=driver.findElement(By.xpath("//*[@id=\'courses-iframe\']" ));
			IF.click();
			System.out.println("iframe is Displayed?"+IF.isDisplayed());
			Thread.sleep(1000);
			driver.close();
	
		 
	}

}
