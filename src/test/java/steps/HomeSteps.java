package steps;

import io.cucumber.java.pt.Dado;
import pages.HomePage;
import pages.UtilsPage;

import static utils.utils.driver;

public class HomeSteps {

    HomePage hp = new HomePage(driver);
    UtilsPage up = new UtilsPage(driver);


    @Dado("que esteja na tela do BugBank")
    public void queEstejaNaTelaDoBugBank() {
    }

}
