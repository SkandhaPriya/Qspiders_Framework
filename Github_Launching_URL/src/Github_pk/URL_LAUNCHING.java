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
	System.out.println("Here Kiran");
	driver.get("https://www.instagram.com");	
	driver.quit();
}
}

