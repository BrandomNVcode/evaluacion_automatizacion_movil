package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultadosScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.GridView[@content-desc=\"Explore Airbnb\"]")
    private WebElement resultContent;

    public void validarResultado(int nResultadosEsperados) {
        List<WebElement> resultados = resultContent.findElements(By.xpath(".//android.widget.FrameLayout"));
        int cantidadResultados = resultados.size();
        Assert.assertTrue(cantidadResultados > nResultadosEsperados);
    }

}
