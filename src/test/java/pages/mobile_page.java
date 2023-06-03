package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

import common_poperty.commons;

public class mobile_page extends basepage {
//	public By checkbox = By.xpath("//div[4]//div[1]//div[3]//div[1]//*[name()='svg']");
	public By samsung = By.xpath("(//h4[contains(text(),'Galaxy Z Fold 4 6.2 & 7.6 Inch Smartphone - 5G – 1')])[1]");
	public By cart = By.xpath("//div[contains(@class,'ProductInfoSection_left__RwkfQ')]//p[contains(@class,'AddToCartButton_text__35euL')][normalize-space()='Add to cart']");
	public By box = By.xpath("(//*[name()='svg'][@class='CheckBox_icon__tbD_W'])[2]");
	public By checkout = By.xpath("//button[normalize-space()='Checkout']");
	public By cart2 = By.xpath("//button[@title='Cart']//*[name()='svg']");
	public By next = By.xpath("//button[normalize-space()='Checkout']");
	public By click_on_selected_item = By.xpath("(//*[name()='svg'][@class='CheckBox_icon__tbD_W'])[4]");
	public By next_for_order = By.xpath("(//button[normalize-space()='Next'])[1]");

}
// mail latobi7996@ippals.com
//div[contains(@class,'ProductInfoSection_left__RwkfQ')]//p[contains(@class,'AddToCartButton_text__35euL')][normalize-space()='Add to cart']
///html/body/div[1]/div/main/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div/button/p
//div[contains(@class,'ProductInfoSection_left__RwkfQ')]//p[contains(@class,'AddToCartButton_text__35euL')][normalize-space()='Add to cart']
//body/div[@id='__next']/div[@class='mainBody']/header[@class='Header_header__D4RXM']/div[@class='Header_top__D8WVM']/div[@class='ShoppingCart_ShoppingCart__29bAL ']/div[@class='nocontainer ShoppingCart_container__LhBNc']/div[@class='ShoppingCart_contents__ipZ03']/div[@class='ShoppingCart_items__cyTDa']/div[4]/div[1]//*[name()='svg']