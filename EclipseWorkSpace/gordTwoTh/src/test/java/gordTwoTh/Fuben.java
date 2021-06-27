package gordTwoTh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Fuben {
	public static void main(String args []){
		//1.首先獲得文件的句柄
		//2.獲得句柄後，當做是一個輸入字節碼的流，然後對這個輸入流進行讀取
		//3.讀取到輸入流後，需要讀取生成字節碼流
		//4.一行一行的輸入，使用readline()函數，注意使用拋出異常的判斷
		//設置編碼格式
		String Code = "GBK";
		
		//設置需要讀取的文件的路徑
		String filepath = "D:\\Gordon\\GitDemo\\selenium-java\\EclipseWorkSpace\\gordTwoTh\\src\\test\\resources\\CIMS2_Element.txt";
		
		//創建一個file對象,通過文件路徑，獲得文件的句柄
		File files = new File(filepath);
		
		try {
		//判斷文件是否存在
			if(files.isFile() && files.exists()) {
				//獲取了文件句柄後，把句柄當成一個輸入字節碼的流
				InputStreamReader read = new InputStreamReader(new FileInputStream(files), Code);
				
				//並對這個流進行讀取
				BufferedReader buffer = new BufferedReader(read);
				
				//讀取完之後，一行一行的輸出，使用readLine()函數
				String lineTx =null;
				while((lineTx = buffer.readLine()) != null) {
					System.out.println(lineTx);
				}
				read.close();
			}
			else {
				System.out.println("Don't find filepath");
			}
				
		}catch(Exception e) {
			System.out.println("Read file error");
			e.printStackTrace();
		}
	}

}
