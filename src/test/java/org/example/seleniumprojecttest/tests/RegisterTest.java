package org.example.seleniumprojecttest.tests;

import org.example.seleniumprojecttest.core.DriveManager;
import org.example.seleniumprojecttest.pages.ListActivePage;
import org.example.seleniumprojecttest.pages.RegisterPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RegisterTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = DriveManager.getDriver();
    }

    @Test
    public void shouldRegisterNewActive() {
        RegisterPage register = new RegisterPage(driver);
        register.accessPage();
        register.openModal();
        register.fillForm("Test", "Test description");
        register.submitForm();

        ListActivePage listActive = new ListActivePage(driver);
        Assertions.assertEquals("Test", listActive.title.getText());
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            DriveManager.quitDriver();
            driver = null;
        }
    }
}