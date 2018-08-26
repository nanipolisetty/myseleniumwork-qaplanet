package add_Employee_And_Verify_In_Emp_List_TC2;
import methods.method_for_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Test_case_2 extends method_for_login {
public static void main(String[] args) {
	method_for_login kildare=new me    thod_for_login();	
   String login= kildare.loginaction();
	System.out.println(login);
	
	Test_case_2.tc2();
	

	{

static void tc2(){
ChromeDriver browser1=new ChromeDriver();
Actions A=new Actions(browser1);
WebElement PIM=browser1.findElementByLinkText("//a/span[contains(text(),'PIM')]");
A.moveToElement(PIM).perform();


}
}
