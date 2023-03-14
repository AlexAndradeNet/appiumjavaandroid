package net.alexandrade.mobile.features;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertTrue;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
  features = "classpath:features",
  glue = "net.alexandrade.mobile.features.steps",
  plugin = "pretty",
  tags = "not @ignore"
)
public class RunnerTest {
    private RunnerTest () {
        super();
    }

    @Test
    public void test () {
        assertTrue(true);
    }

    /*
    DO NOT PUT OTHER METHODS HERE
     */
}
