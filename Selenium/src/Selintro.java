import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nayan Mahajan\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://stage-journey.urbanbuz.com/site/login");
		 System.out.println("The url is : "+driver.getCurrentUrl());
		// driver.close();

	}

}
