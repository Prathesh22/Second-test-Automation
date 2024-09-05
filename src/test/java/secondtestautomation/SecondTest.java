package secondtestautomation;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
		driver.findElement(By.name("search")).sendKeys("Mac");
		//id
	    boolean logoDisplayStatus=driver.findElement(By.id("logo")).isDisplayed();
	    System.out.println(logoDisplayStatus);	
	    //Linktext 
	    driver.findElement(By.linkText("Tablets")).click();
	    //Partial
	    driver.findElement(By.partialLinkText("Tab")).click();
	    
	 
	}
}
//window maximize
//locators name,id
///Linktext,Partiallinktext