package naniP;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class Collections_Practice {
public static void main(String[] args) {
String sUN="qaplanet1";
	String sPWD="lab1";
	
	System.setProperty("webdriver.chrome.driver", "D:\\NAVEEN\\Setup files\\chromedriver.exe");
ChromeDriver browser=new ChromeDriver();

// creating object for WebDriverWait
WebDriverWait wait=new WebDriverWait(browser,60);


browser.get("http://apps.qaplanet.in/qahrm/login.php");
browser.manage().window().maximize();
wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
String cherry=browser.getTitle();
System.out.println(cherry);





browser.findElementByName("txtUserName").sendKeys(sUN);

browser.findElementByName("txtPassword").sendKeys(sPWD);
browser.findElement(By.xpath("//input[@type='Submit']")).click();
browser.switchTo().frame("rightMenu");

String a=browser.findElementByXPath("//table[@class='data-table']/tbody/tr/td[2]").getText();
System.out.println(a);

String prom=browser.getTitle();

if(prom.equals("OrangeHRM"))
		System.out.println("login successful");
		else
			System.out.println("login failed");






}
}
