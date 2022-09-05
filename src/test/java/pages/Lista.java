package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runners.Runner;
import support.Utils;

public class Lista extends Runner {
    private  By resultado = By.xpath("/html/body/div[1]/div[2]/span/div/h1/div/div[1]/div/div/span[3]");

    public String verificarLista(String produto) {
        Utils.waiForElementTobeClickable(resultado,10);
        return getDriver().findElement(resultado).getText();
    }

    public void escolherProduto(String produto) {
        Utils.waiForElementTobeClickable(resultado,10);
        for (WebElement product:getDriver().findElements(By.xpath("//span[@class = 'a-size-base-plus a-color-base a-text-normal']"))){
            if(product.getText().compareTo(produto)==0){
                Utils.waiForElementTobeClickable(product,10);
                product.click();
                break;
            }

        }

    }
}
