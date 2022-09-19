package pages;

import runners.Runner;
import support.Utils;

import static pages.elements.ProdutoPageElements.TITULO;
import static pages.elements.ProdutoPageElements.VALOR;

public class Produto extends Runner {

    public String nomeProduto() {
        Utils.waiForElementTobeClickable(TITULO, 10);
        return getDriver().findElement(TITULO).getText();
    }

    public String valorProduto() {
        Utils.waiForElementTobeClickable(VALOR, 10);
        return getDriver().findElement(VALOR).getText();
    }


}
