import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loopdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nayan Mahajan\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.findElement(By.id("divpaxinfo")).click();
		 System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
		 Thread.sleep(2000);
		 for(int i=1;i<5;i++)
		 {
			driver.findElement(By.id("hrefIncAdt")).click(); 
		 }
		 System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
	}

}
