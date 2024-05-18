package variousConcepts44;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDropdown {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
		@Test
		public void testDropdown() {
			
			By USER_NAME_FIELD = By.xpath("//*[@id=\"user_name\"]");
			By PASSWORD_FIELD = By.xpath("//*[@id=\"password\"]");
			By SIGNIN_BUTTON_FIELD = By.xpath("//*[@id=\"login_submit\"]");
			By DASHBOARD_HEADER_FIELD = By.xpath("/html/body/div[1]/section/div/div[2]/div/div/heade");

			
			driver.findElement(USER_NAME_FIELD).sendKeys("demo@codefios.com");
			driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
			driver.findElement(SIGNIN_BUTTON_FIELD).click();
			
			Assert.assertTrue("Dashboard page not found", driver.findElement(DASHBOARD_HEADER_FIELD).isDisplayed());
			
			
			
			
			
			
			
		}
			
			
			
			
			
			
			
			
			//public void testLogin() throws InterruptedException {

				// type name = value

				// Element list - WebElement

				//WebElement USER_NAME_ELEMENT = driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
				//WebElement PASSWORD_ELEMENT = driver.findElement(By.xpath("//*[@id=\"password\"]"));
				//WebElement SIGNIN_BUTTON_ELEMENT = driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));

				// Element List - By Class Type
				
				//driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("demo@codefios.com");	
				//driver.findElement(USER_NAME_FIELD).sendKeys("demo@codefios.com");
				//USER_NAME_ELEMENT.sendKeys("demo@codefios.com");
				// Thread.sleep(200);

				// USER_NAME_ELEMENT.clear();

				//USER_NAME_ELEMENT.sendKeys("demo@codefios.com");
				//PASSWORD_ELEMENT.sendKeys("abc123");
				//SIGNIN_BUTTON_ELEMENT.click();
				
				
				
				
				
				//WebElement DASHBOARD_HEADER_ELEMENT = driver.findElement(By.xpath("//strong[text()='Dashboard']"));

				//Assert.assertTrue("Dashboard page not found", DASHBOARD_HEADER_ELEMENT.isDisplayed());
				
			
			
		
		
		
		
		
		
		
		
		
	}
	
	


