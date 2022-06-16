package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.PageFactoryHomePage;
import objectRepository.PageFactoryLoginpage;
import objectRepository.ReddiffHomePage;
import objectRepository.ReddiffLoginpage;

public class PageFacttoryLoginApplication {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Eclipse-Workspace\\UdemyPageObject\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		PageFactoryLoginpage obj=new PageFactoryLoginpage(driver);
		
		obj.EmailId().sendKeys("abc@rediff.com");
		obj.Password().sendKeys("hello");
		obj.signin().click();
		obj.Home().click();
		
		PageFactoryHomePage rd=new PageFactoryHomePage(driver);
		rd.searchBox().sendKeys("Hello");
		rd.searchButton().click();
		 
		

	}
}
