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
		
		String[] Element = ReadTx();
		
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
		//cdr.findElementByCssSelector("input[id='react-select-3-input']").sendKeys("Professional Development and Quality Assurance");
		//System.out.println(Element[0]);
		//String ele = Element[0];
		cdr.findElementByCssSelector(Element[0]).sendKeys("Professional Development and Quality Assurance");
		cdr.findElementByCssSelector(Element[1]).sendKeys(Keys.TAB);
		cdr.findElementByCssSelector(Element[2]).sendKeys("Kowloon Families Clinic");
		cdr.findElementByCssSelector(Element[2]).sendKeys(Keys.TAB);
		cdr.findElementByCssSelector(Element[3]).sendKeys("gordonchen");
		cdr.findElementByCssSelector(Element[4]).sendKeys("Aa000000");
		cdr.findElementByCssSelector(Element[5]).click();
		Thread.sleep(5000);
		
		//check login confirm page
		if(isJudgingElement(cdr)) {
			cdr.findElementByCssSelector(Element[6]).click();
			System.out.println("this element is exist");
		}
		Thread.sleep(5000);
		cdr.findElementByCssSelector(Element[7]).sendKeys("Not Attend");
		cdr.findElementByCssSelector(Element[7]).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		cdr.close();
		System.out.println("close window");
		cdr.quit();
		System.out.println("quit process");
	}
	
	public void Gordclose()
	{
		cdr.close();
		cdr.quit();
		System.out.println("open window error");
	}
	
	public String[] ReadTx()
	{
		String[] LineTxBuff = new String[100];
		int LTB=0;
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
					//System.out.println(LineTxt);
					LineTxBuff[LTB] = LineTxt;
					LTB++;
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
		return LineTxBuff;
	}

}
