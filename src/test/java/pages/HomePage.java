package pages;

import org.openqa.selenium.Keys;
import runners.Runner;
import support.Utils;

import static pages.elements.HomePageElements.CAMPO_DE_BUSCA;
import static pages.elements.HomePageElements.URL;

public class HomePage extends Runner {


    public void acessarHomePage() {
        getDriver().get(URL);
    }

    public void procurarProduto(String produto) {
        Utils.waiForElementTobeClickable(CAMPO_DE_BUSCA, 10);
        getDriver().findElement(CAMPO_DE_BUSCA).sendKeys(produto + Keys.ENTER);
    }
}
