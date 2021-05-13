package pe.edu.upc.selenium.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pe.edu.upc.selenium.MyWebDriver;

public class RusuarioStepdefs {

    public static WebDriver webDriver;
 /*   Given El usuario ingresa y hace click en registrar
    And Seleciona tipo de cuenta y rellena los datos
    When Hace click registrarse
    Then Debe iniciar sesión
*/
    public RusuarioStepdefs() {
        webDriver = MyWebDriver.getWebDriver();
    }
    @Given("El usuario ingresa y hace click en registrar"){


    }
    @And("Seleciona tipo de cuenta y rellena los datos")
    public void haceClickEnLaOpciónDetaineeDelMenu() {
        WebElement linkDetainee = webDriver.findElement(By.name("link-detainee"));
        linkDetainee.click();
    }

    @When("Hace click registrarse")
    public void haceClickEnElBotonNuevoDeLaLista() {
        webDriver.get("https://kambista.com/");
    }

    @And("Debe iniciar sesión como usuario nuevo")
    public void ingresaLosDatosDelDetenido() {

        webDriver.findElement(By.id("dni")).sendKeys("70785698");
        webDriver.findElement(By.id("apellidos")).sendKeys("MOLINA");
        webDriver.findElement(By.id("nombres")).sendKeys("LIMENCIO");
        webDriver.findElement(By.id("fechaNacimiento")).sendKeys("25/05/1998");


    }

    @And("Hace click en el boton Grabar del formulario de detainee")
    public void haceClickEnElBotonGrabarDelFormularioDeDetainee() {
    }

    @Then("Verificar que el detenido fue registrado")
    public void verificarQueElDetenidoFueRegistrado() {
    }
}
