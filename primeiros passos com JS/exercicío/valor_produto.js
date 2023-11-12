/* 
  Elabore um algoritmo que calcule oque deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento.
  Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
  
  Código Condição de pagamento:
  - À vista Débito, recebe 10% de desconto;
  - À vista no dinheiro ou PIX, recebe 15% de desconto;
  - Em duas vezes, preço normal de etiqueta sem juros;
  - Acima de duas vezes, preço normal de etiqueta mais juros de 10%;

*/

const precoProduto = 10;
const metodoPagamento = 4;
let precoPagar;

switch (metodoPagamento) {
  case 1:
    precoPagar = precoProduto - precoProduto * 0.1;
    break;
  case 2:
    precoPagar = precoProduto - precoProduto * 0.15;
    break;
  case 3:
    precoPagar = precoProduto;
    break;
  case 4:
    precoPagar = precoProduto + precoProduto * 0.1;
    break;
}

console.log(`Você deve pagar R$ ${precoPagar.toFixed(2)} por este produto!`);
