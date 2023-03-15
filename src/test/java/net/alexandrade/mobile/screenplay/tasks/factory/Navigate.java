package net.alexandrade.mobile.screenplay.tasks.factory;

import net.alexandrade.mobile.screenplay.tasks.Access;
import net.alexandrade.mobile.screenplay.tasks.ShowMenuPanel;
import net.serenitybdd.screenplay.Task;

public class Navigate {

    public static Task menuPanel() {
        return new ShowMenuPanel();
    }

    public static Task menuWithLabel(String label) {
        return new Access(label);
    }
}
