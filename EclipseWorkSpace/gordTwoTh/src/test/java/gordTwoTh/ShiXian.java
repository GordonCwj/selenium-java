package gordTwoTh;

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
