package com.facebook.facebookmeta;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anupam Verma\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("anupamvermaspecial@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Confidential");
			driver.findElement(By.name("login")).click();
			
		}
	}