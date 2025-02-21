package FbStepdefincation;

import java.io.IOException;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Allpages.FBlogin;
import BaseNP.BrowserException;
import GenericMethods.GenericMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbloginStepfination extends FBlogin
{
@Given("user is on login page")
	public static void user_is_on_login_page() throws BrowserException, IOException
	{
	Init_browser();
	Application_url(url);
	ExtentCucumberAdapter.addTestStepLog(" user is on login page");
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethod.Takescreenshot());
	}


@When("user enters Invalid username{string}")
public void user_enters_Invalid_username(String Emailid) throws IOException {
  
	EnterEmailid(Emailid);
	ExtentCucumberAdapter.addTestStepLog("user entered the username"+Emailid);
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethod.Takescreenshot());
}
@When("user enters Invalid password{string}")
public void user_enters_Invalid_password(String password) throws IOException {
	EnterPassword(password);
	ExtentCucumberAdapter.addTestStepLog("user entered the username"+password);
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethod.Takescreenshot());
}


@When("^user enters valid username \"([^\"]*)\"$")
public void user_enters_valid_username(String Emailid) throws IOException {
  
	EnterEmailid(Emailid);
	// take screenshot --we need call
	ExtentCucumberAdapter.addTestStepLog("user entered the username"+Emailid);
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethod.Takescreenshot());
}

@When("^user enters valid password \"([^\"]*)\"$")
public void user_enters_valid_password(String password) {
   
	EnterPassword(password);
	ExtentCucumberAdapter.addTestStepLog("user entered the password"+password);
}



@And("user clicks on submit")
public static void user_clicks_on_submit() throws IOException
{
	SoftAssert sa= new SoftAssert();
	Login();
	//Validate error message--02/19
	//Assert.assertEquals(driver.findElement(InvalidErrorMessage).getText(), "The email address you entered isn't connected to an account. Find your account and log in");
sa.assertFalse(ValidateErrormessage(), "Error message is not matching");
System.out.println("checkout");

	ExtentCucumberAdapter.addTestStepLog("System generated Valid error message");
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethod.Takescreenshot());
	sa.assertAll();
}

@Then("user should be on home page")
public static void user_should_be_on_home_page()
{
	// if("Welcome to FB".equals(driver.gettitle())
	{
		//SOP("pass");
	}
}

}
