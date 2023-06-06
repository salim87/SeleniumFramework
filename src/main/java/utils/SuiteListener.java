package main.java.utils;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import test.java.BaseTest;

public class SuiteListener implements ITestListener{

	 public void onTestFailure(ITestResult tr) {
		  String fileNmae= System.getProperty("user.dir")+ File.separator + "screenshots" + File.separator + tr.getMethod().getMethodName();
		  File ff= ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
		 try {
			FileHandler.copy(ff, new File(fileNmae+ ".png"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	 
	  
	  public void onTestSkipped(ITestResult tr) {
	    
	  }
	 
	  
	  public void onTestSuccess(ITestResult tr) {

	  }
	  
	  public void transform(ITestAnnotation itestAnnotation, Class aClass, Constructor constructor, Method metod) {
		  itestAnnotation.setRetryAnalyzer(aClass);
	  }
}
