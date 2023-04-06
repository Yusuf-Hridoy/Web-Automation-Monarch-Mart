package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import common_poperty.commons;
import pages.signup_page;

public class test_signpage_without_number extends commons {
	signup_page signup = new signup_page();
	@Test
	public void without_number() throws InterruptedException {
		//check the process with wrong number
	
		getDriver().get("https://monarchmart.com/signup?back=Lw==");
		WebElement fn =	getDriver().findElement(signup.first_name);
	WebElement ln =	getDriver().findElement(signup.last_name);
		WebElement mob = 	getDriver().findElement(signup.phone);
		WebElement mail = 	getDriver().findElement(signup.email);
		WebElement paa = 	getDriver().findElement(signup.pass);
		WebElement cpass = 	getDriver().findElement(signup.conpass);
		//WebElement error = getDriver().findElement(signup.login_error);
		fn.sendKeys("yusuf");
		ln.sendKeys("ahmed");
		mob.sendKeys("11111111111");
		paa.sendKeys("ggfd28866");
		cpass.sendKeys("ggfd28866");
		getDriver().findElement(signup.checkbox).click();
		getDriver().findElement(signup.register).click();
		Thread.sleep(3000);
		
	//System.out.println(signup.login_error);
		
		
		
		
	}

}
