package Sprint_7_Positive_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.BaseClass_Matrika;
import genericUtility.PropertyFileUtility;

public class b_MatrikaLogin extends BaseClass_Matrika{

	@Test
	public void b_loginAndProductCheckingTest() throws Exception
	{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,700);");
		Thread.sleep(2000);
		String FirstElement = driver.findElement(By.xpath("(//div[@class='col-6 col-md-2 mb-4 ng-star-inserted'])[1]")).getText();
		if(FirstElement.contains("EditChains"));
		{
			System.out.println("Product Added Successfully");
		}
		
	}
	
}
