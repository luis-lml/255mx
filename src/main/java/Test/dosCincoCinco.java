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
import java.time.Duration;


public class dosCincoCinco {
    public static String browser;
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        //setBrowser();
        PropertiesFile.readPropertiesFile();
        setBrowserConfig();
        runTest();
        PropertiesFile.writePropertiesFile();
        }

    public static void runTest() throws InterruptedException {
        driver.get("https://www.255.com.mx/");
        driver.manage().window().maximize();
//        driver.getTitle();
//        System.out.println("Title: "+ Title);
        Thread.sleep(2000);
        WebElement buttonRetrato = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[contains(text(), 'Retrato') or contains(@href, 'retrato')]")));
        buttonRetrato.click();
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
