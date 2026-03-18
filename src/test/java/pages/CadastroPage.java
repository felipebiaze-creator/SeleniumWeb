package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import runner.RunCucumberTest;
import support.Commands;

import static support.Commands.*;


public class CadastroPage extends RunCucumberTest {
    private String URL = ("https://www.automationpratice.com.br/register");
    private By btnAcessoCadastro = By.cssSelector("#login_area > div > div > div > div > h3");
    private By nome = By.id("user");
    private By email = By.id("email");
    private By senha = By.id("password");
    private By btnCadastro = By.id("btnRegister");
    private By mensagemErro = By.className("errorLabel");
    private By mensagemSucesso = By.id("swal2-title");





    public void acessarTelaCadastro() {

       // String browser = System.getProperty("browser");
        //getDriver(browser).get(URL);

        //getDriver(System.getProperty("browser")).get(URL);

        getDriver("chrome").get(URL);

        //Commands.waitElementBeClickable(btnAcessoCadastro, 20);

        //Assert.assertEquals(true, getDriver().findElement(By.cssSelector("#top_header > div > div > div:nth-child(2) > div > ul > li:nth-child(2) > a")).isDisplayed());
        //System.out.println("Encontrado drive" + getDriver().findElement(By.cssSelector("#top_header > div > div > div:nth-child(2) > div > ul > li:nth-child(2) > a")));


        //getDriver().findElement((btnAcessoCadastro)).click();

        //clickElement(btnAcessoCadastro);

    }



    public void preencherNome(String nomee) {
        Commands.waitElementBeVisible(By.id("user"), 20);
        //getDriver().findElement(nome).sendKeys("Felipe");
        preencheCampo(nome, nomee );

    }

    public void preencherEmail(String randomEmail) {

        getDriver().findElement(email).sendKeys(randomEmail);
    }

    public void preencherSenha(String dsenha1) {
        //getDriver().findElement(senha).sendKeys("1234567");
        preencheCampo(senha,dsenha1);
    }

    public void clicarCadastrar() {

        //getDriver().findElement(By.id("btnRegister")).click();
        WebElement elemento = driver.findElement(By.id("btnRegister"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemento);
        // Agora você pode clicar ou interagir
        //elemento.click();

        Commands.waitElementBeClickable(btnCadastro, 20);
        clickElement(btnCadastro);

    }

    public void mensagemSucesso() {
        checkMessage(mensagemSucesso, "Cadastro realizado!");

    }

    public void mensagemConfirmacao() {
        String mensagem2 = getDriver().findElement(By.id("swal2-html-container")).getText();
        Assert.assertEquals("Bem-vindo Felipe", mensagem2);
    }
    public void loginBDD(String dnome, String demail, String dsenha) {
        getDriver().findElement(nome).sendKeys(dnome);
        //preencheCampo(nome,dnome);
        getDriver().findElement(email).sendKeys(demail);
        //preencheCampo(email,demail);
        getDriver().findElement(senha).sendKeys(dsenha);
       // preencheCampo(senha,dsenha);

    }
    public void verificaCampoVazio(String mensagemerro){
        checkMessage(mensagemErro, mensagemerro );


    }
}
