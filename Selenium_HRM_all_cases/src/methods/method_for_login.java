package methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class method_for_login {
	
	public static ChromeDriver browser;
		public String loginaction(){
			String sUN="qaplanet1";
			String sPWD="lab1";
			System.setProperty("webdriver.chrome.driver","D:\\NAVEEN\\Setup files\\chromedriver.exe");
			
			
			browser= new ChromeDriver();
			
			browser.get("http://apps.qaplanet.in/qahrm/login.php");
			WebElement loginfield=browser.findElementByXPath("//input[@name='txtUserName']");
			WebElement passwordfield=browser.findElementByXPath("//input[@name='txtPassword']");
			loginfield.sendKeys(sUN);	
			passwordfield.sendKeys(sPWD);
			WebElement loginbutton=browser.findElementByName("Submit");
			loginbutton.click();
			return "login successful";
		}
}
