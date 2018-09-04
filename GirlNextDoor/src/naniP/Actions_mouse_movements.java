package naniP;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Actions_mouse_movements {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\NAVEEN\\Setup files\\chromedriver.exe");

ChromeDriver chrome=new ChromeDriver();
	chrome.get("http://apps.qaplanet.in/qahrm/login.php");
	WebElement e=chrome.findElementByClassName("loginText");
	e.sendKeys("qaplanet1");
	chrome.findElementByName("txtPassword").sendKeys("lab1");
	WebElement kilkenny=chrome.findElementByName("Submit");
	kilkenny.sendKeys(Keys.ENTER);
Actions a=new Actions(chrome);
chrome.switchTo().frame("rightMenu");
	a.click(chrome.findElementByXPath("//select")).perform();
	chrome.findElementByXPath("//select").sendKeys(Keys.ARROW_DOWN);
	
	chrome.findElementByXPath("//select").sendKeys(Keys.ENTER);
	a.doubleClick(chrome.findElementByXPath("//select")).build().perform();
chrome.switchTo().parentFrame();
	WebElement mouseover=chrome.findElementByXPath("//div[@id='top-menu']/ul/li/a[@href='./index.php?menu_no_top=eim']");
	a.moveToElement(mouseover).perform();
	WebElement src=chrome.findElementByXPath("//div[@id='top-menu']/ul/li/a[@href='./index.php?menu_no_top=eim']");
	chrome.switchTo().frame("rightMenu");
	WebElement dest= chrome.findElementByXPath("//select");
	chrome.switchTo().parentFrame();
	a.clickAndHold(src).perform();
	
	a.moveToElement(dest).perform();
	a.release();
	System.out.println("Shane Beaty")
	
}
}
