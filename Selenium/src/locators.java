import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Nayan Mahajan\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//Added wait
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("Nayan Mahajan");
driver.findElement(By.name("inputPassword")).sendKeys("welcome");
driver.findElement(By.className("signInBtn")).click();
driver.findElement(By.cssSelector("p.error")).getText();
driver.findElement(By.linkText("Forgot your password?")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Nayan Mahajan");

driver.findElement(By.xpath("//input[@type='text'][2]")).clear();//by index value
driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Mahajan Nayan");
driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("nayan@abc.com");
driver.findElement(By.xpath("//form/input[3]")).sendKeys("9765434675");
driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
Thread.sleep(1000);
driver.findElement(By.id("inputUsername")).sendKeys("Nayan Mahajan");
driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
driver.findElement(By.cssSelector("input[type*=box")).click();
driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

}
}