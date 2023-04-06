package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import common_poperty.commons;
import pages.signup_page;

public class test_sign extends commons {
	signup_page signup = new signup_page();
	
	@Test
	public void test() {
		getDriver().get("https://monarchmart.com/login?back=Lw==");
		
		//click button
		getDriver().findElement(signup.signup_button).click();
		
	}
	
	@Test
	public void first_name() throws InterruptedException {
		getDriver().get("https://monarchmart.com/signup?back=Lw==");
	WebElement fn =	getDriver().findElement(signup.first_name);
//	WebElement ln =	getDriver().findElement(signup.last_name);
//	WebElement mob = 	getDriver().findElement(signup.phone);
//	WebElement mail = 	getDriver().findElement(signup.email);
	//WebElement paa = 	getDriver().findElement(signup.pass);
//	WebElement cpass = 	getDriver().findElement(signup.conpass);
	fn.sendKeys("yusuf");
	Thread.sleep(3000);
//	ln.sendKeys("ahmed");
//	mob.sendKeys("");
//	paa.sendKeys("ggfd28866");
//	cpass.sendKeys("ggfd28866");
	
	
		
		
	}
	@Test
	public void last_name() throws InterruptedException {
		getDriver().get("https://monarchmart.com/signup?back=Lw==");
		WebElement ln =	getDriver().findElement(signup.last_name);
		ln.sendKeys("ahmed");
		Thread.sleep(3000);


		
		
		
	}
	@Test
	public void mobile_number() throws InterruptedException {
		getDriver().get("https://monarchmart.com/signup?back=Lw==");
		WebElement mob = 	getDriver().findElement(signup.phone);
		mob.sendKeys("01585695255");
		Thread.sleep(3000);
		
		
		
	}
	@Test
	public void mail() throws InterruptedException {
		getDriver().get("https://monarchmart.com/signup?back=Lw==");
		WebElement mail = 	getDriver().findElement(signup.email);
		mail.sendKeys("123@gmail.com");
		Thread.sleep(3000);
		
		
	}
	@Test
	public void pass() throws InterruptedException {
		getDriver().get("https://monarchmart.com/signup?back=Lw==");
		WebElement paa = 	getDriver().findElement(signup.pass);
		paa.sendKeys("ggfd28866");
		Thread.sleep(3000);
		
		
	}
	@Test
	public void cpass() {
		getDriver().get("https://monarchmart.com/signup?back=Lw==");
		WebElement cpass = 	getDriver().findElement(signup.conpass);
		cpass.sendKeys("ggfd28866");
		
		getDriver().findElement(signup.checkbox).click();
		getDriver().findElement(signup.register).click();
		
	}

}

