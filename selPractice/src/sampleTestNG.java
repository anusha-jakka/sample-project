import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class sampleTestNG {
	
	  @Test
	  public void method() 
	  {
		  System.out.println("In method");
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  System.out.println("In before method");
	  }

	  @AfterMethod
	  public void afterMethod() 
	  {
		  System.out.println("In After method");
	  }	

}
