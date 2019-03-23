import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CityBank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.citigroup.com/citi/");
		driver.manage().window().maximize();
 //count the link in entire page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Limiting the web driver scope
 //count the link in footer only
		WebElement footerdriver=driver.findElement(By.id("main-citi-footerNav"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
    //count the link from first column in footer
		WebElement columndriver=footerdriver.findElement(By.xpath("//*[@id=\'citi-consumer-business\']"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

    //click on each link in the column and get the title of the page 
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
			//System.out.println(columndriver.findElements(By.tagName("a")).size());		
		{
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(1000L);
									
		}
	//opens all the tab and get title
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		
		    while(it.hasNext())
		    {
		    	driver.switchTo().window(it.next());
		    	System.out.println(driver.getCurrentUrl());
		    	
		    } 
		    Thread.sleep(3000L);
		    driver.quit();
		    Thread.sleep(3000L);
		    WebDriver driver1=new ChromeDriver();
		    driver1.get("https://www.citigroup.com/citi/");
		    driver1.manage().window().maximize();
		    driver1.findElement(By.partialLinkText("Consumer Businesses")).click();
		    
		    //done success
		    
	}

}
