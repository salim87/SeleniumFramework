package com.selautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenUrl {

	WebDriver driver;


	public void openURI() {


	 driver = new ChromeDriver();
		
	 driver.get("https://askomdch.com/");

	 driver.manage().window().maximize();

	 driver.findElement(By.xpath("//li[@id='menu-item-1227']/a[text()='Store']")).click();

	 driver.findElement(By.cssSelector("#woocommerce-product-search-field-0")).sendKeys("blue");

	 driver.findElement(By.cssSelector("button[value='Search']")).click();

	 driver.findElement(By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']")).click();

	 driver.findElement(By.cssSelector("a[title='View cart']")).click();

	 driver.findElement(By.cssSelector(".checkout-button.button.alt.wc-forward")).click();

	 driver.findElement(By.cssSelector("#billing_first_name")).sendKeys("salim");

	 driver.findElement(By.cssSelector("#billing_last_name")).sendKeys("iqbal");

	 driver.findElement(By.cssSelector("#billing_address_1")).sendKeys("245");

	 driver.findElement(By.cssSelector("#billing_city")).sendKeys("California");

	 driver.findElement(By.cssSelector("#billing_postcode")).sendKeys("10000");

	 driver.findElement(By.cssSelector("#billing_email")).sendKeys("abc@gmail.com");

		driver.findElement(By.cssSelector("#place_order")).click();

	}
		



}
