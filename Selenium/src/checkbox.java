import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nayan Mahajan\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		 System.out.println( driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		 System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
