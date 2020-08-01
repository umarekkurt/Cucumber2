package p_O_m;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilis.Driver;

import java.util.List;

public class DressPage extends Parent{
    public DressPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = "#block_top_menu > ul > li:nth-child(2) > a")
    public WebElement dressButton;

    @FindAll({
            @FindBy(css = "div.right-block > h5 > a")

    })
    public List<WebElement> dressList;

    @FindBy (css = "#add_to_cart>button")
    public WebElement addToCartButton;

    @FindBy (css = "div.button-container>a")
    public WebElement proceedToCheckOutButton;

    @FindBy (css = "p.cart_navigation>a")
    public WebElement proceedToCheckOutButton2;

    @FindBy (css = "p.cart_navigation>button")
    public WebElement proceedToCheckOutButton3;

    @FindBy (css = "#total_product")
    public WebElement totalProductFee;

    @FindBy (css = "#total_shipping")
    public WebElement totalShippingFee;

    @FindBy (css = "#total_price")
    public WebElement totalPrice;

    @FindBy (id = "uniform-cgv")
    public WebElement IagreeCheckBox;

    @FindBy (css = "a.bankwire")
    public  WebElement bankWireButton;

    @FindBy (css = "#cart_navigation>button")
    public  WebElement confirmOrderButton;

    @FindBy (css = "p>strong")
    public  WebElement confirmationText;




}