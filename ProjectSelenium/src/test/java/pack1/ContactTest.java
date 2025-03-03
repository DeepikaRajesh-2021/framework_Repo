package pack1;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test
	public void createcontactTest()
	{
		String URL =System.getProperty("url");
		String BROWSER =System.getProperty("browser");
		String USERNAME =System.getProperty("username");
		String PASWORD =System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASWORD);
		
		
		System.out.println("execute create contact test");
	}
	
	@Test
	public void modifycontactTest()
	{
		System.out.println("execute modify contact test");
	}

}
