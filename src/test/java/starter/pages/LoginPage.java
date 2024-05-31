package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject{

    private By loginTitle() {
        return By.xpath("//*[@id=\"root\"]/div/div[1]");
    }
    private By usernameField() {
        return By.id("user-name");
    }
    private By passwordField() {
        return By.id("password");
    }
    private By loginButton() {
        return By.xpath("//*[@id=\"login-button\"]");
    }
    private By errorMessage() {
        return By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]");
    }

    @Step
    public boolean validateOnLoginPage() {
        return $(loginTitle()).isDisplayed();
    }
    @Step
    public void inputValidUsername(String username) {
        $(usernameField()).type(username);
    }
    @Step
    public void inputValidPassword(String password) {
        $(passwordField()).type(password);
    }
    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
    }
    @Step
    public boolean errorNotification() {
        return $(errorMessage()).isDisplayed();
    }
    @Step
    public boolean inputUsernameEmptyCredential() {
        return $(usernameField()).isDisplayed();
    }
    @Step
    public boolean inputPasswordEmptyCredential() {
        return $(passwordField()).isDisplayed();
    }
}
