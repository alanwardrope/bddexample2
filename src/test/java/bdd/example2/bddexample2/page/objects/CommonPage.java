package bdd.example2.bddexample2.page.objects;

/**
 * Created by vanwh on 18/01/2017.
 */

import org.openqa.selenium.WebDriver;
import bdd.example2.bddexample2.framework.ParentPage;

public class CommonPage extends ParentPage {

    public CommonPage(WebDriver driver) {
        super(driver);
    }

    public String pageHasTitle (String pgName) {
        return getPageTitle(pgName);
    }

}
