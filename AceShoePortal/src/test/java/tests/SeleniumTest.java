package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Pages.HomePage;
import Pages.ProductsPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static WebDriver driver;
	
	static ExtentReports report;
	public static ExtentTest test;
	static ExtentReports extent = new ExtentReports();
	
	

	@BeforeTest
	public static void setUp() throws InterruptedException {
		WebDriverManager.chromedriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/Reports/TestReport.html");
		extent.attachReporter(spark);
		HomePage.click_hamburger_menu();
		HomePage.click_products_page();
	}
	
	public static String capture(WebDriver driver) throws IOException
	{
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../ExecImages/" + System.currentTimeMillis() + ".png");
		String errFilePath = Dest.getAbsolutePath();
		FileUtils.copyFile(srcFile, Dest);
		return errFilePath;
	}

	@Test
	void validateTitles_OnlineProducts() throws IOException {
		
		test = extent.createTest("Validate Shoe titles on Product Page", "This test validates different shoetypes on product page");
		ProductsPage.formalShoes_verifyTitle();
		ProductsPage.sportsShoes_verifyTitle();
		ProductsPage.sneakerShoes_verifyTitle();
	}
	
	@Test
	void validateFirstFormalShoes() throws IOException
	{
		test = extent.createTest("Validate first Formal Shoe name", "This test validates formal shoe on product page");
		ProductsPage.formalShoes_firstShoe_Verify();
	}
	
	@Test
	void validateFirstSportsShoes() throws IOException
	{
		test = extent.createTest("Validate first sports Shoe name", "This test validates sports shoe on product page");
		ProductsPage.sportsShoes_firstShoe_Verify();
	}
	
	@Test
	void validateFirstSneakerShoes() throws IOException
	{
		test = extent.createTest("Validate first sneaker Shoe name", "This test validates sneaker shoe on product page");
		ProductsPage.sneakerShoes_firstShoe_Verify();
	}
	
	@AfterTest
	public void tearDown()
	{
		extent.flush();
		driver.quit();
	}
}
