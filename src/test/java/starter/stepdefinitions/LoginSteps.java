package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.LoginPage;
import starter.pages.ProductPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;
    @Steps
    ProductPage productPage;

    @Given("I on the login page")
    public void onTheLoginPage(){
        loginPage.openUrl("https://www.saucedemo.com/");
        Assertions.assertTrue(loginPage.validateOnLoginPage());
    }
    @When("I input username with valid")
    public void inputUsernameWithValid(){
        loginPage.inputValidUsername("standard_user");
    }
    @And("I input password with valid")
    public void inputPasswordWithValid(){
        loginPage.inputValidPassword("secret_sauce");
    }
    @And("I click the login button")
    public void clickTheLoginButton(){
        loginPage.clickLoginButton();
    }
    @Then("I on the product page")
    public void onTheProductPage(){
        Assertions.assertTrue(productPage.validateOnProductPage());
    }
    @Then("I see error message Epic sadface: Password is required")
    public void seeErrorMessagePasswordRequired(){
        loginPage.errorNotification();
    }
    @When("I input username with empty credential")
    public void inputUsernameWithEmptyCredential(){
        loginPage.inputUsernameEmptyCredential();
    }
    @And("I input password with empty credential")
    public void inputPasswordWithEmptyCredential(){
        loginPage.inputPasswordEmptyCredential();
    }
    @Then("I see error message Epic sadface: Username is required")
    public void seeErrorMessageUsernameRequired(){
        loginPage.errorNotification();
    }
}
