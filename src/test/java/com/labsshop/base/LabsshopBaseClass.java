package com.labsshop.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.labsshop.page.LabsshopCartPage;
import com.labsshop.page.LabsshopCheckoutPage;
import com.labsshop.page.LabsshopHomePage;
import com.labsshop.page.LabsshopLoginPage;
import com.labsshop.page.LabsshopProductPage;
import com.labsshop.page.LabsshopRegisterPage;




public class LabsshopBaseClass {

	public static ExtentSparkReporter reporter;
	public static ExtentTest test;
	public static ExtentReports extent;
	
	
	
	public static WebDriver driver;
	public WebDriverWait wait;
	public LabsshopRegisterPage rp;
	public LabsshopLoginPage lp;
	public LabsshopHomePage hp;
	public LabsshopProductPage pp;
	public LabsshopCartPage cp;
	public LabsshopCheckoutPage ck;
	
	
	
	@BeforeTest
	public void SetUp() {
		
		
			
			reporter=new ExtentSparkReporter("./TestReport/Report.html");
			reporter.config().setDocumentTitle("QAAutomationLabsshop_ProjectReport");
			reporter.config().setReportName("Functional test");
			reporter.config().setTheme(Theme.DARK);
			extent=new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("hostname","Localhost");
			extent.setSystemInfo("OS", "Windows10");
			extent.setSystemInfo("Testername","Silna");
			extent.setSystemInfo("browsername", "Chrome");
	
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--incognito");
			
			

		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://shop.qaautomationlabs.com/");
	}
	
	
	@BeforeMethod
	public void method(Method mthd) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		rp=new LabsshopRegisterPage(driver);
		lp=new LabsshopLoginPage(driver);
		hp=new LabsshopHomePage(driver);
		pp=new LabsshopProductPage(driver);
		cp=new LabsshopCartPage(driver);
		ck=new LabsshopCheckoutPage(driver);
		
		test=extent.createTest(mthd.getName()); 
	
}
	@AfterTest
	public void teardown() {
		extent.flush();	
		} 
	
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException {
	
	if(result.getStatus()==ITestResult.FAILURE) {
		test.log(Status.FAIL,"test case failed is"+result.getName());
		test.log(Status.FAIL,"test casefailed is"+result.getThrowable());
		
		
		String screenshotpath=screenshotMethod(driver,result.getName());
		test.addScreenCaptureFromPath(screenshotpath);
		
	
	}
	else if(result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP, "testcase skipped is"+result.getName());
		
	}else if(result.getStatus()==ITestResult.SUCCESS) {
		test.log(Status.PASS, "testcase passed is"+result.getName());
	}
		
}


	public static String screenshotMethod(WebDriver driver, String screenshotname) throws IOException {
		// TODO Auto-generated method stub
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination="./Screenshots/"+screenshotname +".jpeg";
		FileHandler.copy(src,new File(destination));
		return destination;
	}
	
	
	
	
	
}
