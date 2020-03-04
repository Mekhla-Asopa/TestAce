package org.bb.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AceInvoice {

	// X-path of all the web-elements used in our application
			@FindBy(xpath ="//div[@class='devise-links']/a[@class='signup-button border-radius-lg']")
			private WebElement signup;
			@FindBy(xpath = "//input[@placeholder='Email Address']")
			private WebElement email;
			@FindBy(xpath = "//input[@name='get_started']")
			private WebElement gets;
			@FindBy(xpath = "//div/input[@name='password']")
			private WebElement pass;
			@FindBy(xpath = "//div/input[@name='password_confirmation']")
			private WebElement passc;
			@FindBy(xpath = "//input[@data-disable-with='Continue']")
			private WebElement conti;
			@FindBy(xpath = "//input[@name='user[first_name]']")
			private WebElement fname;
			@FindBy(xpath = "//input[@name='user[last_name]']")
			private WebElement lname;
			@FindBy(xpath = "//select[@class='form-control']")
			private WebElement control;
			@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[5]/div/div/label/div[1]")
			private WebElement checkb;
			@FindBy(xpath = "//input[@name='commit']")
			private WebElement commit;
			@FindBy(xpath = "//input[@name='name']")
			private WebElement orgname;
			@FindBy(xpath = "//input[@name='commit']")
			private WebElement orgcommit;
			@FindBy(xpath = "//a[@class='btn btn-outline']")
			private WebElement skip;
			@FindBy(xpath = "//button[@class='btn btn-primary']")
			private WebElement gtoApp;
			
			//Constructor to call the current class object 
			public AceInvoice(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			// All Methods used to perform action on web-elements
			public void signClick() {
				signup.click();	
			}
			public void emailText(String utext){
				email.sendKeys(utext);
			}
			public void getsclick(){
				gets.click();
			}
			public void pwdText(String ptext){
				pass.sendKeys(ptext);
			}
			public void pwdCText(String ptext){
				passc.sendKeys(ptext);
			}
			public void contClick(){
				conti.click();
			}
			public void firstNameText(String text){
				fname.sendKeys(text);
			}
			public void lastNameText(String txt){
				lname.sendKeys(txt);
			}
			public void timeField(){
				Select s = new Select(control);
				s.selectByValue("Mumbai");
			}
			public void checkBoxClick(){
				checkb.click();
			}
			public void commitClick(){
				commit.click();
			}
			public void orgNameText(String otxt){
				orgname.sendKeys(otxt);
			}
			public void orgCommitClick(){
				orgcommit.click();
			}
			public void skipClick(){
				skip.click();
			}
			public void gToAppClick(){
				gtoApp.click();
			}
}
