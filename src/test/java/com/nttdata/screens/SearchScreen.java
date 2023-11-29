package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class SearchScreen extends PageObject {

    @AndroidFindBy(id = "com.airbnb.android:id/start_button")
    private WebElement formSearch;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Search destinations\"]")
    private WebElement searchInput;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.View[3]/android.widget.Button")
    private WebElement closeBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.airbnb.android:id/n2_bottom_sheet_title_title\"]")
    private WebElement resultText;


    public void clickSearchInput(){
        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }

        try {
            System.out.println("se cerrara una ventana...");
            closeBtn.click();
            System.out.println("se cerro ventana");
        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }
        formSearch.click();
        System.out.println("se hara click en el campo de busqueda");

        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(searchInput));
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        searchInput.click();
    }

    public String getResultText(){
        return resultText.getText();
    }


}
