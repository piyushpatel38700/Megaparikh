import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000l);
		
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=driver.findElement(By.id("navFooter"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		driver.findElement(By.xpath("//*[@id='navFooter']/div[1]/div/div[3]/ul/li[1]/a")).click();
		System.out.println(driver.getTitle());
		System.out.println("Well  done Keep Going");
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//a[@class='nav-menu-cta link button button-type-primary button-theme-filled font-size-small']")).click();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Piyushpate@testing.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Thread.sleep(1000L);
		
		driver.findElement(By.xpath("//a[@class='a-link-normal']")).click();
		
		System.out.println(driver.getTitle());
		
		System.out.println("Opps Need to Create Account Frist");
				
	}
}
