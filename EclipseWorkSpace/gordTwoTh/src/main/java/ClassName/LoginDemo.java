// -- [/gordTwoTh/src/main/java/ClassName/ImplementationLoginDemo.java  實現方法
// -- [/gordTwoTh/src/main/java/ClassName/LoginDemo.java]               聲明方法
// -- [/gordTwoTh/src/test/java/gordTwoTh/Only_one_condition_is_satisfied.java] 調用的主方法

package ClassName;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public interface LoginDemo {
	public static final String urlgord="http://192.168.101.180:3000/#/login";
	public static final String chromepath = "D:\\ProgramData\\chrome\\Chrome-bin\\chrome.exe";
	public void openpage() throws InterruptedException;
	
	//登錄的session還有效，然後又打開頁面輸入同一個賬號密碼點擊登錄，就會彈出一個提示框，這裡驗證提示框是否存在，若存在，則點擊ok
	public boolean isJudgingElement(WebDriver web);
	public void Gordclose();
	public String[] ReadTxElement();
	public String[] ReadTxDetail();
}
