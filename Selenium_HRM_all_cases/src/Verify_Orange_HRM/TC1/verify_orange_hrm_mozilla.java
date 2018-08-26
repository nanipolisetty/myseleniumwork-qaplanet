package Verify_Orange_HRM.TC1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;;

public class verify_orange_hrm_mozilla {
	public static void main(String[] args) throws InterruptedException {
		String sUN="qaplanet1";
		String sPWD="lab1";
			
			System.setProperty("webdriver.gecko.driver","D:\\NAVEEN\\Setup files\\geckodriver.exe");
			FirefoxDriver browser=new FirefoxDriver();
			browser.get("http://apps.qaplanet.in/qahrm/login.php");
			String paschal=browser.getTitle();
		if(paschal.equals("OrangeHRM - New Level of HR Management"))
				System.out.println("Homepage display successfull");
		else
			System.out.println("failed to display homepage");
		String field1=browser.findElementByXPath("//td[contains(text(),'Login Name')]").getText();
		if (field1.equals("Login Name :"))
			System.out.println("Login Name : is available");
		else
			System.out.println("Login Name : is not available");
		String field2=browser.findElementByXPath("//td[contains(text(),'Password :')]").getText();
		if (field2.equals("Password :"))
			System.out.println("Password :is available");
		else
			System.out.println("Password : is not available");
		WebElement loginfield=browser.findElementByXPath("//input[@name='txtUserName']");
		WebElement passwordfield=browser.findElementByXPath("//input[@name='txtPassword']");
		if (loginfield.isEnabled()) 
		loginfield.sendKeys("qaplanet1");	
		 else 
		System.out.println("login name textbox is not enabled");
		if(passwordfield.isEnabled())
			passwordfield.sendKeys("lab1");
		else
			System.out.println("password field text field is not enabled");

		WebElement clearbutton=browser.findElementByName("clear");
		if(clearbutton.isEnabled())
			clearbutton.click();
		else
			System.out.println("clearbutton not available");
		loginfield.sendKeys(sUN);	
		passwordfield.sendKeys(sPWD);
		WebElement loginbutton=browser.findElementByName("Submit");
		if(loginbutton.isEnabled())
			loginbutton.click();
		else
			System.out.println("login button not available");
		String afterlogin=browser.getTitle();
		if(afterlogin.equals("OrangeHRM"))
			System.out.println("Orange HRM displayed after login");
			else
				System.out.println("Orange HRM page not displayed after login");
		String 	welcomenote=browser.findElementByXPath("//div[@id='option-menu-bar']/ul/li").getText();
		if(welcomenote.equals("Welcome"+" "+sUN))
			System.out.println("Welcome Username is diplayed");
		else
			System.out.println("welcome username is not displayed");
		WebElement ChangePass=browser.findElementByLinkText("Change Password");



		if (ChangePass.isEnabled())
				
			System.out.println("Change Password is available");
		else
			System.out.println("change password is not available");

		WebElement logoutbutton=browser.findElementByLinkText("Logout");
		if (logoutbutton.isEnabled())
		System.out.println("logoutbutton is available");
		else
			System.out.println("logoutbutton is not available");

		logoutbutton.click();
		Thread.sleep(2000);                             
		if(browser.getTitle().equals("OrangeHRM - New Level of HR Management"))
			System.out.println("logout successfull");
		else 
			System.out.println("logout failed");
		}
		}
