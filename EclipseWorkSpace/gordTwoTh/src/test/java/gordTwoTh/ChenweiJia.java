package gordTwoTh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


////div[@id='react-select-2-option-9']
public class ChenweiJia {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Gordon\\GoogleDriver\\chromedriver.exe");
		String  urls = "http://192.168.101.178:3000/#/login";
		ChromeDriver  cd = new ChromeDriver();
		cd.get(urls);
		cd.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//定位首頁的下拉框，以便選擇service同clinic，通過class name定位可以看到有多個值，用List列表來存儲多個值
		List<WebElement> pagebutton = cd.findElements(By.className("css-11ei81s-indicatorContainer"));
		pagebutton.get(0).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cd.findElement(By.xpath("//div[@id='react-select-3-option-9']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		cd.close();
		cd.quit();
	}
}

