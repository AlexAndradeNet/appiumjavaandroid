package net.alexandrade.mobile.screenplay.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.alexandrade.mobile.screenplay.ui.DashboardPage;
import org.openqa.selenium.NoSuchElementException;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import net.thucydides.core.annotations.Step;

public class ShowMenuPanel implements Task {

    @Step("{0} shows the menu panel  ")
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    new WaitUntilTargetIsReady(DashboardPage.MAIN_NAVIGATE_BUTTON, WebElementStateMatchers.isEnabled())
                            .forNoMoreThan(60).seconds(),
                    Click.on(DashboardPage.MAIN_NAVIGATE_BUTTON));

        }catch(NoSuchElementException e) {
            Click.on(DashboardPage.MAIN_NAVIGATE_BUTTON);
        }
    }

    public static ShowMenuPanel openMenuPanel() {
        return instrumented(ShowMenuPanel.class);
    }

}
