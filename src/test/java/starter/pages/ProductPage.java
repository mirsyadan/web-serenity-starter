package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

    private By productTitle() {
        return By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    }

    @Step
    public boolean validateOnProductPage() {
        return $(productTitle()).isDisplayed();
    }
}
