package utils;


import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;


public class utils {

    public static WebDriver driver;

    public static void iniciarDriver() {
        System.setProperty("webdriver.chrome.driver", "install/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://bugbank.netlify.app/");
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }




    public static void verificarCampoExibido(WebDriver driver, String campoTexto) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));

        WebElement body = driver.findElement(By.tagName("body"));

        if (body.getText().contains(campoTexto)) {
            System.out.println("O campo '" + campoTexto + "' ainda está presente na tela.");
        } else {
            throw new AssertionError("O campo '" + campoTexto + "' não está presente na tela. O teste falhou.");
        }
    }



    public static void clicarElemento(WebElement elemento) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until((ExpectedConditions.elementToBeClickable(elemento))).click();
    }




}
