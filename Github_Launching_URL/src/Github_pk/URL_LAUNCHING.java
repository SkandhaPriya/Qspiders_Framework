package Github_pk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class URL_LAUNCHING 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.close();
	System.out.println("Here Kiran");
	driver = new FirefoxDriver();
	driver.get("https://www.instagram.com");	
	//driver.quit();
	System.out.println("Here Anagha");
	driver.get("https://www.youtube.com");
	System.out.println("Updated Framework");
	driver.quit();
}
}

