package pages;

import org.openqa.selenium.By;

public class homepage extends basepage {
	public By category = By.xpath("//button[normalize-space()='All Categories']");
	public By  mobile = By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > header:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(6) > a:nth-child(2) > h3:nth-child(1)");
	public By mobiles = By.xpath("//h3[normalize-space()='Mobiles']");
	
	//h3[normalize-space()='Mobiles']
	//li[contains(@class,'MenuBar_item__y_BV9 MenuBar_active__WjhOZ')]//a

}
