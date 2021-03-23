import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpiceJetOneWayAndTwoWay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dev;
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		dev=new FirefoxDriver();
		dev.get("http://www.spicejet.com/");
		dev.manage().window().maximize();		
		dev.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> count = dev.findElements(By.id("discount-checkbox"));
        //System.out.println(count.size());//count
		System.out.println("\n");
		System.out.println("List of Checkboxes!");
		System.out.println("\n");
        int c1 = count.size();

        for(int i = 0;i<c1;i++){
            WebElement dis = count.get(i);
            String Checkboxes = dis.getText();
            System.out.println(Checkboxes);// Printing all the check boxes value and not going inside below loop.
            if(Checkboxes.equalsIgnoreCase(" Indian Armed Forces")){
                System.out.println(dis);
                dev.findElements(By.id("discount-checkbox")).get(i).click();
            }
		dev.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();		
		//System.out.println("ONE WAY");
		dev.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); 
		System.out.println("\n");
		System.out.println(" ONE WAY CHECKBOX STATUS ");
		System.out.println("\n");
        System.out.println("Senior Citizen: " + dev.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        System.out.println("Family and Friends: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
        System.out.println("Armed Forces: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_IndArm']")).isSelected());
        System.out.println("LTC Fare: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_Ltc']")).isSelected());
        System.out.println("Government Employee: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_Govt']")).isSelected());
        System.out.println("Student: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
        System.out.println("Minor: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_Unmr']")).isSelected());
        System.out.println("\n");
        //Select origin
        new WebDriverWait(dev, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"))).click();
        dev.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//table[@id='citydropdown']//li/a[@value='HYD']")).click();
        dev.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//table[@id='citydropdown']//li/a[@value='BLR']")).click();
        new WebDriverWait(dev, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='ui-datepicker-calendar']//tr//a[contains(@class,'ui-state-default') and contains(.,'25')]"))).click();
     //Select Passengers
     Thread.sleep(4000);
     dev.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();
     Thread.sleep(4000);
     WebElement Adults = dev.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")); Select adultsdrp = new Select(Adults);
     adultsdrp.selectByValue("2");
     WebElement childs = dev.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
     Select childsdrp = new Select(childs);
     childsdrp.selectByValue("2");
     dev.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();
     System.out.println(dev.findElement(By.xpath(".//*[@id='divpaxinfo']")).getText());
		Select CuD = new Select(dev.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		CuD .selectByValue("INR"); //Currency Dropdown
		dev.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		dev.navigate().back();
		dev.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		//Round Trip
		//System.out.println("Round Trip");
		dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).click(); 
		System.out.println("\n");
		System.out.println(" ROUND TRIP CHECKBOX STATUS");
		System.out.println("\n");
        System.out.println("Senior Citizen: " + dev.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        System.out.println("Family and Friends: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
        System.out.println("Armed Forces: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_IndArm']")).isSelected());
        System.out.println("LTC Fare: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_Ltc']")).isSelected());
        System.out.println("Government Employee: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_Govt']")).isSelected());
        System.out.println("Student: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
        System.out.println("Minor: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_Unmr']")).isSelected());
        System.out.println("\n");
        //Select origin
        new WebDriverWait(dev, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"))).click();
        dev.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//table[@id='citydropdown']//li/a[@value='HYD']")).click();
        dev.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//table[@id='citydropdown']//li/a[@value='BLR']")).click();
        new WebDriverWait(dev, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='ui-datepicker-calendar']//tr//a[contains(@class,'ui-state-default') and contains(.,'25')]"))).click();
     //Select Passengers
     Thread.sleep(4000);
     dev.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();
     Thread.sleep(4000);
     WebElement RAdults = dev.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
     Select Radultsdrp = new Select(RAdults);
     Radultsdrp.selectByValue("2");
     WebElement Rchilds = dev.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
     Select Rchildsdrp = new Select(Rchilds);
     Rchildsdrp.selectByValue("2");
     dev.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();
     System.out.println(dev.findElement(By.xpath(".//*[@id='divpaxinfo']")).getText());
		Select RCuD = new Select(dev.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		RCuD .selectByValue("INR"); //Currency Dropdown
		dev.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		dev.navigate().back();
		dev.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip_2\"]")).click();
		dev.findElement(By.linkText("Ok")).click();
		//dev.switchTo().alert().accept();
		//Multicity
		new WebDriverWait(dev, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"))).click();
        dev.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//table[@id='citydropdown']//li/a[@value='HYD']")).click();
        dev.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//table[@id='citydropdown']//li/a[@value='BLR']")).click();
        new WebDriverWait(dev, 20).until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_mainContent_ddl_originStation2_CTXT"))).click();
        dev.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation2_CTNR']//table[@id='citydropdown']//li/a[@value='DEL']")).click();
        dev.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation2_CTNR']//table[@id='citydropdown']//li/a[@value='CCU']")).click();
        new WebDriverWait(dev, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation3_CTXT']"))).click();
        dev.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation3_CTNR']//table[@id='citydropdown']//li/a[@value='PNQ']")).click();
        dev.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation3_CTNR']//table[@id='citydropdown']//li/a[@value='ATQ']")).click();
       // new WebDriverWait(dev, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation2_CTXT']"))).click();
        new WebDriverWait(dev, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='ui-datepicker-calendar']//tr//a[contains(@class,'ui-state-default') and contains(.,'25')]"))).click();
       // new WebDriverWait(dev, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='ui-datepicker-calendar']//tr//a[contains(@class,'ui-state-default') and contains(.,'29')]"))).click();
       // new WebDriverWait(dev, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='ui-datepicker-calendar']//tr//a[contains(@class,'ui-state-default') and contains(.,'5')]"))).click();
        //System.out.println("Multicity");
		dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).click(); //Checkbox
		//Thread.sleep(4000);
		//dev.findElement(By.xpath("//*[@id=\"MultiCityModelAlert")).click();
		//dev.switchTo().alert().accept();
		System.out.println("\n");
		System.out.println("MULTICITY CHECKBOX STATUS");
		System.out.println("\n");
        System.out.println("Senior Citizen: " + dev.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        System.out.println("Family and Friends: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
        System.out.println("Armed Forces: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_IndArm']")).isSelected());
        System.out.println("LTC Fare: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_Ltc']")).isSelected());
        System.out.println("Government Employee: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_Govt']")).isSelected());
        System.out.println("Student: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
        System.out.println("Minor: " + dev.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_Unmr']")).isSelected());
        System.out.println("\n");
        //Select origin
        
     //Select Passengers
     Thread.sleep(4000);
     dev.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();
     Thread.sleep(4000);
     WebElement MAdults = dev.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
     Select Madultsdrp = new Select(MAdults);
     Madultsdrp.selectByValue("2");
     WebElement Mchilds = dev.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
    Select Mchildsdrp = new Select(Mchilds);
    Mchildsdrp.selectByValue("2");
     dev.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();
     System.out.println(dev.findElement(By.xpath(".//*[@id='divpaxinfo']")).getText());
		Select MCuD = new Select(dev.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		MCuD .selectByValue("INR"); //Currency Dropdown
		dev.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		//dev.navigate().back();
       // dev.quit();
	}
	}
}
