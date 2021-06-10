package gordTwoTh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ClassName.ImplementationLoginDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Only_one_condition_is_satisfied {
	
	public static void main(String []args) {
		ImplementationLoginDemo ild = new ImplementationLoginDemo();
		
//		int flag = 0;
//		ChromeDriver cdr = null;
		
		//set driver path
		//System.setProperty("webdriver.chrome.driver", "D:\\Gordon\\GoogleDriver\\chromedriver.exe");
		
		//set chrome path
//		ChromeOptions opt = new ChromeOptions();
//		opt.setBinary("D:\\ProgramData\\chrome\\Chrome-bin\\chrome.exe");
		
		//create a chromedriver option with opt(chrome path)
		//cdr = new ChromeDriver(opt);
		
		//create a wait option
		
		
		try {
			ild.openpage();
			//sh.eat();
			
			}
		catch(Exception e) {
//			cdr.close();
//			cdr.quit();
//			System.out.println("open window error");
			ild.Gordclose();
			
		}	
		
	}

}
