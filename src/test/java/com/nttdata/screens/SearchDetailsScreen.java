package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchDetailsScreen extends PageObject {

    //@AndroidFindBy(id="search_input")
    @AndroidFindBy(xpath="//android.widget.EditText[@resource-id=\"com.airbnb.android:id/input_bar_input\"]")
    private WebElement searchDetailInput;

    @AndroidFindBy(id="2131429999")
    private WebElement searchDetailInputText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView")
    private WebElement firstOption;


    //@AndroidFindBy(id = "2131430997")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.airbnb.android:id/n2_simple_search_footer_link\"]")
    private WebElement skipButton;

    // id = "2131430822"
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.airbnb.android:id/n2_dls_action_footer_gradient_button\"]")
    private WebElement searchButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.airbnb.android:id/expanded_title\"]")
    private WebElement textFormWhenYourTrip;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.airbnb.android:id/expanded_title\"]")
    private WebElement textFormWhoComming;

    public void enterSearchInput(String place){
        this.searchDetailInput.click();
        this.searchDetailInput.sendKeys(place+"\n"); // para simular el enter se agrega "\n"
    }

    public void clickFirstOption(){
        this.firstOption.click();
        System.out.println("clickFirstOption");
    }

    public void clickSkip(){
        this.skipButton.click();
        System.out.println("clickSkip");
    }

    public void clickSearch(){
        this.searchButton.click();
    }

    public void validarTextoFormularioWhenYourTrip(String expect) {
        Assert.assertEquals(expect, this.textFormWhenYourTrip.getText());
    }

    public void validarTextoFormularioWhoComming(String expect) {
        Assert.assertEquals(expect, this.textFormWhoComming.getText());
    }

}
