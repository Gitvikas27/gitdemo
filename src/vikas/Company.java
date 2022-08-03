package vikas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Company {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//home//vikasb//Music//chrome//chromedriver");	
		WebDriver d = new ChromeDriver();
		d.get("https://twdev.repfabric.com");
		d.findElement(By.xpath("//input[@id='frmLoginFrom:uname']")).sendKeys("admin");
		d.findElement(By.xpath("//input[@id='frmLoginFrom:pwd']")).sendKeys("TW_adm!n1");
		d.findElement(By.xpath("//span[normalize-space()='Login']")).click();
		d.findElement(By.xpath("//button[@id='formMenu:dynaButton']")).click();
		d.findElement(By.xpath("//body/div[@id='formMenu:j_idt34']/ul[1]/li[1]/a[1]")).click();
		d.findElement(By.xpath("//button[@id='compDetailForm:dtCompList:btnNew']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='compDetailsButtonForm:tvComp:itCompName']")).sendKeys("automated company");
		Thread.sleep(5000);
		//d.findElement(By.xpath("//div[@id='compDetailsButtonForm:tvComp:oneMenuRegion_panel']")).click();
		d.findElement(By.xpath("//label[@id='compDetailsButtonForm:tvComp:oneMenuRegion_label']")).click();
		 List<WebElement> list = d.findElements(By.xpath("//ul[@id='compDetailsButtonForm:tvComp:oneMenuRegion_items']//li"));
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++) {
        	list.get(i).getText();
        	if(list.get(i).getText().equals("AZ"))
        	{
        		list.get(i).click();
        		break;
        	}
        d.findElement(By.xpath("//button[@id='compDetailsButtonForm:tvComp:btnChooseCompany']")).click();
       List<WebElement> plookup = d.findElements(By.xpath("//tbody[@id='formCompLookup:companyLookUp_data']//tr"));
       System.out.println(plookup.size());
        }
	}

}
