package Pages;

import static tests.SeleniumTest.capture;
import static tests.SeleniumTest.driver;
import static tests.SeleniumTest.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class ProductsPage {
	public static String formal_Shoes_xpath = "//h2[@class='FormalShoesTitle']";
	public static String sports_Shoes_xpath = "//h2[@class='SportsShoesTitle']";
	public static String sneaker_Shoes_xpath = "//h2[@class='SneakerShoesTitle']";

	public static String formalShoes_DropDown_xpath = "//i[@class='fa fa-angle-double-down formalshoedropdown']";
	public static String sportsShoes_DropDown_xpath = "//i[@class='fa fa-angle-double-down sportsshoedropdown']";
	public static String sneakerShoes_DropDown_xpath = "//i[@class='fa fa-angle-double-down sneakershoedropdown']";

	public static String formalShoes_FirstShoenameXpath = "//table[@class='table table-striped thead-dark formalshoetable']//tr[1]//td[1]";

	public static String sportShoes_FirstShoenameXpath = "//table[@class='table table-striped thead-dark sportsshoetable']//tr[1]//td[1]";

	public static String sneakerShoes_FirstShoenameXpath = "//table[@class='table table-striped thead-dark sneakersshoetable']//tr[1]//td[1]";

	public static void formalShoes_verifyTitle() throws IOException {
		String expectedTitleFS = "Formal Shoes";
		String actualTitleFS = driver.findElement(By.xpath(formal_Shoes_xpath)).getText();
		Assert.assertEquals(expectedTitleFS, actualTitleFS);
		if(expectedTitleFS.equals(actualTitleFS))
		{
			test.log(Status.PASS, "Test passed for title verification of formal shoes");
			test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");
		}
		else
		{
			test.log(Status.FAIL, "Test failed for title verification of formal shoes");
			test.fail("details", 
					MediaEntityBuilder.createScreenCaptureFromBase64String("base64String").build());
		}
	}

	public static void sportsShoes_verifyTitle() throws IOException {
		String expectedTitleSS = "Sports Shoes";
		String actualTitleSS = driver.findElement(By.xpath(sports_Shoes_xpath)).getText();
		//Assert.assertEquals(expectedTitleSS, actualTitleSS);
		if(expectedTitleSS.equals(actualTitleSS))
		{
			test.log(Status.PASS, "Test passed for title verification of sports shoes");
			test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");
		}
		else
		{
			//System.out.println("FAiled here");
			test.log(Status.FAIL, "Test failed for title verification of sports shoes");
			test.fail("details", 
					MediaEntityBuilder.createScreenCaptureFromBase64String("base64String").build());
		}
	}

	public static void sneakerShoes_verifyTitle() throws IOException {
		String expectedTitleSnS = "Sneakers";
		String actualTitleSnS = driver.findElement(By.xpath(sneaker_Shoes_xpath)).getText();
		Assert.assertEquals(expectedTitleSnS, actualTitleSnS);
		if(expectedTitleSnS.equals(actualTitleSnS))
		{
			test.log(Status.PASS, "Test passed for title verification of sneaker shoes");
			test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");
		}
		else
		{
			test.log(Status.FAIL, "Test failed for title verification of sneaker shoes");
		}
	}

	public static void formalShoes_firstShoe_Verify() throws IOException {
		String expectedFirstFormalShoe = "   Classic Cheltenham";
		driver.findElement(By.xpath(formalShoes_DropDown_xpath)).click();
		String actualFirstFormalShoe = driver.findElement(By.xpath(formalShoes_FirstShoenameXpath)).getText();
		Assert.assertEquals(expectedFirstFormalShoe, actualFirstFormalShoe);
		if(expectedFirstFormalShoe.equals(actualFirstFormalShoe))
		{
			test.log(Status.PASS, "Test passed for first shoe title verification");
			test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");
		}
		else
		{
			test.log(Status.FAIL, "Test failed for first shoe title verification");
			test.fail("details", 
					MediaEntityBuilder.createScreenCaptureFromBase64String("base64String").build());
		}
	}

	public static void sportsShoes_firstShoe_Verify() throws IOException {
		String expectedFirstSportsShoe = "   Ultimate";
		driver.findElement(By.xpath(formalShoes_DropDown_xpath)).click();
		String actualFirstSportsShoe = driver.findElement(By.xpath(sportShoes_FirstShoenameXpath)).getText();
		Assert.assertEquals(expectedFirstSportsShoe, actualFirstSportsShoe);
		if(expectedFirstSportsShoe.equals(actualFirstSportsShoe))
		{
			test.log(Status.PASS, "Test passed for title verification of sneaker shoes");
			test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");
		}
		else
		{
			test.log(Status.FAIL, "Test failed for first shoe title verification");
			test.fail("details", 
					MediaEntityBuilder.createScreenCaptureFromBase64String("base64String").build());
		}

	}

	public static void sneakerShoes_firstShoe_Verify() throws IOException {
		String expectedFirstSneakerShoe = "   Archivo";
		driver.findElement(By.xpath(sneakerShoes_DropDown_xpath)).click();
		String actualFirstSneakerShoe = driver.findElement(By.xpath(sneakerShoes_FirstShoenameXpath)).getText();
		Assert.assertEquals(expectedFirstSneakerShoe, actualFirstSneakerShoe);
		if(expectedFirstSneakerShoe.equals(actualFirstSneakerShoe))
		{
			test.log(Status.PASS, "Test passed for title verification of sneaker shoes");
			test.log(Status.PASS, test.addScreenCaptureFromPath(capture(driver))+"Test Passed");
		}
		else
		{
			test.log(Status.FAIL, "Test failed for first shoe title verification");
			test.fail("details", 
					MediaEntityBuilder.createScreenCaptureFromBase64String("base64String").build());
		}

	}

}
