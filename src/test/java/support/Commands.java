package support;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.apache.commons.lang3.SystemUtils;
import org.apache.hc.client5.http.impl.routing.SystemDefaultRoutePlanner;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

public class Commands extends RunCucumberTest {
    public static void waitElementBeClickable(By element, int tempo){
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void waitElementBeVisible(By element, int tempo){
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void checkMessage(By element ,String expectMessage){

        String actualMessage = "";
        try{
            waitElementBeVisible(element,10000);
            actualMessage = getDriver().findElement(element).getText();
            Assert.assertEquals(expectMessage,actualMessage);

        }catch (Exception error){
            System.out.println("********** Aconteceu um erro validar mensagem");
            System.out.println("********** Mensagem esperada" + expectMessage);
            System.out.println("********** Mensagem atual" + actualMessage);
            System.out.println(error);

        }
    }

    public static void clickElement(By element){
        System.out.println("#################");
        try{
            System.out.println("******** vai clicar no elemento: " + element);
            waitElementBeClickable(element,10000);
            getDriver().findElement(element).click();
            System.out.println("****** Clicou no elemento");

        } catch (Exception error){
            System.out.println("******** Aconteceu um erro ao tentar clicar no elemento: " + element);
            System.out.println(error);
        }
    }
    public static void preencheCampo(By element, String value){
        try{
            System.out.println("******** vai clicar no elemento: " + element);
            waitElementBeVisible(element,10000);
            getDriver().findElement(element).sendKeys(value);
            System.out.println("****** Preencheu o campo" + element);

        } catch (Exception error){
            System.out.println("******** Erro ao preencher o campo: " + element);
            System.out.println(error);
        }
    }
}
