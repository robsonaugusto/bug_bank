package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.UtilsPage;


import static pages.UtilsPage.*;
import static pages.UtilsPage.validarTexto;
import static utils.utils.driver;

public class UtilsSteps {

    HomePage hp = new HomePage(driver);
    UtilsPage up = new UtilsPage(driver);

    @Quando("clicar no botao {string}")
    public void clicarNoBotao(String opcao) throws InterruptedException {
        clicar(opcao);
    }

    @Quando("faço o registro")
    public void façoORegistro() throws InterruptedException{
        fazerRegistro();
    }

    @Quando("realizo o login")
    public void realizoOLogin() throws InterruptedException{
        fazerLogin();
    }

    @Entao("devera ser apresentado na tela o texto {string}")
    public void deveraSerApresentadoNaTelaOTexto(String texto) throws InterruptedException{
        validarTexto(texto);
    }
}
