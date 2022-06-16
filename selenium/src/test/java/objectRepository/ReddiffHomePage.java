package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddiffHomePage {


		WebDriver driver;
		
		public ReddiffHomePage(WebDriver driver)
		{
			this.driver=driver;
		}
		
		
		By searchbox=By.id("srchword");
		
		By searchButton=By.xpath("(//input[@class='newsrchbtn'])[1]");
		
		public WebElement searchBox()
		{
			return driver.findElement(searchbox);
		}
		
		public WebElement searchButton()
		{
			return driver.findElement(searchButton);
		}
		


}
