import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dev;
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		dev=new FirefoxDriver();
		dev.get("http://www.echoecho.com/htmlforms10.htm");
		dev.manage().window().maximize();
	int count = dev.findElements(By.xpath("//input[@name='group1']")).size();
	System.out.println("Group1");
	System.out.println("_____________________________________________________________");
	System.out.println("|    " + "Normal[G1]" + "     |     " + "Reverse[G1]" + "     |    " );
	System.out.println("_____________________________________________________________");
	for(int i=0,j=count-1;i<count && j>=0;i++,j--)
	{
		dev.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		System.out.println("     " +dev.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("Value") +  "              "+ dev.findElements(By.xpath("//input[@name='group1']")).get(j).getAttribute("Value"));
	}
	System.out.println("_____________________________________________________________");
	System.out.println("\n");
	System.out.println("Group2");
	int count1 = dev.findElements(By.xpath("//input[@name='group2']")).size();
	System.out.println("_____________________________________________________________");
	System.out.println("|    " +"Normal[G2] " + "     |    " + "Reverse[G2] " + "     |    " );
	System.out.println("_____________________________________________________________");
	for(int i=0, j=count1 -1;i<count1 && j>=0 ;i++, j--)
	{
		dev.findElements(By.xpath("//input[@name='group2']")).get(i).click();
		System.out.println("     " +dev.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("Value")+  "              " + dev.findElements(By.xpath("//input[@name='group2']")).get(j).getAttribute("Value"));
	}
	System.out.println("____________________________________________");
	System.out.println("\n");
    System.out.println("Selected values");
    System.out.println("\n");
    System.out.println("_____________________________________________________________");
    System.out.println("|    " + "Group1" +  "     |    " +"Group2"+ "     |    ");
    System.out.println("_____________________________________________________________");
    System.out.println("     " +dev.findElements(By.xpath("//input[@name='group1']")).get(0).getAttribute("Value")+  "     |    " + dev.findElements(By.xpath("//input[@name='group2']")).get(2).getAttribute("Value"));
    System.out.println("_____________________________________________________________");
    dev.findElements(By.xpath("//input[@name='group2']")).get(2).click();
    dev.findElements(By.xpath("//input[@name='group1']")).get(0).click();

	}
    

}

