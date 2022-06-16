package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryHomePage {


		WebDriver driver;
		
		public PageFactoryHomePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		/*
		 * By searchbox=By.id("srchword");
		 * 
		 * By searchButton=By.xpath("(//input[@class='newsrchbtn'])[1]");
		 */
		
		@FindBy(id="srchword")
		WebElement searchbox;
		
		@FindBy(xpath="(//input[@class='newsrchbtn'])[1]")
		WebElement searchButton;
		
		
		public WebElement searchBox()
		{
			return searchbox;
		}
		
		public WebElement searchButton()
		{
			return searchButton;
		}
		


}
