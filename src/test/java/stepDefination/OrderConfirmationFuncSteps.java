package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import p_O_m.DressPage;

public class OrderConfirmationFuncSteps {

    DressPage dressPage = new DressPage();

    @Given("^Click on the proceed to checkout button$")
    public void click_on_the_proceed_to_checkout_button() throws InterruptedException {

        dressPage.clikFuction(dressPage.proceedToCheckOutButton2);
        dressPage.clikFuction(dressPage.proceedToCheckOutButton3);
    }

    @When("^Click on the I agree, proceed to checkout button,$")
    public void click_on_the_I_agree_proceed_to_checkout_button()  {

        dressPage.clikFuction(dressPage.IagreeCheckBox);
        dressPage.clikFuction(dressPage.proceedToCheckOutButton3);

    }

    @Then("^Click on Pay by bank wire, and i confirm my order button$")
    public void click_on_Pay_by_bank_wire_and_i_confirm_my_order_button() {
        dressPage.clikFuction(dressPage.bankWireButton);
        dressPage.clikFuction(dressPage.confirmOrderButton);
    }

    @Then("^Verify order confirmation text$")
    public void verify_order_confirmation_text() {
        dressPage.VerifyConfirmationText(dressPage.confirmationText.getText());
    }





}