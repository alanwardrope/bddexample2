package bdd.example2.bddexample2.framework;

/**
 * Created by vanwh on 18/01/2017.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class DSL {

    private WebDriver driver;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    public void click(String text) {
        click(By.linkText(text));
    }

    public void click(By by) {
        driver.findElement(by).click();
    }

    public boolean hasElement(By by) {
        return !driver.findElements(by).isEmpty();
    }

    public String getPageTitle(String pageName){

        System.out.println("Searching for title on page " + pageName);
        String pgTitle = driver.getTitle();
        return pgTitle;
    }
    public boolean hasSection(By by, String sectionTitle) {
        List<WebElement> myList = driver.findElements(by);
        System.out.println(myList);
        return !driver.findElements(by).isEmpty();
    }

}