package net.alexandrade.mobile.screenplay.tasks.factory;

import net.alexandrade.mobile.screenplay.tasks.AccountProfile;
import net.alexandrade.mobile.screenplay.tasks.DeleteAccount;
import net.serenitybdd.screenplay.Task;

public class GoTo {

    public static Task accountProfile() {
        return new AccountProfile();
    }

    public static Task guestProfile() {
        return new DeleteAccount();
    }

}
