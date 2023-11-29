package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbSearchSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;


public class AirbnbSearchStepsDefs {

    @Steps
    AirbnbSearchSteps airbnbSearchSteps;


    @Given("que me encuentro en el login de Airbnb")
    public void que_me_enuentro_en_el_login_de_airbnb() {
        this.airbnbSearchSteps.clickClose();
    }

    @When("busco {string}")
    public void busco(String place) {
        this.airbnbSearchSteps.searchByText(place);
    }

    @Then("valido que estoy en el formulario {string}")
    public void validoQueEstoyEnElFormulario(String expect) {
        this.airbnbSearchSteps.validarTextoFormularioWhenYourTrip(expect);
    }

    @When("clic en SKIP")
    public void clicEnSKIP() {
        this.airbnbSearchSteps.clicEnSKIP();
    }

    @Then("valido el texto del formulario {string}")
    public void validoElTextoDelFormulario(String expect) {
        this.airbnbSearchSteps.validarTextoFormularioWhoComming(expect);
    }

    @When("clic en Search")
    public void clicEnSearch() {
        this.airbnbSearchSteps.clicEnSearch();
    }

    @Then("muestra el texto {string}")
    public void muestra_el_texto(String text) {
        Assert.assertEquals(this.airbnbSearchSteps.getResultText(), text);
    }

    @And("valido resultados mayores a {int}")
    public void validoResultadosMayoresA(int nResultados) {
        this.airbnbSearchSteps.validarResultadosMayorA(nResultados);
    }
}
