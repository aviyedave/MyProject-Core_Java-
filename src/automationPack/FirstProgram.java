package automationPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();

				driver.get("https://www.google.com");
		
		
		 
		
		
		
		

	}

}
