package gordTwoTh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Fuben {
	public static void main(String args []){
		String Code = "GBK";
		String[] LineTxBuff = new String[100];
		int LTB=0;
		//1.get document window
		String filepath = "D:\\Gordon\\GitDemo\\selenium-java\\EclipseWorkSpace\\gordTwoTh\\src\\test\\resources\\CIMS2_Element.txt";
		File files = new File(filepath);
		try {
			if(files.isFile() && files.exists()) {
				//2.after get the window, this a input stream, then we read this input steram
				FileInputStream FIn = new FileInputStream(files);
				InputStreamReader read = new InputStreamReader(FIn, Code);
				
				//3.read stream, need to read burffer character stream
				BufferedReader buff = new BufferedReader(read);
				
				//4. user readline(), read a line charachters
				String LineTx = null;
				while((LineTx = buff.readLine()) != null) {
					//System.out.println(LineTx);
					LineTxBuff[LTB] = LineTx;
					LTB++;
				}
				System.out.println(LineTxBuff[2]);
				//close read input stream
				read.close();
			}
			else {
				System.out.println("Don't open filepath");
			}
			
		}catch(Exception e)
		{
			System.out.println("Don't open file");
			e.printStackTrace();
		}
	}
}
