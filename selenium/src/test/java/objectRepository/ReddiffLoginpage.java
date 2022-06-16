package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddiffLoginpage {


		WebDriver driver;
		
		public ReddiffLoginpage(WebDriver driver)
		{
			this.driver=driver;
		}
		By Username=By.id("login1");
		By password=By.id("password");
		By signin=By.xpath("//input[@value='Sign in']");
		By home=By.linkText("rediff.com");
		public WebElement EmailId()
		{
			return driver.findElement(Username);
		}
		
		public WebElement Password()
		{
			return driver.findElement(password);
		}
		
		public WebElement signin()
		{
			return driver.findElement(signin);
		}
		public WebElement Home()
		{
			return driver.findElement(home);
		}
		


}
