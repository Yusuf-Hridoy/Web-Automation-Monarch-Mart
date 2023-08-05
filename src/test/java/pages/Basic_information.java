package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

import common_poperty.commons;

public class Basic_information extends basepage {
	public By first_name = By.xpath("//input[@placeholder='Enter your first name']");
	public By last_name = By.xpath("(//input[@placeholder='Enter your last name'])[1]");
	public By phone = By.xpath("(//input[@placeholder='Enter your phone no'])[1]");
	public By mail = By.xpath("(//input[@placeholder='Enter your email'])[1]");
	public By country = By.xpath("(//input[@id='mantine-r2o'])[1]");
	public By city = By.xpath("(//input[@id='mantine-ri'])[1]");
	public By area = By.xpath("(//input[@id='mantine-rs'])[1]");
	public By street = By.xpath("(//input[@placeholder='Enter your street address'])[1]");
	public By postal = By.xpath("(//input[@placeholder='Enter your postal code'])[1]");
	public By save = By.xpath("(//button[normalize-space()='Save'])[1]");
	public By new_address = By.xpath("(//p[@class='AddressManage_text__tah57'])[1]");
	
	
	
	
	// this things is needed and theb upper info is not needed
	public By agree = By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[2]/div[1]/div[1]/*[name()='svg'][1]");
	public By place_order = By.xpath("(//button[normalize-space()='Place Order'])[1]");

}
