package com.juaracoding.UjianM4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UjianM4 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://demoqa.com/webtables");
		
		driver.manage().window().maximize();
		
		WebElement clickAddNewRecordButton = driver.findElement(By.id("addNewRecordButton"));
		clickAddNewRecordButton.click();
		
		tunggu();
		
		//input positif
		WebElement input1 = driver.findElement(By.id("firstName"));
		input1.sendKeys("Alif");
		
		WebElement input2 = driver.findElement(By.id("lastName"));
		input2.sendKeys("Zuhdi");
		
		WebElement input3 = driver.findElement(By.id("userEmail"));
		input3.sendKeys("gmail@irfanzuhdi.com");
		
		WebElement input4 = driver.findElement(By.id("age"));
		input4.sendKeys("25");
		
		WebElement input5 = driver.findElement(By.id("salary"));
		input5.sendKeys("1000");
		
		WebElement input6 = driver.findElement(By.id("department"));
		input6.sendKeys("Keuangan");
		
		WebElement clickSubmit = driver.findElement(By.id("submit"));
		clickSubmit.click();
		
		tunggu();
		
		WebElement clickAddNewRecordButton2 = driver.findElement(By.id("addNewRecordButton"));
		clickAddNewRecordButton2.click();
		
		//input negatif
//		WebElement inputA = driver.findElement(By.id("firstName"));
//		inputA.sendKeys("Alif");
//		
//		WebElement inputB = driver.findElement(By.id("lastName"));
//		inputB.sendKeys("Zuhdi");
		
		WebElement inputC = driver.findElement(By.id("userEmail"));
		inputC.sendKeys("%%%%%%%");
		
		WebElement inputD = driver.findElement(By.id("age"));
		inputD.sendKeys("%");
		
		WebElement inputE = driver.findElement(By.id("salary"));
		inputE.sendKeys("********");
		
//		WebElement inputF = driver.findElement(By.id("department"));
//		inputF.sendKeys(" ");
		
		WebElement clickSubmit2 = driver.findElement(By.id("submit"));
		clickSubmit2.click();
		
		
	}
	
	 public static void tunggu() {
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	 }
}

