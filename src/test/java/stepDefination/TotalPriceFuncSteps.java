package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import p_O_m.DressPage;
import p_O_m.Parent;

public class TotalPriceFuncSteps extends Parent {

    DressPage dressPage = new DressPage();

    @Given("^Navigate to dresses page$")
    public void navigate_to_dresses_page()  {

        dressPage.clikFuction(dressPage.dressButton);

    }

    @When("^Click on the any item from the page, add to cart and proceed to check out$")
    public void click_on_the_any_item_from_the_page_add_to_cart_and_proceed_to_check_out()  {

        dressPage.clikFuction(dressPage.dressList.get(radom(dressPage.dressList.size())));
        dressPage.clikFuction(dressPage.addToCartButton);
        dressPage.clikFuction(dressPage.proceedToCheckOutButton);


    }

    @Then("^Verify Total products \\+ Total shipping = Total$")
    public void verify_Total_products_Total_shipping_Total()  {
        dressPage.VerifyTotalPrice(dressPage.totalProductFee.getText(),dressPage.totalShippingFee.getText(),dressPage.totalPrice.getText());

    }

}