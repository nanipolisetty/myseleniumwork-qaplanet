package naniP;
import java.awt.List;
import java.util.Iterator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropBox {
	
	public static void main(String[] args) {
		
	
	String sUN="qaplanet1";
	String sPWD="lab1";
	
	System.setProperty("webdriver.chrome.driver", "D:\\NAVEEN\\Setup files\\chromedriver.exe");
	
	ChromeDriver browser=new ChromeDriver();
	browser.get("http://apps.qaplanet.in/qahrm/login.php");
	String hallelujah =browser.getTitle();
	System.out.println(hallelujah);
	browser.findElementByXPath("//input[@name='txtUserName']").sendKeys(sUN);
	browser.findElementByXPath("//input[@name='txtPassword']").sendKeys(sPWD);
	browser.findElementByXPath("//input[@type='Submit']").click();
	browser.switchTo().frame("rightMenu");
//new Select(browser.findElementByXPath("//select")).selectByVisibleText("Job Title");
	
WebElement e= browser.findElementByXPath("//select");
Select x= new Select(e);
x.selectByValue("0");
java.util.List<WebElement> kildare= x.getOptions();
System.out.println(kildare.size());
	Iterator<WebElement> it=kildare.iterator();
	while(it.hasNext()){
	WebElement la=it.next();
	System.out.println(la.getText());
	}
	
	
	}

}
