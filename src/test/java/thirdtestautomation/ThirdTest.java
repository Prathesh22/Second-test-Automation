package thirdtestautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//classname
	    //List<WebElement> headerLinks=driver.findElements(By.className("\"list-inline-item\""));
	   // System.out.println("total number of header links:"+headerLinks.size());
	    
	    //tagname
	    List<WebElement> Links=driver.findElements(By.tagName("a"));
	    System.out.println("total number of links:"+Links.size());
	
	}

}
// locators classname, tagname
