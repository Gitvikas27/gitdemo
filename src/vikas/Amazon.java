package vikas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String array [] = {"a-techsales","a-metro"};
		System.setProperty("webdriver.chrome.driver", "//home//vikasb//Music//chrome//chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://repfabric.signin.aws.amazon.com/console");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("it-admin\n");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("$pRIYX-3MS{h7S)");
        driver.findElement(By.xpath("//a[@id='signin_button']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='awsui-expandable-section-1-trigger']//span[@class='awsui-icon awsui-icon-size-normal awsui-icon-variant-normal']")).click();
        driver.findElement(By.xpath("(//a[@id='allServicesLink-s3'])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[normalize-space()='repfabric-v3-prod-backups']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[contains(text(),'database_backups/')]")).click();
        //Thread.sleep(5000);
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");
        Date date = new Date();
        String date1= dateFormat.format(date);
        System.out.println(date1);
        
        driver.findElement(By.xpath("//input[@placeholder='Find objects by prefix']")).sendKeys(date1);
         driver.findElement(By.xpath("//input[@placeholder='Find objects by prefix']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/awsui-app-layout[1]/div[1]/main[1]/div[2]/div[1]/div[1]/span[1]/main[1]/div[1]/div[2]/awsui-tabs[1]/div[1]/div[1]/div[1]/span[1]/div[1]/awsui-table[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/span[1]/span[1]/a[1]/span[1]")).click();
        for(int i=0;i<=array.length-1;i++)
        {
            driver.findElement(By.xpath("//input[@placeholder='Find objects by prefix']")).sendKeys(array[i]);
            driver.findElement(By.xpath("//input[@placeholder='Find objects by prefix']")).sendKeys(Keys.ENTER);
           System.out.println(driver.findElement(By.xpath("(//span[@class='awsui_results_1sdq3_3izys_20 awsui_results-visible_1sdq3_3izys_26'])[1]")).getText());
           driver.findElement(By.xpath("//span[@class='awsui_input-icon_2rhyz_l26z3_132 awsui_input-icon-right_2rhyz_l26z3_144 awsui_input-icon-hoverable_2rhyz_l26z3_135']//span[@class='awsui_icon_h11ix_fcx0w_4 awsui_size-normal-mapped-height_h11ix_fcx0w_56 awsui_size-normal_h11ix_fcx0w_52 awsui_variant-normal_h11ix_fcx0w_124']")).click();

        }
        
        	        
	}

}
