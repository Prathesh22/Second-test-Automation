package sixthTestautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SixthTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		/*normal alert with OK button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
	    driver.switchTo().alert().accept();
		*/
		
		/*conformation alert - OK & cancel
		  driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		  Thread.sleep(5000);
		  driver.switchTo().alert().accept();
		  driver.switchTo().alert().dismiss();
		*/
		//promt alert- input box
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("welcome");
		myalert.accept();
		}
}
/*normal alert with OK button
  conformation alert - OK & cancel
  promt alert- input box
*/