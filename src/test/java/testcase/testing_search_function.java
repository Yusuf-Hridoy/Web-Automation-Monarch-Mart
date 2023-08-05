package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import common_poperty.commons;
import pages.Search;

public class testing_search_function extends commons{
	Search sarch = new Search();
	@Test
	
	private void search () {
		getDriver().get("https://monarchmart.com/");
		WebElement search = getDriver().findElement(sarch.search);
		
		search.sendKeys("mobile");
		getDriver().findElement(sarch.s_button).click();
		
	}

}
