import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dev;
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		dev=new FirefoxDriver();
		dev.get("http://tizag.com/javascriptT/javascriptalert.php");
		dev.findElement(By.id("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		//Thread.sleep(10000l);
		System.out.println(dev.switchTo().alert().getText());
		dev.switchTo().alert().accept();
	    
		
	}

}
