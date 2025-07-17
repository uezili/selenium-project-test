package org.example.seleniumprojecttest.pages;

import org.example.seleniumprojecttest.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListActivePage extends BasePage {

    public ListActivePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".todo-item .title-data")
    public WebElement title;

    public void getTitle() {
        title.getText();
    }
}
