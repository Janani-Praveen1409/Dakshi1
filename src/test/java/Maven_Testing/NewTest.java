package Maven_Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("test1");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("test0");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BEFORE METHOD");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("AFTER METHOD");
  }
  @Test
  public void f1() {
	  System.out.println("test3");
  }
}
