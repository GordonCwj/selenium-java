package gordTwoTh;

import java.util.Scanner;

public class ImoccDemo {
	public static void main(String[] args)
	{
		/*	功能描述: 接收三個班級各四名學生的成績，計算並輸出每個班級學生的平均分。
			用到的知識點: 二重循環，利用外層循環控制班級的數量，然後利用內層循環控制學生的數量。*/
		
		int classNum = 3; //班級的數量
		int students = 4; //每個班級有4名學生
		int sum = 0; //計算分數的總和
		double avg = 0; //計算平均分
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<classNum;i++)
		{
			System.out.println("***請輸入第"+i+"個班級的分數****");
			for(int y=0;y<students;y++)
			{
				System.out.print("請輸入第"+(y+1)+"個學生的分數:");
				int stuscore = sc.nextInt();
				sum = sum + stuscore; 
			}
			avg = sum/students;
			System.out.println("第"+(i+1)+"個班級平均分是:"+avg);
			
		}
		
	}
}
