package automationPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
		         "C:\\Users\\LENOVO\\OneDrive\\Desktop\\geckodriver.exe");
		
	
		
		
				 WebDriver driver =  new FirefoxDriver();

				 driver.get("https://www.google.com");
	}

}
