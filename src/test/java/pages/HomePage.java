package pages;

import io.cucumber.java.pt.Dado;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static utils.utils.iniciarDriver;

public class HomePage {

    protected static WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);    }



}
