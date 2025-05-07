package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mainPageObjects {
    private static WebDriver driver;
    static By button_portafolio = By.xpath("//span[normalize-space(text())=\"Portafolio\"]");
    static By button_productos = By.xpath("//a[.//span[contains(text(), \"Productos\")]]");

    public mainPageObjects(WebDriver driver) {
        mainPageObjects.driver = driver;
    }
    public static void clickButtonPortafolio() {
        driver.findElement(button_portafolio).click();
    }
    public void clickButton_productos() {
        driver.findElement(button_productos).click();
    }
}
