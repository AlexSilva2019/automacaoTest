package pages;

import core.DriverManager;
import org.openqa.selenium.By;

public class ConfirmarEndereco extends DriverManager {

    private By confirmaEndereco = By.name("processAddress");

    public void confirmarEndereco() {
        driver.findElement(confirmaEndereco).click();
    }
}
