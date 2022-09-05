#language: pt
Funcionalidade: Comprar produto na Amazon
  Fluxo de compras no site da amazon
  Cenário: comprar a partir da busca
    Dado que acesso o site da amazon
    Quando busco por "hunter x hunter" e pressiono Enter
    Então exibe uma lista de produtos relacionados com "hunter x hunter"
    Quando escolho "Hunter X Hunter - Volume 11"
    Então aparece "Hunter X Hunter - Volume 11" no valor de "R$ 23,90"