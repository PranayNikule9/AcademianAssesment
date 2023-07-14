import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium {
	WebDriver driver;

	@BeforeTest
	public void Before() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Automation Software\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);

		driver.get("https://in.bookmyshow.com/explore/home/");
		driver.manage().window().maximize();
		WebElement city = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[2]/ul/li[3]/div/div/img"));
		city.click();
		
		WebElement singin = driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[1]/div/div/div/div[2]/div[2]/div[1]"));
		singin.click();
		
		WebElement entermail = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/div"));
		entermail.click();

		WebElement email = driver.findElement(By.xpath("//*[@id=\"emailId\"]"));
		email.sendKeys("seleniumauto@yopmail.com");
		
		WebElement continuebutton = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div[2]/form/div[2]/button"));
		continuebutton.click();
	}

	@Test

	public void Email() {
		driver.get("https://yopmail.com/");
		driver.manage().window().maximize();
		
		WebElement entertext = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		entertext.sendKeys("seleniumauto@yopmail.com");
		entertext.click();
		
		WebElement bookmyshow = driver.findElement(By.xpath("//*[@id=\"e_ZwZjAmN5ZGx0AQDjZQNjAQRjZwH3Zj==\"]/button/div[1]/span[2]"));
		bookmyshow.click();

	}

	@AfterTest
	public void after() {

		WebElement otp1 = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div[2]/form/div[1]/div[3]"));
		otp1.sendKeys("788228");

		WebElement lastcontinus = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div[2]/form/div[2]/button"));
		lastcontinus.click();

	}
}
