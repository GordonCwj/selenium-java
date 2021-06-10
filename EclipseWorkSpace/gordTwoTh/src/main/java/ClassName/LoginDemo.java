package ClassName;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface LoginDemo {
	public static final String urlgord="http://192.168.101.180:3000/#/login";
	public static final String chromepath = "D:\\ProgramData\\chrome\\Chrome-bin\\chrome.exe";
	public void openpage() throws InterruptedException;
	public boolean isJudgingElement(WebDriver web);
	public void Gordclose();
}
