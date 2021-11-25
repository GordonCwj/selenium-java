package gordTwoTh;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CIMS2_Test {
  @Test
  public void setUpTest() {
	  // code that will be invoked when this test is instantiated
	  //System.out.println("GordonTest...");
	  //Assert.assertTrue(true);
  }
  
  @Test(groups = {"fast"})
  public void aFastTest() {
	  System.out.println("Fast test");
  }
  
  @Test
  public void Selectable() {
	  
  }
  
  @Test(groups = {"slow"})
  public void aSlowTest() {
	  System.out.println("Slow test");
  }
}
