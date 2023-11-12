/* Faça um programa para calcular o valor de uma viagem.

Você terá 3 variáveis. Sendo elas:
1 - Preço do combustível;
2 - Gasto médio de combustível do carro por KM;
3 - Distância em KM da viagem;

*/

const precoCombustivel = 5.82;
const gastoMedioDeCombustivelPorKm = precoCombustivel / 10;
const distanciaViagemEmKm = 25;

let valorGastoViagem = gastoMedioDeCombustivelPorKm * distanciaViagemEmKm;

console.log("R$ " + valorGastoViagem.toFixed(2));
