package ClassName;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

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
		/*judge element whether exist
		 * if exist return true
		 * if not exist return false
		 * */
		try {
			web.findElement(By.cssSelector("button[id='force_login_button']"));
			return true;
		}catch(Exception e){
			System.out.println("this element is not exist");
			return false;
		}
		
	}
	
	public void openpage() throws InterruptedException {
		
		//Set ChromeDriver path
		System.setProperty("webdriver.chrome.driver", "D:\\Gordon\\GoogleDriver\\chromedriver.exe");
		
		//Set Chrome path which will be open
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary(chromepath);
		
		//Create a ChromeDriver option with opt(Chrome path)
		cdr = new ChromeDriver(opt);
		
		//Create a wati option for check element whether exist
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
		System.out.println("Gordon open window successful-2");
		System.out.println("Gordon Implements successful-2");
	}
	
	public void Gordclose()
	{
		cdr.close();
		cdr.quit();
		System.out.println("open window error");
	}
	
	public void ReadTx()
	{
		String encoding = "GBK";
		String filepath = "D:\\Gordon\\GitDemo\\selenium-java\\EclipseWorkSpace\\gordTwoTh\\src\\test\\resources\\CIMS2_Element.txt";
		File files = new File(filepath);
		String LineTxt = null;
		try {
			if(files.isFile()&& files.exists()) {
				InputStreamReader reads = new InputStreamReader(
						new FileInputStream(files), encoding);
				BufferedReader bufferedReader = new BufferedReader(reads);
				while((LineTxt = bufferedReader.readLine()) != null) {
					System.out.println(LineTxt);
					}
				reads.close();
				}
			else {
				System.out.println("txt is not finded");
			}
		}catch(Exception e) {
				System.out.println("read txt error");
				e.printStackTrace();
		}
	}

}
