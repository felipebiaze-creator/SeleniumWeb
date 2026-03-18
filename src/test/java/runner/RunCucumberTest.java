package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/"},
        features = "src/test/resources/features",
        tags = {"@Cadastro5"},//Colocar os cenarios que serão executados
        glue = {"steps"}
)
public class RunCucumberTest extends RunBase {

    @AfterClass
    public static void stop(){
        // para fechar a tela após o teste
        driver.quit();
    }
}
