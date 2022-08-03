package vikas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//home//vikasb//Music//chrome//chromedriver");	
		WebDriver d = new ChromeDriver();
		d.get("https://www.redbus.in/");
		d.findElement(By.cssSelector(".fl.icon-calendar_icon-new.icon-onward-calendar.icon")).click();
		List<WebElement> dates = d.findElements(By.cssSelector(".wd.day"));
		int count = d.findElements(By.cssSelector(".wd.day")).size();
		for(int i=0;i<count;i++)
		{
			String text = d.findElements(By.cssSelector(".wd.day")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				d.findElements(By.cssSelector(".wd.day")).get(i).click();
				break;
			}

		}
			
	}

}