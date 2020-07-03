package pages;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ColocarNoCarrinho extends DriverManager {

    private By procede = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a");

    public void colocarNoCarrinho()  {
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(procede));
        element.click();
    }

}
