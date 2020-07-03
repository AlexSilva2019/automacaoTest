package pages;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmarCarrinho extends DriverManager {

    private By btCheckout = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");

    public void confirmaCarrinho() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(btCheckout));
        element.click();
    }
}
