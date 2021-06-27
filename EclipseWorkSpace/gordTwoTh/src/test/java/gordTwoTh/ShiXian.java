package gordTwoTh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 1.Interface(ShengMing) and interface implementation class(ShiXian), and application class(Only_one_condition_is_satisfied) in the same package 
 */

public class ShiXian implements ShengMing {
	public void eat()
	{
		System.out.println("I'm eating");
	}
	
	public void eaterror()
	{
		System.out.println("I'm eating error");
	}
}
