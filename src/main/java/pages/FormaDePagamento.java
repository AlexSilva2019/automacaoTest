package pages;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormaDePagamento extends DriverManager {

    private By formadePagar = By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a");

    public void formadePagamento() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(formadePagar));
        element.click();
    }
}
