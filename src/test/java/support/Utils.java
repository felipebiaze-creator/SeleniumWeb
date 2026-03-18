package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {

    public static String getRandomEmail(){

        String email_init ="qazando_";
        String email_final = "@qazando.com";

        Random random = new Random();
        int minimo = 0;
        int maximo = 999999999;
        int resultado = random.nextInt(maximo-minimo)+ minimo;

        return email_init+resultado+email_final;


    }
}
