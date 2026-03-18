package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunBase;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();

    @Dado("^que estou na tela de Cadastro$")
    public void que_estou_na_tela_de_Cadastro(){
        //getDriver("FIREFOX");
        cadastroPage.acessarTelaCadastro();
    }

    @Quando("^eu preencho o formulario$")
    public void eu_preencho_o_formulario()  {

        cadastroPage.preencherNome("Felipe");
        cadastroPage.preencherEmail(Utils.getRandomEmail());
        cadastroPage.preencherSenha("12345678");


    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {
        cadastroPage.clicarCadastrar();


    }

    @Entao("^vejo a mensagem de cadastro realizado com sucesso$")
    public void vejo_a_mensagem_de_cadastro_realizado_com_sucesso() {
        cadastroPage.mensagemSucesso();
        cadastroPage.mensagemConfirmacao();

    }

    @Quando("^eu preencho o formulario nome \"([^\"]*)\" e email \"([^\"]*)\" e senha \"([^\"]*)\"$")
      public void eu_preencho_o_formulario_com_nome_email_senha(String dnome, String demail, String dsenha)  {
        cadastroPage.loginBDD(dnome , demail, dsenha);
    }

    @Entao("^vejo a mensagem de \"([^\"]*)\"$")
    public void vejo_a_mensagem_de(String message) {
        cadastroPage.verificaCampoVazio(message);

    }

}
