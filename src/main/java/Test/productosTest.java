package Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.mainPageObjects;
import java.time.Duration;

import static Test.dosCincoCinco.setBrowserConfig;

public class productosTest {
    private static WebDriver driver;
    public static String browser;


    public static void main(String[] args) throws InterruptedException {
        PropertiesFile.readPropertiesFile();
        setBrowser();
        setBrowserConfig();
        productosTest();
        PropertiesFile.writePropertiesFile();
    }

    public static void productosTest() throws InterruptedException {
        driver.get("https://www.255.com.mx/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        mainPageObjects mainPage = new mainPageObjects(driver);
        mainPage.clickButtonPortafolio();
        Thread.sleep(2000);
        mainPage.clickButton_productos();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }

    public static void setBrowser() {
        browser= "Firefox";
    }

    public static void setBrowserConfig() {
        String projectLocation = System.getProperty("user.dir");
        if (browser.contains("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.contains("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
    }
}
