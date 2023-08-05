package pages;

import org.openqa.selenium.By;

public class login_page extends basepage {
	
	public By email = By.xpath("//input[@placeholder='Write your email or phone']");
	public By pass = By.xpath("//input[@placeholder='Enter password']");
	public By click_login = By.xpath("//button[normalize-space()='Login']");
	public By error_msg_name = By.xpath("//p[@class='login_error__tMD9R']");

}
