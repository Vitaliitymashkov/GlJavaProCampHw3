package edu.gl.dddsampleduck.acceptance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class AdminPage {
    private final WebDriver driver;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
        driver.get("http://localhost:8080/dddsampleduck/admin/list");
        assertEquals("Duck Administration", driver.getTitle());
    }

    public void listAllDucks() {
        driver.findElement(By.linkText("List all ducks")).click();
        assertEquals("Duck Administration", driver.getTitle());
    }
}
