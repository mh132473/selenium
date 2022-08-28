package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
public class SeleniumPractisetwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
driver.get("https://parabank.parasoft.com/parabank/index.htm");		
driver.findElement(By.xpath("//a[text()='Register']")).click();
//assertion
		String actual =driver.findElement(By.xpath("//h1[@class='title']")).getText();
		System.out.println("actual");
		String expected = "Signing up is easy!";
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Mehedi");
driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Hasan");
driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Add");	
driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("city");
driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("state");
driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("zipcode");
driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("phone");
driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("ssn");
driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("username");
driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("password");
driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("repeatPassword");
driver.findElement(By.xpath("//input[@value='Register']")).click();
driver.findElement(By.xpath("//a[text()='Register']")).click();
//String expected = "Signing up is easy!";
//String actual=driver.findElement(By.xpath("//h1[text()='Signing up is easy!']")).getText();
//System.out.println(actual);
//Assert.assertEqual(actual,expected);



//String Actual=driver.findElement(By.xpath("//h1[@class='title']")).getText();  //actual result
//System.out.println(Actual);
//String Expected="Signing up is easy!";
//System.out.println(Expected);
//Assert.assertEquals();



	Thread.sleep(3000);	
driver.quit();		
		
		
		
		
	}

}
