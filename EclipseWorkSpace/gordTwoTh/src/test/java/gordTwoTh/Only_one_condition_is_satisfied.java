package gordTwoTh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Only_one_condition_is_satisfied {
	public static boolean isJudgingElement(WebDriver web)
	{
		try {
			web.findElement(By.cssSelector("button[id='force_login_button']"));
			return true;
		}catch(Exception e){
			System.out.println("this element is not exist");
			return false;
		}
		
	}
	public static void main(String []args) {
		
		int flag = 0;
		String urlgord="http://192.168.101.180:3000/#/login";
		ChromeDriver cdr = null;
		//設置好驅動的路徑
		System.setProperty("webdriver.chrome.driver", "D:\\Gordon\\GoogleDriver\\chromedriver.exe");
		
		//設置瀏覽器的啟動路徑
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("D:\\ProgramData\\chrome\\Chrome-bin\\chrome.exe");
		
		//创建一个chromedriver对象
		//cdr = new ChromeDriver();
		cdr = new ChromeDriver(opt);
		
		//創建一個顯示等待的對象
		WebDriverWait wewait = new WebDriverWait(cdr,5);
		
		try {
			//打开窗口
			cdr.get(urlgord);
			Thread.sleep(5000);
			//最大化窗口
			cdr.manage().window().maximize();
			Thread.sleep(1000);
			//cdr.findElementByCssSelector("input[id='react-select-3-input']").click();
			cdr.findElementByCssSelector("input[id='react-select-3-input']").sendKeys("Professional Development and Quality Assurance");
			//Thread.sleep(1000);
			cdr.findElementByCssSelector("input[id='react-select-3-input']").sendKeys(Keys.TAB);
			//cdr.findElement(By.cssSelector("#logingServiceClinicGp_site_select_control>div>div>div>input[id='react-select-3-input']")).sendKeys("Anne Black Maternal and Child Health Centre");
			//cdr.findElementByCssSelector("input[id='react-select-3-input']").click();
			cdr.findElementByCssSelector("input[id='react-select-4-input']").sendKeys("Kowloon Families Clinic");
			//Thread.sleep(1000);
			cdr.findElementByCssSelector("input[id='react-select-4-input']").sendKeys(Keys.TAB);
			
			cdr.findElementByCssSelector("input[id=\"loginName\"]").sendKeys("gordonchen");
			cdr.findElementByCssSelector("input[id='password_password'][name='password']").sendKeys("Aa000000");
			
			cdr.findElementByCssSelector("button[id='btn_signIn']").click();
			Thread.sleep(5000);
			
			if(isJudgingElement(cdr)) {
				cdr.findElementByCssSelector("button[id='force_login_button']").click();
				System.out.println("this element is exist");
			}
			Thread.sleep(5000);
			cdr.findElementByCssSelector("input[id='react-select-5-input']").sendKeys("Not Attend");
			cdr.findElementByCssSelector("input[id='react-select-5-input']").sendKeys(Keys.TAB);
			
			
			//cdr.findElementByCssSelector("input[id='react-select-9-input']").click();
			
			Thread.sleep(5000);
			cdr.close();
			cdr.quit();
			System.out.println("open window successful");
			}
		catch(Exception e) {
			cdr.close();
			cdr.quit();
			System.out.println("open window error");
		}	
		
	}

}
