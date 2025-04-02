package Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class dosCincoCinco {
    public static String browser;
    static WebDriver driver;

    public static void main(String[] args) {
        setBrowser();
        PropertiesFile.readPropertiesFile();
        setBrowserConfig();
        runTest();
        PropertiesFile.writePropertiesFile();
        }

    public static void runTest() {
        driver.get("https://www.255.com.mx/");
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
