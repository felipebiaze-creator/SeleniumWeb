package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.apache.hc.client5.http.impl.routing.SystemDefaultRoutePlanner;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import runner.RunCucumberTest;


public class DescontosSteps extends RunCucumberTest {

    HomePage homePage = new HomePage();

    @Dado("^que estou no site da qazando$")
    public void que_estou_no_site_da_qazando()  {

        homePage.acessarAplicacao();
    }


     @Quando("^eu preencho meus dados$")
    public void eu_preencho_meu_e_mail_senha() throws InterruptedException {
        homePage.scroolDown();
        homePage.preencherEmail();

    }

    @Quando("^clico no botão de login2$")
    public void clico_no_botão_de_login2()  {

       homePage.clicarBotao();

    }

    @Então("^eu vejo o código de desconto$")
    public void eu_vejo_o_código_de_desconto()  {

        homePage.verificarCupom();

    }
    @Dado("^que tenho um cupom gerado$")
    public void que_tenho_um_cupom_gerado() throws InterruptedException {
        homePage.acessarAplicacao();
        homePage.scroolDown();
        homePage.preencherEmail();
        homePage.clicarBotao();

    }

    @Quando("^eu falho$")
    public void eu_falho()  {
        homePage.verificarCupomIinvalido();

    }

}
