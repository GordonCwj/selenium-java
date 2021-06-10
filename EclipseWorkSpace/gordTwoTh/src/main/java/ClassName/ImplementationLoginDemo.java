package ClassName;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class ImplementationLoginDemo implements LoginDemo {
	int flag = 0;
	ChromeDriver cdr = null;
	
	
	public boolean isJudgingElement(WebDriver web)
	{
		try {
			web.findElement(By.cssSelector("button[id='force_login_button']"));
			return true;
		}catch(Exception e){
			System.out.println("this element is not exist");
			return false;
		}
		
	}
	
	public void openpage() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Gordon\\GoogleDriver\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary(chromepath);
		
		cdr = new ChromeDriver(opt);
		WebDriverWait wewait = new WebDriverWait(cdr,5);
		
		cdr.get(urlgord);
		Thread.sleep(5000);
		cdr.manage().window().maximize();
		Thread.sleep(1000);
		cdr.findElementByCssSelector("input[id='react-select-3-input']").sendKeys("Professional Development and Quality Assurance");
		cdr.findElementByCssSelector("input[id='react-select-3-input']").sendKeys(Keys.TAB);
		cdr.findElementByCssSelector("input[id='react-select-4-input']").sendKeys("Kowloon Families Clinic");
		cdr.findElementByCssSelector("input[id='react-select-4-input']").sendKeys(Keys.TAB);
		cdr.findElementByCssSelector("input[id=\"loginName\"]").sendKeys("gordonchen");
		cdr.findElementByCssSelector("input[id='password_password'][name='password']").sendKeys("Aa000000");
		cdr.findElementByCssSelector("button[id='btn_signIn']").click();
		Thread.sleep(5000);
		
		//check login confirm page
		if(isJudgingElement(cdr)) {
			cdr.findElementByCssSelector("button[id='force_login_button']").click();
			System.out.println("this element is exist");
		}
		Thread.sleep(5000);
		cdr.findElementByCssSelector("input[id='react-select-5-input']").sendKeys("Not Attend");
		cdr.findElementByCssSelector("input[id='react-select-5-input']").sendKeys(Keys.TAB);
		Thread.sleep(5000);
		cdr.close();
		cdr.quit();
		System.out.println("Gordon open window successful");
		System.out.println("Gordon Implements successful");
	}
	
	public void Gordclose()
	{
		cdr.close();
		cdr.quit();
		System.out.println("open window error");
	}

}
