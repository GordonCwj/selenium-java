package gordTwoTh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Fuben {
	public static void main(String args []){
		//1.���ȫ@���ļ��ľ��
		//2.�@�þ���ᣬ������һ��ݔ���ֹ��a������Ȼ�ጦ�@��ݔ�����M���xȡ
		//3.�xȡ��ݔ�����ᣬ��Ҫ�xȡ�����ֹ��a��
		//4.һ��һ�е�ݔ�룬ʹ��readline()������ע��ʹ�Ò����������Д�
		//�O�þ��a��ʽ
		String Code = "GBK";
		
		//�O����Ҫ�xȡ���ļ���·��
		String filepath = "D:\\Gordon\\GitDemo\\selenium-java\\EclipseWorkSpace\\gordTwoTh\\src\\test\\resources\\CIMS2_Element.txt";
		
		//����һ��file����,ͨ�^�ļ�·�����@���ļ��ľ��
		File files = new File(filepath);
		
		try {
		//�Д��ļ��Ƿ����
			if(files.isFile() && files.exists()) {
				//�@ȡ���ļ�����ᣬ�Ѿ������һ��ݔ���ֹ��a����
				InputStreamReader read = new InputStreamReader(new FileInputStream(files), Code);
				
				//�K���@�����M���xȡ
				BufferedReader buffer = new BufferedReader(read);
				
				//�xȡ��֮�ᣬһ��һ�е�ݔ����ʹ��readLine()����
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