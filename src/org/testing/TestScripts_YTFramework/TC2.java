package org.testing.TestScripts_YTFramework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testing.Pages.HomePage;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 extends BaseClass
{
	@Test
	public void test() throws InterruptedException
	{
		Login lg=new Login(driver,pr);
		lg.Signin(pr.getProperty("Userid"), pr.getProperty("Password"));
		
		HomePage h=new HomePage(driver,pr);
		h.history();
		
		Logout lout=new Logout(driver, pr);
		lout.Signout();
		
}
}
