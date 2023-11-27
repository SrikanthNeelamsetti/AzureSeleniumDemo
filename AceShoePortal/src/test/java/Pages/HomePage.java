package Pages;

import org.openqa.selenium.By;
import static tests.SeleniumTest.driver;

public class HomePage {
	public static String hamburger_Menu_Xpath = "//input[@type='checkbox']";
	public static String online_products_link_xpath = "//li[normalize-space()='Online Products']";

	public static void click_hamburger_menu() {
		driver.findElement(By.xpath(hamburger_Menu_Xpath)).click();
	}

	public static void click_products_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(online_products_link_xpath)).click();
	}

}
