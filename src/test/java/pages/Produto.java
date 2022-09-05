package pages;

import org.openqa.selenium.By;
import runners.Runner;
import support.Utils;

public class Produto extends Runner {
    private By titulo = By.id("productTitle");
    private By valor = By.id("price");

    public String nomeProduto(){
        Utils.waiForElementTobeClickable(titulo,10);
        return getDriver().findElement(titulo).getText();
    }
    public String valorProduto(){
        Utils.waiForElementTobeClickable(valor,10);
        return getDriver().findElement(valor).getText();
    }


}
