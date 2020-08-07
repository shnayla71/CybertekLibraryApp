package com.Cybertek.step_definition;

import com.Cybertek.pages.landingPages;
import com.Cybertek.pages.loginPages;
import com.Cybertek.utilities.ConfigurationReader;
import com.Cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginDefinition {
  loginPages loginPages=new loginPages();
  landingPages landingPages=new landingPages();
    @Given("Librarian on the login page")
    public void librarian_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
    }

    @When("Librarian login as a librarian")
    public void librarian_login_as_a_librarian() {
       loginPages.login();
    }
    @Then("Dashboard should be displayed")
    public void dashboard_should_be_displayed() {
       String actualTitle=Driver.getDriver().getTitle();
      System.out.println(actualTitle);
       String expectedTitle="Login - Library";
      Assert.assertEquals(actualTitle,expectedTitle);

      Driver.closeDriver();
    }


    @Given("Student on the login page")
    public void student_on_the_login_page() {
      Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
    }

    @When("Student login as a student")
    public void student_login_as_a_student() {
      loginPages.login1();
    }
    @Then("Dashboard1 should be displayed")
    public void dashboard1_should_be_displayed() {
      String actualTitle=Driver.getDriver().getTitle();
      System.out.println(actualTitle);
      String expectedTitle="Login - Library";
      Assert.assertEquals(actualTitle,expectedTitle);
      Driver.closeDriver();
    }
  @Given("I am on the login page")
  public void ıAmOnTheLoginPage() {
    Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
  }

  @When("I enter username {string}")
  public void ı_enter_username(String string) {
      String username1=string;
      loginPages.mailBox.sendKeys(username1);

  }
  @When("I enter password {string}")
  public void ı_enter_password(String string) {
      String password1=string;
      loginPages.password.sendKeys(password1);

  }
  @When("click the sign in button")
  public void click_the_sign_in_button() {
    loginPages.signButton.click();
  }

  @Then("there should be {int} users")
  public void there_should_be_users(Integer int1) throws InterruptedException {
     Thread.sleep(4000);
      int expectedUserCnt=int1;
      String expectedUser=String.valueOf(expectedUserCnt);
    String actualUser=landingPages.userCount.getText();
    Assert.assertEquals(actualUser,expectedUser);
  }
  @Then("dashboard should be displayed")
  public void dashboardShouldBeDisplayed() {
    String actualTitle=Driver.getDriver().getTitle();
    System.out.println(actualTitle);
    String expectedTitle="Library";
    Assert.assertEquals(actualTitle,expectedTitle);

  }


}
