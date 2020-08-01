package p_O_m;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Utilis.Driver;

import java.util.List;
import java.util.Random;

public class Parent {
    WebDriver driver;
    WebDriverWait wait;

    public Parent (){

        driver = Driver.getDriver();
        wait = new WebDriverWait(driver,10);

    }

    public void waitUnitlClikable(WebElement elementToWait){
        wait.until(ExpectedConditions.elementToBeClickable(elementToWait));
    }

    public void waitUntilVisible(WebElement elementToWait){
        wait.until(ExpectedConditions.visibilityOf(elementToWait));
    }

    public void clikFuction (WebElement element){
        waitUnitlClikable(element);
        element.click();
    }

    public void sendKeysFunction (WebElement element, String value){
        waitUntilVisible(element);
        element.clear();
        element.sendKeys(value);
    }

    public void elementContainsText (WebElement element, String text){
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(text));
    }

    public int radom (int max){

        Random rnmd = new Random();

        return rnmd.nextInt(max-1)+1;
    }

    public void getText (List<WebElement> elements, int i){

        System.out.println(elements.get(i));

    }

    public void VerifyTotalPrice (String product, String shipping, String total){


        Double productFee = Double.parseDouble( product.replaceAll("[^\\d.]", ""));
        Double shippingFee = Double.parseDouble(shipping.replaceAll("[^\\d.]", ""));
        double totalFee = Double.parseDouble(total.replaceAll("[^\\d.]", ""));
        double totalFee1 = productFee + shippingFee;
        Assert.assertEquals(totalFee1, totalFee);
    }

    public void VerifyConfirmationText (String text){

        Assert.assertTrue(text.contains("complete"));

    }


}