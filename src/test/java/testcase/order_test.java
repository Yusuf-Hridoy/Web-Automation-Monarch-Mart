package testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v109.page.Page.GetAppIdResponse;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import common_poperty.commons;
import pages.Basic_information;
import pages.homepage;
import pages.login_page;
import pages.mobile_page;

public class order_test extends commons {
	homepage home = new homepage();
	mobile_page mobile = new mobile_page();
	login_page login =new login_page();
	Basic_information basic = new Basic_information();
	
	@Test
	public void test() throws InterruptedException {
		getDriver().get("https://monarchmart.com/");
		Actions actions = new Actions(getDriver());
		
		WebElement cat = getDriver().findElement(home.category);
		actions.clickAndHold(cat).build().perform();
		
		WebElement mob = getDriver().findElement(home.mobile);
		actions.clickAndHold(mob).build().perform();
		
		//click on mobiles
		getDriver().findElement(home.mobiles).click();
		
		
		
		
		//click on first phone
		getDriver().findElement(mobile.samsung).click();
		
		//add to cart
		getDriver().findElement(mobile.cart).click();
		
		//click box 
	//	getDriver().findElement(mobile.box).click();
		
		//chechour
	//	getDriver().findElement(mobile.checkout).click();
		
		// giving information for login page
		WebElement mail = getDriver().findElement(login.email);
		WebElement ppss = getDriver().findElement(login.pass);
		
		mail.sendKeys("latobi7996@ippals.com");
		ppss.sendKeys("123456789");
		
		getDriver().findElement(login.click_login).click();
		
		//click on cart
		getDriver().findElement(mobile.cart2).click();
		
		
		//click on box 
		getDriver().findElement(mobile.box).click();
		
		// now checkout 
		getDriver().findElement(mobile.checkout).click();
		
		// click on selected item
		getDriver().findElement(mobile.click_on_selected_item).click();
		
		// next click for order details
		getDriver().findElement(mobile.next_for_order).click();
		
		//now give personal information 
	//	getDriver().findElement(basic.new_address).click();
		
		
	/*	WebElement first = getDriver().findElement(basic.first_name);
		WebElement last = getDriver().findElement(basic.last_name);
		WebElement mobile = getDriver().findElement(basic.phone);
		WebElement mai = getDriver().findElement(basic.mail);
		WebElement coun = getDriver().findElement(basic.country);
		WebElement city = getDriver().findElement(basic.city);
		WebElement area = getDriver().findElement(basic.area);
		WebElement street = getDriver().findElement(basic.street);
		WebElement post = getDriver().findElement(basic.postal);
		
		first.sendKeys("kjh");
		last.sendKeys("yusuf");
		mobile.sendKeys("01000000000");
		mai.sendKeys("abc@gmail.com");
		coun.sendKeys("Bangladesh");
		city.sendKeys("Dhaka");
		area.sendKeys("Savar");
		street.sendKeys("123");
		post.sendKeys("1347");
		
		getDriver().findElement(basic.save).click();*/
		
		// now place order after clicking agree button
		
		getDriver().findElement(basic.agree).click();
		getDriver().findElement(basic.place_order).click();
		
		
		
		
	}

}
