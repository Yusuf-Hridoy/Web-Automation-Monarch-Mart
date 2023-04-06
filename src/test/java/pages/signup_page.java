package pages;

import org.openqa.selenium.By;

public class signup_page extends basepage {
	public By signup_button = By.xpath("//button[normalize-space()='Signup']");
	public By first_name = By.xpath("//input[@placeholder='Write your first name']");
	public By last_name = By.xpath("//input[@placeholder='Write your last name']");
	public By phone = By.className("InputPhone_input__0mrGh");
	public By email = By.xpath("//input[@placeholder='Write your email address']");
	public By pass = By.id("mantine-r0");
	public  By conpass = By.id("mantine-r1");
	public By checkbox = By.xpath("//input[@type='checkbox']");
	public By register = By.xpath("//button[normalize-space()='Register Now']");
	public By login_error = By.cssSelector(".login_error__tMD9R");

}
