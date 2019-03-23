import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BOALogin {

	//private static String aMD;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cheapoair.com/");
	
		
		
		//String s=amd;
		driver.findElement(By.xpath("//*[@id='app']/div/main/section[1]/div/div/div[1]/div/div/div/section/div/div[1]/div[1]/input")).sendKeys("IAD");
		driver.findElement(By.xpath("//*[@id=\'app\']/div/main/section[1]/div/div/div[1]/div/div/div/section/div/div[1]/div[2]/input")).sendKeys("AMD");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id='app']/div/main/section[1]/div/div/div[1]/div/div/div/section/div/div[1]/div[2]/section/div/ul/li[2]/span/span")).click();
		
		
		
		
		
		driver.findElement(By.xpath("//section[contains(@class,'calendar is--top')]//div[@class='calendar__wrapper']")).click();
		//Thread.sleep(2000l);
		//driver.findElement(By.xpath("//*[@id=\'calendarCompId\']/section/div/div[2]/ol/div[34]/li")).clear();
		//driver.findElement(By.xpath("//*[@id='calendarCompId']/section/div/div[1]/ol/div[34]/li")).click();
		
		//driver.close();
		//Done success
	

	//private static CharSequence AMD(Keys enter) {
		// TODO Auto-generated method stub
		return;
	}

}

