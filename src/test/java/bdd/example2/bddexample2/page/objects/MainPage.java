package bdd.example2.bddexample2.page.objects;

/**
 * Created by vanwh on 18/01/2017.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import bdd.example2.bddexample2.framework.ParentPage;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends ParentPage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickTab(String tab) {
        click(tab);
    }

    //private static final String SECTION_HEADER = "//*[@id='mainContent']/h2/text()='%s'";
    private static final String SECTION_HEADER = "//*[@id='mainContent']/h2/text()";

    public boolean hasSectionHeaderFor(String sectionHeaderText) {
        //boolean isTextPresent=false;
        By hasSectionHeader = By.xpath(String.format(SECTION_HEADER, sectionHeaderText));
        System.out.println("The section header is : " + hasSectionHeader);
        //isTextPresent = driver.findElement(By.xpath(String.format(SECTION_HEADER, sectionHeaderText))
        return hasSection(hasSectionHeader, sectionHeaderText);
    }

}