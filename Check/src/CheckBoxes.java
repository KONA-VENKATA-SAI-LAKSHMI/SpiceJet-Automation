import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dev;
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		dev=new FirefoxDriver();
		dev.get("http://www.cuesysinfotech.com/");
		dev.manage().window().maximize();
		dev.findElement(By.id("enquiry_name")).sendKeys("Wise");
		dev.findElement(By.xpath("//*[@id=\"enquiry_email\"]")).sendKeys("checkboxCheck@gmai.com");
        dev.findElement(By.name("enquiry_phone")).sendKeys("9987654321");
        dev.findElement(By.id("enquiry_message")).sendKeys("KONA VENKATA SAI LAKSHMI CHECKBOX ASSESSMENT!");
        dev.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/button")).click();
	}    

}
