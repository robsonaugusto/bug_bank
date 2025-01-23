package steps;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


import static utils.utils.iniciarDriver;


public class Hooks {

    public static WebDriver driver;

    @Before
    public void setUp() {
        iniciarDriver();
    }

    @After
    public void fecharDriver() {

        if (driver != null) {
            //driver.quit(); // Fecha o navegador
        }

    }
}
