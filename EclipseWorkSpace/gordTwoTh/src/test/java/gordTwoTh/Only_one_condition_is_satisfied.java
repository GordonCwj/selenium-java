// -- [/gordTwoTh/src/main/java/ClassName/ImplementationLoginDemo.java  實現方法
// -- [/gordTwoTh/src/main/java/ClassName/LoginDemo.java]               聲明方法
// -- [/gordTwoTh/src/test/java/gordTwoTh/Only_one_condition_is_satisfied.java] 調用的主方法

package gordTwoTh;

import ClassName.ImplementationLoginDemo;


public class Only_one_condition_is_satisfied {
	
	public static void main(String []args) {
		ImplementationLoginDemo ild = new ImplementationLoginDemo();
			
		try {
			ild.openpage();
			
			}
		catch(Exception e) {

			ild.Gordclose();
			
		}	
	   //ild.ReadTx();
		
		
		
	}

}
