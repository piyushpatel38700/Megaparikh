import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MegaParikh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://mpparikh.com/");
		driver.manage().window().maximize();
 //count the link in entire page
		System.out.println(driver.findElements(By.tagName("a")).size());
		 System.out.println("This ia the home Page");
        System.out.println(driver.getTitle());
//Count the link and perform the action on Home menu on top
        WebElement homemenudriver=driver.findElement(By.id("menu-home"));
		System.out.println(homemenudriver.findElements(By.tagName("a")).size());
		
		for(int i=1;i<homemenudriver.findElements(By.tagName("a")).size();i++)
			//System.out.println(columndriver.findElements(By.tagName("a")).size());		
		{
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			homemenudriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(1000L);
									
		}
		
		        //opens all the tab and get title of home menu
				Set<String> abc=driver.getWindowHandles();
				Iterator<String> it=abc.iterator();
				
				    while(it.hasNext())
				    {
				    	driver.switchTo().window(it.next());
				    	System.out.println(driver.getCurrentUrl());
				    	System.out.println(driver.getTitle());
				    	
				    } 
				    
	   //Social menu  count and click on 
		  WebElement socialmenudriver=driver.findElement(By.id("menu-social-menu"));
		  System.out.println(socialmenudriver.findElements(By.tagName("a")).size());
					
					for(int j=1;j<socialmenudriver.findElements(By.tagName("a")).size();j++)
						//System.out.println(socialmenudriver.findElements(By.tagName("a")).size());		
					   {
					    String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
					    socialmenudriver.findElements(By.tagName("a")).get(j).sendKeys(clickonlinkTab);
					    Thread.sleep(1000);
					    }
					 //opens all the tab and get title of home menu
					Set<String> scc=driver.getWindowHandles();
					Iterator<String> it1=scc.iterator();
					
					    while(it1.hasNext())
					    {
					    	driver.switchTo().window(it1.next());
					    	System.out.println(driver.getCurrentUrl());
					    						    	
					    } 
					
	}

}
