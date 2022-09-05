package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import runners.Runner;
import support.Utils;

public class HomePage extends Runner {

    private String url = "https://www.amazon.com.br/ref=nav_logo";
    private By campobusca = By.id("twotabsearchtextbox");


    public void acessarHomePage(){
        getDriver().get(url);
    }

    public void procurarProduto(String produto) {
        Utils.waiForElementTobeClickable(campobusca,10);
        getDriver().findElement(campobusca).sendKeys(produto+Keys.ENTER);
    }
}
