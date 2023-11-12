/* Faça um programa para calcular o valor de uma viagem.

Você terá 5 variáveis. Sendo elas:
1 - Preço do etanol;
2 - preço da gasolina;
3 - tipo de combustível que está no seu carro;
4 - Gasto médio de combustível do carro por KM;
5 - Distância em KM da viagem;

*/

const precoEtanol = 3.64;
const precoGasolina = 5.82;
const tipoDeCombustivel = "etanol";
let gastoMedioDeCombustivelPorKm;
const distanciaViagemEmKm = 20;

gastoMedioDeCombustivelPorKm =
  tipoDeCombustivel === "gasolina" ? precoGasolina / 10 : precoEtanol / 10;

const valorGastoViagem = gastoMedioDeCombustivelPorKm * distanciaViagemEmKm;

console.log(`Vou gastar R$ ${valorGastoViagem.toFixed(2)} nesta viagem`);
