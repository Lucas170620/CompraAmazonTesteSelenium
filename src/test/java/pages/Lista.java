package pages;

import org.openqa.selenium.WebElement;
import runners.Runner;
import support.Utils;

import static pages.elements.ListaPageElements.*;

public class Lista extends Runner {

    public String verificarLista(String produto) {
        Utils.waiForElementTobeClickable(RESULTADO, 10);
        return getDriver().findElement(RESULTADO).getText();
    }

    public void escolherProduto(String produto) {
        Utils.waiForElementTobeClickable(AVALIACAO_DO_CLIENTE, 10);
        for (WebElement product : getDriver().findElements(LISTA_DE_ELEMENTOS)) {
            Utils.waiForElementTobeClickable(product, 20);
            if (product.getText().compareTo(produto) == 0) {
                product.click();
                break;
            }

        }

    }
}
