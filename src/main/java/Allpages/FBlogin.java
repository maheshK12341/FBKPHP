package Allpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BaseNP.BaseNP;
import GenericMethods.GenericMethod;

public class FBlogin extends BaseNP
{
private static By FBEmailid=By.id("email");
public static By FBpasswordid=By.id("pass");
public static By login=By.name("login");
public static By InvalidErrorMessage=By.xpath("//div[contains(text(),'The email address')]");

public static WebElement GetFBEmailid()
{
	
	return driver.findElement(FBEmailid);
}

public static void EnterEmailid(String Email)
{
	GetFBEmailid().sendKeys(Email);
}
public static void EnterPassword(String password)
{
	driver.findElement(FBpasswordid).sendKeys(password);
}

public static boolean ValidateErrormessage()
{
	boolean flag;
//	Assert.assertEquals(driver.findElement(InvalidErrorMessage).getText(), "The email address you entered isn't connected to an account. Find your account and log in.");
	if(driver.findElement(InvalidErrorMessage).getText().equals("The email address you entered isn't connected to an account. Find your account and log in"))
	{
		flag=true;
	} 
	
	else
	{
		flag=false;
	}
	
	return flag;
}

public static void Login()
{
	GenericMethod GM= new GenericMethod();
	WebElement element=driver.findElement(login);
	GM.Click(element);
}
}
