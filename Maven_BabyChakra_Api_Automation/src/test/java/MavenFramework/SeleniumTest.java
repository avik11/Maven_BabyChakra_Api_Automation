package MavenFramework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SeleniumTest {
	
@Test
	
	public void BrowserTest1()
	
	{
		System.out.println("Selenium1");
	}

    @Test(dependsOnMethods= {"BrowserTest1"})
	
	public void BrowserTest2()
	
	{
		System.out.println("Selenium2");
	}
    
    @Test(enabled=false)
	
   	public void BrowserTest3()
   	
   	{
   		System.out.println("Selenium3");
   	}
    
@Test(timeOut=5000)
	
   	public void BrowserTest4()
   	
   	{
   		System.out.println("Selenium4");
   	}

}
