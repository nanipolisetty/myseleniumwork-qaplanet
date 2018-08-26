package Verify_Orange_HRM.TC1;
import org.openqa.selenium.chrome.ChromeDriver;
public class getattribute {
public static void main(String[] args) {
	String sUN="qaplanet1";
	String sPWD="lab1";
		
		System.setProperty("webdriver.chrome.driver","D:\\NAVEEN\\Setup files\\chromedriver.exe");
		ChromeDriver browser=new ChromeDriver();
		browser.get("http://apps.qaplanet.in/qahrm/login.php");
String s= browser.findElementByXPath("//td[contains(text(),'Login Name')]").getAttribute("name");
System.out.println(s);
}
}
