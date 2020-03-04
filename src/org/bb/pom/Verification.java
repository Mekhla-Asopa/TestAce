package org.bb.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Verification {

	//Constructor to call the current object   
		public Verification(WebDriver driver) {
				PageFactory.initElements(driver, this);		
			}
			
	//Method to verify the actual and expected string 
		public void verify(String utext, int ETO, WebDriver driver){
				WebElement mail = driver.findElement(By.xpath("//table[@id='team-members']/tbody/tr/td[3]"));
				String etext = mail.getText();
				Reporter.log("Email present in the app: " + etext, true);
				if (utext.equals(etext)) {
					Reporter.log("Same email is present", true);
				}
				else{
					Reporter.log("email is not present", true);
				}
			}
}
