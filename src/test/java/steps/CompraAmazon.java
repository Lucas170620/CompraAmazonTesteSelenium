package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.Lista;
import pages.Produto;
import runners.Runner;

import static org.junit.Assert.assertEquals;

public class CompraAmazon extends Runner {
    HomePage home = new HomePage();
    Lista lista = new Lista();
    Produto produto = new Produto();
    @Dado("que acesso o site da amazon")
    public void que_acesso_o_site_da_amazon() {
        home.acessarHomePage();

    }
    @Quando("busco por {string} e pressiono Enter")
    public void busco_por_e_pressiono_enter(String produto) {
        home.procurarProduto(produto);
    }
    @Então("exibe uma lista de produtos relacionados com {string}")
    public void exibe_uma_lista_de_produtos_relacionados_com(String produto) {
        assertEquals("produto nao encontrado","\""+produto+"\"",lista.verificarLista(produto));
    }
    @Quando("escolho {string}")
    public void escolho(String produto) {
        lista.escolherProduto(produto);
    }
    @Então("aparece {string} no valor de {string}")
    public void aparece_no_valor_de(String titulo, String valor) {
        assertEquals("Nome Errado",titulo,produto.nomeProduto());
        assertEquals("Preco Invalido",valor,produto.valorProduto());
    }

}
