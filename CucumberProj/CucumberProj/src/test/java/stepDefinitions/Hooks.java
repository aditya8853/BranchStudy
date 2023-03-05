package stepDefinitions;

import io.cucumber.java.Before;

public class Hooks {

	
	@Before("@RegressionTest or @SmokeTest")
	public void beforeValidations()
	{
		System.out.println("Before annotation");
		System.out.println("Checking pull");
		System.out.println("Checking push");
		System.out.println("Random check");
	}
}
