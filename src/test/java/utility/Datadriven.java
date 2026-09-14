package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.labsshop.base.LabsshopBaseClass;

import utility.Excelutility;

public class Datadriven extends LabsshopBaseClass{
	
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver =new ChromeDriver();
		driver.get("https://shop.qaautomationlabs.com/");
	}
	
	@DataProvider(name="invalidloginData")
	
	public Object[][]getData() throws Exception
	{
		String path="./src/test/resources/Excelsheet/labshoptestdata.xlsx";
		return Excelutility.getTestData(path,"Sheet1");
	}
	
	@Test(dataProvider="invalidloginData")
	
	public void loginTest(String email,String password) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("loginBtn")).click();
		
		System.out.println("Executed for" +email + "and" +password);

}
	@AfterTest
	public void close() {
		driver.close();
	}
	
	
}
