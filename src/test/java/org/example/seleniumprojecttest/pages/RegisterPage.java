package org.example.seleniumprojecttest.pages;

import org.example.seleniumprojecttest.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "open-modal")
    public WebElement openModalBtn;

    @FindBy(id = "title")
    public WebElement titleField;

    @FindBy(className = "description")
    public WebElement descriptionField;

    @FindBy(className = "button-submit")
    public WebElement submitBnt;

    @FindBy(css = "input[type='date']")
    public WebElement dateField;

    @FindBy(className = "selected-option")
    public WebElement selectedOption;

    @FindBy(css = ".options > .option:first-child")
    public WebElement options;

    public void accessPage() {
        driver.get("http://localhost:3000");
    }

    public void openModal() {
        openModalBtn.click();
    }

    public void selectOption() {
        selectedOption.click();
        options.click();

    }

    public void fillForm(String title, String description) {
        titleField.sendKeys(title);
        descriptionField.sendKeys(description);
        dateField.sendKeys("02-08-2025");
        selectOption();
    }

    public void submitForm() {
        submitBnt.click();
    }

}
