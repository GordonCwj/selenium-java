package gordTwoTh;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChenweiJia {
	public static void main(String args[]) throws InterruptedException {
	//System.out.println("helloworld");
	System.setProperty("webdriver.chrome.driver", "D:\\Gordon\\GoogleDriver\\chromedriver.exe");
	ChromeDriver cwj = new ChromeDriver();
	cwj.get("http://192.168.101.180:3000/#/login");
	cwj.manage().window().maximize();
	cwj.findElement(By.cssSelector("#logingServiceClinicGp_service_select_control>div>div>div>input[id='react-select-3-input']")).sendKeys("Families Clinic, PDQA");
	cwj.findElement(By.cssSelector("#logingServiceClinicGp_site_select_control>div>div>div>input[id='react-select-3-input']")).sendKeys("Kowloon Families Clinic");
	cwj.findElementByCssSelector("input[id='loginName'][name='loginName']").sendKeys("gordonchen");
	cwj.findElementByCssSelector("input[id='password_password'][name='password']").sendKeys("Aa000000");
	cwj.findElement(By.id("btn_signIn")).click();
	
	//cwj.findElement(null)
	Thread.sleep(5000);
	cwj.close();
	cwj.quit();
	}

}

