package kildare;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
public class WorkingWithFlatFiles {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\NAVEEN\\Setup files\\chromedriver.exe");
	ChromeDriver browser=new ChromeDriver();
	Properties pain=new Properties();
	pain.load(new FileInputStream("C:\\Users\\QAP9\\git\\myseleniumwork-qaplanet\\Selenium_HRM_all_cases\\filename.properties"));
	String strur=pain.getProperty("url");
	browser.get(strur);

	}

}
