package gordTwoTh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import java.net.URL;


public class ChenweiJia {
	public static void main(String args[]){
		String encoding = "GBK";
		//URL urls = ChenweiJia.class.getClassLoader().getResource("conf.propertis");
		
		String filepath = "D:\\Gordon\\GitDemo\\selenium-java\\EclipseWorkSpace\\gordTwoTh\\src\\test\\resources\\CIMS2_Element.txt";
		
		//String filepath = Reader.class.getClassLoader().getResource("CIMS2_Element.txt").getPath();
		//String filepath = Readable.class.getClassLoader().getResource("my.txt").getPath();
		File files = new File(filepath);
		String LineTxt = null;
		//judge file whether exist
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

