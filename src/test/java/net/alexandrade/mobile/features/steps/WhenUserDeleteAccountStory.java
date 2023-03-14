package net.alexandrade.mobile.features.steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.alexandrade.mobile.screenplay.questions.SelectedAccount;
import net.alexandrade.mobile.screenplay.tasks.DeleteAccount;

public class WhenUserDeleteAccountStory {

    @When("wants to delete its account")
    public void wantsToDeleteItsAccount() {
        theActorInTheSpotlight().attemptsTo(DeleteAccount.currently());
    }

    @Then("see the accounts disappears")
    public void seeTheNumbersOfItemsIs() {
        theActorInTheSpotlight().should(seeThat(SelectedAccount.disappear(), is(true)));
    }

}
