import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class FbSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dev;
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		dev=new FirefoxDriver();
		dev.get("https://www.facebook.com/");
		dev.manage().window().maximize();
		dev.findElement(By.partialLinkText("Create New Account")).click();
		Thread.sleep(1000L);
		dev.findElement(By.name("firstname")).sendKeys("Dev");
		dev.findElement(By.name("lastname")).sendKeys("Screwed");
		dev.findElement(By.name("reg_email__")).sendKeys("productive@gmail.com");
		dev.findElement(By.name("reg_email_confirmation__")).sendKeys("productive@gmail.com");
		dev.findElement(By.name("reg_passwd__")).sendKeys("DevTurntedToTester");
		//dev.findElement(By.cssSelector("#u_17_2_2u")).click();
		Select Date = new Select(dev.findElement(By.id("day")));
		Select Month = new Select(dev.findElement(By.id("month")));
		Select Year = new Select(dev.findElement(By.id("year")));
		Date.selectByVisibleText("1");
	    Month.selectByVisibleText("Aug");
		Year.selectByVisibleText("1999");
		//Thread.sleep(1000L);
		dev.findElements(By.xpath("//*[@id=\"u_4_2_AX\"]")).get(1).click();
		//dev.findElement(By.cssSelector("input[id='u_17_2_2u']")).click();
		dev.findElement(By.name("websubmit")).click();
		dev.quit();

	}

}
