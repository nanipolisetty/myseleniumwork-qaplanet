package naniP;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
public class Keyboard_actions {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\NAVEEN\\Setup files\\chromedriver.exe");

	ChromeDriver chrome=new ChromeDriver();
chrome.get("http://apps.qaplanet.in/qahrm/login.php");
WebElement e=chrome.findElementByClassName("loginText");
e.sendKeys("qaplanet1");
chrome.findElementByName("txtPassword").sendKeys("lab1");
WebElement kilkenny=chrome.findElementByName("Submit");
kilkenny.sendKeys(Keys.ENTER);

chrome.switchTo().frame("rightMenu");
//WebElement select= chrome.findElementByXPath("//select[@name='loc_code']");
chrome.findElementByXPath("//select[@name='loc_code']").sendKeys(Keys.ARROW_DOWN);

WebElement cork=chrome.findElementByXPath("//td[contains(text(),'7719')]");
cork.sendKeys(Keys.chord(Keys.CONTROL,"a"));
}
}
