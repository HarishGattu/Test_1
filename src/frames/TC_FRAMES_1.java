package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_FRAMES_1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\Testing\\Testing Softwares\\Softwares\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		
		WebElement username=driver.findElement(By.xpath("//input[@name='txtUserName']"));
		username.sendKeys("admin");
		
		WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.sendKeys("admin");
		
		driver.findElement(By.name("Submit")).click();
		//Entering into the frame
		driver.switchTo().frame("rightMenu");
	
		WebElement add_button=driver.findElement(By.xpath("//input[@value='Add']"));
		add_button.click();
		
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Harish");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("GATTU");
		driver.findElement(By.id("btnEdit")).click();
		//Exit from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
	}

}
