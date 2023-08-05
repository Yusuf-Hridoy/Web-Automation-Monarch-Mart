package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import common_poperty.commons;
import pages.signup_page;

public class Signup_page extends commons {
	
	signup_page sign = new signup_page();
	@Test
	
	public void Check_signup_page() throws InterruptedException {
		//go to the website test case 1
		getDriver().get("https://monarchmart.com/");
		
		//click on the sign up page
		getDriver().findElement(sign.Click_to_go_signup).click();
		
		getDriver().findElement(sign.signup_button).click();
		
		WebElement fname = getDriver().findElement(sign.first_name);
		WebElement lname = getDriver().findElement(sign.last_name);
		WebElement ph = getDriver().findElement(sign.phone);
		WebElement mail = getDriver().findElement(sign.email);
		WebElement pass = getDriver().findElement(sign.pass);
		WebElement cpass = getDriver().findElement(sign.conpass);
		
		fname.sendKeys("john");
		lname.sendKeys("doe");
		ph.sendKeys("01571705559");
		mail.sendKeys("1@gmail.com");
		pass.sendKeys("A123456a");
		cpass.sendKeys("A123456a");
		
		getDriver().findElement(sign.checkbox).click();
		
		getDriver().findElement(sign.register).click();
		Thread.sleep(5000);
	}
		
		@Test
		public void test_case_2 () throws InterruptedException {
			
			getDriver().get("https://monarchmart.com/");
			
			//click on the sign up page
			getDriver().findElement(sign.Click_to_go_signup).click();
			
			getDriver().findElement(sign.signup_button).click();
			
			WebElement fname = getDriver().findElement(sign.first_name);
			WebElement lname = getDriver().findElement(sign.last_name);
			WebElement ph = getDriver().findElement(sign.phone);
			WebElement mail = getDriver().findElement(sign.email);
			WebElement pass = getDriver().findElement(sign.pass);
			WebElement cpass = getDriver().findElement(sign.conpass);
			
			fname.sendKeys("");
			lname.sendKeys("");
			ph.sendKeys("01571705550");
			mail.sendKeys("2@gmail.com");
			pass.sendKeys("A123456a");
			cpass.sendKeys("A123456a");
			
			getDriver().findElement(sign.checkbox).click();
			
			getDriver().findElement(sign.register).click();
			Thread.sleep(5000);
		}
		
		@Test
		public void test_case_3 () throws InterruptedException {
			
			getDriver().get("https://monarchmart.com/");
			
			//click on the sign up page
			getDriver().findElement(sign.Click_to_go_signup).click();
			
			getDriver().findElement(sign.signup_button).click();
			
			WebElement fname = getDriver().findElement(sign.first_name);
			WebElement lname = getDriver().findElement(sign.last_name);
			WebElement ph = getDriver().findElement(sign.phone);
			WebElement mail = getDriver().findElement(sign.email);
			WebElement pass = getDriver().findElement(sign.pass);
			WebElement cpass = getDriver().findElement(sign.conpass);
			
			
			fname.sendKeys("Yusuf ahmed ");
			lname.sendKeys("Yusuf ahmed ahmed");
			ph.sendKeys("01571705558");
			mail.sendKeys("3@gmail.com");
			pass.sendKeys("A123456a");
			cpass.sendKeys("A123456a");
			
			getDriver().findElement(sign.checkbox).click();
			
			getDriver().findElement(sign.register).click();
			Thread.sleep(5000);
		}
		@Test
		public void test_case_4 () throws InterruptedException {
			
			getDriver().get("https://monarchmart.com/");
			
			//click on the sign up page
			getDriver().findElement(sign.Click_to_go_signup).click();
			
			getDriver().findElement(sign.signup_button).click();
			
			WebElement fname = getDriver().findElement(sign.first_name);
			WebElement lname = getDriver().findElement(sign.last_name);
			WebElement ph = getDriver().findElement(sign.phone);
			WebElement mail = getDriver().findElement(sign.email);
			WebElement pass = getDriver().findElement(sign.pass);
			WebElement cpass = getDriver().findElement(sign.conpass);
			
			
			fname.sendKeys("Yusuf ahmed$% ");
			lname.sendKeys("123Yusuf ahmed ahmed");
			ph.sendKeys("01571705551");
			mail.sendKeys("4@gmail.com");
			pass.sendKeys("A123456a");
			cpass.sendKeys("A123456a");
			
			getDriver().findElement(sign.checkbox).click();
			
			getDriver().findElement(sign.register).click();
			Thread.sleep(5000);
		}
		
		}
			
		
		
		
		
	
	


