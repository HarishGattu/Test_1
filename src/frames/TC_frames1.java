package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;


public class TC_frames1 {
	

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\Testing\\Testing Softwares\\Softwares\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//Enter URl
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		//Enter login details
		driver.findElement(By.className("loginText")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//ul[@id='option-menu']/li")).getText().matches("Welcome admin"));
		//driver.findElement(By.className("plainbtn")).click();
		Thread.sleep(3000);
		//Enter into the frame
		driver.switchTo().frame("rightMenu");
		//Enter details
		driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();
		driver.findElement(By.id("txtEmpLastName")).sendKeys("Harish");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Harish");
		driver.findElement(By.id("btnEdit")).click();
		//Exit from FRamr		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();	

	}
}
