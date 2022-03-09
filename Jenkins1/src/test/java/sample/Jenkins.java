package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jenkins {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome_driver\\chromedriver (2).exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://demowebshop.tricentis.com/login");

		driver.manage().window().maximize();

		String expectedtitle="Demo Web Shop. Login";

		String actualtitle=driver.getTitle();

		if(expectedtitle.equals(actualtitle))
		{
		System.out.println(actualtitle);
		System.out.println("Correct Page");
		driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekhab");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
		}

		else
		{
		System.out.println("Incorrect Page");
		System.out.println(actualtitle);
		driver.close();
		}




		}
	
}
