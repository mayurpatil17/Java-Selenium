package scenarioBasedQuestions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class LogoBasedScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com");
		
		WebElement logo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		
		File src = logo.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/googleLogo2.png");
		
		Files.copy(src, dest);
		
		driver.close();
		
		System.out.println("END OF PROGRAMME");

	}

}
