package naniP;

import org.openqa.selenium.chrome.ChromeDriver;

public class Jabon_Deselect {

public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "D:\\NAVEEN\\Setup files\\chromedriver.exe");

ChromeDriver chrome=new ChromeDriver();
chrome.get("https://www.jabong.com/");
chrome.findElementByXPath("//input[@id='search']").sendKeys("men");

chrome.findElementByXPath("//div[@class='search-containter']").click();
String[] listboxnames={"Accessory Gift Set","Aprons","Backpacks","Bakeware","Basketballs"};

	

chrome.findElementByXPath("//a[contains(text(),'Accessory Gift Set')]").click();
chrome.findElementByXPath("//a[contains(text(),'Aprons')]").click();
chrome.findElementByXPath("//a[contains(text(),'BB and CC Cream')]").click();
chrome.findElementByXPath("//a[contains(text(),'Bakeware')]").click();
chrome.findElementByXPath("//a[contains(text(),'Backpacks')]").click();


}
}

//a[contains(text(),'Accessory Gift Set')]


//a[contains(text(),'Accessory Gift Set')]

//String[] listboxnames={"Accessory Gift Set","Aprons","Backpacks","Bakeware","Basketballs"};

/*chrome.switchTo().frame(chrome.findElementByXPath("/html/head/iframe"));
int i;
//System.out.println(listboxnames[i]);
for(i=0;i<=4;i++){
chrome.findElementByXPath("//a[contains(text(),(listboxnames[i])]").click();
}
	
*/
