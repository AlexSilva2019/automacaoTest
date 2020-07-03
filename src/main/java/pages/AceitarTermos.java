package pages;

import core.DriverManager;
import org.openqa.selenium.By;

public class AceitarTermos extends DriverManager {

    private By aceitarTermo = By.id("cgv");
    private By confirmarAceite = By.name("processCarrier");

    public void aceitaTermos() {
        driver.findElement(aceitarTermo).click();
        driver.findElement(confirmarAceite).click();
    }
}

