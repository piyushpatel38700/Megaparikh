//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("703844159");
	    driver.findElement(By.name("pass")).sendKeys("Peter@6813");
	    driver.findElement(By.xpath("//input[@value='Log In']")).click();
	    driver.navigate().back();
	    driver.findElement(By.linkText("Forgot account?")).click();
	    driver.manage().window().maximize();
	    
	   // driver.findElement(By.xpath("//[@id='tsf']/div[2]/div/div[3]/center/div/div/div[12]")).click();
	}
}
