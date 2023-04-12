package Question_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_01 {

	public static  void main( String[] args)
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver;
	ChromeOptions co=new ChromeOptions();   
	co.addArguments("--remote-allow-orgins=*");
	driver=new ChromeDriver(co);
	driver.get("https://www.amazon.in/iQOO-Dimensity-Processor-Brightest-FlashCharge/dp/B07WFPMQB1/ref=sr_1_2?crid=3632HOPP93RLY&keywords=vivo%2Bv27%2Bpro%2B5g&qid=1681288375&sprefix=vivo%2Caps%2C769&sr=8-2&th=1");
	driver.manage().window().maximize();
	WebElement text=driver.findElement(By.id("add-to-cart-button"));
	text.click();
	driver.get("https://www.amazon.in/cart/smart-wagon?newItems=Ca8070ce7-8540-413d-8944-2679084f5cb3,1");
	driver.navigate().back();
	System.out.print("The product is added to the cart");
	}

}



