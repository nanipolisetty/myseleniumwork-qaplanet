package naniP;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TestNGPractice {


@AfterClass
public void After()
{
System.out.println("After");
}

@Test
public void test()
{
System.out.println("test");	

}

@BeforeClass
public void before()
{
System.out.println("before");	}

	
	
}
