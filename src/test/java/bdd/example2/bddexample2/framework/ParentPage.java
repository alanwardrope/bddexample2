package bdd.example2.bddexample2.framework;

/**
 * Created by vanwh on 18/01/2017.
 */

import org.openqa.selenium.WebDriver;

public abstract class ParentPage extends DSL {

    public ParentPage(WebDriver driver) {
        super(driver);
    }

}