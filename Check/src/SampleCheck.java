import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleCheck {
	WebDriver dev;
	public void BrowserCheck() {
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		dev=new FirefoxDriver();
		dev.get("https://github.com/KONA-VENKATA-SAI-LAKSHMI");
	}
	
	public static void main(String[] args) {
		SampleCheck obj= new SampleCheck();
		obj.BrowserCheck();
	}

}
