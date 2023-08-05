package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import common_poperty.commons;
import pages.login_page;
import pages.signup_page;

public class Login_page_test extends commons {
	login_page login = new login_page();
	signup_page sign = new signup_page();
	
	@Test
	
	public void Check_login_page() throws InterruptedException {
		
		getDriver().get("https://monarchmart.com/");
		
		getDriver().findElement(sign.Click_to_go_signup).click();
		
		WebElement emph = getDriver().findElement(login.email);
		WebElement ppss = getDriver().findElement(login.pass);
		
		emph.sendKeys("01571705559");
		ppss.sendKeys("1@gmail.com");
		
		getDriver().findElement(login.click_login).click();
		
		Thread.sleep(5000);
	}
		
		@Test
		
		public void Test_case2() throws InterruptedException {
			
			getDriver().get("https://monarchmart.com/");
			
			getDriver().findElement(sign.Click_to_go_signup).click();
			
			WebElement emph = getDriver().findElement(login.email);
			WebElement ppss = getDriver().findElement(login.pass);
			
			emph.sendKeys("");
			ppss.sendKeys("1@gmail.com");
			
			getDriver().findElement(login.click_login).click();
			
			Thread.sleep(5000);
			
			System.out.println(getDriver().findElement(login.error_msg_name));
		
		
		
		
		
		
		
	
}
}
