package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Training_1 {

	public static String browser = "Chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(browser.equals("Firefox"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://fr-fr.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("Yassir");
		driver.findElement(By.name("email")).clear();
		System.out.println(driver.findElement(By.name("email")).getAttribute("class"));
		System.out.println(driver.findElement(By.name("login")).getCssValue("width"));
		System.out.println(driver.findElement(By.name("login")).getSize());
		System.out.println(driver.findElement(By.name("login")).getLocation());
		System.out.println(driver.findElement(By.name("login")).getText());
		System.out.println(driver.findElement(By.name("login")).getTagName());
		System.out.println(driver.findElement(By.name("login")).isDisplayed());
		System.out.println(driver.findElement(By.name("login")).isEnabled());
		System.out.println(driver.findElement(By.name("login")).isSelected());
		
	
		
	}

}
