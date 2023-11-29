package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.ResultadosScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;


public class AirbnbSearchSteps {

    LoginScreen loginScreen;
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailsScreen;
    ResultadosScreen resultadosScreen;

    @Step("Click en cerrar")
    public void clickClose(){
        this.loginScreen.clickClose();
    }

    @Step("Búsqueda por texto {0}")
    public void searchByText(String place){
        this.searchScreen.clickSearchInput();
        this.searchDetailsScreen.enterSearchInput(place);
    }

    @Step("clic en SKIP")
    public void clicEnSKIP() {
        this.searchDetailsScreen.clickSkip();
    }

    @Step("clic en Search")
    public void clicEnSearch() {
        this.searchDetailsScreen.clickSearch();
    }

    @Step("valido que estoy en el formulario {string}")
    public void validarTextoFormularioWhenYourTrip(String expect) {
        this.searchDetailsScreen.validarTextoFormularioWhenYourTrip(expect);
    }

    @Step("valido el texto del formulario {string}")
    public void validarTextoFormularioWhoComming(String expect) {
        this.searchDetailsScreen.validarTextoFormularioWhoComming(expect);
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return this.searchScreen.getResultText();
    }


    @Step("valido resultados mayores a {int}")
    public void validarResultadosMayorA(int nResultados) {
        this.resultadosScreen.validarResultado(nResultados);
    }
}
