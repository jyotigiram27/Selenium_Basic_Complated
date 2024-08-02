package Com.Crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Com.Crm.JavaUtility.JavaUtilityVT;
import Com.Crm.Pom.Login_Page;

public class Vtiger_Baseclass
{
	 public static WebDriver driver;
	  
	  @BeforeClass
	  public void preCondition() throws IOException
	  {
		  String browser = JavaUtilityVT.logindata("browser");
		  String url = JavaUtilityVT.logindata("url");
		  if(browser.equals("chrome")) {
			   driver = new ChromeDriver();
		   }
		   
		   else if(browser.equals("edge")) {
			   driver =new EdgeDriver();
		   }
		   else if (browser.equals("firefox")) {
			   driver = new FirefoxDriver();
		   }
		   else {
			   driver = new EdgeDriver();
		   }
		   
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
	  }
		  @BeforeMethod
		  public void login() throws IOException
		  {
			  Login_Page  ref = new Login_Page (driver);
			  ref.userName(JavaUtilityVT.logindata("username"));
			  ref.password(JavaUtilityVT.logindata("password"));
			  ref.loginbutton();
			  
		  }
		
		  @AfterClass
		  public void postCondition()
		  {
			  driver.quit();
		  }
	

}
