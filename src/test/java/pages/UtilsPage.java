package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.utils.clicarElemento;
import static utils.utils.verificarCampoExibido;


public class UtilsPage {

    protected static WebDriver driver;

    public UtilsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static HomePage hp = new HomePage(driver);
    public static UtilsPage up = new UtilsPage(driver);

    @FindBy(xpath = "(//input[contains(@type,'email')])[1]")
    public static WebElement inputEmail;

    @FindBy(xpath = "(//input[contains(@type,'password')])[1]")
    public static WebElement inputSenha;

    @FindBy(xpath = "//button[contains(.,'Acessar')]")
    public static WebElement btnAcessar;

    @FindBy(xpath = "//button[contains(.,'Registrar')]")
    public static WebElement btnRegistrar;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public static WebElement campoEmail;

    @FindBy(xpath = "//input[contains(@type,'name')]")
    public static WebElement campoNome;

    @FindBy(xpath = "(//input[contains(@type,'password')])[2]")
    public static WebElement campoSenha;

    @FindBy(xpath = "//input[contains(@placeholder,'Informe a confirmação da senha')]")
    public static WebElement campoConfirmacaoSenha;

    @FindBy(xpath = "//label[contains(@class,'styles__Container-sc-1pngcbh-0 kIwoPV')]")
    public static WebElement btnCriarComSaldo;

    @FindBy(xpath = "//button[contains(.,'Cadastrar')]")
    public static WebElement btnCadastrar;

    @FindBy(xpath = "//a[contains(.,'Fechar')]")
    public static WebElement btnFechar;


    public static void fazerLogin() throws InterruptedException {
        Thread.sleep(2000);
        inputEmail.sendKeys("robson@gmail.com");
        inputSenha.sendKeys("123456");
        btnAcessar.click();

    }

    public static void clicar(String opcao) throws InterruptedException {
        switch (opcao) {

            case "ENVIAR":

                break;

            default:
                System.out.println("O botao nao foi mapeado");

        }

    }

    public static void fazerRegistro() throws InterruptedException {

        clicarElemento(btnRegistrar);
        campoEmail.sendKeys("robson@gmail.com");
        campoNome.sendKeys("Robson Matos");
        campoSenha.sendKeys("123456");
        campoConfirmacaoSenha.sendKeys("123456");
        Thread.sleep(2000);
        clicarElemento(btnCriarComSaldo);
        clicarElemento(btnCadastrar);
        clicarElemento(btnFechar);

    }

    public static void validarTexto(String texto) throws InterruptedException {
        switch (texto) {

            case "bem vindo ao BugBank :)":
                Thread.sleep(2000);
                verificarCampoExibido(driver, "bem vindo ao BugBank :)");
                break;

            default:
                System.out.println("O botao nao foi mapeado");

        }

    }

}











