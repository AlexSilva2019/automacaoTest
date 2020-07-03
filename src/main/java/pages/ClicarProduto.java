package pages;

import core.DriverManager;
import org.openqa.selenium.By;

public class ClicarProduto extends DriverManager {

    private By produto = By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]");
    private By mensagem = By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span");


    public void acessarUrl (String url) {
        driver.get(url);
    }

    public void escolherProduto() {
        driver.findElement(produto).click();
        driver.findElement(mensagem).click();
    }

}
