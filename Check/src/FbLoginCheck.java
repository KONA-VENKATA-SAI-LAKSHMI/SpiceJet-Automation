import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLoginCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dev;
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		dev=new FirefoxDriver();
		dev.get("https://www.facebook.com/");
		dev.manage().window().maximize();
        dev.findElement(By.id("email")).sendKeys("productive@gmail.com");
        dev.findElement(By.id("email")).sendKeys("productive@gmail.com");
        dev.findElement(By.id("pass")).sendKeys("Productive1");
        dev.findElement(By.name("login")).click();
        String in="https://www.facebook.com";
        String res= dev.getCurrentUrl();
        if(res.equalsIgnoreCase(in)) {
			System.out.println("successfully accessed");
		} else {
			System.out.println("Check your credentials!!");
			dev.findElement(By.id("email")).sendKeys("productive@gmail.com");
			dev.findElement(By.id("pass")).sendKeys("Productive1");
			Thread.sleep(1000L);
			dev.findElement(By.partialLinkText("Forgot your password?")).click();
			dev.findElement(By.id("email")).sendKeys("productive@gmail.com");
			dev.findElement(By.name("did_submit")).click();
			dev.quit();
		}
	}

}
