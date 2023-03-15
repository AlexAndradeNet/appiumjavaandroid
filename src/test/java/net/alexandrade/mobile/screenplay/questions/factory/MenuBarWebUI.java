package net.alexandrade.mobile.screenplay.questions.factory;

import java.util.List;
import net.alexandrade.mobile.screenplay.questions.NumberOfMenuInDashboard;
import net.alexandrade.mobile.screenplay.questions.PresentMenusInDashboard;
import net.serenitybdd.screenplay.Question;

public class MenuBarWebUI {
    public static Question<Integer> numberOfItems() {
        return new NumberOfMenuInDashboard();
    }

    public static Question<List<String>> displayedWithStrictOrder() {
        return new PresentMenusInDashboard();
    }
}
