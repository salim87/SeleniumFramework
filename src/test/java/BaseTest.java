package test.java;

import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import main.java.utils.Constants;


public class BaseTest {
	public static WebDriver driver;
	public ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	@BeforeTest
	public void beforeTestMethod() {
		htmlReporter= new ExtentSparkReporter(System.getProperty("user.dir")+ File.separator + "reports" + File.separator + "AutomationReport.html" );
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Automation Lead", "Salim");
	}
	
	
	
	@BeforeMethod
	@Parameters(value= {"browserName"})
	public void beforeMethod(@Optional String browserName, Method method) {
		test=extent.createTest(method.getName());
		setupDriver(browserName);
		driver.manage().window().maximize();
		driver.get(Constants.url);
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
			String methodName= result.getMethod().getMethodName();
			String logText= "Test Case: "+methodName+" Passed" ;
			Markup m= MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			test.log(Status.PASS, m);
		}else if(result.getStatus()==ITestResult.FAILURE) {
			String methodName= result.getMethod().getMethodName();
			String logText= "Test Case: "+methodName+" Passed" ;
			Markup m= MarkupHelper.createLabel(logText, ExtentColor.RED);
			test.log(Status.FAIL, m);
		}
		driver.quit();	
	}
	
	@AfterTest
	public void afterTestMethod() {
		extent.flush();
	}

	public void setupDriver(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
	}

}
