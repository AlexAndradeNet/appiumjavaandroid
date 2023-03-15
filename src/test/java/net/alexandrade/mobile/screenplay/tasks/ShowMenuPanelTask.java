package net.alexandrade.mobile.screenplay.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.alexandrade.mobile.screenplay.interactions.MenuBoardAction;
import net.alexandrade.mobile.screenplay.ui.DashboardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.NoSuchElementException;

public class ShowMenuPanelTask implements Task {

    @Step("{0} shows the menu panel  ")
    public <T extends Actor> void performAs(T actor) {
        MenuBoardAction.show().performAs(actor);
    }

    public static ShowMenuPanelTask openMenuPanel() {
        return instrumented( ShowMenuPanelTask.class);
    }
}
