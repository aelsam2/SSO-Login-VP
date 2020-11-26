package master;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	WebDriver driver;
	static String projPath =System.getProperty("user.dir");
	

	public static void main (String args[]) {
		System.out.println(projPath);

	}
	public WebDriver launchApp(String url) {
		
		System.out.println(projPath);
	System.setProperty("webdriver.chrome.driver", projPath+"\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
    return driver; 
	}

}
