package bdd.example2.bddexample2.framework;

/**
 * Created by vanwh on 18/01/2017.
 */

import bdd.example2.bddexample2.page.objects.CommonPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import bdd.example2.bddexample2.page.objects.DownloadPage;
import bdd.example2.bddexample2.page.objects.MainPage;
import bdd.example2.bddexample2.page.objects.CommonPage;

import java.util.concurrent.TimeUnit;

public class ParentScenario {

    private WebDriver driver;

    protected DownloadPage downloadPage;
    protected MainPage mainPage;
    protected CommonPage commonPage;

    protected void startBrowser() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        downloadPage = new DownloadPage(driver);
        mainPage = new MainPage(driver);
        commonPage = new CommonPage(driver);
    }

    protected void navigateTo() {
        driver.navigate().to("http://docs.seleniumhq.org/");
    }


    protected void closeBrowser() {
        driver.quit();
    }

}