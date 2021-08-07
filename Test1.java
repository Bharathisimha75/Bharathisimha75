/**
 * 
 */
package p1;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
/**
 * @author bharathisimha
 *
 */
class Test1 {

	WebDriver driver;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	 static void setUpBeforeClass() throws Exception {
		
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "//Users//bharathisimha//TestWS1//TP1//chromedriver");
		driver= new ChromeDriver();
		driver.wait(20000);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Testing");
		driver.findElement(By.name("Search")).click();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		driver.close();
	}

	@Test
	void test() {
	//	fail("Not yet implemented");
	}

}
