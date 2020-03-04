package org.bb.testPom;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.bb.pom.AceInvoice;
import org.bb.pom.Verification;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAceInvoice {
	
	public WebDriver driver;
	
	@BeforeTest
	public void lBrowser() {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	driver = new ChromeDriver();
	Reporter.log("Launching browser", true);
	driver.manage().window().maximize();    
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://qa.aceinvoice.com");
	}
	
	@Test
	public void run() throws InterruptedException{
	AceInvoice in = new AceInvoice(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(2000);
	in.signClick();
	
	Random r = new Random();
	int num = r.nextInt(2000);
	String utext = ("un" + num + "@gmail.com");
	String ptext = "Qwerty123";
	Reporter.log("Email enter by user: " + utext, true);
	in.emailText(utext);
	in.getsclick();
	Thread.sleep(2000);
	in.pwdText(ptext);
	Thread.sleep(4000);
	in.pwdCText(ptext);
	Thread.sleep(4000);
	in.contClick();
	Thread.sleep(4000);
	in.firstNameText("Mekhla");
	Thread.sleep(2000);
	in.lastNameText("Asopa");
	Thread.sleep(2000);
	in.timeField();
	Thread.sleep(2000);
	in.checkBoxClick();
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(4000);
	in.commitClick();
	Thread.sleep(4000);
	in.orgNameText("Big_Binary");
	Thread.sleep(2000);
	in.orgCommitClick();
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(2000);
	in.skipClick();
	Thread.sleep(4000);
	in.gToAppClick();
	Thread.sleep(10000);
	Verification vf = new Verification(driver);
	vf.verify(utext, 20, driver);
	
	}
	
	@AfterTest
	public void cBrowser(){
		driver.close();
		}
}
