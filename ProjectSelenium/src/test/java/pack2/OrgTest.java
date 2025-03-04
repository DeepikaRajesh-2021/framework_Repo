package pack2;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test
	public void createorgTest()
	{
		
		String URL =System.getProperty("url");
		String BROWSER =System.getProperty("browser");
		String USERNAME =System.getProperty("username");
		String PASWORD =System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASWORD);
		System.out.println("execute create org test");
	}
	
	@Test
	public void modifyorgTest()
	{
		System.out.println("execute modify org test");
	}

}
