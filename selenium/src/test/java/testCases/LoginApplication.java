package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.ReddiffHomePage;
import objectRepository.ReddiffLoginpage;

public class LoginApplication {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Eclipse-Workspace\\UdemyPageObject\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		ReddiffLoginpage obj=new ReddiffLoginpage(driver);
		obj.EmailId().sendKeys("abc@rediff.com");
		obj.Password().sendKeys("hello");
		obj.signin().click();
		obj.Home().click();
		ReddiffHomePage rd=new ReddiffHomePage(driver);
		rd.searchBox().sendKeys("Hello");
		rd.searchButton().click();
		

	}
}
