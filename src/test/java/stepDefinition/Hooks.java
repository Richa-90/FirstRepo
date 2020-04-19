package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforeValidation()
	{
		System.out.println("Before Mobile hooks");
	}

	@After("@MobileTest")
	public void afterValidation()
	{
		System.out.println("After Mobile hook");
	}
	@Before("@WebTest")
	public void beforeWebValidation()
	{
		System.out.println("Before web hook");
	}
	
	@After("@WebTest")
	public void afterWebValidation()
	{
		System.out.println("After web hook");
	}
}
