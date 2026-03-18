package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import runner.RunCucumberTest;
import support.Commands;
import support.Utils;

public class HomePage extends RunCucumberTest {

    public void acessarAplicacao(){
        getDriver().get("https://qazando.com.br/curso.html");
        Commands.waitElementBeClickable(By.id("btn-ver-cursos"), 10);

        Assert.assertEquals(true, getDriver().findElement(By.id("btn-ver-cursos")).isDisplayed());
    }
    public void scroolDown() throws InterruptedException {

        //Comando para dar um scrol na tela para dar tempo de achar o ID
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(10000)");
        Thread.sleep(2000);
    }

    public void preencherEmail(){
        getDriver().findElement(By.id("email")).sendKeys("felipe@teste.com.br");
    }
    public void clicarBotao(){
        getDriver().findElement(By.id("button")).click();
    }
    public void verificarCupom(){
        String texto_cupom = getDriver().findElement(By.cssSelector("#cupom > h2 >span")).getText();
        System.out.println(texto_cupom);

        Assert.assertEquals("QAZANDO15OFF", texto_cupom);
    }

    public void verificarCupomIinvalido(){
        String texto_cupom = getDriver().findElement(By.cssSelector("#cupom > h2 >span")).getText();
        System.out.println(texto_cupom);

        Assert.assertEquals("QAZANDO15OFFxxxx", texto_cupom);
    }
}
