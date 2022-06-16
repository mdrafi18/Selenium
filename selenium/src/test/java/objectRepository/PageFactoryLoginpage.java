package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLoginpage {


		WebDriver driver;
		
		public PageFactoryLoginpage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		/*
		 * By Username=By.id("login1"); By password=By.id("password"); By
		 * signin=By.xpath("//input[@value='Sign in']"); By
		 * home=By.linkText("rediff.com");
		 */
		@FindBy(id="login1")
		WebElement EmailId;
		
		@FindBy(id="password")
		WebElement password;
		
		@FindBy(xpath="//input[@value='Sign in']")
		WebElement signin;
		
		@FindBy(linkText ="rediff.com" )
		WebElement home;
		
		public WebElement EmailId()
		{
			return EmailId;
		}
		
		public WebElement Password()
		{
			return password;
		}
		
		public WebElement signin()
		{
			return signin;
		}
		public WebElement Home()
		{
			return home;
		}
		
		
		


}
